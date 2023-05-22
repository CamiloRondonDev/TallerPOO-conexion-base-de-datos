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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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

    /**
     * se encarga de realizar la conexion a la base de datos y realizar la
     * insercion de los mismos
     *
     * @param user - informacion de los usuarios a insertar
     */
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
            if (user.id_Rol == 5) {
                JOptionPane.showMessageDialog(null, "Admin creado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Vendedor creado exitosamente");
            }

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }
    
         public Usuarios ConsultarUsuarioTabla(JTable tabla, DefaultTableModel modeloTabla) {
        Usuarios user = new Usuarios();
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement consulVenta = con.createStatement();
            System.out.println("correcto conexion Consulta Venta");

            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");//consulta a realizar
            System.out.println("consulta exitosa");

            while (rs.next()) {
                user.id = rs.getInt("id");
                user.nombre = rs.getString("nombre");
                user.dni = rs.getString("dni");
                user.tel = rs.getString("tel");
                user.cel = rs.getString("cel");
                user.mail = rs.getString("mail");
                user.estado = rs.getInt("estado");
                user.id_Rol = rs.getInt("idRoles");


                String[] info = new String[6];
                info[0] = String.valueOf(user.nombre);
                info[1] = String.valueOf(user.dni);
                info[2] = String.valueOf(user.cel);
                info[3] = String.valueOf(user.mail);
                //info[4] = String.valueOf(user.id_Rol);
                info[5] = String.valueOf(user.estado);
                if(user.id_Rol == 7){
                   info[4] = "Super-Admin";
                }else if(user.id_Rol == 5){
                   info[4] = "Admin";
                }else{
                   info[4] = "Vendedor";
                }
                             
                modeloTabla.addRow(info);
            }
            return user;

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }
        return user;

    }
      public Usuarios ConsultarUsuariosID(String clien) {

        Usuarios user = new Usuarios();

        try {
            con = null;
            final String drive = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/poo";
            String userBD = "root";
            String password = "";

            Class.forName(drive);
            con = DriverManager.getConnection(url, userBD, password);
            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");//consulta a realizar
            //JOptionPane.showMessageDialog(null, "conexion correcta");
            System.out.println("consulta exitosa");

            while (rs.next()) {
                user.id = rs.getInt("id");
                user.nombre = rs.getString("nombre");
                user.id_Rol = Integer.parseInt(rs.getString("idRoles"));
                user.dni = rs.getString("dni");
                user.cel = rs.getString("cel");
                user.tel = rs.getString("tel");
                user.mail = rs.getString("mail");
                user.estado = rs.getInt("estado");

                if (user.dni.equals(clien)) {
                    return user;
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return user;

    }

         
      
        public void ActualizarUsuario(Usuarios user) {

        String update;
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            update = "update usuarios set nombre = '" + user.nombre + "', dni = '" + user.dni + "', tel = '" + user.tel + "', cel = '" + user.cel + "', mail = '" + user.mail + "', idRoles = " + user.id_Rol + " where id = " + user.id;

            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            if (valor == 1) {
                JOptionPane.showMessageDialog(null, "Porveedor bloqueado exitosamente");
            }


        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }
    /**
     *
     * @param producto
     * @return
     */
    public Productos ConsultarProductos(String producto, int id_prod, int val) {

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

                if (val == 1) { //consulta por nombre
                    if (prod.nombre.equals(producto)) {
                        return prod;
                    }
                } else if (val == 2) {//consulta por id_producto
                    if (prod.id == id_prod) {
                        return prod;
                    }
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return prod;

    }

    public Productos ConsultarProductosNombre(String producto) {

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

    public Productos ConsultarProductosTabla(JTable tabla, DefaultTableModel modeloTabla) {
        Productos produc = new Productos();
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement consulVenta = con.createStatement();
            System.out.println("correcto conexion Consulta Venta");

            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM producto");//consulta a realizar
            System.out.println("consulta exitosa");

            while (rs.next()) {
                produc.id = rs.getInt("id");
                produc.nombre = rs.getString("nombre");
                produc.precioCompra = rs.getFloat("precioCompra");
                produc.precioVenta = rs.getFloat("precioVenta");
                produc.stock = rs.getInt("stock");
                produc.estado = rs.getInt("estado");

                String[] info = new String[5];
                info[0] = String.valueOf(produc.nombre);
                info[1] = String.valueOf(produc.precioCompra);
                info[2] = String.valueOf(produc.precioVenta);
                info[3] = String.valueOf(produc.stock);
                info[4] = String.valueOf(produc.estado);

                modeloTabla.addRow(info);
            }
            return produc;

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }
        return produc;

    }

    public void DesactivarProducto(Productos prod, int accion) {

        String update;
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            if (accion == 1) {
                update = "update producto set estado = 1 where id = " + prod.id;
            } else {
                update = "update producto set estado = 0 where id = " + prod.id;
            }

            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            if (valor == 1) {
                JOptionPane.showMessageDialog(null, "bloqueado exitosamente");
            }

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }
    public void ActualizarProductos(Productos prod) {

        String update;
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            update = "update producto set nombre = '" + prod.nombre + "', precioCompra = " + prod.precioCompra + ", precioVenta = " + prod.precioVenta + ", stock = " + prod.stock + " where id = " + prod.id;

            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            if (valor == 1) {
                JOptionPane.showMessageDialog(null, "correcto");
            }

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

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

    public Cliente ConsultarClientes(String clien, int client_id, int val) {

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

                if (val == 1) {//buscar por nombre

                    if (cliente.nombre.equals(clien)) {
                        return cliente;
                    }

                } else if (val == 2) {//buscar por id_cliente
                    if (cliente.id == client_id) {
                        return cliente;
                    }
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return cliente;

    }
     public Cliente ConsultarClientesID(String clien) {

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
                cliente.estado = rs.getInt("estado");

                if (cliente.dni.equals(clien)) {
                    return cliente;
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return cliente;

    }
    
     public Cliente ConsultarClientesTabla(JTable tabla, DefaultTableModel modeloTabla) {
        Cliente cliente = new Cliente();
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement consulVenta = con.createStatement();
            System.out.println("correcto conexion Consulta Venta");

            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente");//consulta a realizar
            System.out.println("consulta exitosa");

            while (rs.next()) {
                cliente.id = rs.getInt("id");
                cliente.nombre = rs.getString("nombre");
                cliente.dni = rs.getString("dni");
                cliente.tel = rs.getString("tel");
                cliente.cel = rs.getString("cel");
                cliente.mail = rs.getString("mail");
                cliente.direccion = rs.getString("direccion");
                cliente.estado = rs.getInt("estado");


                String[] info = new String[6];
                info[0] = String.valueOf(cliente.nombre);
                info[1] = String.valueOf(cliente.dni);
                info[2] = String.valueOf(cliente.cel);
                info[3] = String.valueOf(cliente.mail);
                info[4] = String.valueOf(cliente.direccion);
                info[5] = String.valueOf(cliente.estado);
                

                modeloTabla.addRow(info);
            }
            return cliente;

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
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
        public void ActualizarCliente(Cliente clientes) {

        String update;
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            update = "update cliente set nombre = '" + clientes.nombre + "', dni = '" + clientes.dni + "', tel = '" + clientes.tel + "', cel = '" + clientes.cel + "', mail = '" + clientes.mail + "', direccion = '" + clientes.direccion + "' where id = " + clientes.id;

            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            if (valor == 1) {
                JOptionPane.showMessageDialog(null, "Porveedor bloqueado exitosamente");
            }


        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

    public void DesactivarUsuario(Usuarios usuarios, int accion) {
        String update = null;

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            if (accion == 1) {
                update = "update usuarios set estado = 1 where id = " + usuarios.id;
            } else if (accion == 0) {
                update = "update usuarios set estado = 0 where id = " + usuarios.id;
            }

            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            JOptionPane.showMessageDialog(null, "Usuario bloqueado exitosamente");

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

    public void DesactivarClientes(Cliente clientes, int accion) {
        String update;

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            if(accion == 1){
             update = "update cliente set estado = 1 where id = " + clientes.id;
            }else{
             update = "update cliente set estado = 0 where id = " + clientes.id;
            }
            
            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            JOptionPane.showMessageDialog(null, "exito");

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

    public void DesactivarProveedor(Proveedores provee, int accion) {

        String update;
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            if (accion == 1) {
                update = "update proveedor set estado = 1 where nit = " + provee.nit;
            } else {
                update = "update proveedor set estado = 0 where nit = " + provee.nit;
            }

            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            if (valor == 1) {
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
            if (valor == 1) {
                JOptionPane.showMessageDialog(null, "Proveefor creado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear Proveedor");
            }

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

    public Venta ConsultarVenta(JTable tabla, DefaultTableModel modeloTabla) {

        Venta venta = new Venta();
        Cliente cliente;
        Productos prod;

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement consulVenta = con.createStatement();
            System.out.println("correcto conexion Consulta Venta");

            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM venta");//consulta a realizar
            System.out.println("consulta exitosa");

            while (rs.next()) {
                venta.id = rs.getInt("id");
                venta.idProducto = rs.getInt("idProducto");
                venta.idCliente = rs.getInt("idCliente");
                venta.cantidad = rs.getInt("cantidad");
                venta.valorUnitario = rs.getFloat("valorUnitario");
                venta.valorTotal = rs.getFloat("valorTotal");
                venta.fecha = rs.getString("fecha");

                cliente = ConsultarClientes("", venta.idCliente, 2);
                prod = ConsultarProductos("", venta.idProducto, 2);

                String[] info = new String[5];
                info[0] = String.valueOf(cliente.nombre);
                info[1] = String.valueOf(prod.nombre);
                info[2] = String.valueOf(venta.cantidad);
                info[3] = String.valueOf(venta.valorTotal);
                info[4] = venta.fecha;
                modeloTabla.addRow(info);
            }
            return venta;

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }
        return venta;

    }

    public void insertarProductos(Productos prod) {

        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            String insert = "insert into producto (nombre, precioCompra, precioVenta , stock)"
                    + "values ('" + prod.nombre + "', " + prod.precioCompra + ", " + prod.precioVenta + ", " + prod.stock + ")";
            System.out.println("resultado--> " + insert);
            int valor = inserData.executeUpdate(insert);
            System.out.println("retorno > " + valor);
            JOptionPane.showMessageDialog(null, "Cliente creado exitosamente");

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

    public Proveedores ConsultarProveedores(JTable tabla, DefaultTableModel modeloTabla) {
        Proveedores proveed = new Proveedores();
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement consulVenta = con.createStatement();
            System.out.println("correcto conexion Consulta Venta");

            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM proveedor");//consulta a realizar
            System.out.println("consulta exitosa");

            while (rs.next()) {
                proveed.id = rs.getInt("id");
                proveed.nombre = rs.getString("nombre");
                proveed.nit = rs.getString("nit");
                proveed.tel = rs.getString("tel");
                proveed.cel = rs.getString("cel");
                proveed.mail = rs.getString("mail");
                proveed.direccion = rs.getString("direccion");
                proveed.estado = rs.getInt("estado");

                String[] info = new String[5];
                info[0] = String.valueOf(proveed.nombre);
                info[1] = String.valueOf(proveed.nit);
                info[2] = String.valueOf(proveed.mail);
                info[3] = String.valueOf(proveed.direccion);
                info[4] = String.valueOf(proveed.estado);

                modeloTabla.addRow(info);
            }
            return proveed;

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }
        return proveed;

    }

    public Proveedores ConsultarProveeNit(String prov_nit) {

        Proveedores proveed = new Proveedores();

        try {
            con = null;
            final String drive = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/poo";
            String userBD = "root";
            String password = "";

            Class.forName(drive);
            con = DriverManager.getConnection(url, userBD, password);
            Statement stmt = con.createStatement();// se crea para poder dar instrucciones a  la base de datos
            ResultSet rs = stmt.executeQuery("SELECT * FROM proveedor");//consulta a realizar
            //JOptionPane.showMessageDialog(null, "conexion correcta");
            System.out.println("consulta exitosa");

            while (rs.next()) {
                proveed.id = rs.getInt("id");
                proveed.nombre = rs.getString("nombre");
                proveed.nit = rs.getString("nit");
                proveed.tel = rs.getString("tel");
                proveed.cel = rs.getString("cel");
                proveed.mail = rs.getString("mail");
                proveed.direccion = rs.getString("direccion");
                proveed.estado = rs.getInt("estado");

                if (proveed.nit.equals(prov_nit)) {
                    return proveed;
                }
            }
            return proveed;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }
        return proveed;
    }

    public void ActualizarProveedor(Proveedores provee) {

        String update;
        try {
            con = null;
            Class.forName(DRIVE);
            con = DriverManager.getConnection(URL, USER_BD, PASSWORD);
            Statement inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            update = "update proveedor set nombre = '" + provee.nombre + "', nit = '" + provee.nit + "', tel = '" + provee.tel + "', cel = '" + provee.cel + "', mail = '" + provee.mail + "', direccion = '" + provee.direccion + "' where nit = " + provee.nit;

            System.out.println("resultado--> " + update);
            int valor = inserData.executeUpdate(update);
            System.out.println("retorno > " + valor);
            if (valor == 1) {
                JOptionPane.showMessageDialog(null, "Porveedor bloqueado exitosamente");
            }


        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }
}
