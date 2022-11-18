/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUMNOS #  01
 */
public class Estudiante extends Persona {

    //Campos específicos de la subclase.
    private int CodEst;
    private int N1, N2, N3, Def;

    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase
    public Estudiante (String TipoDoc, int NumDoc, String nombre, String apellidos, int edad) 
    {
        super(TipoDoc, NumDoc, nombre, apellidos, edad);
        CodEst = 0;
        N1=0;
        N2=0;
        N3=0;
        Def=0;
    } //Cierre del constructor

    //Métodos específicos de la subclase
    public void setCodEst (int CodEst)
    { 
        this.CodEst = CodEst;
    }
    
    public int getCodEst ()
    { 
        return CodEst;
    }
    
    public void setNota1(int N1)
    {
        this.N1 = N1;
    }
    
    public int getNota1()
    {
        return N1;
    }
    
    public void setNota2(int N2)
    {
        this.N2 = N2;
    }
    
    public int getNota2()
    {
        return N2;
    }
    
    public void setNota3(int N3)
    {
        this.N3 = N3;
    }
    
    public int getNota3()
    {
        return N3;
    }

    public int SetGetDef()
    {
        Def = (N1+N2+N3)/3;
        return Def;
    }
            
    public void mostrarDatosEstudiante() 
    {
        // nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error
        // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase
        System.out.println ("Tipo Documento:" + getTipoDoc() + "\n" + "Numero Documento:" + getNumDoc() + "\n" +
                "Nombre Estudiante: " + getNombre() + " " +  getApellidos() + "\n" +
         "Codigo de estudiante: " + getCodEst() + "\n" + 
                 "Nota 1:" + getNota1() + "\n" + "Nota 2:" + getNota2() + "\n" + "Nota 3:" + getNota3()
        + "\n" + "Definitiva:" + SetGetDef()); 
    
    }
} //Cierre de la clase
