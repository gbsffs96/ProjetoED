
package Implementacoes;

/*
 * @author Gean RC
 */

public class FilaEnc{
    private No inicio;
    //aponta para o inicio da fila 
    private No fim;
    // aponta para o fim da fila
    private int nElementos;
    //cria um fila
    
    public FilaEnc(){
        inicio = null;
        fim = null;
        nElementos = 0;
    }

    //verifica se a fila esta vazia
    public boolean vazia(){
        if(nElementos == 0)
            return true;
        else
            return false;
    }

    //obtem o tamanho da fila
    public int tamanho(){
        return nElementos;
    }

    //consulta o elemento do inicio da fila. -1 se estiver vazia
    public int inicio(){
        if(vazia())
            return -1; 
            // Erro: Fila vazia 
            return inicio.getConteudo();
    }

    //insere um elemento no fim da fila. false se mem. insuficiente se nao true
    public boolean insere(int valor){
        No novoNo = new No();
        novoNo.setConteudo(valor);
        novoNo.setProx(null);
        if(vazia()){
            //insercao em fila vazia
            inicio = novoNo;
        }
        else{
            fim.setProx(novoNo); 
            //liga com a fila
        }
        fim = novoNo;
        //atualiza o novo fim
        nElementos++;
        return true;
    }

    //retira o elemento do inicio da fila e retorna seu valor. -1 se vazia
    public int remove(){
        if(vazia()){
            return -1; 
            // Erro: Fila vazia 
        }
        int valor = inicio();
        No p = inicio;
        if(inicio == fim){ 
        // Fila com 1 elemento 
        fim = null;
        inicio = null;
        }
        else{
            inicio = p.getProx();
        }
        //sugere a libercao pro garbage collector
        p= null;
        nElementos--;
        return valor;
    }
}
