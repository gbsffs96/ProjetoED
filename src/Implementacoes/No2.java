
package Implementacoes;

/*
 * @author Gean RC
 */

public class No2 {
    private int conteudo;
    private No2 esq;
    private No2 dir;
    
    public No2(){
        esq = null;
        dir = null;
    }
    
    public int getConteudo(){
        return conteudo;
    }
    
    public void setConteudo(int conteudo){
        this.conteudo = conteudo;
    }
    
    public No2 getEsq(){
        return esq;
    }
    
    public void setEsq(No2 esq){
        this.esq = esq;
    }
    
    public No2 getDir(){
        return dir;
    }
    
    public void setDir(No2 dir){
        this.dir = dir;
    }
}
