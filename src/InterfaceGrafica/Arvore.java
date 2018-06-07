
package InterfaceGrafica;

/*
 * @author Gean RC
 */

import Implementacoes.ABP;
import Implementacoes.ArvBin;
import Implementacoes.No2;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;

class No3{
    int vd, profunDir, profunEsq;
    No3 dir, esq;
    int pX = 0, pY = 0;
}

class funAdicionais extends javax.swing.JPanel {
    int afastamento = 60;
    Graphics g;
    
    public No3 inserir(No3 noAuxiliar, int valorDigitado){
        
        No3 novo;
        if(noAuxiliar == null){
            novo = new No3();
            novo.vd = valorDigitado;
            novo.profunDir = 0;
            novo.profunEsq = 0;
            novo.esq = null;
            novo.dir = null;
            noAuxiliar = novo;
        }         
        // verifica se o valor inserido é menor, sendo assim vai para a esquerda
        //esquerda
        else if(valorDigitado < noAuxiliar.vd){
            noAuxiliar.esq = inserir(noAuxiliar.esq, valorDigitado);
            //se o a prof da direita for maior q a esquerda, prof esquerda = prof direita +1
            if(noAuxiliar.esq.profunDir > noAuxiliar.esq.profunEsq){
                noAuxiliar.profunEsq = noAuxiliar.esq.profunDir + 1;
            }else{
                //se n, prof esq +1
                noAuxiliar.profunEsq = noAuxiliar.esq.profunEsq + 1;
            }
            //verifica se o valor inserido é maior
            //direita
        }else{
            noAuxiliar.dir = inserir(noAuxiliar.dir, valorDigitado);
            // se a prof da direita for maior q a prof da esq na direita, prof direita +1, ou seja, um filho para a direita
            if (noAuxiliar.dir.profunDir > noAuxiliar.dir.profunEsq) {
                noAuxiliar.profunDir = noAuxiliar.dir.profunDir + 1;
            } else {// se n, um filho para a esquerda
                noAuxiliar.profunDir = noAuxiliar.dir.profunEsq + 1;
            }
        }
        return noAuxiliar;
        // retorna a raiz
    }

