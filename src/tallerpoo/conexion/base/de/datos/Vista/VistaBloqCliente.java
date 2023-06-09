/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.conexion.base.de.datos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tallerpoo.conexion.base.de.datos.entidades.Productos;

/**
 *
 * @author hp
 */
public class VistaBloqCliente extends javax.swing.JFrame {

    /**
     * Creates new form VistaBloqCliente
     */
    DefaultTableModel modeloTablaCliente = new DefaultTableModel();
    Cliente cliente = new Cliente();
    BaseDatos bd = new BaseDatos();
    int aux;

    public VistaBloqCliente() {
        initComponents();
         this.setLocationRelativeTo(null);//centrar ventana
        modeloTablaCliente.addColumn("NOMBRE");
        modeloTablaCliente.addColumn("DNI");
        modeloTablaCliente.addColumn("CEL");
        modeloTablaCliente.addColumn("MAIL");
        modeloTablaCliente.addColumn("DIRECCION");
        modeloTablaCliente.addColumn("ESTADO");
        this.tabla_Clientes.setModel(modeloTablaCliente);
        
       cliente = bd.ConsultarClientesTabla(tabla_Clientes ,modeloTablaCliente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Clientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cel_id = new javax.swing.JTextField();
        nombre_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        correo_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccion_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dni_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tel_id = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_actu_cliente = new javax.swing.JButton();
        btnAgregar_cliente = new javax.swing.JButton();
        btn_desac_cliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/conexion/base/de/datos/img/back.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tabla_Clientes.setAutoCreateRowSorter(true);
        tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nombre", "dni", "cel", "mail", "direccion"
            }
        ));
        tabla_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Clientes);

        jLabel2.setText("NOMBRE");

        jLabel5.setText("CEL");

        jLabel3.setText("CORREO");

        jLabel4.setText("DIRECCION");

        jLabel7.setText("DNI");

        dni_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dni_idActionPerformed(evt);
            }
        });

        jLabel1.setText("TEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGap(25, 25, 25))
                        .addComponent(jLabel4)
                        .addComponent(nombre_id, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(correo_id)
                        .addComponent(direccion_id))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cel_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dni_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(tel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dni_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(direccion_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_actu_cliente.setText("ACTUALIZAR");
        btn_actu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actu_clienteActionPerformed(evt);
            }
        });

        btnAgregar_cliente.setText("AGREGAR");
        btnAgregar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_clienteActionPerformed(evt);
            }
        });

        btn_desac_cliente.setText("DESACTIVAR");
        btn_desac_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desac_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 497, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnAgregar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_actu_cliente)
                                .addGap(32, 32, 32)
                                .addComponent(btn_desac_cliente)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_actu_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_desac_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        dispose();//para cerrarla al ir a otra

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tabla_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ClientesMouseClicked
        // TODO add your handling code here:
        int rowIndex = tabla_Clientes.getSelectedRow();
        String dni = tabla_Clientes.getValueAt(rowIndex, 1).toString();
        cliente = bd.ConsultarClientesID(dni);
        nombre_id.setText(cliente.nombre);
        dni_id.setText(cliente.dni);
        cel_id.setText(cliente.cel);
        correo_id.setText(cliente.mail);
        direccion_id.setText(cliente.direccion);
        tel_id.setText(cliente.tel);

        if(cliente.estado == 0){
            btn_desac_cliente.setText("ACTIVAR");
            aux = 1;
        }else if (cliente.estado == 1){
            btn_desac_cliente.setText("DESACTIVAR");
            aux = 0;
        }


    }//GEN-LAST:event_tabla_ClientesMouseClicked

    private void dni_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dni_idActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        dni_id.setEnabled(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_actu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actu_clienteActionPerformed
        // TODO add your handling code here:
        cliente.nombre = nombre_id.getText();
        cliente.dni = dni_id.getText();
        cliente.mail = correo_id.getText();
        cliente.direccion = direccion_id.getText();
        cliente.tel = tel_id.getText();
        cliente.cel = cel_id.getText();

        bd.ActualizarCliente(cliente);
        DefaultTableModel model = (DefaultTableModel) tabla_Clientes.getModel();
        model.setRowCount(0);
        cliente = bd.ConsultarClientesTabla(tabla_Clientes ,modeloTablaCliente);
    }//GEN-LAST:event_btn_actu_clienteActionPerformed

    private void btnAgregar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_clienteActionPerformed
        // TODO add your handling code here:
        
        cliente.nombre = nombre_id.getText();
        cliente.dni = dni_id.getText();
        cliente.mail = correo_id.getText();
        cliente.direccion = direccion_id.getText();
        cliente.tel = tel_id.getText();
        cliente.cel = cel_id.getText();

        bd.insertarClientes(cliente);
        DefaultTableModel model = (DefaultTableModel) tabla_Clientes.getModel();
        model.setRowCount(0);
        cliente = bd.ConsultarClientesTabla(tabla_Clientes ,modeloTablaCliente);

    }//GEN-LAST:event_btnAgregar_clienteActionPerformed

    private void btn_desac_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desac_clienteActionPerformed
        // TODO add your handling code here:

        System.out.println( btn_desac_cliente.getText());

      //  cliente.id =  dni_id.getText();
        bd.DesactivarClientes(cliente, aux);
        DefaultTableModel model = (DefaultTableModel) tabla_Clientes.getModel();
        model.setRowCount(0);
        cliente = bd.ConsultarClientesTabla(tabla_Clientes ,modeloTablaCliente);
    }//GEN-LAST:event_btn_desac_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(VistaBloqCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBloqCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBloqCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBloqCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBloqCliente().setVisible(true);
            }
        });
    }

       public void limpiar(){
        nombre_id.setText("");
        dni_id.setText("");
        cel_id.setText("");
        correo_id.setText("");
        direccion_id.setText("");
        tel_id.setText("");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_cliente;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btn_actu_cliente;
    private javax.swing.JButton btn_desac_cliente;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JTextField cel_id;
    private javax.swing.JTextField correo_id;
    private javax.swing.JTextField direccion_id;
    private javax.swing.JTextField dni_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_id;
    private javax.swing.JTable tabla_Clientes;
    private javax.swing.JTextField tel_id;
    // End of variables declaration//GEN-END:variables
}
