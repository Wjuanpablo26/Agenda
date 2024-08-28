package co.edu.uniquindio.poo;

public class Grupo {
    public String nombre;
    private Contacto[] contactos;
    private Categoria categoria;

    /**
     *  Constructor de la clase Grupo
     * @param nombre
     */
    public Grupo(String nombre, Categoria categoria) {
        assert nombre!= null && !nombre.isBlank();
        this.nombre = nombre;
        this.contactos = new Contacto[5]; 
    }

    /*
     * Getters y Setters de la clase Grupo
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    /*
     * Metodo para crear contacto
     */
    public void crearContacto(String nombre, String alias, String direccion, String telefono, String email){
        Contacto contacto = new Contacto(nombre, alias, direccion, telefono, email);
        validarMaximoContactos(contacto);
    }

    /**
     * Método para validar el máximo de contactos
     */
    public boolean validarMaximoContactos(Contacto contacto){
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] == null){
                contactos[i] = contacto;
                return true;
            }
        }
        return false;
    }

    /*
     * Metodo para agregar un contacto al grupo
     */
    public void agregarContacto(Contacto contacto){
        if(validarMaximoContactos(contacto)){
            System.out.println("Contacto agregado");
        }else{
            System.out.println("No se puede agregar el contacto");
        }
    }

    /*
     * Metodo para eliminar un contacto del grupo
     */
    public void eliminarContacto(Contacto contacto){
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null && contactos[i].equals(contacto)){
                contactos[i] = null;
                System.out.println("Contacto eliminado");
                break;
            }
        }
        
    }


    
    
}
