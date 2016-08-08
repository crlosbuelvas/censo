/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.modelos;

/**
 *
 * @author Admin
 */
public class ModeloConductor {
    
    private long id_conductor;
    private long n_censo;
    private long cedula;
    private String nit;
    private String apllido1;
    private String apellido2;
    private String nombre;
    
    public ModeloConductor(){
        n_censo = 0;
        cedula = 0;
        nit = "";
        id_conductor = 0;
        apllido1 = "";
        apellido2 = "";
        nombre = "";
    }
    
    public void setIdConductor(long id_conductor){ this.id_conductor = id_conductor; }
    public void setNCenso(long n_censo){ this.n_censo = n_censo; }
    public void setCedula(long cedula){ this.cedula = cedula; }
    public void setNit(String nit){ this.nit = nit.toUpperCase(); }
    public void setApelllido1(String apllido1){ this.apllido1 = apllido1.toUpperCase(); }
    public void setApellido2(String apellido2){ this.apellido2 = apellido2.toUpperCase(); }
    public void setNombre(String nombre){ this.nombre = nombre.toUpperCase(); }
    
    public long getIdConductor(){ return this.id_conductor; }
    public long getNCenso(){ return this.n_censo; }
    public long getCedula(){ return this.cedula; }
    public String getNit(){ return this.nit; }
    public String getApellido1(){ return this.apllido1; }
    public String getApellido2(){ return this.apellido2; }
    public String getNombre(){ return this.nombre; }
}
