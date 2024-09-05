package co.edu.uniquindio.poo.application;
import java.util.Scanner;

import co.edu.uniquindio.poo.model.Agenda;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args )throws InterruptedException {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerDate = new Scanner(System.in);
        Scanner scannerTime = new Scanner(System.in);

        

        System.out.println("Ingrese el nombre de la agenda");
        String nombre = scannerString.nextLine();

        Agenda agenda = new Agenda(nombre);

        int opc=0;

        do {

            System.out.println("Que desea hacer?\n 1.Crear Contacto\n "+
                                "2.Crear Grupo\n"+
                                "3.Crear Reunion\n"+ 
                                "4.Eliminar Contacto\n"+ 
                                "5.Eliminar Grupo\n"+ 
                                "6.Eliminar Reunion\n"+ 
                                "7.Modificar Contacto\n"+ 
                                "8.Modificar Grupo\n"+ 
                                "9.Modificar Reunion\n"+ 
                                "10.Salir\n");

            



            
        } while (opc!=0);
        scannerString.close();
        scannerInt.close();
        scannerDate.close();
        scannerTime.close();


    }

}
