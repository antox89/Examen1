

package examen1;

import java.util.ArrayList;


public class Usuarios {
    
    private String nombre, email, usuario,password;
    private int edad;
    private ArrayList<Clases> clases = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String email, String usuario, String password, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
    }

    public void agregarClases(Clases clase){
        this.clases.add(clase);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }
    
    
    

}
