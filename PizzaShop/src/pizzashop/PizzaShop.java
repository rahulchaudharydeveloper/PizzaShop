package pizzashop;

import java.util.Scanner;

public class PizzaShop extends Pizza{
    public PizzaShop(String type, String size) {
        super(type, size);
        // TODO Auto-generated constructor stub
    }

    public void getToppings(){}

    public static void main(String[] args) {

        // ask for customer name, type and size of pizza.
        String name="",type="",size="";
        Scanner in = new Scanner(System.in);
        do
        {
        System.out.println("Enter customer name: ");
        name = in.nextLine();
        }while(name.equals(""));
        
        do{
        System.out.println("What type of pizza would you like, regular or feast ");
        type = in.nextLine();
        }while(type.equals(""));
        
        do
        {
        System.out.println("What size of pizza would you like, small, medium or large? ");
        size = in.nextLine(); 
        }while(size.equals(""));
        
        /* Find total price of pizza as per selection of the user for each pizza type. 
        [5 Marks] */

        if (type.equalsIgnoreCase("regular")){
            new Regular(type,size);

        }
        if(type.equalsIgnoreCase("feast")){
            new Feast(type,size);
        }
        in.close();
        /* Finally call the toString() method from your Pizza Class and modify it to display the customer name, their type, size and toppings and the total cost of the pizza. [2 Marks] */  
        PizzaShop obj=new PizzaShop(type,size);
        String complete=obj.toString();
        System.out.println("\n\n-------------------------------------OUTPUT---------------------------------------");
        System.out.println("\nName: "+name);
        System.out.println(complete);
    }
}
