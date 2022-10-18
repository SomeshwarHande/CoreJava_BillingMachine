package BillingCounter;

import java.util.Scanner;

public class BillMachine 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int samosa= 0;
		int sam=0;
		int s = 0;
		int vadapav = 0;
		int vad=0;
		int v = 0;
		int tea= 0;
		int te=0;
		int t=0;
		int total;
		int a=1;
		int i=1;
	
		while(i==1) {
			
			System.out.println(" *** Snacks Corner ***"+"1.New Order \n"+"2.Turn Off");
			
			int machine = sc.nextInt();
			
			switch(machine) {
			
			case 1:
				
				a=1;
				
				while(a==1) {
					
					System.out.println(" **Menu** \n"+"1. Samosa \n"+"2. Vadapav \n"+"3. Tea \n"+"4. Print");
					
					int choice= sc.nextInt();
					
					switch(choice) {
					
					case 0:
						
						samosa= 0;
						sam=0;
						s = 0;
						vadapav = 0;
						vad=0;
						v = 0;
						tea= 0;
						te=0;
						t=0;
						total=0;
						break;
					
					case 1:
						
						System.out.println("Enter no of Samosa");
						s = sc.nextInt();
						if(s>0)
						{
							samosa = 15 *s;
							sam=1;
							System.out.println("Samosa = "+s);
						}
						break;
					
						
					case 2:
						
						System.out.println("Enter no of Vadapav");
						v = sc.nextInt();
						if(v>0)
						{
							vadapav = 15 *v;
							vad=1;
							System.out.println("Vadapav = "+v);
						}
						break;
						
						
					case 3:
						
						System.out.println("Enter no of Tea");
						t = sc.nextInt();
						if(t>0)
						{
							tea = 12 *t;
							te=1;
							System.out.println("Tea = "+t);
						}
						break;
						
					case 4:
						
						a=0;
						
						total= samosa + vadapav + tea;
						
						System.out.println("\n"+"******Snacks Corner*********"+"\n");
						System.out.println("Order      Rs  Quantity  Total ");
						
						if(sam>0) {
							System.out.println("Samosa     15     "+s+"       "+ samosa);
						}
						if(vad>0) {
							System.out.println("Vadapav    15     "+v+"       "+ vadapav);
						}
						if(te>0) {
							System.out.println("Tea        12     "+t+"       "+ tea);
						}
							System.out.println("Total                  "+"Rs " +total);
							
						System.out.println("\n"+"****************************"+"\n");
						
						samosa= 0;
						sam=0;
						s = 0;
						vadapav = 0;
						vad=0;
						v = 0;
						tea= 0;
						te=0;
						t=0;
						total=0;
						break;
					}
				}
				break;
				
			case 2:
				
				i=0;
				System.out.println("Turnning OFF \n"+"Bye Bye");
				
			}
		}

	}
}
