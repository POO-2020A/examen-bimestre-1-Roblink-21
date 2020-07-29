
import java.util.ArrayList;


public class Plane {
    private ArrayList<Seat> seats;
    private int rows;
    private int cols;
    
    public Plane(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.seats = new ArrayList<>();
    }
    
    public int getRows()
    {
        return this.rows;
    }
    
    public int getCols()
    {
        return this.cols;
    }
    
    public void setRows(int filas)
    {
        this.rows = filas;
    }
    
    public void setCols(int columnas)
    {
        this.cols = columnas;
    }
    
    public void seatSets(Seat info)
    {
        this.seats.add(info);
    }
    
    @Override
    public String toString()
    {
        String Abecedario ="A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T";
        String partes[] = Abecedario.split(",");
        String impresion = "";
        System.out.println("Este es el mapa del avión:");
        for(int i = 0; i < this.rows; i++)
        {
            impresion = impresion + (i+1) + " ";
            for(int j = 0; j < this.cols; j++)
            {
                if(this.seats.isEmpty())
                {
                   impresion = impresion + partes[j]; 
                }
                else
                {
                    
                    for(Seat p : this.seats)
                    {
                        
                        if((p.getRow() - 1 == i) && p.getCol().equals(partes[j]))
                        {
                            
                            
                            impresion = impresion + "X"; 
                        }
                        else
                        {
                            impresion = impresion + partes[j]; 
                        }
                 
                    }
                    
                }
                
            }
            impresion = impresion + "\n";
            
        }
        
        return impresion;
        
    }
    
            
    
}
