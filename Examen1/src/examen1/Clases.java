

package examen1;

import java.util.ArrayList;


public class Clases {
    
    private String nombre;
    private ArrayList<Atributos> atributos = new ArrayList();
    private ArrayList<Metodos> metodos = new ArrayList();
    
    public Clases(){
    }

    public Clases(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarAtributo(Atributos atributo){
        this.atributos.add(atributo);
    }
    
    public void agregarMetodo(Metodos metodo){
        this.metodos.add(metodo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atributos> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributos> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<Metodos> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodos> metodos) {
        this.metodos = metodos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
