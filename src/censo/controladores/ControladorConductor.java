/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloConductor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ControladorConductor {
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloConductor MC = null;
    ModeloConductor[] MCA;
    
    public ControladorConductor(){
        Conexion c = new Conexion();
        
        if(c.CrearConexion()){
            con = c.getConexion();
        }
    }
    
    public void setModelo(ModeloConductor MC){
        this.MC = MC;
    }
    
    public void setModelos(ModeloConductor[] MCA){
        this.MCA = MCA;
    }
    
    public ModeloConductor[] Select(String consulta){
        MCA = new ModeloConductor[5];
        
        if(consulta.equals("SelectLote")){
            try{
                preparedStatement = con.prepareStatement("SELECT * FROM public.conductores WHERE id_vehiculo = ?;");
                preparedStatement.setLong(1, MC.getNCenso());
                
                resultSet = preparedStatement.executeQuery();
                
                for(int i = 0; i < 5;i++){
                    MCA[i] = new ModeloConductor();
                    if(resultSet.next()){
                        try{
                            MCA[i].setApelllido1(resultSet.getString("ape1_con"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setApellido2(resultSet.getString("ape2_con"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setNombre(resultSet.getString("nom_com"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setNit(resultSet.getString("nit"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setIdConductor(resultSet.getLong("id_conductor"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setCedula(resultSet.getLong("cod_conductor"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                    }
                }
                
                resultSet.close();
                preparedStatement.close();
                con.close();
                
                return MCA;
            }catch(SQLException e){
                System.err.println("error en SelectUltimo");
            }
            
        }
        if(consulta.equals("SelectForId")){
            try{
                preparedStatement = con.prepareStatement("SELECT * FROM public.conductores WHERE id_vehiculo = ? AND id_conductor = ?;");
                preparedStatement.setLong(1, MC.getNCenso());
                preparedStatement.setLong(2, MC.getIdConductor());
                
                resultSet = preparedStatement.executeQuery();
                
                for(int i = 0; i < 5;i++){
                    MCA[i] = new ModeloConductor();
                    if(resultSet.next()){
                        
                        try{
                            MCA[i].setApelllido1(resultSet.getString("ape1_con"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setApellido2(resultSet.getString("ape2_con"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setNombre(resultSet.getString("nom_com"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setNit(resultSet.getString("nit"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setIdConductor(resultSet.getLong("id_conductor"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                        try{
                            MCA[i].setCedula(resultSet.getLong("cod_conductor"));
                        }catch(NullPointerException e){
                            System.out.println(e.getMessage());
                        }
                    }
                }
                
                resultSet.close();
                preparedStatement.close();
                con.close();
                
                return MCA;
            }catch(SQLException e){
                System.err.println("error en SelectUltimo");
            }
            
        }
        return null;
    }
    
    public int InsertarActualizar(String consulta){
        if(consulta.equals("Actualizar") || consulta.equals("Insertar")){
            try{
                if(consulta.equals("Actualizar")){
                    preparedStatement = con.prepareStatement("UPDATE public.conductores SET "
                            + "id_conductor=?, ape1_con=?, ape2_con=?, nom_com=?, "
                            + "nit=?, id_vehiculo=? "
                            + "WHERE id_conductor = ?;");
                    preparedStatement.setLong(7, MC.getIdConductor());
                }else if (consulta.equals("Insertar")){
                    preparedStatement = con.prepareStatement("INSERT INTO public.conductores("
                            + "id_conductor, ape1_con, ape2_con, nom_com, nit, id_vehiculo) "
                            + "VALUES (?, ?, ?, ?, ?, ?);");
                }
                
                if(MC.getIdConductor()!= 0){
                    preparedStatement.setLong(1, MC.getIdConductor());
                }else{
                    preparedStatement.setNull(1, java.sql.Types.BIGINT);
                }
                if(!MC.getApellido1().equals("")){
                    preparedStatement.setString(2, MC.getApellido1());
                }else{
                    preparedStatement.setNull(2, java.sql.Types.VARCHAR);
                }
                if(!MC.getApellido2().equals("")){
                    preparedStatement.setString(3, MC.getApellido2());
                }else{
                    preparedStatement.setNull(3, java.sql.Types.VARCHAR);
                }
                if(!MC.getNombre().equals("")){
                    preparedStatement.setString(4, MC.getNombre());
                }else{
                    preparedStatement.setNull(4, java.sql.Types.VARCHAR);
                }
                if(!MC.getNit().equals("")){
                    preparedStatement.setString(5, MC.getNit());
                }else{
                    preparedStatement.setNull(5, java.sql.Types.VARCHAR);
                }
                if(MC.getNCenso()!= 0){
                    preparedStatement.setLong(6, MC.getNCenso());
                }else{
                    preparedStatement.setNull(6, java.sql.Types.BIGINT);
                }
                
                int r = preparedStatement.executeUpdate();
                
                preparedStatement.close();
                con.close();
                
                return r;
            }catch(SQLException e){
                System.err.println("error: " + e.getMessage());
                return 3;
            }
            
        }
        return 3;
    }
}
