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
   String tipoProd ;
   int cantidad ;
   float total;
    
    
    /**
     * Creates new form VistaVendedor
     */
    public VistaVendedor() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(imgVendedor);
        this.aggImg(this.imgVendedor, "src/tallerpoo/conexion/base/de/datos/cajero.png");    
        DameCliente();
        DameProducto();
        tipoProd = Combo_Producto.getSelectedItem().toString();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valUnit = new javax.swing.JTextField();
        ValorTotal_text = new javax.swing.JTextField();
        cantidadProd_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Combo_Producto = new javax.swing.JComboBox<>();
        mostrarClienteCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        imgVendedor = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ValorTotal_text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ValorTotal_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorTotal_textActionPerformed(evt);
            }
        });

        cantidadProd_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProd_textActionPerformed(evt);
            }
        });

        jLabel1.setText("valor Uni");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mostrarClienteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(valUnit)
                                .addComponent(cantidadProd_text)
                                .addComponent(Combo_Producto, 0, 113, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCalcular)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(imgVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ValorTotal_text, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
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
                        .addComponent(valUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(mostrarClienteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorTotal_text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadProd_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProd_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProd_textActionPerformed

    private void ValorTotal_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTotal_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorTotal_textActionPerformed

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
         
         System.out.println("total venta--> "+total);
         System.out.println("prudocto --> "+ prod.nombre +" id producto --> "+ prod.id);
         System.out.println("precio venta unitario --> "+ prod.precioVenta);
         System.out.println("nombe cliente --> " + cliente.nombre);
         System.out.println("id cliente --> " + cliente.id);
         System.out.println("cantidad --> " + cantidad);
         
         System.out.println("--------------------------fin--------------------------------");

         retro =  bd.RegistrarVenta(cliente , prod , cantidad , total);
         if(retro == 1){
          JOptionPane.showMessageDialog(null, "Venta registrada exitosamente");
         }else{
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
         
         System.out.println("precio venta-->"+prod.precioVenta);
         valUnit.setText(String.valueOf(prod.precioVenta));
         cantidad = Integer.parseInt(cantidadProd_text.getText());
         total = (float) (cantidad * prod.precioVenta);
         ValorTotal_text.setText(String.valueOf(total));
         
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void aggImg(JLabel labelEjm, String ruta){
        
        this.imagen = new ImageIcon(ruta);
        
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        labelEjm.getWidth() ,
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
    
    
    public void DameCliente(){
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
    
    
     public void DameProducto(){
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
    private javax.swing.JTextField ValorTotal_text;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTextField cantidadProd_text;
    private javax.swing.JLabel imgVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> mostrarClienteCB;
    private javax.swing.JTextField valUnit;
    // End of variables declaration//GEN-END:variables
}
