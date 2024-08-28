package co.edu.uniquindio.poo;

public class Contacto {
    public String nombre, alias, direccion, telefono, email;

    /*
     * Constructor de la clase Contacto
     */
    public Contacto (String nombre, String alias, String direccion, String telefono, String email){
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.alias = telefono;
        assert nombre!= null && !nombre.isBlank();
        assert alias!= null && !alias.isBlank();
        assert direccion!= null && !direccion.isBlank();
        assert telefono!= null && !telefono.isBlank();
        assert email!= null && !email.isBlank();
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
    
    /*
     * Metodo para verificar que un contacto sea a igual a otro
     */
    public boolean verificarContactoIgual(Contacto contacto){
        return this.nombre.equals(contacto.getNombre()) && this.telefono.equals(contacto.getTelefono());
    }

}
