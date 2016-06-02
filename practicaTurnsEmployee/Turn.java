// David Gascón López

package crewmanagement;

public class Turn {
    String day;
    int initHour;
    int finishHour;
    
    /**
     * Constructor por defecto.
     */
    public Turn(){
        
    }
    
    /**
     * Constructor sobrecargado con el día.
     */
    Turn(String aDay){
        day = aDay.toUpperCase();
    }
    
    /**
     * Constructor sobrecargado con el día, la hora de inicio y la hora final.
     */
    Turn(String aDay, int aInitHour, int aFinishHour){
        day = aDay.toUpperCase();
        if(aInitHour > 0 && aInitHour < 23)
            initHour = aInitHour;
        if(aFinishHour > 0 && aFinishHour < 23)
            finishHour = aFinishHour;
    }
    
    /**
     * Modifica el valor de day.
     */
    void setDay(String aDay){
        if(aDay != null)
            day = aDay.toUpperCase();
    }
    
    /**
     * Devuelve day.
     */
    String getDay(){
        return day;
    }
    
    /**
     * Modifica el valor de initHour.
     */
    void setInitHour(int aInitHour){
        if(aInitHour > 0 && aInitHour < 23)
            initHour = aInitHour;
    }
    
    /**
     * Devuelve initHour.
     */
    int getInitHour(){
        return initHour;
    }
    
    /**
     * Modifica el valor de finishHour.
     */
    void setFinishHour(int aFinishHour){
        if(aFinishHour > 0 && aFinishHour < 23)
            finishHour = aFinishHour;
    }
    
    /**
     * Devuelve finishHour.
     */
    int getFinishHour(){
        return finishHour;
    }
}
