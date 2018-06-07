
package Implementacoes;

/*
 * @author Gean RC
 */

public class FilaSeq{
    private int dados[];
    private int inicio;
    private int fim;
    private int nElementos;
    private int tamMax;
    
    public FilaSeq(){
        inicio = 0;
        fim = -1;
        nElementos = 0;
        tamMax = 100;
        dados =  new int[tamMax];
    }
    
    public FilaSeq(int n){
        inicio = 0;
        fim = -1;
        nElementos = 0;
        tamMax = n;
        dados =  new int[tamMax];
    }
    
    //verifica se a fila esta vazia    
    public boolean vazia(){
        if(nElementos == 0)
            return true;
        else
            return false;
    }
    
    //verifica se a fila esta
    public boolean cheia(){
        if(nElementos == tamMax)
            return true;
        else
            return false;
    }
    
    //obtem o tamanho da fila
    public int tamanho(){
        return nElementos;
    }
    
    //consulta o elemento do inicio da fila. retorna -1 se vazia
    public int primeiro(){
        if(vazia())
            return -1; 
            // Erro: Fila vazia 
            return dados[inicio];
    }

    //insere um elemento no fim da fila. retorna false se cheia se nao true
    public boolean insere(int valor){
        if(cheia()){
            return false;
        }
        fim = (fim + 1) % tamMax;
        //Circularidade 
        dados[fim] = valor;
        nElementos++;
        return true;
    }

    //Remove o elemento do inicio da fila e retorna o valor removido. -1 se vazio
    public int remove(){
        if (vazia())
            return -1;
        int res = primeiro();
        inicio = (inicio + 1) % tamMax;
        //Circularidade
        nElementos--;
        return res;
    }
}
