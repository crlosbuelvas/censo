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
    private int id_usuario;
    private int cod_id;
    private String ape1_usuario;
    private String ape2_usuario;
    private String nom_usuario;
    private String dir_usuario;
    private int tel_usuario;
    private String mail_usuario;
    private int cod_perfil;
    private String contrasena_usuario;
    
    public void setIdUsuario(int id_usuario){ this.id_usuario = id_usuario; }
    public void setCodId(int cod_id){ this.cod_id = cod_id; }
    public void setApe1Usuario(String ape1_usuario){ this.ape1_usuario = ape1_usuario.toUpperCase(); }
    public void setApe2Usuario(String ape2_usuario){ this.ape1_usuario = ape2_usuario.toUpperCase(); }
    public void setNomUsuario(String nom_usuario){ this.nom_usuario = nom_usuario.toUpperCase(); }
    public void setTelUsuario(int tel_usuario){ this.tel_usuario = tel_usuario; }
    public void setMailuUsuario(String mail_usuario){ this.mail_usuario = mail_usuario.toUpperCase(); }
    public void setCodPerfil(int cod_perfil){ this.cod_perfil = cod_perfil; }
    public void setContrasenaUsuario(String contrasena_usuario){ this.contrasena_usuario = contrasena_usuario; }
    
    public int getIdUsuario(){ return this.id_usuario; }
    public int getCodId(){ return this.cod_id; }
    public String getApe1Usuario(){ return this.ape1_usuario; }
    public String getApe2Usuario(){ return this.ape1_usuario; }
    public String getNomUsuario(){ return this.nom_usuario; }
    public int getTelUsuario(){ return this.tel_usuario; }
    public String getMailuUsuario(){ return this.mail_usuario; }
    public int getCodPerfil(){ return this.cod_perfil; }
    public String getContrasenaUsuario(){ return this.contrasena_usuario; }
}