    public void showTree(No3 noAuxiliar){
    	String c;
        g = (Graphics) this.getGraphics(); 
        try{
    	if (noAuxiliar != null){
            // pega o valor digitado
            c = String.valueOf(noAuxiliar.vd);  
            //desenha o valor digitado | seta na cor azul o circulo   
            g.drawString(c , noAuxiliar.pX, noAuxiliar.pY);
            g.setColor(Color.BLACK);
            c.length();
            //desenha uma bola
            g.drawOval(noAuxiliar.pX-10, noAuxiliar.pY-15, 30, 30);
            //verifica o tam da prof que foi inserido no metodo inserir
            if(noAuxiliar.profunEsq > 0 ){
                //se prof for igual a 1, então -fat, pois é o primeiro elemento
                if(noAuxiliar.profunEsq == 1){
                    noAuxiliar.esq.pX = noAuxiliar.pX - afastamento;
                    noAuxiliar.esq.pY = noAuxiliar.pY + afastamento;
                }
                else if(noAuxiliar.profunEsq>=2){
                    noAuxiliar.esq.pX = noAuxiliar.pX - afastamento;
                    noAuxiliar.esq.pY = noAuxiliar.pY + afastamento;
                    //caso a altura seja maior que 2, e feito um afastamento nos nós 
                }
                showTree(noAuxiliar.esq);
            } 
            if(noAuxiliar.profunDir > 0){
                if(noAuxiliar.profunDir == 1){
                    noAuxiliar.dir.pX = noAuxiliar.pX + afastamento;
                    noAuxiliar.dir.pY = noAuxiliar.pY + afastamento;
                }
                else if(noAuxiliar.profunDir>=2){
                    noAuxiliar.dir.pX = noAuxiliar.pX + afastamento;
                    noAuxiliar.dir.pY = noAuxiliar.pY + afastamento;
                }
                showTree(noAuxiliar.dir); 
            }
            else
                noAuxiliar = null;
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void drawLine(No3 noAuxiliar, int positionX, int positionY, boolean draw){
        if (noAuxiliar!=null){
            if(draw==true){
                g.setColor(Color.BLUE);
                g.drawLine(noAuxiliar.pX-3, noAuxiliar.pY, positionX,positionY ); 
            }
            else {
                draw = true;
            }
            g.setColor(Color.BLUE);
             //recursividade ir desenhar a linha da esquerda
            drawLine(noAuxiliar.esq,noAuxiliar.pX,noAuxiliar.pY,draw);
            //recursividade ir desenhar a linha da direita
            drawLine(noAuxiliar.dir,noAuxiliar.pX,noAuxiliar.pY,draw);
        }
    }
    
    public boolean verificarValor(No3 noAuxiliar, int valorDigitado, boolean loop){
        //caso exista o mesmo valor na árvore, ele retorna o true
        //caso nao exista, ele insere o valor na árvore
        if(noAuxiliar != null && loop == false){
            if(noAuxiliar.vd == valorDigitado){
                loop = true;
                //g.setColor(Color.red);
            }else if (valorDigitado < noAuxiliar.vd) {
                loop = verificarValor(noAuxiliar.esq, valorDigitado, loop);
            }else{
                loop = verificarValor(noAuxiliar.dir, valorDigitado, loop);
            }
        }
        return loop;
    }   
    
    /**
     * Creates new form fk
     */
    public funAdicionais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
public class Arvore extends javax.swing.JFrame {
    
    No3 no = null; 
    No2 ra = null;
    funAdicionais arvore = new funAdicionais();
    ABP arv =  new ABP();
    ArvBin arvbin = new ArvBin();
    int valor, valor2;

    public Arvore() {
        initComponents();        
        arvore.add(this.bt_adicionar);
       
        arvore.add(this.bt_buscar);
        arvore.add(this.txt_buscar);
        arvore.add(this.txt_adicionar);        
        add(arvore);
        arvore.setVisible(true);        
        setLocationRelativeTo(null);
        arvore.setSize(720,480);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_adicionar = new javax.swing.JButton();
        txt_adicionar = new javax.swing.JTextField();
        bt_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Arvore Binaria de Pesquisa");

        bt_adicionar.setText("Adicionar");
        bt_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adicionarActionPerformed(evt);
            }
        });

        txt_adicionar.setOpaque(false);

        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        txt_buscar.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_adicionar)
                .addGap(18, 18, 18)
                .addComponent(txt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_buscar)
                .addGap(18, 18, 18)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_adicionar)
                    .addComponent(txt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(446, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adicionarActionPerformed
        if (txt_adicionar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo vazio, digite um número para adicionar");
        }else{
            try {
                String v = txt_adicionar.getText();
                valor = Integer.parseInt(v);
                valor2 = valor;
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            txt_adicionar.setText("");
            if(arvore.verificarValor(no, valor, false)){
                JOptionPane.showMessageDialog(null, "O valor já está contido na árvore");
            }else{
//                arvore.repaint();
                no = arvore.inserir(no, valor);
                arv.insere(valor2);
//                arvbin.
            }  
            if(no == null){  
                JOptionPane.showMessageDialog(null, "Ávore sem Nós, vazia");
            }else{
                no.pX = getWidth() / 2;
                no.pY = getHeight() / 3;
                arvore.showTree(no);
                arvore.drawLine(no, no.pX, no.pY, false);
            }
        }       
    }//GEN-LAST:event_bt_adicionarActionPerformed

    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        if(txt_buscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite um número para fazer a busca");
            txt_buscar.setText(null);
        }
        int x = Integer.parseInt(txt_buscar.getText());
        No2 k = arv.busca(x);
        if(k == null){
            JOptionPane.showMessageDialog(null, "Valor não encontrado na árvore");
        }
        else{
            if(k.getEsq() == ra && k.getDir() == ra){
                JOptionPane.showMessageDialog(null, "Valor: "+k.getConteudo()+" é uma folha");
                txt_buscar.setText(null);
            }
            else if(k.getEsq() == ra){
                JOptionPane.showMessageDialog(null, "Valor: "+k.getConteudo()+" tem No esq: "+k.getDir().getConteudo());
                txt_buscar.setText(null);
            }
            else if(k.getDir() == ra){
                JOptionPane.showMessageDialog(null, "Valor: "+k.getConteudo()+" tem No dir: "+k.getEsq().getConteudo());
                txt_buscar.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Valor: "+k.getConteudo()+
                        " achado entre o No esq: "+k.getEsq().getConteudo()+" e o No dir: "+k.getDir().getConteudo());
                txt_buscar.setText(null); 
            }
        }

    }//GEN-LAST:event_bt_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windon".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arvore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arvore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionar;
    private javax.swing.JButton bt_buscar;
    private javax.swing.JTextField txt_adicionar;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
