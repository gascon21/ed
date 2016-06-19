package ejercicio14;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    public String GetDni(){
        return dni;
    }
    
    public void SetDni(String dni){
        this.dni = dni;
    }
    
    public String GetNombre(){
        return nombre;
    }
    
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String GetApellido1(){
        return apellido1;
    }
    
    public void SetApellido1(String apellido1){
        this.apellido1 = apellido1;
    }
    
    public String GetApellido2(){
        return apellido2;
    }
    
    public void SetApellido2(String apellido2){
        this.apellido2 = apellido2;
    }
}
