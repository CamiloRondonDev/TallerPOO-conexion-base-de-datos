/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tallerpoo.conexion.base.de.datos;
//package tallerpoo.conexion.base.de.datos;
package tallerpoo.conexion.base.de.datos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import tallerpoo.conexion.base.de.datos.VistaSuperUser;

/**
 *
 * @author Camilo Rondon
 */
public class VistaLogin extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    private int aux = 0;

    public VistaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar ventana
        this.setLocationRelativeTo(imgLogin);
        this.aggImg(this.imgLogin, "src/tallerpoo/conexion/base/de/datos/img/imgLogin.png");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cedula_text = new javax.swing.JTextField();
        nombre_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JComboBox<>();
        imgLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cedula_text.setText("1616");
        cedula_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_textActionPerformed(evt);
            }
        });

        nombre_text.setText("admin");
        nombre_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_textActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel3.setText("CEDULA");

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Super-Usuario" }));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cedula_text, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_text, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cedula_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_text, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedula_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_textActionPerformed

    private void nombre_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_textActionPerformed

    private void TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TipoUsuarioActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tipoUsuer = TipoUsuario.getSelectedItem().toString();
        String cedula = cedula_text.getText().toString();
        String nombre = nombre_text.getText().toString();

        if (cedula.equals("") || nombre.equals("")) {//validar que no vengan vacios los campos
            JOptionPane.showMessageDialog(null, "llena todo los datos");
            aux = 1;
        }

        ValidarLogin valLogin = new ValidarLogin();
        Usuarios user;

        user = valLogin.validarUsuario(tipoUsuer, cedula, nombre);
 
        //validar a que vista ir
        if (user.logAux == 5 && user.estado == 1) {
            dispose();//para cerrarla al ir a otra 
            VistaAdmin vistaAdmin = new VistaAdmin(user);
            vistaAdmin.setVisible(true);
        } else if (user.logAux == 6 && user.estado == 1) {
            dispose();//para cerrarla al ir a otra 
            VistaVendedor vistaVendedor = new VistaVendedor(user);
            vistaVendedor.setVisible(true);
        } else if (user.logAux == 7 && user.estado == 1) {
            dispose();//para cerrarla al ir a otra 
            VistaSuperUser vistaSuper = new VistaSuperUser();
            vistaSuper.setVisible(true);
        } else {
            if (aux == 0) {
                JOptionPane.showMessageDialog(null, "usuario no resgistrasdo o bloqueado");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     *
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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    /**
     * funcion para agregar imgagen en el label de forma dinámica al espacio
     * @param labelEjm label donde quiero que la imagen se adapte de forma dinamica
     * @param ruta ruta especifica de la imagen a mostrar
     */
    private void aggImg(JLabel labelEjm, String ruta) {

        this.imagen = new ImageIcon(ruta);

        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        labelEjm.getWidth(),
                        labelEjm.getHeight(),
                        Image.SCALE_DEFAULT)
        );
        labelEjm.setIcon(icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JTextField cedula_text;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombre_text;
    // End of variables declaration//GEN-END:variables
}
