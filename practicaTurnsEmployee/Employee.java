// David Gascón López

package crewmanagement;

public class Employee {
    
    final static int MAX_TURNS = 7;
    
    String name;
    String surname;
    String dni;
    Turn[] turns = new Turn[MAX_TURNS];
    int turnCount = 0;
    
    /**
     * Constructor por defecto.
     */
    public Employee(){
        name = null;
        surname = null;
        dni = null;
    }
    
    /**
     * Constructor sobrecargado.
     * @param aName
     * @param aSurname 
     */
    public Employee(String aName, String aSurname){
        name = aName;
        surname = aSurname;
    }
    
    /**
     * Devuelve si un dni es verdadero o falso.
     * @param dni
     * @return 
     */
    
    static public boolean ValidateDNI(String dni){
        String[] letters = { "T", "R", "w", "A", "G", "M", "Y", "F", "P", "D",
                "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int resultDiv = Integer.parseInt(dni.substring(0, 8)) % 23;
        
            return (dni.toUpperCase().substring(8).equals(letters[resultDiv]));
    }
    
    /**
     * Constructor sobrecargado que comprueba si el dni es valido con una funcion auxiliar.
     * @param aDNI
     * @param aName
     * @param aSurname 
     */
    Employee(String aDNI, String aName, String aSurname){
        if(ValidateDNI(aDNI)){
            name = aName;
            surname = aSurname;
            dni = aDNI;
        }
    }
    
    /**
     * Modifica el valor de name.
     * @param aName 
     */
    void setName(String aName){
        if(aName != null)
            name = aName;
    }
    
    /**
     * Devuelve name.
     */
    String getName(){
        return name;
    }
    
    /**
     * Modifica el valor de surname.
     */
    void setSurname(String aSurname){
        if(aSurname != null)
            surname = aSurname;
    }
    
    /**
     * Devuelve surname.
     */
    String getSurname(){
        return surname;
    }
    
    /**
     * Devuelve el nombre completo formateado segun parametros.
     */
    String getFullName(boolean nameInUppercase, boolean surnameInUpperCase){
        if(name != null && surname != null){
            if(nameInUppercase && surnameInUpperCase)
                return name.toUpperCase() + ", " + surname.toUpperCase();
            else if(!nameInUppercase && surnameInUpperCase)
                return (name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()) + ", " + surname.toUpperCase();
            else if(nameInUppercase && !surnameInUpperCase)
                return name.toUpperCase() + ", " + (surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase());
            else
                return (name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()) + ", " + (surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase());
        }
        else if(name != null && surname == null){
            if(nameInUppercase)
                return name.toUpperCase();
            else
                return (name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
        }
        else if(name == null && surname != null){
            if(surnameInUpperCase)
                return surname.toUpperCase();
            else
                return (surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase());
        }
        return "";
    }
    
    /**
     * Modifica el valor de dni.
     * @param aDNI 
     */
    void setDNI(String aDNI){
        if(aDNI != null && aDNI.length() == 9)
            if(ValidateDNI(aDNI))
                dni = aDNI;
    }
    
    /**
     * Devuelve dni.
     */
    String getDNI(){
        return dni;
    }
    
    /**
     * Añade un turno.
     */
    void addTurn(Turn turn1){
        if ( getTurnCount( )< 7 && turn1 != null){
            turns[getTurnCount()] = turn1;
            turnCount++;
        }
    }
    
    /**
     * Elimina un turno.
     */
    void removeTurn(String aDay){
        
        Turn[] newTurn = new Turn[MAX_TURNS];
        int numTurn = getTurnCount();
        int count = 0;
        
        for (int i = 0 ; i < numTurn; i++)
            if (!turns[i].getDay().equals(aDay.toUpperCase()))
                newTurn[count++] = turns[i];
        
        turnCount = count;
        turns = newTurn;
    }
    
    /**
     * Devuelve la cuenta de turnos de un empleado.
     */
    int getTurnCount(){
        return turnCount;
    }
    
    /**
     * Devuelve el turno que se encuentra en la posición indicada por parametros.
     */
    Turn getTurnAt(int anIndex){
        return turns[anIndex];
    }
    
    /**
     * Devuelve un array con los turnos asignados del empleado.
     */
    Turn[] getTurns(){
        Turn[] turnsTemp = new Turn[getTurnCount()];
        for(int i = 0 ; i < getTurnCount() ; i ++){
            turnsTemp[i] = turns[i];
        }
        
        return turnsTemp;
    }
    
}
