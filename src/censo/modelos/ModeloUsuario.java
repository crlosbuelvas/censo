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
    private long numero_de_documento;
    private String apellido1;
    private String apellido2;
    private String nombre;
    private String direccion;
    private long telefono;
    private String correo;
    private long cod_perfil;
    private String contrasena_usuario;
    
    public ModeloUsuario(){
        id_usuario = 0;
        numero_de_documento = 0;
        apellido1 = "";
        apellido2 = "";
        nombre = "";
        direccion = "";
        telefono = 0;
        correo = "";
        cod_perfil = 0;
        contrasena_usuario = "";
    }
    
    public void setIdUsuario(long id_usuario){ this.id_usuario = id_usuario; }
    public void setNumeroDeDocumento(long numero_de_documento){ this.numero_de_documento = numero_de_documento; }
    public void setApellido1(String apellido1){ this.apellido1 = apellido1.toUpperCase(); }
    public void setApellido2(String apellido2){ this.apellido2 = apellido2.toUpperCase(); }
    public void setNombre(String nombre){ this.nombre = nombre.toUpperCase(); }
    public void setTelefono(long telefono){ this.telefono = telefono; }
    public void setCorreo(String correo){ this.correo = correo.toUpperCase(); }
    public void setCodPerfil(long cod_perfil){ this.cod_perfil = cod_perfil; }
    public void setDireccion(String direccion){ this.direccion = direccion.toUpperCase(); }
    public void setContrasenaUsuario(String contrasena_usuario){ this.contrasena_usuario = contrasena_usuario; }
    
    public long getIdUsuario(){ return this.id_usuario; }
    public long getNumeroDeDocumento(){ return this.numero_de_documento; }
    public String getApellido1(){ return this.apellido1; }
    public String getApellido2(){ return this.apellido2; }
    public String getNombre(){ return this.nombre; }
    public long getTelefono(){ return this.telefono; }
    public String getCorreo(){ return this.correo; }
    public long getCodPerfil(){ return this.cod_perfil; }
    public String getDireccion(){ return this.direccion; }
    public String getContrasenaUsuario(){ return this.contrasena_usuario; }
}
