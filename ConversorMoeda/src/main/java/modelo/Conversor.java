package modelo;


public class Conversor {
    
    private double quantReal;
    private double cambioDolar;
    private double cambioEuro;
    private double valor;
    
    public Conversor(){
        
    }
    
    public double converter(double r, String moeda){
    quantReal = r;
    if (moeda == "Dolár"){
        valor = quantReal*cambioDolar;
    }
    if(moeda == "Euro"){
        valor = quantReal*cambioEuro;
    }
    switch(moeda){
        
        case "Dólar":   
        valor = quantReal*cambioDolar;
        break;
       case "Euro":   
        valor = quantReal*cambioEuro;
        break;  
           
    }
    
    
    return valor;
    }
    
    
    
    
        
    
    
    
    
    
    
}
