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
public class ModeloImagen {
    private int id_imagen = 0;
    private String nombre = "";
    private byte[] imagen = null;
    
    public void setIdImagen(int id_imagen){
        this.id_imagen = id_imagen;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setImagen(byte[] imagen){
        this.imagen = imagen;
    }
    
    public int getIdImagen(){
        return id_imagen;
    }
    public String getNombre(){
        return nombre;
    }
    public byte[] getImagenBytea(){
        return this.imagen;
    }
}
