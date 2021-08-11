
package ejemploHerenciaPolimorfismo;


public class Persona {
    String nombre;
    String edad;
    public Persona(String nombre,String edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String mostrar(){
        return "El nombre es: "+nombre+"\nLa edad es:"+edad;
    } 
}
