
package InterfaceGrafica;

import java.awt.Color;

/*
 * @author Gean RC
 */

public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        setLocation(170, 110);
        
        getContentPane().setBackground(Color.YELLOW);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilha_bt = new javax.swing.JButton();
        fila_bt = new javax.swing.JButton();
        listaseq_txt = new javax.swing.JButton();
        listaenc_bt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DataStructure");

        pilha_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pilha-Encadeada.png"))); // NOI18N
        pilha_bt.setBorderPainted(false);
        pilha_bt.setContentAreaFilled(false);
        pilha_bt.setFocusPainted(false);
        pilha_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilha_btActionPerformed(evt);
            }
        });

        fila_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fila-Encadeada.png"))); // NOI18N
        fila_bt.setBorderPainted(false);
        fila_bt.setContentAreaFilled(false);
        fila_bt.setFocusPainted(false);
        fila_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fila_btActionPerformed(evt);
            }
        });

        listaseq_txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lista-Sequencial.png"))); // NOI18N
        listaseq_txt.setToolTipText("");
        listaseq_txt.setBorderPainted(false);
        listaseq_txt.setContentAreaFilled(false);
        listaseq_txt.setFocusPainted(false);
        listaseq_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaseq_txtActionPerformed(evt);
            }
        });

        listaenc_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lista-SE.png"))); // NOI18N
        listaenc_bt.setBorderPainted(false);
        listaenc_bt.setContentAreaFilled(false);
        listaenc_bt.setFocusPainted(false);
        listaenc_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaenc_btActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arv. de busca.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lista-DE.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(listaenc_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pilha_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listaseq_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fila_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaseq_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaenc_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fila_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pilha_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilha_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilha_btActionPerformed
        Pilha PE = new Pilha();
        PE.setVisible(true);        
    }//GEN-LAST:event_pilha_btActionPerformed

    private void fila_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fila_btActionPerformed
        Fila FE = new Fila();
        FE.setVisible(true);
    }//GEN-LAST:event_fila_btActionPerformed

    private void listaseq_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaseq_txtActionPerformed
        ListaSequenc ls = new ListaSequenc();
        ls.setVisible(true);
    }//GEN-LAST:event_listaseq_txtActionPerformed

    private void listaenc_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaenc_btActionPerformed
        ListaSe le = new ListaSe();
        le.setVisible(true);
    }//GEN-LAST:event_listaenc_btActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Arvore ar = new Arvore();
       ar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ListaDe de = new ListaDe();
        de.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fila_bt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton listaenc_bt;
    private javax.swing.JButton listaseq_txt;
    private javax.swing.JButton pilha_bt;
    // End of variables declaration//GEN-END:variables
}
