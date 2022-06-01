# vending-machine-ver-java
import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, this is a vending machine program");
		System.out.println("Please register the product.");
		System.out.print("Please enter the name of product 1");
		String product1 = scanner.nextLine();
		System.out.println("product 1:"+product1);
		System.out.print("Please enter the price of product 1");
		String product1P = scanner.nextLine();
		int product1Price = Integer.parseInt(product1P);
		System.out.println(product1Price);
	
		System.out.print("Please enter the name of product 2");
		String product2 = scanner.nextLine();
		System.out.println("product 2:"+product2);
		System.out.print("Please enter the price of product 2");
		String product2P = scanner.nextLine();
		int product2Price = Integer.parseInt(product2P);
		System.out.println(product2Price);
	
		System.out.print("Please enter the name of product 3");
		String product3 = scanner.nextLine();
		System.out.println("product 3:"+product3);
		System.out.print("Please enter the price of product 3");
		String product3P = scanner.nextLine();
		int product3Price = Integer.parseInt(product3P);
		System.out.println(product3Price);

		System.out.print("Please enter the name of product 4");
		String product4 = scanner.nextLine();
		System.out.println("product 4:"+product4);
		System.out.print("Please enter the price of product 4");
		String product4P = scanner.nextLine();
		int product4Price = Integer.parseInt(product4P);
		System.out.println(product4Price);
		
		System.out.print("Please enter the name of product 5");
		String product5 = scanner.nextLine();
		System.out.println("product 5:"+product5);
		System.out.print("Please enter the price of product 5");
		String product5P = scanner.nextLine();
		int product5Price = Integer.parseInt(product5P);
		System.out.println(product5Price);
		while(true)	{
			System.out.println("Hello, this is a vending machine program");
			System.out.print("product1:"+product1);
			System.out.println("  price:"+product1P+"won");
			System.out.print("product2:"+product2);
			System.out.println("  price:"+product2P+"won");
			System.out.print("product3:"+product3);
			System.out.println("  price:"+product3P+"won");
			System.out.print("product4:"+product4);
			System.out.println("  price:"+product4P+"won");
			System.out.print("product5:"+product5);
			System.out.println("  price:"+product5P+"won");
			System.out.println("If you want to buy it, please enter number 1");
			String question = scanner.nextLine();
			int num = Integer.parseInt(question);
				
				if(num == 1) {
					System.out.println("Put the money in, please");
					String inputMoney = scanner.nextLine();
					int money = Integer.parseInt(inputMoney);
					System.out.print("Enter");
					System.out.println(money);
					System.out.println("Please choose a product number");
					String inputProductNum = scanner.nextLine();
					int ProductNum = Integer.parseInt(inputProductNum);
						if(ProductNum ==1 ) {
							if(money-product1Price >= 0) {
								System.out.println(product1);
								System.out.println("Keep the change");
								System.out.print("The charge is ");
								System.out.print(money-product1Price);
								System.out.println("won");
								
							}
							else	{
								System.out.println("Money is scarce.");
							}
							
						}
						else if(ProductNum==2) {
							if(money-product2Price >= 0) {
								System.out.println(product2);
								System.out.println("Keep the change");
								System.out.print("The charge is ");
								System.out.print(money-product2Price);
								System.out.println("won");
							}
							else	{
								System.out.println("Money is scarce.");
							}
							
						}
						else if(ProductNum==3) {
							if(money-product3Price >= 0) {
								System.out.println(product3);
								System.out.println("Keep the change");
								System.out.print("The charge is ");
								System.out.print(money-product3Price);
								System.out.println("won");
							}
							else	{
								System.out.println("Money is scarce.");
							}
							
						}
						else if(ProductNum==4) {
							if(money-product4Price >= 0) {
								System.out.println(product4);
								System.out.println("Keep the change");
								System.out.print("The charge is ");
								System.out.print(money-product4Price);
								System.out.println("won");
							}
							else	{
								System.out.println("Money is scarce.");
							}
							
						}
						else if(ProductNum==5) {
							if(money-product5Price >= 0) {
								System.out.println(product5);
								System.out.println("Keep the change");
								System.out.print("The charge is ");
								System.out.print(money-product5Price);
								System.out.println("won");
							}
							else	{
								System.out.println("Money is scarce.");
							}
							
						}
						else	{
							System.out.println("The product number does not exist. Please enter it again.");
						}
				}
				
				else {
					System.out.println("You have entered it incorrectly. Please enter number 1 again");
					continue;
					
				}
	}
		
	}

}
