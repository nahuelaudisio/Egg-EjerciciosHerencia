
package ejherencia02electrodomesticomain;

import ejherencia02electrodomesticomain.Entidades.Electrodomestico;
import ejherencia02electrodomesticomain.Entidades.Lavadora;
import ejherencia02electrodomesticomain.Entidades.Televisor;


public class Ejecutable {
    public static void ejecutar (){
        Electrodomestico electrodomesticos [] = new Electrodomestico[4];
        
        electrodomesticos [0] = new Lavadora (31, 100d, 19, "azul", 'A');
        electrodomesticos [1] = new Lavadora (30, 100d, 19, "azul", 'A');
        electrodomesticos [2] = new Televisor (41, true, 100d, 19, "azul", 'A');
        electrodomesticos [3] = new Televisor(39, false, 100d, 80, "azul", 'D');
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electrodomestico;
                lavadora.precioFinal();
                
            }else if (electrodomestico instanceof Televisor) {
                Televisor televisor = (Televisor) electrodomestico;
                televisor.precioFinal();
            }else{
                electrodomestico.precioFinal();
            }
            System.out.println(electrodomestico);
        }
        
        
    } 
}
