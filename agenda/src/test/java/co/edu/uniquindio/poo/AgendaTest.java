package co.edu.uniquindio.poo;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collection;


public class AgendaTest {
    private static final Logger LOG = Logger.getLogger (Agenda.class.getName());

    /**
      * Prueba para buscar un contacto en la agenda
      */
    @Test
    public void testBuscarContacto() {
        LOG.info("Iniciando test buscarContacto");
        Agenda agenda = new Agenda("Agenda Personal");
        Contacto contacto1 = new Contacto("Camila Mejía", "Cami", "Calle 14 #5-20", "3005612665", "cami.m@uqvirtual.edu.co");
        Contacto contacto2 = new Contacto("Juan Pérez", "Juan", "Calle 10 #10-30", "3123456789", "juan.p@correo.com");
        Collection<Contacto> contactos = new ArrayList<>();        
        contactos.add(contacto1);
        contactos.add(contacto2);
        agenda.setContactos(contactos);
        Contacto resultadoExistente = agenda.buscarContacto("3005612665");
        assertNotNull(resultadoExistente);//El contacto existe en la agenda
        assertEquals(contacto1, resultadoExistente);//El resultado no coincide con lo esperado
        LOG.info("Finalizando test buscarContacto");
    }

    /**
    Prueba para eliminar un contacto de la agenda
     */
    @Test
    public void eliminarContacto(){
        LOG.info("Iniciando test eliminarontacto");
        Agenda agenda = new Agenda("Agenda Personal");
        Contacto contacto1 = new Contacto("Camila Mejía", "Cami", "Calle 14 #5-20", "3005612665", "cami.m@uqvirtual.edu.co");
        Contacto contacto2 = new Contacto("Juan Pérez", "Juan", "Calle 10 #10-30", "3123456789", "juan.p@correo.com");
        Collection<Contacto> contactos = new ArrayList<>();        
        contactos.add(contacto1);
        contactos.add(contacto2);
        agenda.setContactos(contactos);
        agenda.eliminarContacto(contacto1);
        assertFalse(agenda.verificarContacto(contacto1.getNombre(), contacto1.getTelefono()));//El contacto se elimina de la agenda
        assertEquals(1, agenda.getContactos().size());//Ahora la agenda solo contiene un contacto
        LOG.info("Finalizando test eliminarContacto");
    }


    /**
     *Prueba para verificar que un grupo existe o no existe
     */
    @Test
    public void VerificarGrupo() {
        LOG.info("Iniciando test verificarGrupo");
        Agenda agenda = new Agenda("Agenda de Prueba");
        Grupo grupo1 = new Grupo("Oficina", Categoria.OFICINA);
        Grupo grupo2 = new Grupo("Amigos", Categoria.AMIGOS);
        Collection<Grupo> grupos = new ArrayList<>();
        grupos.add(grupo1);
        grupos.add(grupo2);
        agenda.setGrupos(grupos);
        assertTrue(agenda.verificarGrupo("Oficina"));//El grupo Oficina sí debe existir
        assertFalse(agenda.verificarGrupo("Familia"));//El grupo Familia no debe existir
        LOG.info("Finalizando test verificarGrupo");
    }

    /**
     *Prueba para eliminar una reunión
     */
    @Test
    public void testEliminarReunion() {
        LOG.info("Iniciando test eliminarReunion");
        Agenda agenda = new Agenda("Agenda de Prueba");
        String fecha = "2022-10-10";
        String hora1 = "10:00:00";
        String hora2 = "14:00:00";
        Reunion reunion1 = new Reunion("Reunión en la Oficina",fecha, hora1);
        Reunion reunion2 = new Reunion("Fiesta", fecha, hora2);
        Collection<Reunion> reuniones = new ArrayList<>();
        reuniones.add(reunion1);
        reuniones.add(reunion2);
        agenda.setReuniones(reuniones);
        agenda.eliminarReunion(reunion1);
        assertFalse(agenda.getReuniones().contains(reunion1));//Aquí se elimina la reunión de la oficina
        assertEquals(1, agenda.getReuniones().size());//Ahora la agenda solo tiene una reunión
        LOG.info("Finalizando test eliminarReunion");
    }


}

