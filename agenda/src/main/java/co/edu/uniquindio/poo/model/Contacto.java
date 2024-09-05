package co.edu.uniquindio.poo.model;
import java.util.Random;

public class Contacto {
    public String nombre, alias, direccion, telefono, email;
    private int edad;
    private Grupo grupo;

    /*
     * Constructor de la clase Contacto
     */
    public Contacto (String nombre, String alias, String direccion, String telefono, String email,int edad){
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.edad = new Random().nextInt(46)+15; //Se inicializa una edad aleatoria entre 15 y 60
        assert nombre!= null && !nombre.isBlank();
        assert alias!= null && !alias.isBlank();
        assert direccion!= null && !direccion.isBlank();
        assert telefono!= null && !telefono.isBlank();
        assert email!= null && !email.isBlank();
        assert edad > 0;
    }

    /*
     * Getters y Setters de la clase Contacto
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
        this.nombre = grupo.getNombre();
    }
    
    /*
     * Metodo para verificar que un contacto sea a igual a otro
     */
    public boolean verificarContactoIgual(Contacto contacto){
        return this.nombre.equals(contacto.getNombre()) && this.telefono.equals(contacto.getTelefono());
    }



}
