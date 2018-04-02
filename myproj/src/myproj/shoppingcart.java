package myproj;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Iterable;

public class shoppingcart {

	ArrayList<String> items=new ArrayList<String>() ;
	private static shoppingcart instance = new shoppingcart();
	String objectToSell1;
	String objectToSell2;
	float object_1_Price1=10.0f;
	float object_1_Price2=12.0f;
	float total_cart;
	
	Scanner sc = new Scanner(System.in);




	
	
	
	public shoppingcart()
	{
		
	}
	
	public static shoppingcart getInstance(){
	      return instance;
	   }
	
	public void mycart()
	{
		
		System.out.println("Please enter item number to enter to cart \n 1.object1 \n 2.object2");
		objectToSell1=sc.nextLine();
		
		
		if(objectToSell1.equals("A"))
		{
			items.add("A");
		}
		else if(objectToSell1.equals("B"))
		{
			items.add("B");
		}
		else
		{
			System.out.println("Your request is invalid!");
		}

	}
	 
	public void getTotalOfCart()
	{
        total_cart = 0;
        for(String item: items)
        {
            if (item.equals("A")){
                total_cart += 10.0;
            }
            else if (item.equals("B"))
            {
                total_cart += 15.0;
            }
        }
        System.out.println(total_cart);
    }
	
	
}
