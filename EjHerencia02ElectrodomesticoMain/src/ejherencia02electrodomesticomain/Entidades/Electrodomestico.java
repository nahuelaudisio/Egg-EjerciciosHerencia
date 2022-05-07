
package ejherencia02electrodomesticomain.Entidades;

import ejherencia02electrodomesticomain.Enums.Color;
import ejherencia02electrodomesticomain.Enums.ConsumoElectrico;
import java.util.Scanner;

public class Electrodomestico {
    protected Double precioBase;
    protected Integer peso;
    protected Color color;
    protected ConsumoElectrico consumoElectrico;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Electrodomestico(){
        this.precioBase = 1000d;
        this.color = Color.BLANCO;
        this.consumoElectrico = consumoElectrico.F;
        this.peso = 5;

    }

    public Electrodomestico(Double precioBase, Integer peso, String color, char letra) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoElectrico = comprobarConsumoEnergetico(letra);
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoElectrico getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(ConsumoElectrico consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", peso=" + peso + ", color=" + color + ", consumoElectrico=" + consumoElectrico + '}';
    }
    
  private ConsumoElectrico  comprobarConsumoEnergetico(char letra){
      
      for (ConsumoElectrico value : ConsumoElectrico.values()) {
          if(String.valueOf(value).equals(String.valueOf(letra))){
              return value;
          }
      }
  return ConsumoElectrico.F;
  }
  
  private Color comprobarColor(String color){
      
      for (Color value : Color.values()) {
          if(String.valueOf(value).equals(color)){
              return value;
          }
      }
  return Color.BLANCO;
  }

   public void precioFinal(){
       // operador ternario 
       this.precioBase = es("A") ? mas(1000d) :
               es("B") ? mas(800d) :
               es("C") ? mas(600d) :
               es("D") ? mas(500d) :
               es("E") ? mas(300d) : mas(100d);
    this.precioBase =    esMenor(20) ? mas(100d) :
                        esMenor(50) ? mas(500d) :
                          esMenor(20) ? mas(800d) : mas(1000d);
       
   }
   
  protected boolean es(String letra){
       return String.valueOf(this.consumoElectrico).equals(letra);
       
   }
protected Double mas(Double numero){
    return this.precioBase + numero;
}

protected boolean esMenor (Integer peso){
   
    return this.peso < peso;
}

public void crearElectrodomestico(){
    
 //   public Electrodomestico(Double precioBase, Integer peso, String color, char letra) {
    //    this.precioBase = precioBase;
      //  this.peso = peso;
      //  this.color = comprobarColor(color);
      //  this.consumoElectrico = comprobarConsumoEnergetico(letra);
      System.out.println("CREAMOS UN ELECTRODOmestico");
      
}

}

