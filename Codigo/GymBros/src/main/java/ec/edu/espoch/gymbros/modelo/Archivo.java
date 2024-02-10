package ec.edu.espoch.gymbros.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {

    public static void crearArchivo() {
        String ubicacion = "C:/DatosGym";
        File carpeta = new File(ubicacion);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }
        File archivo = new File(carpeta, "archivoDatosGym.txt");
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
                PrintWriter salida = new PrintWriter(archivo);
                salida.close(); 
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static ArrayList<Persona> leerArchivo() {
        ArrayList<Persona> personas = new ArrayList<>();
        
        String ubicacion = "C:/DatosGym";
        File carpeta = new File(ubicacion);
        File archivo = new File(carpeta, "archivoDatosGym.txt");
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                String[] datos = lectura.split(";");
                Persona objPersona = new Persona();
                objPersona.setNombre(datos[0]);
                objPersona.setEdad(Integer.valueOf(datos[1])); 
                objPersona.setCedula(datos[2]);
                objPersona.setTpSangre(datos[3]);
                objPersona.setTpSuscripcion(datos[4]);
                personas.add(objPersona);

                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return personas;
    }
    
    public static String anexarArchivo(String nombre, int edad, String cedula, String tpSangre, String tpSuscripcion) {
        String ubicacion = "C:/DatosGym";
        File carpeta = new File(ubicacion);
        File archivo = new File(carpeta, "archivoDatosGym.txt");
        String verificar = "";
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "" + nombre + ";" + edad + ";" + cedula + ";" + tpSangre+ ";" + tpSuscripcion;
            salida.println(contenido);
            salida.close();
            verificar = "Registro correcto";
        } catch (FileNotFoundException ex) {
            verificar = "Error, al acceder al archivo";
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            verificar = "Error, escribir en el archivo";
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verificar;
    }
    
    public static Integer verificarNombreEnLista(ArrayList<Persona> personas, String nombre) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public static String modificarPersona(ArrayList<Persona> personas, int posicion, String nuevoNombre, int nuevaEdad, String nuevaCedula, String nuevaTpSangre, String nuevaTpSuscripcion) {
        if (posicion != -1 && posicion < personas.size()) {
            Persona personaModificada = personas.get(posicion);
            personaModificada.setNombre(nuevoNombre);
            personaModificada.setEdad(nuevaEdad);
            personaModificada.setCedula(nuevaCedula);
            personaModificada.setTpSangre(nuevaTpSangre);
            personaModificada.setTpSuscripcion(nuevaTpSuscripcion);

            actualizarArchivo(personas);

            return "Modificación realizada correctamente.";
        } else {
            return "El nombre no está presente en la lista.";
        }
    }

    public static void actualizarArchivo(ArrayList<Persona> personas) {
        String ubicacion = "C:/DatosGym";
        File carpeta = new File(ubicacion);
        File archivo = new File(carpeta, "archivoDatosGym.txt");

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, false));

            for (Persona persona : personas) {
                String contenido = persona.getNombre() + ";" + persona.getEdad() + ";" + persona.getCedula() + ";" + persona.getTpSangre() + ";" + persona.getTpSuscripcion();
                salida.println(contenido);
            }
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}