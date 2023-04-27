/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.conexion.base.de.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import tallerpoo.conexion.base.de.datos.entidades.*;

/**
 *
 * @author hp
 */
class BaseDatos {

    Connection con;
    final String DRIVE = "com.mysql.cj.jdbc.Driver";
    final String URL = "jdbc:mysql://localhost:3306/poo";
    final String USER_BD = "root";
    final String PASSWORD = "";

    public void insertarUsuarios(Usuarios user) {

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            String insert = "insert into usuarios (nombre, idRoles, dni , tel , cel , mail )"
                    + "values ('" + user.nombre + "', " + user.id_Rol + ", '" + user.dni + "', '" + user.tel + "', '" + user.cel + "', '" + user.mail + "')";
            System.out.println("resultado--> " + insert);
            int valor = inserData.executeUpdate(insert);
            System.out.println("retorno > " + valor);
            if(user.id_Rol == 5){
             JOptionPane.showMessageDialog(null, "Admin creado exitosamente");
            }else{
             JOptionPane.showMessageDialog(null, "Vendedor creado exitosamente");
            }
            

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

    public Productos ConsultarProductos(String producto) {

        Productos prod = new Productos();

        try {
            con = null;
            final String drive = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/poo";
            String userBD = "root";
            String password = "";

            Class.forName(drive);
            con = DriverManager.getConnection(url, userBD, password);
            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM producto");//consulta a realizar
            //JOptionPane.showMessageDialog(null, "conexion correcta");
            System.out.println("consulta exitosa");

            while (rs.next()) {
                prod.id = rs.getInt("id");
                prod.nombre = rs.getString("nombre");
                prod.precioCompra = rs.getLong("precioCompra");
                prod.precioVenta = rs.getLong("precioVenta");
                prod.stock = rs.getInt("stock");
                prod.estado = rs.getInt("estado");

                if (prod.nombre.equals(producto)) {
                    return prod;
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return prod;

    }

    public int RegistrarVenta(Cliente cliente, Productos product, int cantidad, float total) {

        Productos prod;
        int valor = 0;
        //Cliente cliente;
        Venta venta = new Venta();

        try {
            con = null;

            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            //String insert = "insert into datos (nombre, cedula, correo ) values" + "('" + nombre + "'," + "'" + dni + "',"+ "'" + correo + "')";
            //String insert = "insert into venta (idProducto,idCliente,cantidad,valorUnitario,valorTotal,fecha) values(1 ,2 ,3,2000,6000,CURDATE())";
            String insert = "insert into venta (idProducto,idCliente,cantidad,valorUnitario,valorTotal,fecha) values(" + product.id + "," + cliente.id + " ," + cantidad + "," + product.precioVenta + "," + total + ",CURDATE())";
            System.out.println("-->resultado<--" + insert);
            valor = inserData.executeUpdate(insert);
            System.out.println("retorno > " + valor);
            return valor;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return valor;

    }

    public Cliente ConsultarClientes(String clien) {

        Cliente cliente = new Cliente();

        try {
            con = null;
            final String drive = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/poo";
            String userBD = "root";
            String password = "";

            Class.forName(drive);
            con = DriverManager.getConnection(url, userBD, password);
            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");//consulta a realizar
            //JOptionPane.showMessageDialog(null, "conexion correcta");
            System.out.println("consulta exitosa");

            while (rs.next()) {
                cliente.id = rs.getInt("id");
                cliente.nombre = rs.getString("nombre");
                cliente.dni = rs.getString("dni");
                cliente.tel = rs.getString("tel");
                cliente.cel = rs.getString("cel");
                cliente.mail = rs.getString("mail");
                cliente.direccion = rs.getString("direccion");

                if (cliente.nombre.equals(clien)) {
                    return cliente;
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return cliente;

    }

    public void insertarClientes(Cliente cliente) {

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            String insert = "insert into cliente (nombre, dni, tel , cel , mail, direccion)"
                    + "values ('" + cliente.nombre + "', '" + cliente.dni + "', '" + cliente.tel + "', '" + cliente.cel + "', '" + cliente.mail + "', '" + cliente.direccion + "')";
            System.out.println("resultado--> " + insert);
            int valor = inserData.executeUpdate(insert);
            System.out.println("retorno > " + valor);
            JOptionPane.showMessageDialog(null, "Cliente creado exitosamente");

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }
    
       public void DesactivarUsuario(Usuarios usuarios) {

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            String update = "update usuarios set estado = 0 where dni = " +usuarios.dni;
            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            JOptionPane.showMessageDialog(null, "Usuario bloqueado exitosamente");

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

       
    public void DesactivarClientes(Cliente clientes) {

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            String update = "update cliente set estado = 0 where dni = " + clientes.dni;
            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            JOptionPane.showMessageDialog(null, "Usuario bloqueado exitosamente");

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }
    
        public void DesactivarProveedor(Proveedores provee) {

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            String update = "update proveedor set estado = 0 where nit = " +provee.nit;
            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            if(valor ==1 ){
            JOptionPane.showMessageDialog(null, "Porveedor bloqueado exitosamente");
            }
            

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }
        
    public void insertarProveedor(Proveedores provee) {

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            String insert = "insert into proveedor (nombre, nit, tel , cel , mail, direccion)"
                    + "values ('" + provee.nombre + "', '" + provee.nit + "', '" + provee.tel + "', '" + provee.cel + "', '" + provee.mail + "', '" + provee.direccion + "')";
            System.out.println("resultado--> " + insert);
            int valor = inserData.executeUpdate(insert);
            System.out.println("retorno > " + valor);
            if(valor == 1){
            JOptionPane.showMessageDialog(null, "Proveefor creado exitosamente");
            }else{
             JOptionPane.showMessageDialog(null, "Error al crear Proveedor");
            }
            

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

}
