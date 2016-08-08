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
public class ModeloTurno {
    private int n_censo;
    private String[] hora;
    private int modulo;
    
    public ModeloTurno(){
        n_censo = 0;
        hora = new String[2];
        hora[1] = "";
        hora[2] = "";
        modulo = 0;
    }
    
    public void setNCenso(int n_censo){ this.n_censo = n_censo; }
    public void setHora(String[] hora){ this.hora = hora; }
    public void setModulo(int modulo){ this.modulo = modulo; }
    
    public int getNCenso(){ return this.n_censo; }
    public String[] getHora(){ return this.hora; }
    public int getModulo(){ return this.modulo; }
}
