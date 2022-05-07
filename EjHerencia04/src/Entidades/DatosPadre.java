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
package Entidades;

import ejherencia04.Interfaces.calculosFormas;


public final class DatosPadre implements calculosFormas{
    private final Double pi = 3.14d;

    public DatosPadre() {
    }

    @Override
    public void areaCirculo(Double radio) {
     Double areaCirculo = pi * (radio * radio);
        System.out.println("El area del circulo es -> "+areaCirculo);
    }

    @Override
    public void perimetroCirculo(Double diametro) {
      Double perimCirculo = pi * diametro;
        System.out.println("el perimetro del circulo es -> "+perimCirculo);
    }

    @Override
    public void areaRectangulo(int base, Double altura) {
       Double areaRectangulo = base*altura;
        System.out.println("el area del rectangulo es -> "+areaRectangulo);
    }

    @Override
    public void perimetroRectangulo(int base, Double altura) {
       Double primetroRectangulo = (base + altura) * 2;
        System.out.println("el perimetro del rextangulo es ->"+primetroRectangulo);
    }
    
    
}
