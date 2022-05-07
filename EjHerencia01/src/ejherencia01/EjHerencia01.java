/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
 * La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
 * Animal.
 * Crear un método en la clase Animal a través del cual cada clase hija deberá
 * mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
 * una clase Main que realice lo siguiente:
 */
package ejherencia01;

import ejherencia01.Entidades.Animal;
import ejherencia01.Entidades.Caballo;
import ejherencia01.Entidades.Gato;
import ejherencia01.Entidades.Perro;
import java.util.Scanner;

public class EjHerencia01 {

    public static void main(String[] args) {
      //Declaracion del objeto perro
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Animal p = new Perro("Stich", "Carnivoro", 15, "Doberman");
        p.alimentarse();

//Declaracion del objeto Gato
        Animal g = new Gato("Pelusa", "Galletas", 15, "Siames");
        g.alimentarse();

//Declaracion del objeto Caballo
        Animal c = new Caballo("Spark", "Pasto", 25, "Fino");
        c.alimentarse();

    }

}
