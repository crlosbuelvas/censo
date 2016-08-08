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
public class ModeloVeiculo {
    private long n_censo;
    private long modelo;
    private long cilindraje;
    private String placa;
    private String clase;
    private String servicio;
    private String color;
    private String marca;
    private String linea;
    private String n_motor;
    private String n_chasis;
    private String n_licencia;
    private String o_transito;
    private String soat;
    private String tecno;
    private String extra;
    private String fecha_de_pago;
    private String n_recibo;
    private String v_pago;
    private String uso;
    private String observacion;
    
    public ModeloVeiculo(){
        n_censo = 0;
        placa = "";
        clase = "";
        servicio = "";
        modelo = 0;
        cilindraje = 0;
        color = "";
        marca = "";
        linea = "";
        n_motor = "";
        n_chasis = "";
        n_licencia = "";
        o_transito = "";
        soat = "";
        tecno = "";
        extra = "";
        fecha_de_pago = "";
        n_recibo = "";
        v_pago = "";
        uso = "";
        observacion = "";
    }
    
    public void setNCenso(long n_censo){ this.n_censo = n_censo; }
    public void setModelo(long modelo){ this.modelo = modelo; }
    public void setCilindraje(long cilindraje){ this.cilindraje = cilindraje; }
    public void setPlaca(String placa){ this.placa = placa.toUpperCase(); }
    public void setClase(String clase){ this.clase = clase.toUpperCase(); }
    public void setServicio(String servicio){ this.servicio = servicio.toUpperCase(); }
    public void setColor(String color){ this.color = color.toUpperCase(); }
    public void setMarca(String marca){ this.marca = marca.toUpperCase(); }
    public void setLinea(String linea){ this.linea = linea.toUpperCase(); }
    public void setNMotor(String n_motor){ this.n_motor = n_motor.toUpperCase(); }
    public void setNChasis(String n_chasis){ this.n_chasis = n_chasis.toUpperCase(); }
    public void setNLicencia(String n_licencia){ this.n_licencia = n_licencia.toUpperCase(); }
    public void setNTransito(String o_transito){ this.o_transito = o_transito.toUpperCase(); }
    public void setSoat(String soat){ this.soat = soat.toUpperCase(); }
    public void setTecno(String tecno){ this.tecno = tecno.toUpperCase(); }
    public void setExtra(String extra){ this.extra = extra.toUpperCase(); }
    public void setFecha_de_pago(String fecha_de_pago){ this.fecha_de_pago = fecha_de_pago.toUpperCase(); }
    public void setNRecibo(String n_recibo){ this.n_recibo = n_recibo.toUpperCase(); }
    public void setVPago(String v_pago){ this.v_pago = v_pago.toUpperCase(); }
    public void setUso(String uso){ this.uso = uso.toUpperCase(); }
    public void setObservacion(String observacion){ this.observacion = observacion.toUpperCase(); }
    
    public long getNCenso(){ return this.n_censo; }
    public long getModelo(){ return this.modelo; }
    public long getCilindraje(){ return this.cilindraje; }
    public String getPlaca(){ return this.placa; }
    public String getClase(){ return this.clase; }
    public String getServicio(){ return this.servicio; }
    public String getColor(){ return this.color; }
    public String getMarca(){ return this.marca; }
    public String getLinea(){ return this.linea; }
    public String getNMotor(){ return this.n_motor; }
    public String getNChasis(){ return this.n_chasis; }
    public String getNLicencia(){ return this.n_licencia; }
    public String getNTransito(){ return this.o_transito; }
    public String getSoat(){ return this.soat; }
    public String getTecno(){ return this.tecno; }
    public String getExtra(){ return this.extra; }
    public String getFecha_de_pago(){ return this.fecha_de_pago; }
    public String getNRecibo(){ return this.n_recibo; }
    public String getVPago(){ return this.v_pago; }
    public String getUso(){ return this.uso; }
    public String getObservacion(){ return this.observacion; }
}
