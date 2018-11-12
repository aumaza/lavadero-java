/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadero;

/**
 *
 * @author augusto
 */
public class Vehiculo {
    
    private String _patente;
    private int _cantRuedas;
    eMarcas _marcas;
    
    private String getPatente(){
        
        return _patente;
    }
    
    private int getRuedas(){
        
        return _cantRuedas;
    }
    
    private void setRuedas(int _cantRuedas){
        
        this._cantRuedas = _cantRuedas;
    }
    
    private eMarcas getMarcas(){
        
        return _marcas;
    }
    
    private void setMarcas(eMarcas _marcas){
        
        this._marcas = _marcas;
    }
    
    public void Mostrar(){
        
        
    }
    
    public void Vehiculo(String _patente,int _cantRuedas, eMarcas _marcas){
        
        
    }
    
    
}
