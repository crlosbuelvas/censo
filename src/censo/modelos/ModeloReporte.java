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
    private long id;
    private String tabla;
    private long clave_primaria;
    private long estado;
    private String accion;
    private long usuario;
    
    public ModeloReporte(){
        id = 0;
        tabla = "";
        clave_primaria = 0;
        estado = 0;
        accion = "";
        usuario = 0;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setTabla(String tabla){
        this.tabla = tabla;
    }
    public void setClavePrimaria(long clave_primaria){
        this.clave_primaria = clave_primaria;
    }
    public void setEstado(long estado){
        this.estado = estado;
    }
    public void setAccion(String accion){
        this.accion = accion.toUpperCase();
    }
    public void setUsuario(long usuario){
        this.usuario = usuario;
    }
    
    public long getId(){
        return this.id;
    }
    public String getTabla(){
        return this.tabla;
    }
    public long getClavePrimaria(){
        return this.clave_primaria;
    }
    public long getEstado(){
        return this.estado;
    }
    public String getAccion(){
        return this.accion;
    }
    public long getUsuario(){
        return this.usuario;
    }
}
