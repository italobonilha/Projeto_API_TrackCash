/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import modelo.CanaisDTO;

/**
 *
 * @author debor
 */
public class frmLoginTokenGUI extends javax.swing.JFrame {
    
    private CanaisDTO canais;
    public frmLoginTokenGUI(CanaisDTO canais) {
        initComponents();
        this.canais = canais;
        
}                                            


     /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
*/
    @SuppressWarnings("unchecked")
           
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtToken = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGerarToken = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastro1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo_padrao.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtToken.setToolTipText("");
        txtToken.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        txtToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTokenActionPerformed(evt);
            }
        });
        getContentPane().add(txtToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 290, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("    ADICIONAR NOVO CANAL");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 0)));
        jLabel3.setMaximumSize(new java.awt.Dimension(242, 43));
        jLabel3.setMinimumSize(new java.awt.Dimension(242, 43));
        jLabel3.setPreferredSize(new java.awt.Dimension(242, 43));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 490, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("PADRÃO DE AUTENTICAÇÃO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        btnGerarToken.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGerarToken.setForeground(new java.awt.Color(51, 0, 51));
        btnGerarToken.setText("Gerar");
        btnGerarToken.setActionCommand("");
        btnGerarToken.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        btnGerarToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarTokenActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerarToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Token");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 90, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, -1, -1));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(51, 0, 51));
        btnVoltar.setText("Voltar");
        btnVoltar.setActionCommand("");
        btnVoltar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 120, 40));

        btnCadastro1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCadastro1.setForeground(new java.awt.Color(51, 0, 51));
        btnCadastro1.setText("Adicionar");
        btnCadastro1.setActionCommand("");
        btnCadastro1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        btnCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 120, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo_padrao.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1020, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTokenActionPerformed

    private void btnGerarTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarTokenActionPerformed
  
    }//GEN-LAST:event_btnGerarTokenActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frmAnteLoginGUI objfrmantelogingui = new frmAnteLoginGUI();
        objfrmantelogingui.setVisible(true); //abri a pagina se o login for correto

        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastro1ActionPerformed
          String  token, tipo, nome, canal;

        token = txtToken.getText();
        canal = canais.getCanal();
        tipo = canais.getTipo();
        nome = canais.getNome();
        
        

        CanaisDTO objCanaisDTO = new CanaisDTO();
        objCanaisDTO.setToken(token);
        objCanaisDTO.setCanal(canal);
        objCanaisDTO.setTipo(tipo);
        objCanaisDTO.setNome(nome);
        

        UsuarioDAO objCanalDAO = new UsuarioDAO();
        objCanalDAO.cadastrarCanal(objCanaisDTO);

        JOptionPane.showMessageDialog(null, "Cadastro feito!");
        
        dispose();
        
        
        frmListaUserGUI objListausergui = new frmListaUserGUI();
        objListausergui.setVisible(true);  //abri a pagina se o login for correto
                
        dispose();
                                             

    }//GEN-LAST:event_btnCadastro1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLoginTokenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginTokenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginTokenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginTokenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro1;
    private javax.swing.JButton btnGerarToken;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtToken;
    // End of variables declaration//GEN-END:variables
}
