/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloVeiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorVehiculo {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloVeiculo MV;
    
    public ControladorVehiculo(ModeloVeiculo MV){
        this.MV = MV;
        
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public ModeloVeiculo Select(String consulta){
        if(consulta.equals("SelectForId")){
            try{
                preparedStatement = con.prepareStatement("SELECT * FROM public.vehiculos WHERE n_censo = ?;");
                preparedStatement.setLong(1, MV.getNCenso());
                
                resultSet = preparedStatement.executeQuery();
                
                while(resultSet.next()){
                    try{
                        MV.setPlaca(resultSet.getString("placa"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setClase(resultSet.getString("clase"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setServicio(resultSet.getString("servicio"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setModelo(resultSet.getLong("modelo"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setCilindraje(resultSet.getLong("cilindraje"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setColor(resultSet.getString("color"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setMarca(resultSet.getString("marca"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setLinea(resultSet.getString("linea"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setNMotor(resultSet.getString("n_motor"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setNChasis(resultSet.getString("n_chasis"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setNLicencia(resultSet.getString("n_licencia"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setNTransito(resultSet.getString("o_transito"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setSoat(resultSet.getString("soat"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setTecno(resultSet.getString("tecno"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setExtra(resultSet.getString("extra"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setFecha_de_pago(resultSet.getString("fecha_de_pago"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setNRecibo(resultSet.getString("n_recibo"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setVPago(resultSet.getString("v_pago"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setUso(resultSet.getString("uso"));
                    }catch(NullPointerException e){

                    }
                    try{
                        MV.setObservacion(resultSet.getString("observacion"));
                    }catch(NullPointerException e){

                    }

                    resultSet.close();
                    preparedStatement.close();
                    con.close();
                    
                    return MV;
                }
                
                MV.setNCenso(0);
                return MV;
            }catch(SQLException e){
                System.err.println("error: Controlador vehiculo en la consulta SelectForId: \n" + e.getMessage());
            }
        }
        return null;
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("Actualizar") || consulta.equals("Insertar")){
            try{
                if (consulta.equals("Actualizar")){
                    preparedStatement = con.prepareStatement(
                        "UPDATE public.vehiculos " +
                                "SET n_censo=?, placa=?, clase=?, servicio=?, modelo=?, cilindraje=?, " +
                                "color=?, marca=?, linea=?, n_motor=?, n_chasis=?, n_licencia=?, " +
                                "o_transito=?, soat=?, tecno=?, extra=?, fecha_de_pago=?, n_recibo=?, " +
                                "v_pago=?, uso=?, observacion=? WHERE n_censo = ?;"
                    );
                    preparedStatement.setLong(25, MV.getNCenso());
                }else{
                    preparedStatement = con.prepareStatement(
                        "INSERT INTO public.vehiculos(" +
                                "n_censo, placa, clase, servicio, modelo, cilindraje, color, marca, " +
                                "linea, n_motor, n_chasis, n_licencia, o_transito, soat, tecno, " +
                                "extra, fecha_de_pago, n_recibo, v_pago, uso, observacion) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, " +
                                "?, ?, ?, ?, ?, ?, ?, " +
                                "?, ?, ?, ?, ?, ?);"
                    );
                }
                if(MV.getNCenso() != 0){
                    preparedStatement.setLong(1, MV.getNCenso());
                }else{
                    preparedStatement.setNull(1, java.sql.Types.BIGINT);
                }
                if(!MV.getPlaca().equals("")){
                    preparedStatement.setString(2, MV.getPlaca());
                }else{
                    preparedStatement.setNull(2, java.sql.Types.VARCHAR);
                }
                if(!MV.getClase().equals("")){
                    preparedStatement.setString(3, MV.getClase());
                }else{
                    preparedStatement.setNull(3, java.sql.Types.VARCHAR);
                }
                if(!MV.getServicio().equals("")){
                    preparedStatement.setString(4, MV.getServicio());
                }else{
                    preparedStatement.setNull(4, java.sql.Types.VARCHAR);
                }
                if(MV.getModelo() != 0){
                    preparedStatement.setLong(5, MV.getModelo());
                }else{
                    preparedStatement.setNull(5, java.sql.Types.BIGINT);
                }
                if(MV.getCilindraje() != 0){
                    preparedStatement.setLong(6, MV.getCilindraje());
                }else{
                    preparedStatement.setNull(6, java.sql.Types.BIGINT);
                }
                if(!MV.getColor().equals("")){
                    preparedStatement.setString(7, MV.getColor());
                }else{
                    preparedStatement.setNull(7, java.sql.Types.VARCHAR);
                }
                if(!MV.getMarca().equals("")){
                    preparedStatement.setString(8, MV.getMarca());
                }else{
                    preparedStatement.setNull(8, java.sql.Types.VARCHAR);
                }
                if(!MV.getLinea().equals("")){
                    preparedStatement.setString(9, MV.getLinea());
                }else{
                    preparedStatement.setNull(9, java.sql.Types.VARCHAR);
                }
                if(!MV.getNMotor().equals("")){
                    preparedStatement.setString(10, MV.getNMotor());
                }else{
                    preparedStatement.setNull(10, java.sql.Types.VARCHAR);
                }
                if(!MV.getNChasis().equals("")){
                    preparedStatement.setString(11, MV.getNChasis());
                }else{
                    preparedStatement.setNull(11, java.sql.Types.VARCHAR);
                }
                if(!MV.getNLicencia().equals("")){
                    preparedStatement.setString(12, MV.getNLicencia());
                }else{
                    preparedStatement.setNull(12, java.sql.Types.VARCHAR);
                }
                if(!MV.getNTransito().equals("")){
                    preparedStatement.setString(13, MV.getNTransito());
                }else{
                    preparedStatement.setNull(13, java.sql.Types.VARCHAR);
                }
                if(!MV.getSoat().equals("")){
                    preparedStatement.setString(14, MV.getSoat());
                }else{
                    preparedStatement.setNull(14, java.sql.Types.VARCHAR);
                }
                if(!MV.getTecno().equals("")){
                    preparedStatement.setString(15, MV.getTecno());
                }else{
                    preparedStatement.setNull(15, java.sql.Types.VARCHAR);
                }
                if(!MV.getExtra().equals("")){
                    preparedStatement.setString(16, MV.getExtra());
                }else{
                    preparedStatement.setNull(16, java.sql.Types.VARCHAR);
                }
                if(!MV.getFecha_de_pago().equals("")){
                    preparedStatement.setString(17, MV.getFecha_de_pago());
                }else{
                    preparedStatement.setNull(17, java.sql.Types.DATE);
                }
                if(!MV.getNRecibo().equals("")){
                    preparedStatement.setString(18, MV.getNRecibo());
                }else{
                    preparedStatement.setNull(18, java.sql.Types.VARCHAR);
                }
                if(!MV.getVPago().equals("")){
                    preparedStatement.setString(19, MV.getVPago());
                }else{
                    preparedStatement.setNull(19, java.sql.Types.VARCHAR);
                }
                if(!MV.getUso().equals("")){
                    preparedStatement.setString(20, MV.getUso());
                }else{
                    preparedStatement.setNull(20, java.sql.Types.VARCHAR);
                }
                if(!MV.getObservacion().equals("")){
                    preparedStatement.setString(21, MV.getObservacion());
                }else{
                    preparedStatement.setNull(21, java.sql.Types.VARCHAR);
                }
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                System.err.println("error: Controlador vehiculo en la consulta Insert: \n" + e.getMessage());
            }
            
        }
        return 3;
    }
}
