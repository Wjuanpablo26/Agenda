package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GrupoTest {

    private static final Logger LOG = Logger.getLogger (Agenda.class.getName());

    /*
     * Prueba para verificar que se pueda cambiar el nombre de un grupo
     */
    @Test
    public void cambiarNombreGrupo() {
        LOG.info("Iniciando test cambiarNombreGrupo");
        Grupo grupo = new Grupo("Amigos", Categoria.AMIGOS);
        
        // Cambiar el nombre del grupo
        grupo.setNombre("Nuevos Amigos");
        
        // Verificar que el nombre se haya cambiado correctamente
        assertEquals("Nuevos Amigos", grupo.getNombre());
        
        LOG.info("Finalizando test cambiarNombreGrupo");
    }

    /*
     * Prueba para verificar que se puede crear un grupo
     */
    @Test
    public void crearGrupo() {
        LOG.info("Iniciando test agregarContactoAlGrupo");
        Grupo grupo = new Grupo("Familia", Categoria.FIESTA);
        Contacto contacto = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");
        Contacto contacto2 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");
        Contacto contacto3 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");
        Contacto contacto4 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");
        Contacto contacto5 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");

        // Agregar el contacto al grupo
        grupo.agregarContacto(contacto);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);
        
        // Verificar que el contacto se haya agregado correctamente
        assertEquals(5, grupo.getContactos().length);
        assertEquals(contacto, grupo.getContactos()[0]);
        assertEquals(contacto2, grupo.getContactos()[1]);
        assertEquals(contacto3, grupo.getContactos()[2]);
        assertEquals(contacto4, grupo.getContactos()[3]);
        assertEquals(contacto5, grupo.getContactos()[4]);
        
        LOG.info("Finalizando test agregarContactoAlGrupo");
    }

    /*
     * Prueba para verificar que se pueda eliminar un contacto del grupo
     */
    @Test
    public void eliminarContactoDelGrupo() {
        LOG.info("Iniciando test eliminarContactoDelGrupo");
        Grupo grupo = new Grupo("Amigos", Categoria.AMIGOS);
        Contacto contacto1 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");
        Contacto contacto2 = new Contacto("Pedro", "Pedrito", "Calle 456", "0987654321", "pedrito@example.com");
        Contacto contacto3 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");
        Contacto contacto4 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");
        Contacto contacto5 = new Contacto("Juan", "Juanito", "Calle 123", "1234567890", "juanito@example.com");

        // Agregar los contactos al grupo
        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);
        
        // Eliminar un contacto del grupo
        grupo.eliminarContacto(contacto1);
        grupo.eliminarContacto(contacto2);
        grupo.eliminarContacto(contacto3);
        grupo.eliminarContacto(contacto4);
        grupo.eliminarContacto(contacto5);
        
        // Verificar que el contacto se haya eliminado correctamente
        assertEquals(5, grupo.getContactos().length);
        assertEquals(null, grupo.getContactos()[0]);
        assertEquals(null, grupo.getContactos()[1]);
        assertEquals(null, grupo.getContactos()[2]);
        assertEquals(null, grupo.getContactos()[3]);
        assertEquals(null, grupo.getContactos()[4]);

        
        LOG.info("Finalizando test eliminarContactoDelGrupo");
    }


    /*
     * Prueba para verificar que un grupo sea igual a otro
     */
    @Test
    public void grupoIgual() {
        LOG.info("Iniciando test grupoIgual");
        Grupo grupo1 = new Grupo("Familia",Categoria.FIESTA); 
        Grupo grupo2 = new Grupo("Familia",Categoria.FIESTA);

        // Verificar que los dos grupos son iguales
        assertEquals(grupo1.getNombre(), grupo2.getNombre());
        assertEquals(grupo1.getCategoria(), grupo2.getCategoria());

        LOG.info("Finalizando test grupoIgual");
    }

    

}
