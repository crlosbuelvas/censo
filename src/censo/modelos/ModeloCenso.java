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
    
    public ModeloCenso(){
        n_censo = 0;
    }
    
    public void setNCenso(int n_censo){
        this.n_censo = n_censo;
    }
    
    public int getNCenso(){
        return this.n_censo;
    }
}
