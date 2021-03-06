
package InterfaceGrafica;

import Implementacoes.FilaEnc;
import Implementacoes.ListaSeq;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 * @author Gean RC
 */

public class Fila extends javax.swing.JFrame {

    public Fila() {
        initComponents();
        createBufferStrategy(1);
        setLocationRelativeTo(null);
    }
    
    Graphics l;    
    FilaEnc fila = new FilaEnc();
    //lista pra desenhar
    ListaSeq lista = new ListaSeq();
    //eixo em destaque X
    int x = 20;
    String v = new String();    
    int valor, posicao;
    int elementos = 0;
    
    public boolean validarValor(){
        if(valor_txt.getText().isEmpty()){
            //Verifica se tem campo vazio
            JOptionPane.showMessageDialog(this, "Campo vazio! Por favor preencha!", "Campo vazio", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
                //verifica se foram colocados valores errados
            try {
                Integer.parseInt(valor_txt.getText());
            }catch (NumberFormatException e){
                //Exibe a mensagem de erro caso digitem errado
                JOptionPane.showMessageDialog(this, "Entrada invalida! Apenas numeros", "Invalido!", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inserir_Bt = new javax.swing.JButton();
        remover_Bt = new javax.swing.JButton();
        inicio_bt = new javax.swing.JButton();
        valor_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        elementos_txt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicio_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fila Encadeada");

        inserir_Bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inserir_Bt.setText("Inserir");
        inserir_Bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserir_BtActionPerformed(evt);
            }
        });

        remover_Bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        remover_Bt.setText("Remover");
        remover_Bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_BtActionPerformed(evt);
            }
        });

        inicio_bt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inicio_bt.setText("Inicio");
        inicio_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio_btActionPerformed(evt);
            }
        });

        valor_txt.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Elementos:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inicio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(609, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elementos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(inicio_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inserir_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remover_Bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valor_txt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(inicio_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(inicio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(elementos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inserir_Bt)
                .addGap(18, 18, 18)
                .addComponent(remover_Bt)
                .addGap(18, 18, 18)
                .addComponent(inicio_bt)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserir_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserir_BtActionPerformed
        l = getBufferStrategy().getDrawGraphics();
        if(validarValor()){            
            //se nao for vazia desenha ligacao
            if(fila.vazia()==false){
                //linha horizontal
                l.setColor(Color.BLUE);
                l.drawLine(x-15, 210, x, 210); 
                l.setColor(Color.BLACK);
            } 
            //pega os valores digitados e coloca na lista
            valor = Integer.parseInt(valor_txt.getText());            
            fila.insere(valor); 
            //informa o numero de elementos na lista
            elementos++;
            elementos_txt.setText(Integer.toString(elementos));
            //lista pra desenhar
            lista.insere(elementos, valor); 
            //quadrado
            l.drawRect(x,200,30 ,20);
            //string com os valores
            l.drawString(valor_txt.getText(),x+10, 210);            
            x = x+45;
            l.dispose();
            getBufferStrategy().show(); 
            //limpa os valores
            valor_txt.setText(null);
            inicio_txt.setText(null);
        }
    }//GEN-LAST:event_inserir_BtActionPerformed

    private void remover_BtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_BtActionPerformed
        l = getBufferStrategy().getDrawGraphics();
        if(fila.vazia()){
            JOptionPane.showMessageDialog(rootPane, "Fila", "ERRO", HEIGHT);
        }
        //limpa
        l.clearRect(0, 190,x+100, 500);
        fila.remove();
        lista.remove(1);
        x = 20;
        //reescreve 
        for (int k = 1; k<elementos; k++){
            if(k==1){
                //quadrado
                l.drawRect(x,200,30 ,20);
                //string com os valores
                v = Integer.toString(lista.elemento(k));
                l.drawString(v,x+10, 210);
                x = x+45;
            }
            //se nao for 1 desenha a ligacao
            else{
                //quadrado
                l.drawRect(x, 200, 30, 20);
                //string com os valores
                v = Integer.toString(lista.elemento(k));                
                l.drawString(v,x+10, 210);
                //linha horizontal 
                l.setColor(Color.BLUE);
                l.drawLine(x-15, 210, x, 210);
                l.setColor(Color.BLACK);
                x = x+45;
            }
        }
        l.dispose();
        getBufferStrategy().show();
        //informa o numero de elementos na lista
        elementos--; 
        elementos_txt.setText(Integer.toString(elementos));   
        //limpa os valores
        valor_txt.setText(null);
        inicio_txt.setText(null);
    }//GEN-LAST:event_remover_BtActionPerformed
    private void inicio_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio_btActionPerformed
        int v = fila.inicio(); 
        if(v>=0){
            int q = fila.inicio();
            String t = Integer.toString(q);
            inicio_txt.setText(t);            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Fila vazia", "ERRO", HEIGHT);
        }
    }//GEN-LAST:event_inicio_btActionPerformed

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
                if ("Windown".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elementos_txt;
    private javax.swing.JButton inicio_bt;
    private javax.swing.JLabel inicio_txt;
    private javax.swing.JButton inserir_Bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton remover_Bt;
    private javax.swing.JTextField valor_txt;
    // End of variables declaration//GEN-END:variables
}
