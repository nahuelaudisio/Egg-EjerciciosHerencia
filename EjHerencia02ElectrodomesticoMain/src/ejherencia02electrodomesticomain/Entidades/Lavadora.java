
package ejherencia02electrodomesticomain.Entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomestico{
    private Integer carga;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
        
    }

    public Lavadora(Integer carga, Double precioBase, Integer peso, String color, char letra) {
        super(precioBase, peso, color, letra);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + "carga " + carga;
    }
    
    

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        this.precioBase = this.carga > 30 ? super.mas(500d) : this.precioBase;
    }

    @Override
    public void crearElectrodomestico() {

        
    }
    
    
}
