package co.edu.uniquindio.poo;


import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Contacto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ContactoTest {
    private static final Logger LOG = Logger.getLogger (ContactoTest.class.getName());

    /**
     * Prueba para verificar que un contacto sea igual a otro
     */
    @Test
    public void contactoIgual() {
        LOG.info("Iniciando test contactoIgual");
        Contacto contacto1 = new Contacto("Camila Mejia", "Cami", "Calle 14 #5-20", "3005612665", "cami.m@uqvirtual.edu.co",19);
        Contacto contacto2 = new Contacto("Camila Mejia", "Cami", "Calle 14 #5-20", "3005612665", "cami.m@uqvirtual.edu.co",29);
        assertEquals(contacto1.verificarContactoIgual(contacto2), true);
        LOG.info("Finalizando test contactoIgual");
    }

    
    /**
     * Prueba para verificar que los datos no estén nulos
     */
    @Test
    public void datosNulos(){
        LOG.info("Iniciando test de datosNulos");
        assertThrows(Throwable.class, ()-> new Contacto(null, null, null, null, null,0));
        LOG.info("Finalizando test datosNulos");
    }

    /**
     * Prueba para verificar que los datos no estén vacíos
     */
    @Test
    public void datosVacios(){
        LOG.info("Iniciando test de datosVacios");
        assertThrows(Throwable.class, ()-> new Contacto(" ", " ", " ", " ", " ",0));
        LOG.info("Finalizando test datosVacios");
    }

}
    

