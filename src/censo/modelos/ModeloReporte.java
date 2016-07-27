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
    private int accion;
    private int usuario;
    
    public ModeloReporte(){
        id = 0;
        tabla = "";
        clave_primaria = 0;
        estado = 0;
        accion = 0;
        usuario = 0;
    }
}
