/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LUIS
 */
public class cliente extends persona {
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
    System.out.println("Nit:  "+ getNit() );
    System.out.println("Nombres:  "+ this.getNombres());
    System.out.println("Apellidos:  "+ this.getApellidos());
    System.out.println("Telefono:  "+ this.getTelefono());
    System.out.println("Direccion:  "+ this.getDireccion());
    System.out.println("Fecha_de_nacimiento:  "+ this.getFecha_de_nacimiento());
    }
    
    @Override
     public void modificar(){
    System.out.println("Nit:  "+ getNit() );
    System.out.println("Nombres:  "+ this.getNombres());
    System.out.println("Apellidos:  "+ this.getApellidos());
    System.out.println("Telefono:  "+ this.getTelefono());
    System.out.println("Direccion:  "+ this.getDireccion());
    System.out.println("Fecha_de_nacimiento:  "+ this.getFecha_de_nacimiento());
    
     }
     @Override
     public void eliminar(){
    System.out.println("Nit:  "+ getNit() );
    System.out.println("Nombres:  "+ this.getNombres());
    System.out.println("Apellidos:  "+ this.getApellidos());
    System.out.println("Telefono:  "+ this.getTelefono());
    System.out.println("Direccion:  "+ this.getDireccion());
    System.out.println("Fecha_de_nacimiento:  "+ this.getFecha_de_nacimiento());
    
        
    }

    public void setNit(JTextField text_nit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombres(JTextField txt_nombres) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setApellidos(JTextField txt_apellidos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDireccion(JTextField txt_direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTelefono(JTextField txt_telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFecha_de_nacimiento(JLabel txt_fn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
}
