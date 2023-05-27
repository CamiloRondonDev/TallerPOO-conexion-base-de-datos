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
class Proveedores {
    int id;
    String nit;
    String tel;
    String cel;
    String mail;
    String direccion;
    int estado;
    
        String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  id +"-"+nombre;
    }
    
    
}
