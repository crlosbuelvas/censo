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
public class ModeloPersona {
    private long id_persona;
    private long numero_de_documento;
    private int n_censo;
    private int tipo_de_persona;
    private int personas_a_cargo;
    private int numero_de_hijos;
    private int estrato;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String ciudad;
    private String licencia;
    private String sexo;
    private String nacimiento;
    private String estado_civil;
    private String escolaridad;
    private String profecion;
    private String salud;
    private String nombre;
    private String placa;
    private String tipo_documento;
    
    public ModeloPersona(){
        id_persona = 0;
        numero_de_documento = 0;
        n_censo = 0;
        tipo_de_persona = 0;
        personas_a_cargo = 0;
        numero_de_hijos = 0;
        estrato = 0;
        apellido1 = "";
        apellido2 = "";
        direccion = "";
        ciudad = "";
        licencia = "";
        sexo = "";
        nacimiento = "";
        estado_civil = "";
        escolaridad = "";
        profecion = "";
        salud = "";
        nombre = "";
        placa = "";
        tipo_documento = "";
    }
    
    public void setIdPersona(long id_persona){ this.id_persona = id_persona; }
    public void setNumeroDeDocumento(long numero_de_documento){ this.numero_de_documento = numero_de_documento; }
    public void setNCenso(int n_censo){ this.n_censo = n_censo; }
    public void setTipoDePersona(int tipo_de_persona){ this.tipo_de_persona = tipo_de_persona; }
    public void setPersonasCargo(int personas_a_cargo){ this.personas_a_cargo = personas_a_cargo; }
    public void setNumeroDeHijos(int numero_de_hijos){ this.numero_de_hijos = numero_de_hijos; }
    public void setEstratoPro(int estrato){ this.estrato = estrato; }
    public void setApellido1(String apellido1){ this.apellido1 = apellido1.toUpperCase(); }
    public void setApellido2(String apellido2){ this.apellido2 = apellido2.toUpperCase(); }
    public void setDireccion(String direccion){ this.direccion = direccion.toUpperCase(); }
    public void setCiudad(String ciudad){ this.ciudad = ciudad.toUpperCase(); }
    public void setLicencia(String licencia){ this.licencia = licencia.toUpperCase(); }
    public void setSexo(String sexo){ this.sexo = sexo.toUpperCase(); }
    public void setNacimiento(String nacimiento){ this.nacimiento = nacimiento.toUpperCase(); }
    public void setEstadoCivil(String estado_civil){ this.estado_civil = estado_civil.toUpperCase(); }
    public void setEscolaridad(String escolaridad){ this.escolaridad = escolaridad.toUpperCase(); }
    public void setProfecion(String profecion){ this.profecion = profecion.toUpperCase(); }
    public void setSalud(String salud){ this.salud = salud.toUpperCase(); }
    public void setNombre(String nombre){ this.nombre = nombre.toUpperCase(); }
    public void setPlaca(String placa){ this.placa = placa.toUpperCase(); }
    public void setTipoDocumento(String tipo_documento){ this.tipo_documento = tipo_documento.toUpperCase(); }
    
    public long getIdPersona(){ return this.id_persona; }
    public long getNumeroDeDocumento(){ return this.numero_de_documento; }
    public int getNCenso(){ return this.n_censo; }
    public int getTipoDePersona(){ return this.tipo_de_persona; }
    public int getPersonasCargo(){ return this.personas_a_cargo; }
    public int getNumeroHijos(){ return this.numero_de_hijos; }
    public int getEstrato(){ return this.estrato; }
    public String getApellido1(){ return this.apellido1; }
    public String getApellido2(){ return this.apellido2; }
    public String getDireccion(){ return this.direccion; }
    public String getCiudad(){ return this.ciudad; }
    public String getLicencia(){ return this.licencia; }
    public String getSexo(){ return this.sexo; }
    public String getNacimiento(){ return this.nacimiento; }
    public String getEstadoCivil(){ return this.estado_civil; }
    public String getEscolaridad(){ return this.escolaridad; }
    public String getProfecion(){ return this.profecion; }
    public String getSalud(){ return this.salud; }
    public String getNom(){ return this.nombre; }
    public String getPlaca(){ return this.placa; }
    public String getTipoDocumento(){ return this.tipo_documento; }
}
