package ejercicio14;

import java.util.List;

public class Mascota {
    private String codigo;
    private String alias;
    private String especie;
    private String raza;
    private String color;
    private String fechaNac;
    private float pesoMedio;
    private float[] pesos;
    private float pesoActual;
    private Historial historial;
    private Calendario calendario;
    private List<Cliente> cliente;
    
    public String GetCodigo(){
        return codigo;
    }
    
    public void SetCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String GetAlias(){
        return alias;
    }
    
    public void SetAlias(String alias){
        this.alias = alias;
    }
    public String GetEspecie(){
        return especie;
    }
    
    public void SetEspecie(String especie){
        this.especie = especie;
    }
    
    public String GetRaza(){
        return raza;
    }
    
    public void SetRaza(String raza){
        this.raza = raza;
    }
    
    public String GetColor(){
        return color;
    }
    
    public void SetColor(String color){
        this.color = color;
    }
    
    public String GetFechaNac(){
        return fechaNac;
    }
    
    public void SetFechaNac(String fechaNac){
        this.fechaNac = fechaNac;
    }
    
    public float GetPesoMedio(){
        return pesoMedio;
    }
    
    public void SetPesoMedio(float pesoMedio){
        this.pesoMedio = pesoMedio;
    }
    
    public float[] GetPesos(){
        return pesos;
    }
    
    public void SetPesos(float[] pesos){
        this.pesos = pesos;
    }
    
    public float GetPesoActual(){
        return pesoActual;
    }
    
    public void SetPesoActual(float pesoActual){
        this.pesoActual = pesoActual;
    }
    
    public Historial GetHistorial(){
        return historial;
    }
    
    public Calendario GetCalendario(){
        return calendario;
    }
    
    public List<Cliente> GetCliente(){
        return cliente;
    }
}
