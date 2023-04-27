/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.conexion.base.de.datos;

/**
 *
 * @author hp
 */
public class VistaSuperUser extends javax.swing.JFrame {

    String tipoUsuer;
    Usuarios user;
    
    /**
     * Creates new form VistaSuperUser
     */
    public VistaSuperUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        Usuarios user = new Usuarios();
        BaseDatos bd = new BaseDatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accion_realizar = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accion_realizar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Agregar Admin", "Agregar Vendedor", "Agregar Cliente", "Agregar Proveedor", "Bloq. Admin", "Bloq. Vendedor", "Bloq. Proveedor", "Bloq. Cliente", "Registro ventas" }));

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(accion_realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(accion_realizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        tipoUsuer = accion_realizar.getSelectedItem().toString();
        System.out.println(tipoUsuer);
        
        switch (tipoUsuer) {
            case "Agregar Admin":
                System.out.println("AGG ADMIN");
                user.id_Rol = 5;
                CrearVendedor crearV1 = new CrearVendedor(user);
                crearV1.setVisible(true);
                break;

            case "Agregar Vendedor":
                System.out.println("AGG VENDEDOR");
                Usuarios user = new Usuarios();
                BaseDatos bd = new BaseDatos();
                user.id_Rol = 6;
                CrearVendedor crearV2 = new CrearVendedor(user);
                crearV2.setVisible(true);
                break;

            case "Agregar Cliente":
                System.out.println("AGG CLIENTE");
                VistaCrearCliente vistaCreaClie = new VistaCrearCliente();
                vistaCreaClie.setVisible(true);
                break;

            case "Agregar Proveedor":
                System.out.println("AGG PROVEE");
                break;

            case "Bloq. Admin":
                System.out.println("BLOQ ADMIN");
                VistaBloqUsuario vistaBloAdmin = new VistaBloqUsuario();
                vistaBloAdmin.setVisible(true);
                break;

            case "Bloq. Vendedor":
                System.out.println("BLOQ VENDEDOR");
                VistaBloqUsuario vistabloqVend = new VistaBloqUsuario();
                vistabloqVend.setVisible(true);
                break;

            case "Bloq. Proveedor":
                System.out.println("BLOQ PROVEE");
                VistaBloqProveedor vistaBloProvee = new VistaBloqProveedor();
                vistaBloProvee.setVisible(true);
                break;

              case "Bloq. Cliente":
                System.out.println("BLOQ CLIENTE");
                VistaBloqCliente bloqCliente = new VistaBloqCliente();
                bloqCliente.setVisible(true);
                break;
                
            case "Registro ventas":
                System.out.println("REG VENTAS");
                break;
                
            default:
                System.out.println("selecciona alguna");
                break;

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSuperUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaSuperUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accion_realizar;
    private javax.swing.JButton btnAceptar;
    // End of variables declaration//GEN-END:variables
}
