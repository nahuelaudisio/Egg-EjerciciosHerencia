/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
 * La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
 * Animal.
 * Crear un método en la clase Animal a través del cual cada clase hija deberá
 * mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
 * una clase Main que realice lo siguiente:
 */
package ejherencia01.Entidades;

public abstract class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public abstract void alimentarse();
}
