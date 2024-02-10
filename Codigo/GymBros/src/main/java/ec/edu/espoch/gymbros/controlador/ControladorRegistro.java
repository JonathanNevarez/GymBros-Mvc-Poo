package ec.edu.espoch.gymbros.controlador;

import ec.edu.espoch.gymbros.modelo.Persona;
import ec.edu.espoch.gymbros.vista.VistaPrincipal;
import ec.edu.espoch.gymbros.vista.VistaRegistro;

public class ControladorRegistro {
    private VistaRegistro vistaReg;
    private VistaPrincipal vistaPrin;
    private Persona persona;

    public ControladorRegistro(VistaRegistro vistaReg) {
        this.vistaReg = vistaReg;
        this.persona = new Persona();
        this.vistaPrin = new VistaPrincipal();
    }
    
    public void accionIngresar() {
        String nombre, cedula, tpSangre, tpSuscripcion;
        int edad;
        
        if (this.vistaReg.getNombre().isEmpty() || this.vistaReg.getCedula().isEmpty() ||
            this.vistaReg.getTpSangre().isEmpty() || this.vistaReg.getTpSuscripcion().isEmpty() ||
                    this.vistaReg.getEdad().isEmpty()) {
            this.vistaReg.setMensaje("Por favor, complete todos los campos.");
            return;
        }
        
        try {
            edad = Integer.parseInt(this.vistaReg.getEdad());
        } catch (NumberFormatException e) {
            this.vistaReg.setMensaje("La edad tiene que ser un valor");
            return;
        }
        
        nombre = String.valueOf(this.vistaReg.getNombre());
        cedula = String.valueOf(this.vistaReg.getCedula());
        tpSangre = String.valueOf(this.vistaReg.getTpSangre());
        tpSuscripcion = String.valueOf(this.vistaReg.getTpSuscripcion());

        this.persona.setNombre(nombre);
        this.persona.setEdad(edad);
        this.persona.setCedula(cedula);        
        this.persona.setTpSangre(tpSangre);
        this.persona.setTpSuscripcion(tpSuscripcion);
        String msm = this.persona.ingresarDatos();
        this.vistaReg.setMensaje(msm);
        this.vistaReg.limpiar();
    }
    
    public void accionRetroceder(){
        this.vistaReg.setVisible(false);
        this.vistaPrin.setVisible(true);
        this.vistaPrin.setLocationRelativeTo(null);
    }
}