
package Implementacoes;

/*
 * @author Gean RC
 */

public class ABP{    
    private No2 raiz;
    
    public ABP(){
        raiz = null;
    }
    
    //verifica se a arvore esta vazia
    public boolean vazia(){
        return (raiz == null);
    }
    
    //busca recursivamente a partir da raiz. retorna o endereco se nao null
    private No2 busca(No2 T, int valor){
        if(T == null)
            return null;  
            // Arvore Vazia
            if(T.getConteudo() == valor)
                return T; 	
                // Elem. encontrado na raiz
                if(valor < T.getConteudo())
                    return busca(T.getEsq(), valor);
                else
                    return busca(T.getDir(), valor);
    }
    
    //buscar um elemento na ABP. retorna o endereco ou null
    public No2 busca(int valor){  
        if(raiz != null)
            return busca(raiz, valor);
        return null;
    }
    
    //exibe o conteudo no formato in-ordem
    private void exibe(No2 T){
        if(T != null){
            exibe(T.getEsq());
            System.out.print(" " + T.getConteudo());
            exibe(T.getDir());
        }
    }
    
    public void exibe(){
        if(raiz == null)
            System.out.println("Arvore vazia");
        else
            exibe(raiz);
    }
    
    //inserer um no em uma arvore ABP. retor 1 se sim e 0 se nao
    public boolean insere(int valor){
        No2 novoNo = new No2();
        novoNo.setConteudo(valor);
        novoNo.setEsq(null);
        novoNo.setDir(null);
        if (raiz == null){ 
        // Arvore vazia
        raiz = novoNo;
        return true;
        }
        // Procura a posicao correta pra inserir o novo no
        No2 aux = raiz;
        No2 p = null;
        while(aux != null){
            p = aux;
            if(valor < aux.getConteudo())
                aux = aux.getEsq();
            else
                aux = aux.getDir();
        }
        // Encontrou um no folha para inserir
        if(valor < p.getConteudo())
            p.setEsq(novoNo);
        else
            p.setDir(novoNo);
        return true;
    }
}