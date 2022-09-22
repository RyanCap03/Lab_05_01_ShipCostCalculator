public class Main
{
    public static void main(String[] args)
    {
        double itemPrice = 77.0;
        double shipping = itemPrice * 0.02;

        if(itemPrice >= 100)
        {
            System.out.println("Your item is over $100 so your shipping is free!");
            System.out.println("Shipping is $0.00");
            System.out.println("Your Total is $" + itemPrice);
        }
        else
        {
            System.out.println("Your shipping is $" + shipping);
            System.out.println("Your Tota is $" + itemPrice + shipping);
        }



    }
}