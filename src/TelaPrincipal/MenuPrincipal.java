/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaPrincipal;

import Funcionario.AdicionarFunci;
import Funcionario.AlterarExcluirFunci;
import Funcionario.ConsultarFunci;

import Login.AdicionarCredenciais;
import Login.AlterarExcluirCredenciais;
import Login.ConsultarCredenciais;

import Projeto.AdicionarProjeto;
import Projeto.AlterarExcluirProjeto;
import Projeto.ConsultarProjeto;


/**
 *
 * @author gabri
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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
        btnAdicionarFunci = new javax.swing.JButton();
        btnConsultarFunci = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnAdicionarCreden = new javax.swing.JButton();
        btnConsultarCreden = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnAdicionarProjeto = new javax.swing.JButton();
        btnConsultarProjeto = new javax.swing.JButton();
        btnAlterarExcluirFunci = new javax.swing.JButton();
        btnAlterarExcluirCreden = new javax.swing.JButton();
        btnAlterarExcluirProjeto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        btnAdicionarFunci.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAdicionarFunci.setText("Adicionar");
        btnAdicionarFunci.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdicionarFunci.setBorderPainted(false);
        btnAdicionarFunci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarFunciActionPerformed(evt);
            }
        });

        btnConsultarFunci.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnConsultarFunci.setText("Consultar");
        btnConsultarFunci.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultarFunci.setBorderPainted(false);
        btnConsultarFunci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFunciActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel1.setText("Funcionário");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel2.setText("Credências");

        btnAdicionarCreden.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAdicionarCreden.setText("Adicionar");
        btnAdicionarCreden.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdicionarCreden.setBorderPainted(false);
        btnAdicionarCreden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarCreden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCredenActionPerformed(evt);
            }
        });

        btnConsultarCreden.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnConsultarCreden.setText("Consultar");
        btnConsultarCreden.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultarCreden.setBorderPainted(false);
        btnConsultarCreden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCreden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCredenActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("Projeto");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        btnAdicionarProjeto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAdicionarProjeto.setText("Adicionar");
        btnAdicionarProjeto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdicionarProjeto.setBorderPainted(false);
        btnAdicionarProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProjetoActionPerformed(evt);
            }
        });

        btnConsultarProjeto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnConsultarProjeto.setText("Consultar");
        btnConsultarProjeto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultarProjeto.setBorderPainted(false);
        btnConsultarProjeto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProjetoActionPerformed(evt);
            }
        });

        btnAlterarExcluirFunci.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAlterarExcluirFunci.setText("Alterar/Excluir");
        btnAlterarExcluirFunci.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterarExcluirFunci.setBorderPainted(false);
        btnAlterarExcluirFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarExcluirFunciActionPerformed(evt);
            }
        });

        btnAlterarExcluirCreden.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAlterarExcluirCreden.setText("Alterar/Excluir");
        btnAlterarExcluirCreden.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterarExcluirCreden.setBorderPainted(false);
        btnAlterarExcluirCreden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarExcluirCredenActionPerformed(evt);
            }
        });

        btnAlterarExcluirProjeto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAlterarExcluirProjeto.setText("Alterar/Excluir");
        btnAlterarExcluirProjeto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAlterarExcluirProjeto.setBorderPainted(false);
        btnAlterarExcluirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarExcluirProjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionarFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarExcluirFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionarCreden, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarExcluirCreden, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarCreden, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarExcluirProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarExcluirFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCreden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarCreden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarExcluirCreden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarExcluirProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFunciActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ConsultarFunci().setVisible(true);
    }//GEN-LAST:event_btnConsultarFunciActionPerformed

    private void btnAdicionarFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFunciActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdicionarFunci().setVisible(true);
    }//GEN-LAST:event_btnAdicionarFunciActionPerformed

    private void btnAdicionarCredenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCredenActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdicionarCredenciais().setVisible(true);
    }//GEN-LAST:event_btnAdicionarCredenActionPerformed

    private void btnAdicionarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProjetoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdicionarProjeto().setVisible(true);
    }//GEN-LAST:event_btnAdicionarProjetoActionPerformed

    private void btnConsultarCredenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCredenActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ConsultarCredenciais().setVisible(true);
    }//GEN-LAST:event_btnConsultarCredenActionPerformed

    private void btnConsultarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProjetoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ConsultarProjeto().setVisible(true);
    }//GEN-LAST:event_btnConsultarProjetoActionPerformed

    private void btnAlterarExcluirFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarExcluirFunciActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlterarExcluirFunci().setVisible(true);
    }//GEN-LAST:event_btnAlterarExcluirFunciActionPerformed

    private void btnAlterarExcluirCredenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarExcluirCredenActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlterarExcluirCredenciais().setVisible(true);
    }//GEN-LAST:event_btnAlterarExcluirCredenActionPerformed

    private void btnAlterarExcluirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarExcluirProjetoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AlterarExcluirProjeto().setVisible(true);
    }//GEN-LAST:event_btnAlterarExcluirProjetoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCreden;
    private javax.swing.JButton btnAdicionarFunci;
    private javax.swing.JButton btnAdicionarProjeto;
    private javax.swing.JButton btnAlterarExcluirCreden;
    private javax.swing.JButton btnAlterarExcluirFunci;
    private javax.swing.JButton btnAlterarExcluirProjeto;
    private javax.swing.JButton btnConsultarCreden;
    private javax.swing.JButton btnConsultarFunci;
    private javax.swing.JButton btnConsultarProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
