

package examen1;


public class Atributos {
    
    private String atributo;
    private String nombre;

    public Atributos() {
    }

    public Atributos(String atributo, String nombre) {
        this.atributo = atributo;
        this.nombre = nombre;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
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