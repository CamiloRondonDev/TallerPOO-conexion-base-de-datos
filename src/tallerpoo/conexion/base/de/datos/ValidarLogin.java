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
import tallerpoo.conexion.base.de.datos.entidades.Productos;

/**
 *
 * @author hp
 */
class ValidarLogin {

    public Usuarios validarUsuario(String id_rol, String cedula, String nombre) {

        Connection con;
        Usuarios user = new Usuarios();
        int rol = 0;

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

            if (id_rol.equals("Administrador")) {
                rol = 5;
            }else if(id_rol.equals("Vendedor")){
               rol = 6;
            }else{
               rol = 7;
            }

            while (rs.next()) {
                user.id = rs.getInt("id");
                user.nombre = rs.getString("nombre");
                user.id_Rol = rs.getInt("idRoles");
                user.dni = rs.getString("dni");
                user.tel = rs.getString("tel");
                user.cel = rs.getString("cel");
                user.mail = rs.getString("mail");
                user.estado = rs.getInt("estado");

//                 System.out.println(user.id);
//                 System.out.println(user.nombre);
//                 System.out.println(user.id_Rol);
//                 System.out.println(user.dni);
//                 System.out.println(user.tel);
//                 System.out.println(user.cel);
//                 System.out.println(user.mail);
//                 System.out.println(user.estado);
//                 
//                 System.out.println("nombre -->"+ nombre);
//                 System.out.println("cedula -->" + cedula);
//                 System.out.println("rol -->"+ rol);
//                 
                if (user.nombre.equals(nombre) && user.dni.equals(cedula) && user.id_Rol == rol) {
                    System.out.println("administrador");
                    user.logAux = rol;
                    return user;
                }
                
                if (user.nombre.equals(nombre) && user.dni.equals(cedula) && user.id_Rol == rol) {
                    System.out.println("Vendedor");
                    user.logAux = rol;
                    return user;
                }
                
                 if (user.nombre.equals(nombre) && user.dni.equals(cedula) && user.id_Rol == rol) {
                    System.out.println("SuperAdmin");
                    user.logAux = rol;
                    return user;
                }
                
                
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de conexion" + e);

        }

        return user;

    }
    
}
