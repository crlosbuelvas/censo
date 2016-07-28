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
public class ModeloReporte {
    private int id;
    private String tabla;
    private int clave_primaria;
    private int estado;
    private String accion;
    private int usuario;
    
    public ModeloReporte(){
        id = 0;
        tabla = "";
        clave_primaria = 0;
        estado = 0;
        accion = "";
        usuario = 0;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setTabla(String tabla){
        this.tabla = tabla;
    }
    public void setClavePrimaria(int clave_primaria){
        this.clave_primaria = clave_primaria;
    }
    public void setEstado(int estado){
        this.estado = estado;
    }
    public void setAccion(String accion){
        this.accion = accion.toUpperCase();
    }
    public void setUsuario(int usuario){
        this.usuario = usuario;
    }
    
    public int getId(){
        return this.id;
    }
    public String getTabla(){
        return this.tabla;
    }
    public int getClavePrimaria(){
        return this.clave_primaria;
    }
    public int getEstado(){
        return this.estado;
    }
    public String getAccion(){
        return this.accion;
    }
    public int getUsuario(){
        return this.usuario;
    }
}
