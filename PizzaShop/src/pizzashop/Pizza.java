package pizzashop;
import java.util.ArrayList;

// Change the class type if required. [1 Mark]

public abstract class Pizza {

    private static final double costOfTopping = 2.5;
    // Price of Small, medium and large pizza is 10$, 12$ and 14$ respectively.
    private double[] PriceOfBasePizza = {10.00, 12.00, 14.00};
    private static double TotalCost;
    private static String type;

    protected  static ArrayList<String> toppings = new ArrayList<String>();
    private static String size;

    //Initialize the default constructor for this class. [1 Mark]
    Pizza()
    {

    }

    public Pizza(String type, String size) {
        this.type = type;
        this.size = size;
    }

    /* Generate Setters and getters for the variables which you will be requiring later [3 Marks] */
    public double getTotalCost()
    {
        return this.TotalCost;
    }

    double setTotalCost(double TotalCost)
    {
        return this.TotalCost = TotalCost;
    }

    public String gettype()
    {
        return this.type;
    }

    String settype(String type)
    {
        return this.type = type;
    }

    public String getsize()
    {
        return this.size;
    }

    String setsize(String size)
    {
        return this.size = size;
    }

    public double getcostOfTopping()
    {
        return this.costOfTopping;
    }

    public double[] getPriceOfBasePizza()
    {
        return this.PriceOfBasePizza;
    }

    public abstract void getToppings();
    //Override the toString() method here. [2 Marks]
    public String toString()
    {
        return "Type: "+ gettype()+"\nSize: "+ getsize()+"\nToppings: "+toppings+"\nTotal Cost: "+Double.toString(getTotalCost());
    }
}
