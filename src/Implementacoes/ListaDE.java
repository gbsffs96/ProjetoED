
package Implementacoes;

/*
 * @author Gean RC
 */

public class ListaDE{
    private No inicio;
    private No fim;
    private int tamanho;
    
    public ListaDE(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }
    
    //verifica se a lista esta vazia
    public boolean vazia(){
        if(tamanho == 0)
            return true;
        else
            return false;
    }
    
    //obtem o tamanho da lista
    public int tamanho(){
        return tamanho;
    }

    //obtem o i-esimo elemento de uma lista. retorna o valor encontrado
    public int elemento(int pos){
        No aux = inicio;
        int cont = 1;
        if(vazia()){
            return -1; 
            // Consulta falhou
        }
        if((pos < 1) || (pos > tamanho())){
            return -1; 
            // Posicao invalida 
        }
        
        // Percorre a lista do 1o elemento ate pos 
        while(cont < pos){
        // modifica "aux" para apontar para o proximo elemento da lista 
        aux = aux.getProx();
        cont++;
        }
        return aux.getConteudo();
    }
    
    //retorna a posicao de um elemento pesquisado. 0 caso contrario
    public int posicao(int dado){
        int cont = 1;
        No aux;
        //lista vazia
        if(vazia()){
            return -1;
        }
        //percorre a lista do inicio ao fim ate encontrar o elemento
        aux = inicio;
        while(aux != null){
            //se encontrar o elemento, retorna sua posicao n
            if(aux.getConteudo() == dado){
                return cont;
            }
            //modifica aux para apontar para o proximo elemento da lista
            aux = aux.getProx();
            cont++;
        }
        return -1;
    }

    //insere no em lista vazia
    private boolean insereInicioLista(int valor){
    // Aloca memoria para novo no 
    No novoNo = new No();
    // Insere novo elemento na cabeca da lista
    novoNo.setConteudo(valor);
    novoNo.setProx(inicio);
    novoNo.setAnt(null); 
    // Nova instrucao
    if(vazia())
        fim = novoNo;
        // Nova instrucao
    else
        inicio.setAnt(novoNo); 
        // Nova instrucao
        inicio = novoNo;
        tamanho++;
        return true;
    }

    //insere no no meio da lista
    private boolean insereMeioLista(int pos, int dado){
        int cont = 1;
        // Aloca memoria para novo no
        No novoNo = new No();
        novoNo.setConteudo(dado);
        // Localiza a pos. onde sera inserido o novo no
        No aux = inicio;
        while((cont < pos-1) && (aux != null)){
            aux = aux.getProx();
            cont++;
        }
        if(aux == null){ 
            // pos. invalida
            return false;
        }
        // Insere novo elemento apos aux
        novoNo.setAnt(aux); 
        // Nova instrucao
        novoNo.setProx(aux.getProx());
        aux.getProx().setAnt(novoNo); 
        // Nova instrucao
        aux.setProx(novoNo);
        tamanho++;
        return true;
    }
    
    //insere no no fim da lista
    private boolean insereFimLista(int dado){
        // Aloca memoria para novo no 
        No novoNo = new No();
        novoNo.setConteudo(dado);
        // Procura o final da lista 
        No aux = inicio;
        while(aux.getProx() != null){
            aux = aux.getProx();
        }
        novoNo.setProx(null);
        aux.setProx(novoNo);
        novoNo.setAnt(fim);  
        // Nova instrucao
        fim.setProx(novoNo); 
        // Nova instrucao
        fim = novoNo; 
        // Nova instrucao
        this.tamanho++;
        return true;
    }

    //insere um elemento em qualquer posicao. retorna true ou false
    public boolean insere(int pos, int dado){
        if((vazia()) && (pos != 1)){
            return false;
            //lista vazia ou invalida
        }
        //insercao no inicio da lista ou vazia
        if(pos == 1){
            return insereInicioLista(dado);
        }
        //insercao no fim da lista
        else if(pos == tamanho+1){
            return insereFimLista(dado);
        }
        //insercao no meio da lista
        else{
            return insereMeioLista(pos, dado);
        }
    }
    
    //remove elemento do inicio de uma lista
    private int removeInicioListaUnitaria(){ 
        int dado = inicio.getConteudo();
        inicio = null;
        fim = null; 
        tamanho--;
        return dado;
    }
    
    //remove elemento do inicio da lista
    private int removeInicioLista(){
        No p = inicio;
        // Dado recebe o dado removido
        int dado = p.getConteudo();
        // Retira o 1o elemento da lista (p)
        inicio = p.getProx();
        p.getProx().setAnt(null);
        // Nova instrucao
        tamanho--;
        // Sugere ao garbage collector que libere a memoria 
	p = null;
        return dado;
    }
    
    //remove elemento no meio da lista
    private int removeMeioLista(int pos){
        No p = inicio;
        int n = 1;
        //localiza o no que sera removido
        while((n <= pos-1) && (p != null)){
            p = p.getProx();
            n++;
        }
        if(p == null){
            return -1; 
            //pos. invalida
        }
        int dado = p.getConteudo();
        p.getAnt().setProx(p.getProx());
        p.getProx().setAnt(p.getAnt());
        tamanho--;
        //sugere ao garbage colletctor que libere a memoria 
        p = null;
        return dado;
    }
    
    //remove elemento do inicio da lista
    private int removeFimLista(){ 
        No p = fim;
        int dado = p.getConteudo();
        fim.getAnt().setProx(null);
        fim = fim.getAnt();
        tamanho--;
        p = null; 
        return dado;
    }
    
    //remove um elemento de uma determinada posicao. -1 se invalida
    public int remove(int pos){
        // Lista vazia 
        if (vazia()) {
            return -1;
        }
        //remocao do elemento da cabeca
        if((pos == 1) && (tamanho() == 1)){
            return removeInicioListaUnitaria();
        }
        else if (pos == 1){
            return removeInicioLista();
        }
        // Remocao no fim da lista
        else if(pos == tamanho()){ 
            return removeFimLista();
        }
        //remocao em outro lugar da lista
        else{
            return removeMeioLista(pos);
        }
    }
}
