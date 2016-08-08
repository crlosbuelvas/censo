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
    private long n_censo = 0;
    private String nombre = "";
    private byte[] imagen = null;
    
    public void setNCenso(long n_censo){
        this.n_censo = n_censo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setImagen(byte[] imagen){
        this.imagen = imagen;
    }
    
    public long getNCenso(){
        return n_censo;
    }
    public String getNombre(){
        return nombre;
    }
    public byte[] getImagenBytea(){
        return this.imagen;
    }
}
