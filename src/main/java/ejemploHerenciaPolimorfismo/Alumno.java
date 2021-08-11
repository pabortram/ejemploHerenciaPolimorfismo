/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploHerenciaPolimorfismo;

/**
 *
 * @author pabor
 */
public class Alumno extends Persona {
    String gradoAcademico;
    public Alumno(String nombre,String edad,String gradoAcademico){
        super(nombre, edad);
        this.gradoAcademico=gradoAcademico;
    }
    public String Mostrar(){
        return super.mostrar()+"\nEl grado academico es:"+gradoAcademico;
    }
    
}
