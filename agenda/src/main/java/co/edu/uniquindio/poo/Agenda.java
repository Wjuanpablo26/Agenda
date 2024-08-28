package co.edu.uniquindio.poo;

import java.util.Collection;

public class  Agenda {

    public String nombre;
    private Collection<Grupo> grupos;
    private Collection<Reunion> reuniones;
    private Collection<Contacto> contactos;
    
    /**
     *  Constructor de la clase Agenda
     * @param nombre
     */
    public Agenda(String nombre) {
        assert nombre!= null && !nombre.isBlank();
        this.nombre = nombre;
    }

    /*
     * Getters y Setters de la clase Agenda
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Collection<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Collection<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(Collection<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    /*
     * Metodo para buscar un contacto
     */
    public Contacto buscarContacto(String telefono){
        for (Contacto contacto : contactos) {
            if(contacto.getTelefono().equals(telefono)){
                return contacto;
            }
        }
        return null;
    }

    /**
     * Metodo para verificar si un contacto ya existe
     */
    public boolean verificarContacto(String nombre, String telefono){
        boolean existe = false;
        for (Contacto contacto : contactos){
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                existe = true;
            }
        }
        return existe;
    }

    /*
     * Método para agregar un contacto
     */
    public void agregarContacto(Contacto contacto) {
        if (contacto != null && !verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            contactos.add(contacto);
        }
    }

    /*
     * Método para eliminar un contacto
    */
    public void eliminarContacto(Contacto contacto) {
        if (contacto != null && verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            contactos.remove(contacto);
        }
    }

    /*
     * Método para buscar un grupo
     */
    public Grupo buscarGrupo(String nombre){
        for (Grupo grupo : grupos) {
            if(grupo.getNombre().equals(nombre)){
                return grupo;
            }
        }
        return null;
    }

    /*
     * Método para agregar un grupo
     */
    public void agregarGrupo(Grupo grupo) {
        if (grupo != null && !grupos.contains(grupo)) {
            grupos.add(grupo);
        }
    }

    /*
     * Método para eliminar un grupo
    */
    public void eliminarGrupo(Grupo grupo) {
        if (grupo != null && grupos.contains(grupo)) {
            grupos.remove(grupo);
        }
    }

    /*
     * Método para buscar una reunión
     */
    public Reunion buscarReunion(String descripcion){
        for (Reunion reunion : reuniones) {
            if(reunion.getDescripcion().equals(descripcion)){
                return reunion;
            }
        }
        return null;
    }

    /*
     * Método para agregar una reunión
     */
    public void agregarReunion(Reunion reunion) {
        if (reunion != null && !reuniones.contains(reunion)) {
            reuniones.add(reunion);
        }
    }

    /*
     * Método para eliminar una reunión
    */
    public void eliminarReunion(Reunion reunion) {
        if (reunion != null && reuniones.contains(reunion)) {
            reuniones.remove(reunion);
        }
    }

    /*
     * Método para verificar si un grupo ya existe
     */
    public boolean verificarGrupo(String nombre){
        boolean existe = false;
        for (Grupo grupo : grupos){
            if(grupo.getNombre().equals(nombre)){
                existe = true;
            }
        }
        return existe;
    }

    /*
     * Método para verificar si una reunión ya existe
     */
    public boolean verificarReunion(String descripcion){
        boolean existe = false;
        for (Reunion reunion : reuniones){
            if(reunion.getDescripcion().equals(descripcion)){
                existe = true;
            }
        }
        return existe;
    }

}
