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
public class ModeloUsuario {
    private long id_usuario;
    private long cod_id;
    private String ape1_usuario;
    private String ape2_usuario;
    private String nom_usuario;
    private String dir_usuario;
    private long tel_usuario;
    private String mail_usuario;
    private long cod_perfil;
    private String contrasena_usuario;
    
    public ModeloUsuario(){
        id_usuario = 0;
        cod_id = 0;
        ape1_usuario = "";
        ape2_usuario = "";
        nom_usuario = "";
        dir_usuario = "";
        tel_usuario = 0;
        mail_usuario = "";
        cod_perfil = 0;
        contrasena_usuario = "";
    }
    
    public void setIdUsuario(long id_usuario){ this.id_usuario = id_usuario; }
    public void setCodId(long cod_id){ this.cod_id = cod_id; }
    public void setApe1Usuario(String ape1_usuario){ this.ape1_usuario = ape1_usuario.toUpperCase(); }
    public void setApe2Usuario(String ape2_usuario){ this.ape1_usuario = ape2_usuario.toUpperCase(); }
    public void setNomUsuario(String nom_usuario){ this.nom_usuario = nom_usuario.toUpperCase(); }
    public void setTelUsuario(long tel_usuario){ this.tel_usuario = tel_usuario; }
    public void setMailuUsuario(String mail_usuario){ this.mail_usuario = mail_usuario.toUpperCase(); }
    public void setCodPerfil(long cod_perfil){ this.cod_perfil = cod_perfil; }
    public void setDir(String dir_usuario){ this.dir_usuario = dir_usuario.toUpperCase(); }
    public void setContrasenaUsuario(String contrasena_usuario){ this.contrasena_usuario = contrasena_usuario; }
    
    public long getIdUsuario(){ return this.id_usuario; }
    public long getCodId(){ return this.cod_id; }
    public String getApe1Usuario(){ return this.ape1_usuario; }
    public String getApe2Usuario(){ return this.ape1_usuario; }
    public String getNomUsuario(){ return this.nom_usuario; }
    public long getTelUsuario(){ return this.tel_usuario; }
    public String getMailuUsuario(){ return this.mail_usuario; }
    public long getCodPerfil(){ return this.cod_perfil; }
    public String getDir(){ return this.dir_usuario; }
    public String getContrasenaUsuario(){ return this.contrasena_usuario; }
}
