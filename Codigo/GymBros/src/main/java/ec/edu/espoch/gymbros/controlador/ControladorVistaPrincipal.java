
package ec.edu.espoch.gymbros.controlador;

import ec.edu.espoch.gymbros.modelo.Archivo;
import ec.edu.espoch.gymbros.vista.VistaDatosGenerales;
import ec.edu.espoch.gymbros.vista.VistaPrincipal;
import ec.edu.espoch.gymbros.vista.VistaRegistro;
import javax.swing.JOptionPane;

public class ControladorVistaPrincipal {
    private VistaPrincipal vistaPrin;
    private VistaRegistro vistaReg;
    private VistaDatosGenerales vistaDatGen;

    public ControladorVistaPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrin = vistaPrincipal;
    }
    
    public void botonAccion(String accion){
        Archivo.crearArchivo();
        switch (accion) {
            case "Registrar" -> {
                this.vistaReg = new VistaRegistro();
                this.vistaReg.setVisible(true);
                this.vistaReg.setLocationRelativeTo(null);           
            }
            case "Datos Generales" -> {
                this.vistaDatGen = new VistaDatosGenerales();
                this.vistaDatGen.setVisible(true);
                this.vistaDatGen.setLocationRelativeTo(null);
            }
        }  
        this.vistaPrin.setVisible(false);
    } 
    
    public void botonInf(){
        JOptionPane.showMessageDialog(null, """
                                            Nombre de la institucion:
                                            Escuela Superior Polit\u00e9cnica de Chimborazo
                                            
                                            Pao: 02
                                            
                                            Autores:
                                            Jonathan Nevarez
                                            Cristopher Mendoza
                                            Joel Perez
                                            Wachinton Nu\u00f1ez
                                            
                                            A\u00f1o: 2024""",
                "Informacion", JOptionPane.PLAIN_MESSAGE);
    }
}
