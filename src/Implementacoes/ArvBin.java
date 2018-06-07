
package Implementacoes;

/*
 * @author Gean RC
 */

public class ArvBin{
    private No2 raiz;
    
    public ArvBin(){
        raiz = null;
    }
    
    //verificfa se a arvore esta vazia
    public boolean vazia(){
        return (raiz == null);
    }
    
    //funcao de busca recursiva
    private No2 busca(No2 T, int valor){
        No2 aux;
        // Condicao de parada
        if(T == null)
            return null;
            // Arvore Vazia
            // Condicao de parada
            if(T.getConteudo() == valor)
                return T; 
                //Elemento encontrado na raiz
                // Caso recursivo
                aux = busca(T.getEsq(), valor);
                if (aux == null)
                    aux = busca(T.getDir(), valor);
                return aux;
    }
    
    //busca um elemento. retorna o edereco se noa null
    public No2 busca(int valor){
        if(vazia())
            return null;
            //No2 res = busca(raiz, valor);
            //return res;
            return busca(raiz, valor);
    }
    
    //insere um no raiz na arvore vazia. se sim true se nao false
    public boolean insereRaiz(int valor){
        if(raiz != null)
            return false;  
            //Erro: Arvore nao esta vazia
            No2 novoNo = new No2();
            novoNo.setConteudo(valor);
            novoNo.setEsq(null);
            novoNo.setEsq(null);
            raiz = novoNo;
            return true;
    } 
    
    //insere um filho a direita do dado, retorna true ou false
    public boolean insereDir(int vPai, int vFilho ){
        // Verifica se o elemento ja existe
        No2 filho = busca(vFilho);
        if(filho != null)
            return false;  
            // Erro dado ja existe
            // Busca o pai e verifica se possui filho direito
            No2 pai = busca(vPai);
            if(pai == null)
                return false;  
                // Erro pai nao encontrado
                if(pai.getDir() != null)
                    return false;  
                    // Erro filho dir ja existe
                    No2 novoNo = new No2();
                    novoNo.setConteudo(vFilho);
                    novoNo.setEsq(null);
                    novoNo.setDir(null);
                    pai.setDir(novoNo);
                    return true;
    }
    
    //insere um filho a esquerda de um dado no. retorna true ou false
    public boolean insereEsq(int vPai, int vFilho ){
        // Verifica se o elemento ja existe 
        No2 filho = busca(vFilho);
        if(filho != null)
            return false;  
            // Erro dado ja existe
            // Busca o pai e verifica se possui filho da esq
            No2 pai = busca(vPai);
            if(pai == null)
                return false; 
                // Erro pai nao encontrado
                if(pai.getEsq() != null)
                    return false; 
                    // Erro filho esq ja existe
                    No2 novoNo = new No2();
                    novoNo.setConteudo(vFilho);
                    novoNo.setEsq(null);
                    novoNo.setDir(null);
                    pai.setEsq(novoNo);
                    return true;
    }
    
    //exibe o conteudo de um arvore em pre-ordem
    private void exibePreOrdem(No2 T){
        if(T == null)
            return;
        System.out.print(" " + T.getConteudo());
        if(T.getEsq() != null)
            exibePreOrdem(T.getEsq());
        if(T.getDir() != null)
            exibePreOrdem(T.getDir());
    }
    
    //exibe o conteudo de uma arvore em pre-ordem 
    public void exibePreOrdem(){
        if(raiz == null)
            System.out.println("Arvore vazia");
        else
            exibePreOrdem(raiz);
    }	
	
    //exibe o conteudo de uma arvore in-0rdem
    private void exibeInOrdem(No2 T){
        if(T == null)
            return ;
        if(T.getEsq() != null)
            exibeInOrdem(T.getEsq());
        System.out.print(" " + T.getConteudo());
        if(T.getDir() != null)
            exibeInOrdem(T.getDir());
    }

    //exibe o conteudo de uma arvore in-ordem
    public void exibeInOrdem(){
        if(raiz == null)
            System.out.println("Arvore vazia");
        else
            exibeInOrdem(raiz);
    }
    
    //exibe o conteudo de uma arvore Pos-ordem
    private void exibePosOrdem(No2 T){
        if(T == null)
            return ;
        if(T.getEsq() != null)
            exibePosOrdem(T.getEsq());
        if(T.getDir() != null)
            exibePosOrdem(T.getDir());
        System.out.print(" " + T.getConteudo());
    }
    
    //exibe o conteudo de uma arvore em Pos-ordem
    public void exibePosOrdem(){
        if(raiz == null)
            System.out.println("Arvore vazia");
        else
            exibePosOrdem(raiz);
    }
}
