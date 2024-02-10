package ec.edu.espoch.gymbros.controlador;

import ec.edu.espoch.gymbros.modelo.Archivo;
import ec.edu.espoch.gymbros.modelo.Persona;
import ec.edu.espoch.gymbros.vista.VistaDatosGenerales;
import ec.edu.espoch.gymbros.vista.VistaModificar;
import ec.edu.espoch.gymbros.vista.VistaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControladorDatosGenerales {
    private VistaDatosGenerales vistaDatGen;
    private VistaPrincipal vistaPrin;
    private VistaModificar vistaModi;
    private Persona persona;

    public ControladorDatosGenerales(VistaDatosGenerales vista) {
        this.vistaDatGen = vista;
        this.vistaPrin = new VistaPrincipal();
        this.vistaModi = new VistaModificar();
        this.persona = new Persona();
    }
    
    public void accionAgregar() {
        persona.mostrarDatos();
        this.vistaDatGen.setModelo();
        this.vistaDatGen.setDatos(this.persona.mostrarDatos());
    }
    
    public void accionRetroceder(){
        this.vistaDatGen.setVisible(false);
        this.vistaPrin.setVisible(true);
        this.vistaPrin.setLocationRelativeTo(null);
    }
    
    public void accionModificar(){
        this.vistaDatGen.setVisible(false);
        this.vistaModi.setVisible(true);
        this.vistaModi.setLocationRelativeTo(null); 
    }
    
    public void accionEliminar() {
        ArrayList<Persona> personas = Archivo.leerArchivo();

        String nombreAEliminar = JOptionPane.showInputDialog("Ingrese el nombre que desea eliminar:");

        if (nombreAEliminar != null) {
            int posicion = Archivo.verificarNombreEnLista(personas, nombreAEliminar);

            if (posicion != -1) {
                personas.remove(posicion);
                Archivo.actualizarArchivo(personas);

                vistaDatGen.actualizarTabla(personas);
                vistaDatGen.setMensaje("Persona eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El nombre no está presente en la lista.");
            }
        }
    }
}
