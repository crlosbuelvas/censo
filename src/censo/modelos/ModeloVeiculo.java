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
    private String placa;
    private String clase;
    private String servicio;
    private long modelo;
    private long cilindraje;
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
    private String uso_vehiculo;
    private String observacion;
    private long id_propietario;
    private long id_poseedor;
    private long cod_conductor;
    
    public void setNCenso(long n_censo){ this.n_censo = n_censo; }
    public void setPlaca(String placa){ this.placa = placa.toUpperCase(); }
    public void setClase(String clase){ this.clase = clase.toUpperCase(); }
    public void setServicio(String servicio){ this.servicio = servicio.toUpperCase(); }
    public void setModelo(long modelo){ this.modelo = modelo; }
    public void setCilindraje(long cilindraje){ this.cilindraje = cilindraje; }
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
    public void setUsoVehiculo(String uso_vehiculo){ this.uso_vehiculo = uso_vehiculo.toUpperCase(); }
    public void setObservacion(String observacion){ this.servicio = observacion.toUpperCase(); }
    public void setIdPropietario(long id_propietario){ this.cilindraje = id_propietario; }
    public void setIdPoseedor(long id_poseedor){ this.id_poseedor = id_poseedor; }
    public void setCodConductor(long cod_conductor){ this.cod_conductor = cod_conductor; }
    
    public long getNCenso(){ return this.n_censo; }
    public String getPlaca(){ return this.placa; }
    public String getClase(){ return this.clase; }
    public String getServicio(){ return this.servicio; }
    public long getModelo(){ return this.modelo; }
    public long getCilindraje(){ return this.cilindraje; }
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
    public String getUsoVehiculo(){ return this.uso_vehiculo; }
    public String getObservacion(){ return this.servicio; }
    public long getIdPropietario(){ return this.cilindraje; }
    public long getIdPoseedor(){ return this.id_poseedor; }
    public long getCodConductor(){ return this.cod_conductor; }
}
