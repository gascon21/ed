// David Gascón López

package propertyshop;

public class Property {
    String name;
    String address;
    double constructedSurfaces;
    double availableSurfaces;
    String owner;
    String ownerAddress;
    int prince;
    
    /**
     * Este método modifica el valor de name.  
     */
    void setName(String newName){
        if (newName != null)
            name = newName.toLowerCase();
    }
    
    /**
     * Este método devuelve el valor de name.
     */
    String getName(){
        return name;
    }
    
    /**
     * Este método modifica el valor de address.  
     */
    void setAddress(String newAddress){
        if (newAddress != null)
            address = newAddress.toUpperCase();
    }
    
    /**
     * Este método devuelve el valor de address.
     */
    String getAddress(){
        return address;
    }
    
    /**
     * Este método modifica el valor de constructedSurfaces si es un número mayor
     * que 0, si el número es 0 o menor este método no hará nada.  
     */
    void setConstructedSurface(double newConstructedSurfaces){
        if(newConstructedSurfaces > 0)
            constructedSurfaces = newConstructedSurfaces;
    }
    
    /**
     * Este método devuelve el valor de constructedSurfaces.
     */
    double getConstructedSurface(){
        return constructedSurfaces;
    }
    
    /**
     * Este método modifica el valor de availableSurfaces si es un número mayor
     * que 0, si el número es 0 o menor este método no hará nada.  
     */
    void setAvailableSurface(double newAvailableSurfaces){
        if(newAvailableSurfaces > 0)
            availableSurfaces = newAvailableSurfaces;
    }
    
    /**
     * Este método devuelve el valor de availableSurfaces.
     */
    double getAvailableSurface(){
        return availableSurfaces;
    }
    
    /**
     * Este método modifica el valor de owner.  
     */
    void setOwner(String newOwner){
        owner = newOwner;
    }
    
    /**
     * Este método devuelve el valor de owner.
     */
    String getOwner(){
        return owner;
    }
    
    /**
     * Este método modifica el valor de ownerAddress.  
     */
    void setOwnerAddress(String newOwnerAddress){
        ownerAddress = newOwnerAddress;
    }
    
    /**
     * Este método devuelve el valor de ownerAddress.
     */
    String getOwnerAddress(){
        return ownerAddress;
    }
    
    /**
     * Este método modifica el valor de prince si es un número mayor
     * que 0, si el número es 0 o menor este método no hará nada.  
     */
    void setPrice(int newPrince){
        if(newPrince > 0)
            prince = newPrince;
    }
    
    /**
     * Este método devuelve el valor de prince.
     */
    int getPrice(){
        return prince;
    }
}
