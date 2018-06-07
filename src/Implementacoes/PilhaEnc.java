
package Implementacoes;

/*
 * @author Gean RC
 */

public class PilhaEnc {
    No topo;
    int nElementos;
    public PilhaEnc(){
        topo = null;
        nElementos = 0;
    }
    
    //verifica se a pilha esta vazia
    public boolean vazia(){
        if(nElementos == 0)
            return true;
        else
            return false;
    }

    //obtem o tamanho da pilha
    public int tamanho(){
        return nElementos;        
//        No p = topo;
//        int i = 0;
//        while(p != null){
//            p = p.getProx();
//            i++;
//        }
//        return i;
//        tamanho percorrendo tudo
    }
    
    //consulta o elemento do topo da pilha. -1 se a pilha estiver vazia
    public int top(){
        if(vazia()){
            return -1; 
            // Pilha vazia 
        }
        return topo.getConteudo();
    }
    
    //insere um elemento no topo da pilha. retorna true se funcionar
    public boolean push(int valor){
        // Aloca memoria para novo no e preenche conteudo 
        No novoNo = new No();
        novoNo.setConteudo(valor);
        // Faz o novo no apontar pro atual topo da pilha
        novoNo.setProx(topo);
        // Atualiza o topo da pilha que agora sera o novo nao
        topo = novoNo;
        // Atualiza o tamanho da pilha
        nElementos++;
        return true;
    }

    //retira o elemento do topo da pilha. -1 se vazia se noa retorna o valor removido
    public int pop(){
        if (vazia()){
            return -1;
            // pilha vazia 
        }
        // Guarda o no que no topo da pilha e o seu conteudo
        No p = topo;
        int valor = p.getConteudo();
        //modifica o topo\ retira o 
        topo = p.getProx();
        // Decrementa o tamanho da pilha 
        nElementos--;
        //sugere ao garbage collector que libere memoria
        p= null;
        return valor;
    }
}
