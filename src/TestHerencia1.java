/**
 *
 * @author MORCILLO
 */

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestHerencia1 {

    public static void main (String [ ] Args) 
    {

        Profesor profesor1 = new Profesor ("Cedula",111111 ,"Juan", "Hernández García", 33);
        profesor1.setIdProfesor("Ced 123456789");
        profesor1.setSalario(1000000);
        profesor1.mostrarNombreApellidosYCarnet();
        
        System.out.println ("\n \n");
        
        Estudiante estudiante1 = new Estudiante ("Cedula", 222222, "Pepe", "Mojica Perez", 20);
        estudiante1.setCodEst(123456789);
        estudiante1.setNota1(50);
        estudiante1.setNota2(80);
        estudiante1.setNota3(60);
        estudiante1.mostrarDatosEstudiante();
        
        
        
    }

} //Cierre de la clase

