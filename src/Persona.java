/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNOS #  01
 */
//Código de la clase Persona ejemplo 
public class Persona {
    private String TipoDoc;
    private int NumDoc;
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor
    public Persona (String TipoDoc, int NumDoc, String nombre, String apellidos, int edad) 
    {
        this.TipoDoc=TipoDoc;
        this.NumDoc=NumDoc;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;                   
    }

    //Métodos
    public String getTipoDoc () 
    { 
       return TipoDoc;  
    }
    public int getNumDoc () 
    { 
       return NumDoc;  
    }
    public String getNombre () 
    { 
       return nombre;  
    }
    public String getApellidos () 
    { 
        return apellidos;  
    }
    public int getEdad () 
    { 
        return edad;   
    }

} //Cierre de la clase