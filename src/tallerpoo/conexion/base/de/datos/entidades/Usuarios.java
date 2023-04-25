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
class Usuarios {
    int id ;
    String nombre;
    int id_Rol;
    String dni;
    String cel;
    String tel;
    String mail;
    int estado;
    int logAux;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(int id_Rol) {
        this.id_Rol = id_Rol;
    }

    @Override
    public String toString() {
        return nombre;
    }

//    @Override
//    public String toString() {
//        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", id_Rol=" + id_Rol + ", dni=" + dni + ", cel=" + cel + ", tel=" + tel + ", mail=" + mail + ", estado=" + estado + ", logAux=" + logAux + '}';
//    }
    


}
