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
public class empleado extends persona {
    private String codigo_empelado,puesto;

    public String getCodigo_empelado() {
        return codigo_empelado;
    }

    public void setCodigo_empelado(String codigo_empelado) {
        this.codigo_empelado = codigo_empelado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
    System.out.println("codigo_empelado:  "+ this.codigo_empelado() );
    System.out.println("puesto:  "+ this.puesto() );
    System.out.println("Nombres:  "+ this.getNombres());
    System.out.println("Apellidos:  "+ this.getApellidos());
    System.out.println("Telefono:  "+ this.getTelefono());
    System.out.println("Direccion:  "+ this.getDireccion());
    System.out.println("Fecha_de_nacimiento:  "+ this.getFecha_de_nacimiento());
    
}
    
    @Override
    public void modificar(){
    System.out.println("codigo_empelado:  "+ this.codigo_empelado() );
    System.out.println("puesto:  "+ this.puesto() );
    System.out.println("Nombres:  "+ this.getNombres());
    System.out.println("Apellidos:  "+ this.getApellidos());
    System.out.println("Telefono:  "+ this.getTelefono());
    System.out.println("Direccion:  "+ this.getDireccion());
    System.out.println("Fecha_de_nacimiento:  "+ this.getFecha_de_nacimiento());
    }
    @Override
    public void eliminar(){
    System.out.println("codigo_empelado:  "+ this.codigo_empelado() );
    System.out.println("puesto:  "+ this.puesto() );
    System.out.println("Nombres:  "+ this.getNombres());
    System.out.println("Apellidos:  "+ this.getApellidos());
    System.out.println("Telefono:  "+ this.getTelefono());
    System.out.println("Direccion:  "+ this.getDireccion());
    System.out.println("Fecha_de_nacimiento:  "+ this.getFecha_de_nacimiento());
    }

    private String codigo_empelado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String puesto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNombres(JTextField txt_nombres) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDireccion(JTextField txt_direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTelefono(JTextField txt_telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFecha_de_nacimiento(JLabel txt_fn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setPuesto(JTextField txt_puesto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCodigo_de_empleado(JTextField txt_cde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCodigo_empleado(JTextField txt_cde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

