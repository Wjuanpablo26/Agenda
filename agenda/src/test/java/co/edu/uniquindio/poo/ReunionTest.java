package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Agenda;
import co.edu.uniquindio.poo.model.Contacto;
import co.edu.uniquindio.poo.model.Reunion;



public class ReunionTest {

    private static final Logger LOG = Logger.getLogger (Agenda.class.getName());

    /**
    * test para eliminar contactos de una reunion
    */
    @Test
    public void eliminarContacto() {
        LOG.info("Iniciando test eliminarContacto");
        Reunion reunion = new Reunion("poyecto 1", "24-05-1999", "9:08");
        Contacto contacto1 = new Contacto("Camila Mejía", "Cami", "Calle 14 #5-20", "3005612665", "cami.m@uqvirtual.edu.co",30);
        Contacto contacto2 = new Contacto("Juan Pérez", "Juan", "Calle 10 #10-30", "3123456789", "juan.p@uqvirtual.edu.co",22);

        Collection<Contacto> contactosReunion = new ArrayList<>();
        contactosReunion.add(contacto1);
        contactosReunion.add(contacto2);

        
        reunion.setContactos(contactosReunion);
        reunion.eliminarContacto(contacto1);


        assertFalse(reunion.getContactos().contains(contacto1), "El contacto debería haberse eliminado de la reunión");
        assertEquals(1, reunion.getContactos().size(), "La reunión debería contener ahora un solo contacto");

        LOG.info("Finalizando test eliminarContacto");
    }

    /**
     * Prueba para verificar que los datos no esten vacios 
     */
    @Test
    public void datosVaciosReunion(){
        LOG.info("Iniciando test de datosVacios");
        assertThrows(Throwable.class, ()-> new Reunion(" ", " ", " "));
        LOG.info("Finalizando test datosVacios");
    }

    /**
     * Prueba para verificar que los datos no estén nulos
     */
    @Test
    public void datosNulos(){
        LOG.info("Iniciando test de datosNulos");
        assertThrows(Throwable.class, ()-> new Reunion(null, null, null));
        LOG.info("Finalizando test datosNulos");
    }

    
    

    
}




    

    


    

