/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNOS #  01
 */
//Código de la clase profesor, subclase de la clase Persona ejemplo aprenderaprogramar.com
public class Profesor extends Persona {

    //Campos específicos de la subclase.
    private String IdProfesor;
    private int Salario;

    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
    public Profesor (String TipoDoc, int NumDoc, String nombre, String apellidos, int edad) 
    {
        super(TipoDoc, NumDoc, nombre, apellidos, edad);
        IdProfesor = "Unknown";
        Salario=0;
    } //Cierre del constructor

    //Métodos específicos de la subclase
    public void setIdProfesor (String IdProfesor)
    { 
        this.IdProfesor = IdProfesor;   
    }
    public String getIdProfesor ()
    { 
        return IdProfesor;  
    }
    public void setSalario (int Salario)
    { 
        this.Salario = Salario;   
    }
    public int getSalario ()
    { 
        return Salario;  
    }

    public void mostrarNombreApellidosYCarnet() 
    {
        // nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error
        // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase
        System.out.println ("Tipo de documento:" + getTipoDoc() + "\n" +"Numero de Documento:" + getNumDoc() + "\n" +
                "Nombre de Profesor: " + getNombre() + " " +  getApellidos() + "\n" +
         "Id de profesor: " + getIdProfesor() + "\n" + "Salario: $" + getSalario()); 
    }
} //Cierre de la clase

