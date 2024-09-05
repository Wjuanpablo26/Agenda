package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
        this.reuniones = new ArrayList<>();
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

    /*
     * Metodo para imprimir las posiciones impares del arreglo de la lista contactos
     */
    public void imprimirPosicionesImpares(){
        for (int i = 0; i < contactos.size(); i++) {
            if(i % 2 != 0){
                System.out.println(contactos.toArray()[i]);
            }
        }
    }


    /*
     * Metodo para obtener la edad más repetida de los contactos
     */
    public int obtenerEdadRepetida(){
        int edadRepetida=0;
        int contadorMasRepetida=0;
        int contador=0;
        for (int i=0;i<contactos.size();i++){
            if(contactos.toArray()[i]!= null){
                int edadI = ((Contacto) contactos.toArray()[i]).getEdad();
                contador=0;
                for (int j=0;j<contactos.size();j++){
                    if(contactos.toArray()[j]!= null){
                        int edadJ= ((Contacto) contactos.toArray()[j]).getEdad();
                        if(edadI==edadJ){
                            contador++;
                        }
                    }
                }
                if (contador>contadorMasRepetida){
                    contadorMasRepetida=contador;
                    edadRepetida=edadI;
                }
            }
        }
        return edadRepetida;
    }

    /*
     * Metodo para eliminar los contactos que tengan 3 vocales en su nombre
     */
    public void eliminarContactosConTresVocales(){
        for (int i=0;i<contactos.size();i++){
            if(contactos.toArray()[i]!= null){
                String nombre = ((Contacto) contactos.toArray()[i]).getNombre();
                int contadorVocales=0;
                for (int j=0;j<nombre.length();j++){
                    char letra = nombre.charAt(j);
                    if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
                        contadorVocales++;
                    }
                }
                if(contadorVocales>=3){
                    contactos.remove(contactos.toArray()[i]);
                }
            }
        }
    }

    /*
     * Metodo para obtener el grupo con más contactos
     */
    public Grupo obtenerGrupoConMasContactos(){
        Grupo grupoMasContactos = null;
        int contadorMasContactos=0;
        for (int i=0;i<grupos.size();i++){
            if(grupos.toArray()[i]!= null){
                Grupo grupo = (Grupo) grupos.toArray()[i];
                int contador=0;
                for (int j=0;j<contactos.size();j++){
                    if(contactos.toArray()[j]!= null){
                        Contacto contacto = (Contacto) contactos.toArray()[j];
                        if(contacto.getGrupo().equals(grupo)){
                            contador++;
                        }
                    }
                }
                if (contador>contadorMasContactos){
                    contadorMasContactos=contador;
                    grupoMasContactos=grupo;
                }
            }
        }
        return grupoMasContactos;
    }

    /*
     * Metodo para obtener el promedio de edades de los contactos
     */
    public double obtenerPromedioEdades(){
        double promedio=0;
        int contador=0;
        for (int i=0;i<contactos.size();i++){
            if(contactos.toArray()[i]!= null){
                promedio+=((Contacto) contactos.toArray()[i]).getEdad();
                contador++;
            }
        }
        return promedio/contador;   
    }

    /*
     * Metodo para obtener los contactos menores de 18 años
     */
    public Collection<Contacto> obtenerContactosMenoresEdad(){
        Collection<Contacto> menoresEdad= new ArrayList<>();
        for (int i=0;i<contactos.size();i++){
            if(contactos.toArray()[i]!=null){
                if(((Contacto) contactos.toArray()[i]).getEdad()<18){
                    menoresEdad.add((Contacto) contactos.toArray()[i]);
                }
            }
        }
        return menoresEdad;
    }

    /*
     * Metodo para calcular la desviación estándar de las edades de los contactos
     */
    public double calcularDesviacionEstandarEdad() {
        if (contactos == null || contactos.isEmpty()) {
            return 0.0;
        }

        // Paso 1: Obtener las edades
        ArrayList<Integer> edades = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto != null) {
                edades.add(contacto.getEdad());
            }
        }

        // Paso 2: Calcular la media
        double suma = 0.0;
        for (int edad : edades) {
            suma += edad;
        }
        double media = suma / edades.size();

        // Paso 3: Calcular la varianza
        double sumaCuadrados = 0.0;
        for (int edad : edades) {
            sumaCuadrados += Math.pow(edad - media, 2);
        }
        double varianza = sumaCuadrados / edades.size();

        // Paso 4: Calcular la desviación estándar
        return Math.sqrt(varianza);
    }

    /*
     * Metodo para imprimir los nombres de los contactos al revés
     */
    public void imprimirNombresAlReves() {
        for (Contacto contacto : contactos) {
            if (contacto != null) {
                String nombre = contacto.getNombre();
                String nombreInvertido = "";
                for (int i = nombre.length() - 1; i >= 0; i--) {
                    nombreInvertido += nombre.charAt(i);
                }
                System.out.println(nombreInvertido);
            }
        }
    }

    /*
     * Método para realizar las operaciones necesarias para retornar una matriz con las reuniones
     */
    public void obtenerMatrizReuniones() {
        String[][] reuniones = {
                {"01-11-2022", "30-11-2022", "Reunión de Noviembre"},
                {"01-12-2022", "31-12-2022", "Reunión de Diciembre"},
                {"01-01-2022", "30-12-2022", "Reunión del Año"}
        };
        System.out.println("Matriz de reuniones:");
        for (String[] fila : reuniones) {
            System.out.println(Arrays.toString(fila));
        }
    }

    /*
     * Metodo para asignar un contacto a un grupo dado el nombre del grupo
     */
    public void asignarContactoAGrupo(String nombreGrupo, Collection<Contacto> contactos) {
            Grupo grupo = buscarGrupo(nombreGrupo);
            if (grupo != null) {
                for (Contacto contacto : contactos) {
                    contacto.setGrupo(grupo);
                }
                System.out.println("Contactos asociados al grupo '" + nombreGrupo + "':");
                for (Contacto contacto : contactos) {
                    System.out.println(contacto.getNombre() + " está en el grupo: " + contacto.getGrupo());
                }
            } else {
                System.out.println("El grupo '" + nombreGrupo + "' no existe.");
            }
    }

    /*
     * Método para ordenar los contactos por nombre
     */
    public void ordenarContactos() {
        List<Map<String, Object>> contactos = new ArrayList<>();
        for (int i = 0; i < contactos.size() - 1; i++) {
            for (int j = 0; j < contactos.size() - i - 1; j++) {
                String nombre1 = (String) contactos.get(j).get("name");
                String nombre2 = (String) contactos.get(j + 1).get("name");
                if (nombre1.compareTo(nombre2) > 0) {
                    // Intercambiar
                    Map<String, Object> temporal = contactos.get(j);
                    contactos.set(j, contactos.get(j + 1));
                    contactos.set(j + 1, temporal);
                }
            }
        }

        // Imprimir contactos ordenados
        System.out.println("Contactos ordenados por nombre:");
        for (Map<String, Object> contact : contactos) {
            System.out.println(contact.get("name"));
        }
    }

}
