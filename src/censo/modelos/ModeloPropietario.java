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
public class ModeloPropietario {
    private long id_propietario;
    private long tipo_id;//cedula
    private String ape1_pro;
    private String ape2_pro;
    private String dir_pro;
    private String estrato_pro;
    private String ciudad_pro;
    private String licencia;
    private String sexo_pro;
    private String nacimiento_pro;
    private String personas_cargo;
    private long n_hijos;
    private String estado_civil;
    private String escolaridad_pro;
    private String profecion_pro;
    private String salud_pro;
    private String nom_pro;
    private String placa;
    private String tipo_documento;
    
    public ModeloPropietario(){
        id_propietario = 0;
        tipo_id = 0;
        ape1_pro = "";
        ape2_pro = "";
        dir_pro = "";
        estrato_pro = "";
        ciudad_pro = "";
        licencia = "";
        sexo_pro = "";
        nacimiento_pro = "";
        personas_cargo = "";
        n_hijos = 0;
        estado_civil = "";
        escolaridad_pro = "";
        profecion_pro = "";
        salud_pro = "";
        nom_pro = "";
        placa = "";
        tipo_documento = "";
    }
    
    public void setIdPropietario(long id_propietario){ this.id_propietario = id_propietario; }
    public void setTipoId(long tipo_id){ this.tipo_id = tipo_id; }
    public void setApe1Pro(String ape1_pro){ this.ape1_pro = ape1_pro.toUpperCase(); }
    public void setApe2Pro(String ape2_pro){ this.ape2_pro = ape2_pro.toUpperCase(); }
    public void setDirPro(String dir_pro){ this.dir_pro = dir_pro.toUpperCase(); }
    public void setEstratoPro(String estrato_pro){ this.estrato_pro = estrato_pro.toUpperCase(); }
    public void setCiudadPro(String ciudad_pro){ this.ciudad_pro = ciudad_pro.toUpperCase(); }
    public void setLicencia(String licencia){ this.licencia = licencia.toUpperCase(); }
    public void setSexoPro(String sexo_pro){ this.sexo_pro = sexo_pro.toUpperCase(); }
    public void setNacimientoPro(String nacimiento_pro){ this.nacimiento_pro = nacimiento_pro.toUpperCase(); }
    public void setPersonasCargo(String personas_cargo){ this.personas_cargo = personas_cargo.toUpperCase(); }
    public void setNHijos(long n_hijos){ this.n_hijos = n_hijos; }
    public void setEstadoCivil(String estado_civil){ this.estado_civil = estado_civil.toUpperCase(); }
    public void setEscolaridadPro(String escolaridad_pro){ this.escolaridad_pro = escolaridad_pro.toUpperCase(); }
    public void setProfecionPro(String profecion_pro){ this.profecion_pro = profecion_pro.toUpperCase(); }
    public void setSaludPro(String salud_pro){ this.salud_pro = salud_pro.toUpperCase(); }
    public void setNomPro(String nom_pro){ this.nom_pro = nom_pro.toUpperCase(); }
    public void setPlaca(String placa){ this.placa = placa.toUpperCase(); }
    public void setTipoDocumento(String tipo_documento){ this.tipo_documento = tipo_documento.toUpperCase(); }
    
    public long getIdPropietario(){ return this.id_propietario; }
    public long getTipoId(){ return this.tipo_id; }
    public String getApe1Pro(){ return this.ape1_pro; }
    public String getApe2Pro(){ return this.ape2_pro; }
    public String getDirPro(){ return this.dir_pro; }
    public String getEstratoPro(){ return this.estrato_pro; }
    public String getCiudadPro(){ return this.ciudad_pro; }
    public String getLicencia(){ return this.licencia; }
    public String getSexoPro(){ return this.sexo_pro; }
    public String getNacimientoPro(){ return this.nacimiento_pro; }
    public String getPersonasCargo(){ return this.personas_cargo; }
    public long getNHijos(){ return this.n_hijos; }
    public String getEstadoCivil(){ return this.estado_civil; }
    public String getEscolaridadPro(){ return this.escolaridad_pro; }
    public String getProfecionPro(){ return this.profecion_pro; }
    public String getSaludPro(){ return this.salud_pro; }
    public String getNomPro(){ return this.nom_pro; }
    public String getPlaca(){ return this.placa; }
    public String getTipoDocumento(){ return this.tipo_documento; }
}
