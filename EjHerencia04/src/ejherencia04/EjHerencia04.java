/**
 * 4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
* 
* 
* Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package ejherencia04;

import Entidades.DatosPadre;
import java.util.Scanner;


public class EjHerencia04 {

  
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
      DatosPadre calculos = new DatosPadre();
        System.out.println("Ahora se le pediara que ingrese un radio");
        calculos.areaCirculo(leer.nextDouble());
        System.out.println("ingrese diametro del circulo ");
        calculos.perimetroCirculo(leer.nextDouble());
        System.out.println("ingrese base y luego la altura de ducho rectangulo");
        int base = leer.nextInt();
        Double altura = leer.nextDouble();
        calculos.areaRectangulo(base, altura);
        calculos.perimetroRectangulo(base, altura);
    }
    
}
