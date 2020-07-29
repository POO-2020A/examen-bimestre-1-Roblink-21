
public class Seat {
    private int row;
    private String col;
    private  Passenger passenger;
    
    public Seat(int row, String col)
    {
        this.row = row;
        this.col = col;
        
    }
    
    public int getRow()
    {
        return this.row;
    }
    
    public String getCol()
    {
        return this.col;
    }
    
    public void setRow(int row)
    {
        this.row = row;
    }
    
    public void setCol(String col)
    {
        this.col = col;
    }
    
    public boolean isFree()
    {
        if(passenger == null)
        {
            return true;
        }
        return false;
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
        
        Seat comparedAsiento = (Seat) compared;
        
        if((this.col.equals(comparedAsiento.col)) && (this.row == comparedAsiento.row))
        {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString()
    {
        String message = "";
        if(this.isFree())
        {
            message = "Asiento: " + this.row + this.col + ", libre.";
        }
        else
        {
            message = "Asiento: " + this.row + this.col + ", ocupado. Pasajero: " + passenger.toString();
        }
        
        
        return message;
    }
    
    
}
