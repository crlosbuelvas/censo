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
public class ModeloCenso {
    private int n_censo;
    private int id_propietario;
    private int id_poseedor;
    
    public ModeloCenso(){
        n_censo = 0;
        id_propietario = 0;
        id_poseedor = 0;
    }
    
    public void setNCenso(int n_censo){
        this.n_censo = n_censo;
    }
    public void setIdPropietario(int id_propietario){
        this.id_propietario = id_propietario;
    }
    public void setIdPoseedor(int id_poseedor){
        this.id_poseedor = id_poseedor;
    }
    
    public int getNCenso(){
        return this.n_censo;
    }
    public int getIdPropietario(){
        return this.id_propietario;
    }
    public int getIdPoseedor(){
        return this.id_poseedor;
    }
}
