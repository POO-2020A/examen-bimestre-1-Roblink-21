
public class Passenger {
    private String name;
    private String lastname;
    
    public Passenger(String name, String lastname)
    {
        this.name = name;
        this.lastname = lastname;
    }
    
    public String getName()
    {
        return this.name;
        
    }
    
    public String getLastName()
    {
        return this.lastname;
    }
    
    public void setName(String nombre)
    {
        this.name = nombre;
    }
    
    public void setLastName(String apellido)
    {
        this.lastname = apellido;
    }
    
    @Override
    public boolean equals(Object compared)
    {
        if(this == compared)
        {
            return true;
        }
        if(!(compared instanceof Passenger))
        {
            return false;
        }
        
        Passenger comparedPasajero = (Passenger) compared;
        
        if(this.name.equals(comparedPasajero.name) && this.name.equals(comparedPasajero.lastname))
        {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString()
    {
        return this.name + " " + this.lastname;
    }
}
