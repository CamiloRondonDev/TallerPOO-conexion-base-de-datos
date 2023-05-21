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
public class VistaCrearProducto extends javax.swing.JFrame {

    Productos prod = new Productos();
    BaseDatos bd = new BaseDatos();
    DefaultTableModel modeloTablaProd = new DefaultTableModel();
    int aux;
    /**
     * Creates new form VistaCrearProducto
     */
    public VistaCrearProducto() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar ventana
        modeloTablaProd.addColumn("NOMBRE");
        modeloTablaProd.addColumn("PRECIO COMPRA");
        modeloTablaProd.addColumn("PRECIO VENTA");
        modeloTablaProd.addColumn("STOCK");
        modeloTablaProd.addColumn("ESTADO");
        this.tabla_Productos.setModel(modeloTablaProd);
        
       prod = bd.ConsultarProductosTabla(tabla_Productos ,modeloTablaProd);
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precioVen_id = new javax.swing.JTextField();
        nombre_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stock_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        precioCom_id = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_actu_prod = new javax.swing.JButton();
        btnAgregar_prod = new javax.swing.JButton();
        btn_desac_prod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtras.setText("<- atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tabla_Productos.setAutoCreateRowSorter(true);
        tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nombre", "precio Compra", "precio Venta", "Stock", "estado"
            }
        ));
        tabla_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_Productos);

        jLabel2.setText("NOMBRE");

        jLabel5.setText("PRECIO VENTA");

        jLabel3.setText("STOCK");

        jLabel7.setText("PRECIO COMPRA");

        precioCom_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioCom_idActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(nombre_id, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(precioVen_id, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(precioCom_id, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioCom_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(precioVen_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_actu_prod.setText("ACTUALIZAR");
        btn_actu_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actu_prodActionPerformed(evt);
            }
        });

        btnAgregar_prod.setText("AGREGAR");
        btnAgregar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_prodActionPerformed(evt);
            }
        });

        btn_desac_prod.setText("DESACTIVAR");
        btn_desac_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desac_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnAgregar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actu_prod)
                        .addGap(32, 32, 32)
                        .addComponent(btn_desac_prod)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actu_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_desac_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        dispose();//para cerrarla al ir a otra
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btn_desac_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desac_prodActionPerformed

                bd.DesactivarProducto(prod, aux);
                DefaultTableModel model = (DefaultTableModel) tabla_Productos.getModel();
                model.setRowCount(0);
                bd.ConsultarProductosTabla(tabla_Productos ,modeloTablaProd);
    }//GEN-LAST:event_btn_desac_prodActionPerformed

    private void btnAgregar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_prodActionPerformed
        // TODO add your handling code here:
                prod.nombre = nombre_id.getText();
                prod.precioCompra = Double.parseDouble( precioCom_id.getText());
                prod.precioVenta = Double.parseDouble(precioVen_id.getText());
                prod.stock = Integer.parseInt( stock_id.getText());

        
                bd.insertarProductos(prod);
                DefaultTableModel model = (DefaultTableModel) tabla_Productos.getModel();
                model.setRowCount(0);
                bd.ConsultarProductosTabla(tabla_Productos ,modeloTablaProd);
    }//GEN-LAST:event_btnAgregar_prodActionPerformed

    private void btn_actu_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actu_prodActionPerformed

                prod.nombre = nombre_id.getText();
                prod.precioCompra = Double.parseDouble( precioCom_id.getText());
                prod.precioVenta = Double.parseDouble(precioVen_id.getText());
                prod.stock = Integer.parseInt( stock_id.getText());
                
                bd.ActualizarProductos(prod);
                DefaultTableModel model = (DefaultTableModel) tabla_Productos.getModel();
                model.setRowCount(0);
                bd.ConsultarProductosTabla(tabla_Productos ,modeloTablaProd);
    }//GEN-LAST:event_btn_actu_prodActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void precioCom_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioCom_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioCom_idActionPerformed

    private void tabla_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ProductosMouseClicked
        // TODO add your handling code here:
                int rowIndex = tabla_Productos.getSelectedRow();
                String nombre = tabla_Productos.getValueAt(rowIndex, 0).toString();
                prod = bd.ConsultarProductosNombre(nombre);
                nombre_id.setText(prod.nombre);
                precioCom_id.setText(String.valueOf(prod.precioCompra));
                precioVen_id.setText(String.valueOf(prod.precioVenta));
                stock_id.setText(String.valueOf( prod.stock));

        
                if(prod.estado == 0){
                        btn_desac_prod.setText("ACTIVAR");
                        aux = 1;
                    }else if (prod.estado == 1){
                        btn_desac_prod.setText("DESACTIVAR");
                        aux = 0;
                    }
        
    }//GEN-LAST:event_tabla_ProductosMouseClicked

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
            java.util.logging.Logger.getLogger(VistaCrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCrearProducto().setVisible(true);
            }
        });
    }

    public static boolean ValirdarNumero(String dat){
        try {
            int num = Integer.parseInt(dat);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
        
    public void limpiar(){
        nombre_id.setText("");
        precioCom_id.setText("");
        precioVen_id.setText("");
        stock_id.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_prod;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btn_actu_prod;
    private javax.swing.JButton btn_desac_prod;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_id;
    private javax.swing.JTextField precioCom_id;
    private javax.swing.JTextField precioVen_id;
    private javax.swing.JTextField stock_id;
    private javax.swing.JTable tabla_Productos;
    // End of variables declaration//GEN-END:variables
}
