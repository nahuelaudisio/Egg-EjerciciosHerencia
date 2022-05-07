
package ejherencia02electrodomesticomain.Entidades;


public class Televisor extends Electrodomestico{
    private Integer resolucion;// pulgadas
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        
        
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Double precioBase, Integer peso, String color, char letra) {
        super(precioBase, peso, color, letra);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return super.toString() + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT   ;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        this.precioBase = this.resolucion > 40 ? this.precioBase * 1.3 : this.precioBase;
        this.precioBase = this.sintonizadorTDT ? super.mas(500d) : this.precioBase;
    }
    
    
    
}
