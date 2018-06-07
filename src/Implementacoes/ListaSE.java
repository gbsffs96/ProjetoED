
package Implementacoes;

/*
 * @author Gean RC
 */

public class ListaSE{
    private No cabeca;
    private int nElementos;
    
    public ListaSE(){
        cabeca = null;
        nElementos = 0;
    }
    
    //verifica se a lista esta vazia
    public boolean vazia(){
        if(nElementos == 0)
            return true;
        else
            return false;
    }
    
    //obtem o tamanho da lista
    public int tamanho(){
        //return nElementos;
        No aux = cabeca;
        int cont = 0;
        while(aux != null){
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }
    
    //obtem o i-esimo elemento de uma lista. retorna o valor
    public int elemento (int pos){
        if(vazia()){
            return -1; 
            // Consulta falhou
        }
        if((pos < 1) || (pos > tamanho())){
            return -1; 
            // Posicao invalida 
        }        
        No aux = cabeca;
        // Percorre a lista do 1 elemento ate pos 
        for(int i =1; i < pos; i++){
            // modifica "aux" para apontar para o proximo elemento da lista
            aux = aux.getProx();
        }
        return aux.getConteudo();
    }
    
    //retorna a posicao de um elemento pesquisado. -1 caso nao encontre
    public int posicao(int dado){
        int cont = 1;
        No aux;
        //lista vazia
        if(vazia()){
            return -1;
        }
        
        //percorre a lista do inicio ao fim ate encontrar o elemento
        aux = cabeca;
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
    novoNo.setProx(cabeca);
    cabeca = novoNo;
    nElementos++;
    return true;
    }

    //insere no no meio da lista
    private boolean insereMeioLista(int pos, int dado){
    // Aloca memoria para novo no
    No novoNo = new No();
    novoNo.setConteudo(dado);
    // Localiza a pos. ANTERIOR onde sera inserido o novo no
    No aux = cabeca;
    for (int i =1; i < pos-1; i++){
    // modifica "aux" para apontar para o proximo elemento da lista 
    aux = aux.getProx();
    }
    
//    while ((cont < pos-1) && (aux != null)){
//        aux = aux.getProx();
//        cont++;
//    }
//    if(aux == null){  
//    // pos. invÃ¡lida 
//    return false;
//    }	    
//    // Insere novo elemento apos aux
//    novoNo.setProx(aux.getProx());
//    aux.setProx(novoNo);
	    
    // Insere novo elemento apos aux
    No p = aux.getProx();
    novoNo.setProx(p);
    aux.setProx(novoNo);
    nElementos++;
    return true;
    }
    
    //insere no no fim da lista
    private boolean insereFimLista(int dado){
    // Aloca memoria para novo no
    No novoNo = new No();
    novoNo.setConteudo(dado);
    // Procura o final da lista
    No aux = cabeca;
    while(aux.getProx() != null){
        aux = aux.getProx();
    }
    novoNo.setProx(null);
    aux.setProx(novoNo);
    nElementos++;
    return true;
    }
    
    //insere um elemento em uma determinada posicao. retorna true ou false
    public boolean insere(int pos, int dado){
        if((vazia()) && (pos != 1)){
            return false; 
            //lista vazia mas posicao inv
        }
        //insercao no inicio da lista ou vazia
        if (pos == 1){
            return insereInicioLista(dado);
        }
        //insercao no fim da lista
        else if(pos == nElementos+1){
            return insereFimLista(dado);
        }
        //insercao no meio da lista
        else{
            return insereMeioLista(pos, dado);
        }
    }
    
    //remove elemento do inicio da lista
    private int removeInicioLista(){
        No p = cabeca;
        // Dado recebe o dado removido
        int dado = p.getConteudo();
        // Retira o 1o elemento da lista (p)
        cabeca = p.getProx();
        nElementos--;
        // Sugere ao garbage collector que libere a memoria
        //  da regiao apontada por p
        p = null;
        return dado;
    }

    //remove elemento no meio da lista
    private int removeNaLista(int pos){
        No atual = null, antecessor = null;
        int dado = -1;
        int cont = 1;
        //localiza o no que sera removido
        atual = cabeca;
        while((cont < pos) && (atual != null)){
            antecessor = atual;
            atual = atual.getProx();
            cont++;
        }
        if(atual == null){ 
            //posicao invalida
            return -1;
        }        
        //retira o elemento da lista
        dado = atual.getConteudo();
        antecessor.setProx(atual.getProx());
        nElementos--;
        //sugere ao garbage collector que libere a memoria da regiao apontada p
        atual = null;
        return dado;
    }
    
    //remove um elemento de uma determinada posicao. -1 se vazia ou invalida
    public int remove(int pos){
    // Lista vazia 
    if (vazia()){
        return -1;
    }
    // Remocao do elemento da cabeca da lista
    if(pos == 1){
        return removeInicioLista();
    }
    // Remocao em outro lugar da lista
    else{
        return removeNaLista(pos);
    }
    }
}
