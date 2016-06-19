package ejercicio14;

import java.util.List;

public class Cliente {
    private String codigo;
    private String apellido1;
    private String direccion;
    private String numCuenta;
    private String telefono;
    private List<Mascota> mascota;
    private List<Persona> persona;
    
    public String GetCodigo(){
        return codigo;
    }
    
    public void SetCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String GetApellido1(){
        return apellido1;
    }
    
    public void SetApellido1(String apellido1){
        this.apellido1 = apellido1;
    }
    
    public String GetDireccion(){
        return direccion;
    }
    
    public void SetDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String GetNumCuenta(){
        return numCuenta;
    }
    
    public void SetNumCuenta(String numCuenta){
        this.numCuenta = numCuenta;
    }
    
    public String GetTelefono(){
        return telefono;
    }
    
    public void SetTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public List<Mascota> GetMascota(){
        return mascota;
    }
    
    public List<Persona> GetPersona(){
        return persona;
    }
}
