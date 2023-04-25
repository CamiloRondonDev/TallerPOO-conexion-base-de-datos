/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.conexion.base.de.datos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
            Statement  inserData = con.createStatement();
            System.out.println("correcto conexion insert");

            
            String insert = "insert into usuarios (nombre, idRoles, dni , tel , cel , mail )"
            + "values ('" + user.nombre + "', " + user.id_Rol + ", '" + user.dni + "', '" + user.tel + "', '" + user.cel + "', '" + user.mail + "')";
            System.out.println("resultado--> "+insert);
            int valor =  inserData.executeUpdate(insert);
            System.out.println("retorno > " + valor);
            JOptionPane.showMessageDialog(null, "Vendedor creado exitosamente");
            

        } catch (Exception e) {
            System.out.println("error de conexion" + e);
        }

    }

}

