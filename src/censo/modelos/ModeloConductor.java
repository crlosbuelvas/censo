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
public class ModeloConductor {
    private long cod_conductor;
    private String nit;
    private long id_conductor;
    private String ape1_con;
    private String ape2_con;
    private String nom_con;
    
    public void setCodConductor(long cod_conductor){ this.cod_conductor = cod_conductor; }
    public void setNit(String nit){ this.nit = nit.toUpperCase(); }
    public void setIdConductor(long id_conductor){ this.id_conductor = id_conductor; }
    public void setApe1Con(String ape1_con){ this.ape1_con = ape1_con.toUpperCase(); }
    public void setApe2Con(String ape2_con){ this.ape2_con = ape2_con.toUpperCase(); }
    public void setNomCon(String nom_con){ this.nom_con = nom_con.toUpperCase(); }
    
    public long getCodConductor(){ return this.cod_conductor; }
    public String getNit(){ return this.nit; }
    public long getIdConductor(){ return this.id_conductor; }
    public String getApe1Con(){ return this.ape1_con; }
    public String getApe2Con(){ return this.ape2_con; }
    public String getNomCon(){ return this.nom_con; }
}
