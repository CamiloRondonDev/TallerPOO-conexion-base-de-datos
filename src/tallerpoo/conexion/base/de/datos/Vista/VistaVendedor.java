/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.conexion.base.de.datos;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.layout.Border;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import tallerpoo.conexion.base.de.datos.entidades.Productos;

/**
 *
 * @author hp
 */
public final class VistaVendedor extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    String tipoUsuer;
    String tipoProd;
    int cantidad = 0;
    float total;

    /**
     * 
     * @param user - trae la informaciòn del vendedor que va a realizar la venta
     */
    public VistaVendedor(Usuarios user) {
        initComponents();
        this.setLocationRelativeTo(null);//centrar ventana
        this.setLocationRelativeTo(imgVendedor);
        this.aggImg(this.imgVendedor, "src/tallerpoo/conexion/base/de/datos/img/cajero.png");
        DameCliente();
        DameProducto();
        tipoProd = Combo_Producto.getSelectedItem().toString();
        mostrarNombreVend.setText(user.nombre);
        valUnit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ValorTotal_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    }

    private VistaVendedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cantidadProd_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Combo_Producto = new javax.swing.JComboBox<>();
        mostrarClienteCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        imgVendedor = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        mostrarNombreVend = new javax.swing.JLabel();
        valUnit = new javax.swing.JLabel();
        ValorTotal_text = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(174, 214, 241));

        cantidadProd_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProd_textActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor Unitario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Valor total");

        Combo_Producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODUCTOS" }));
        Combo_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_ProductoActionPerformed(evt);
            }
        });

        mostrarClienteCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USUARIOS" }));
        mostrarClienteCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarClienteCBActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("VENDEDOR");

        valUnit.setBackground(new java.awt.Color(159, 216, 255));
        valUnit.setOpaque(true);

        ValorTotal_text.setBackground(new java.awt.Color(159, 216, 255));
        ValorTotal_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ValorTotal_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValorTotal_text.setOpaque(true);

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mostrarClienteCB, 0, 113, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadProd_text)
                            .addComponent(Combo_Producto, 0, 113, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCalcular)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ValorTotal_text, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mostrarNombreVend, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mostrarNombreVend)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Combo_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadProd_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(mostrarClienteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ValorTotal_text, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadProd_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProd_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProd_textActionPerformed

    private void Combo_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_ProductoActionPerformed

    private void mostrarClienteCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarClienteCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarClienteCBActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        BaseDatos bd = new BaseDatos();
        Productos prod;
        Cliente cliente;
        int retro;

        prod = bd.ConsultarProductos(tipoProd);
        cliente = bd.ConsultarClientes(tipoUsuer);

        System.out.println("--------------------------ini--------------------------------");

        System.out.println("total venta--> " + total);
        System.out.println("prudocto --> " + prod.nombre + " id producto --> " + prod.id);
        System.out.println("precio venta unitario --> " + prod.precioVenta);
        System.out.println("nombe cliente --> " + cliente.nombre);
        System.out.println("id cliente --> " + cliente.id);
        System.out.println("cantidad --> " + cantidad);

        System.out.println("--------------------------fin--------------------------------");

        retro = bd.RegistrarVenta(cliente, prod, cantidad, total);
        if (retro == 1) {
            JOptionPane.showMessageDialog(null, "Venta registrada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Venta no registrada");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

        BaseDatos bd = new BaseDatos();
        Productos prod = new Productos();
        tipoUsuer = mostrarClienteCB.getSelectedItem().toString();
        tipoProd = Combo_Producto.getSelectedItem().toString();
        System.out.println(" nombre--->> " + tipoUsuer);
        System.out.println(" producto--->> " + tipoProd);

        prod = bd.ConsultarProductos(tipoProd);

        if (prod.stock <= 0) {
            JOptionPane.showMessageDialog(null, "Producto agotado");
        }
        if (tipoUsuer.equals("USUARIOS") || tipoProd.equals("PRODUCTOS")) {
            JOptionPane.showMessageDialog(null, "Seleccione primero");
        } else {
            
            if (cantidadProd_text.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese cantidad");
            } else {
                
                System.out.println("precio venta-->" + prod.precioVenta);
                valUnit.setText(String.valueOf(prod.precioVenta));
                cantidad = Integer.parseInt(cantidadProd_text.getText());
                total = (float) (cantidad * prod.precioVenta);
                ValorTotal_text.setText(String.valueOf(total));
            }
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VistaLogin visLogin = new VistaLogin(); 
        dispose();//para cerrarla al ir a otra 
        visLogin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVendedor().setVisible(true);
            }
        });
    }

    
    /**
     * esta funcion conecta a la base de datos y selecciona todos los clientes
     * para posteriormente mostrarlos en el comboBox de manera dinámica
     */
    public void DameCliente() {
        Connection con;
        Cliente cliente = new Cliente();
        try {
            con = null;
            final String drive = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/poo";
            String userBD = "root";
            String password = "";

            Class.forName(drive);
            con = DriverManager.getConnection(url, userBD, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");
            System.out.println("consulta exitosa");

            while (rs.next()) {
                cliente.setNombre(rs.getNString("nombre"));
                mostrarClienteCB.addItem(cliente.toString());
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);
        }

    }

    /**
     * esta funcion se encarga de conectarse a la base de datos consultar todos los productos
     * para posteriormete mostrarlos en el comboBox de manera dinámica
     */
    public void DameProducto() {
        Connection con;
        Productos prod = new Productos();
        try {
            con = null;
            final String drive = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/poo";
            String userBD = "root";
            String password = "";

            Class.forName(drive);
            con = DriverManager.getConnection(url, userBD, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM producto");
            System.out.println("consulta exitosa");

            while (rs.next()) {
                prod.setNombre(rs.getNString("nombre"));
                Combo_Producto.addItem(prod.toString());
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_Producto;
    private javax.swing.JLabel ValorTotal_text;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cantidadProd_text;
    private javax.swing.JLabel imgVendedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> mostrarClienteCB;
    private javax.swing.JLabel mostrarNombreVend;
    private javax.swing.JLabel valUnit;
    // End of variables declaration//GEN-END:variables
}
