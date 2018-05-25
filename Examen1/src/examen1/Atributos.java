

package examen1;


public class Atributos {
    
    private Atributos atributo;
    private String nombre;

    public Atributos() {
    }

    public Atributos(Atributos atributo, String nombre) {
        this.atributo = atributo;
        this.nombre = nombre;
    }

    public Atributos getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributos atributo) {
        this.atributo = atributo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return atributo +" "+nombre;
    }
    
    
}