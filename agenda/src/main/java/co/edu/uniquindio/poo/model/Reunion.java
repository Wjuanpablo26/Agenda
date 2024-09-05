package co.edu.uniquindio.poo.model;



import java.util.Collection;

public class Reunion {
    public String descripcion;
    public String fecha;
    public String hora;
    private Collection<Contacto> contactos;

    /**
     * Constructor de la clase Reunion
     * @param descripcion
     * @param fecha
     * @param hora
     */
    public Reunion(String descripcion, String fecha, String hora){
        assert descripcion!= null && !descripcion.isBlank();
        assert fecha!= null && !fecha.isBlank();
        assert hora!= null && !hora.isBlank();
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    /*
     * Constructor de la clase Reunion vacio
     */
    public Reunion(){
            
    }

    /*
     * Getters y Setters
     */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    /*
     * Metodo para agregar contacto a la reunion
     */
    public void agregarContacto(Contacto contacto){
        if(!contactos.contains(contacto)){
            contactos.add(contacto);
        }
        else{
            System.out.println("El contacto ya se encuentra en la reunion");
        }


    }

    /**
     * Metodo para eliminar contacto de la reunion
     */
    public void eliminarContacto(Contacto contacto){
        if(contactos.contains(contacto)){
            contactos.remove(contacto);
        }else{
            System.out.println("El contacto no se encuentra en la reunion");
        }
    }

    /**
     * Metodo para buscar contacto en la reunion
     */
    public Contacto buscarContacto(String telefono){
        for (Contacto contacto : contactos) {
            if(contacto.getTelefono().equals(telefono)){
                return contacto;
            }
        }
        return null;
    }

      // Método para verificar si un contacto existe en la reunión
    public boolean verificarContacto(Contacto contacto) {
        return contactos.contains(contacto);
    }
    
}
