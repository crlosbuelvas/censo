/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo.controladores;

import censo.modelos.ModeloCenso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class ControladorCenso {
    
    private Connection con = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    ModeloCenso MC = null;
    
    public ControladorCenso(ModeloCenso MC){
        this.MC = MC;
    }
    
    public ModeloCenso Select(String consulta){
        if(consulta.equals("SelectUltimo")){
            
        }
        return null;
    }
}
