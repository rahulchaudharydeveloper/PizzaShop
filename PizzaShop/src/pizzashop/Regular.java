// Change, if required with inheritance and interface. [2 Marks]
package pizzashop;
import java.util.Scanner;
public class Regular extends Pizza implements PizzaPrice{

    public Regular(String type, String size) {
        super(type, size);
        // TODO Auto-generated constructor stub
        getToppings();
    }

    /*Define the toppings here, ask the user, max 2 toppings allowed for Regular type pizza. Populate your ArrayList of Toppings defined in Pizza class in here. Also compute here the total cost of ordering the extra toppings. [3 Marks] */
    public void getToppings() {

        Scanner in = new Scanner(System.in);
        System.out.println("How many toppings would you like?");
        int numToppings = (in.nextInt());
        if (numToppings>2)
        {
            System.out.println(" max 2 toppings allowed for Regular type pizza");
            getToppings();
        }
        else
        {

            for(int i=0;i<numToppings;i++)
            {
                System.out.println("Enter the toppings");
                String nameToppings = in.next();
                toppings.add(nameToppings);
            }

            if(getsize().equalsIgnoreCase("small"))
            {
                double BasePriceSmall=PriceofSmallPizza(numToppings*getcostOfTopping());
                setTotalCost(BasePriceSmall);
            }
            if(getsize().equalsIgnoreCase("medium"))
            {
                double BasePriceMedium=PriceofMediumPizza(numToppings*getcostOfTopping());
                setTotalCost(BasePriceMedium);
            }
            if(getsize().equalsIgnoreCase("large"))
            {
                double BasePriceLarge=PriceofLargePizza(numToppings*getcostOfTopping());
                setTotalCost(BasePriceLarge);
            }
        }
        in.close();
    }

    /*Implement the PizzaPrice Interface’s methods here to find the price of each pizza by its size using the cost of toppings. One of the method is implemented for your reference.   [3 Marks] */
@Override
    public double PriceofSmallPizza(double costTopping)
    {
        return costTopping+this.getPriceOfBasePizza()[0];
    }
@Override
    public double PriceofMediumPizza(double costTopping)
    {
        return costTopping+this.getPriceOfBasePizza()[1];
    }
@Override
    public double PriceofLargePizza(double costTopping)
    {
        return costTopping+this.getPriceOfBasePizza()[2];
    }
@Override
    public double TaxOnPizza(double TotalCost)
    {
        return TotalCost;
    }
}
