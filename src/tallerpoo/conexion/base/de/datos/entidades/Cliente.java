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
class Cliente {
    public int id;
    public String nombre;
    public String dni;
    public String tel;
    public String cel ;
    public String mail;
    public String direccion;
    public int estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
    
    
}