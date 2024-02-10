package ec.edu.espoch.gymbros.controlador;

import ec.edu.espoch.gymbros.modelo.Archivo;
import ec.edu.espoch.gymbros.modelo.Persona;
import ec.edu.espoch.gymbros.vista.VistaDatosGenerales;
import ec.edu.espoch.gymbros.vista.VistaModificar;
import java.util.ArrayList;

public class ControladorModificar {
    private VistaModificar vistaModi;
    private VistaDatosGenerales vistaDatGen;

    public ControladorModificar(VistaModificar vistaModi) {
        this.vistaModi = vistaModi;
    }
       
    public void accionRetroceder(){
        this.vistaModi.setVisible(false);
        this.vistaDatGen = new VistaDatosGenerales();
        this.vistaDatGen.setVisible(true);
        this.vistaDatGen.setLocationRelativeTo(null);
    }
    
    public void accionModificar() {
        String usuarioModif = String.valueOf(vistaModi.getUsuarioModif());
        String nuevoNombre = vistaModi.getNombre();

        // Verificar si las casillas están vacías
        if (this.vistaModi.getNombre().isEmpty() || this.vistaModi.getCedula().isEmpty() ||
            this.vistaModi.getTpSangre().isEmpty() || this.vistaModi.getTpSuscripcion().isEmpty() ||
                    this.vistaModi.getEdad().isEmpty()) {
            this.vistaModi.setMensaje("Por favor, complete todos los campos.");
            return;
        }

        int nuevaEdad;
        try {
            nuevaEdad = Integer.parseInt(vistaModi.getEdad());
        } catch (NumberFormatException e) {
            vistaModi.setMensaje("La edad tiene que ser un valor numérico.");
            return;
        }

        if (nuevaEdad <= 0) {
            vistaModi.setMensaje("La edad debe ser un valor positivo.");
            return;
        }

        String nuevaCedula = String.valueOf(vistaModi.getCedula());
        String nuevaTpSangre = String.valueOf(vistaModi.getTpSangre());
        String nuevaTpSuscripcion = String.valueOf(vistaModi.getTpSuscripcion());

        ArrayList<Persona> personas = Archivo.leerArchivo();
        int posicion = Archivo.verificarNombreEnLista(personas, usuarioModif);

        String mensaje;
        if (posicion != -1) {
            mensaje = Archivo.modificarPersona(personas, posicion, nuevoNombre, nuevaEdad, nuevaCedula, nuevaTpSangre, nuevaTpSuscripcion);
        } else {
            mensaje = "El nombre no está presente en la lista.";
        }
        vistaModi.setMensaje(mensaje);
    }
}
