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
public class ModeloPerfil {
    private long cod_perfil;
    private String desc_perfil;
    
    public void setCodPerfil(long cod){
        this.cod_perfil = cod;
    }
    public void setDescripcionPerfil(String desc){
        this.desc_perfil = desc.toLowerCase();
    }
    public long getCodPerfil(){
        return this.cod_perfil;
    }
    public String getDescripcionPerfil(){
        return this.desc_perfil;
    }
}
