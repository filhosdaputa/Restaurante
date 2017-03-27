/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.restaurante.visual;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import static br.com.restaurante.modelo.VerificaSenha.verificaSenha;

/**
 *
 * @author christian
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFLogin
     */
    public JFLogin() {
        initComponents();
        jtxtInvalidos.setVisible(false);
        this.setTitle("Restaurante - Identificação de Entrada");
        jtxtUsuario.setText("suporte");
        jlblAlerta.setVisible(false);
        testeCaixaAltaAlerta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblUsuario = new javax.swing.JLabel();
        jlblSenha = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jpwdSenha = new javax.swing.JPasswordField();
        jbtnEntrar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jtxtInvalidos = new javax.swing.JLabel();
        jlblAlerta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jlblUsuario.setText("Usuário:");
        getContentPane().add(jlblUsuario);
        jlblUsuario.setBounds(30, 90, 60, 17);

        jlblSenha.setText("Senha:");
        getContentPane().add(jlblSenha);
        jlblSenha.setBounds(30, 150, 47, 17);

        jtxtUsuario.setToolTipText("Nome do Usuário");
        jtxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtUsuario);
        jtxtUsuario.setBounds(110, 80, 230, 27);

        jpwdSenha.setToolTipText("Palavra chave/senha");
        jpwdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpwdSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jpwdSenha);
        jpwdSenha.setBounds(110, 140, 230, 27);

        jbtnEntrar.setText("Entrar");
        jbtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEntrar);
        jbtnEntrar.setBounds(106, 190, 110, 29);

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCancelar);
        jbtnCancelar.setBounds(230, 190, 110, 29);

        jtxtInvalidos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jtxtInvalidos.setForeground(java.awt.Color.red);
        jtxtInvalidos.setText("Usuário/Senha inválido");
        jtxtInvalidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jtxtInvalidos);
        jtxtInvalidos.setBounds(150, 60, 170, 17);

        jlblAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/restaurante/visual/imagens/alerta.png"))); // NOI18N
        jlblAlerta.setToolTipText("Caps Lock Ligado");
        jlblAlerta.setFocusable(false);
        getContentPane().add(jlblAlerta);
        jlblAlerta.setBounds(350, 70, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/restaurante/visual/imagens/churrasco-04.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jpwdSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpwdSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbtnEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_jpwdSenhaKeyPressed

    private void jbtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEntrarActionPerformed
        String passText = new String(jpwdSenha.getPassword());
        String comparaSenha;
        try {
            comparaSenha = verificaSenha(passText);
        } catch (NoSuchAlgorithmException e) {
        }
        if (passText.equals("") && jtxtUsuario.getText().equalsIgnoreCase("suporte")) {
            new JFPrincipal().setVisible(true);
            this.dispose();

        } else {
            Toolkit.getDefaultToolkit().beep();
            jtxtInvalidos.setVisible(true);
            jtxtUsuario.requestFocus();
            limparCampos();
        }
    }//GEN-LAST:event_jbtnEntrarActionPerformed

    private void jtxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyPressed
        testeCaixaAltaAlerta();
    }//GEN-LAST:event_jtxtUsuarioKeyPressed

    private void jtxtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyReleased
        testeCaixaAltaAlerta();
    }//GEN-LAST:event_jtxtUsuarioKeyReleased

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    private void testeCaixaAltaAlerta() {
        if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK) == true) {
            Toolkit.getDefaultToolkit().beep();
            jlblAlerta.setVisible(true);
        } else {
            Toolkit.getDefaultToolkit().beep();
            jlblAlerta.setVisible(false);
        }
    }

    private void limparCampos() {
        jtxtUsuario.setText(null);
        jpwdSenha.setText(null);
        jtxtUsuario.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEntrar;
    private javax.swing.JLabel jlblAlerta;
    private javax.swing.JLabel jlblSenha;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPasswordField jpwdSenha;
    private javax.swing.JLabel jtxtInvalidos;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
