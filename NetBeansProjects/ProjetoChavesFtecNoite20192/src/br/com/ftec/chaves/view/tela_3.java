/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.view;

import br.com.ftec.chaves.model.Sala;
import javax.swing.JOptionPane;

/**
 *
 * @author bernadete.abegg
 */
public class tela_3 extends javax.swing.JFrame {

    /**
     * Creates new form tela_3
     */
    public tela_3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbsala = new javax.swing.JLabel();
        lbdescr = new javax.swing.JLabel();
        lbcapac = new javax.swing.JLabel();
        lbtipo = new javax.swing.JLabel();
        tfsala = new javax.swing.JTextField();
        tfdescr = new javax.swing.JTextField();
        tfcapac = new javax.swing.JTextField();
        tftipo = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        lbsala.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbsala.setForeground(new java.awt.Color(255, 255, 255));
        lbsala.setText("Sala");

        lbdescr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbdescr.setForeground(new java.awt.Color(255, 255, 255));
        lbdescr.setText("Descrição");

        lbcapac.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbcapac.setForeground(new java.awt.Color(255, 255, 255));
        lbcapac.setText("Capacidade");

        lbtipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbtipo.setForeground(new java.awt.Color(255, 255, 255));
        lbtipo.setText("Tipo");

        tfsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsalaActionPerformed(evt);
            }
        });

        tfdescr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdescrActionPerformed(evt);
            }
        });

        btnsalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btncancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbsala)
                        .addComponent(lbdescr)
                        .addComponent(lbtipo)
                        .addComponent(lbcapac)
                        .addComponent(btnsalvar))
                    .addGap(39, 39, 39)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btncancelar)
                        .addComponent(tfsala)
                        .addComponent(tfdescr)
                        .addComponent(tfcapac)
                        .addComponent(tftipo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(304, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbsala)
                        .addComponent(tfsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbdescr)
                        .addComponent(tfdescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbcapac)
                        .addComponent(tfcapac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbtipo)
                        .addComponent(tftipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsalvar)
                        .addComponent(btncancelar))
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdescrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdescrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdescrActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // Sala sal
        Sala sala = new Sala();
        sala.setSala(tfsala.getText());
        sala.setCapacidade(tfcapac.getText());
        sala.setDescricao(tfdescr.getText());
        sala.setTipo(tftipo.getText());
        String mensagem = "sala:"+sala.getSala( )+
        "\n capacidade:"+sala.getCapacidade()+
        "\n tipo:"+sala.getTipo( )+
        "\n OBS:"+sala.getDescricao()+
        "\n \n Salvo com Sucesso!";
        int confirma = JOptionPane.showConfirmDialog(this,"Deseja Salvar os"+ 
                "dados da seguinte sala \n"+mensagem);
        if(confirma==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this,"Salvo com Sucesso");
        }else if(confirma == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this,"Operacao cancelada");
        Principal p = new Principal();
        p.setVisible(true);
                }else{           
    }//GEN-LAST:event_btnsalvarActionPerformed
}
    private void tfsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsalaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcapac;
    private javax.swing.JLabel lbdescr;
    private javax.swing.JLabel lbsala;
    private javax.swing.JLabel lbtipo;
    private javax.swing.JTextField tfcapac;
    private javax.swing.JTextField tfdescr;
    private javax.swing.JTextField tfsala;
    private javax.swing.JTextField tftipo;
    // End of variables declaration//GEN-END:variables
}
