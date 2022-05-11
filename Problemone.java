package naguruabdur_Assignment1;
import java.util.LinkedList;
import java.util.Scanner;


/**
@author naguru abdur rehaman
**/
public class Problemone {
	
		
	public static void main(String[] args)
	{ 
				
		myproblem1();
	
    }

		static LinkedList<Integer> L1 = new LinkedList<>();
		
		static Scanner scan = new Scanner(System.in);
		
		public static LinkedList<Integer> testProblem1(LinkedList<Integer> L1){
			
			 
					
			 LinkedList<Integer> L2 = new LinkedList<>();
					
						
					 
					for(int i= 0;i<L1.size();i++) 
					{	
						int temp = 0;
						for(int j=1; j<=L1.get(i)/2; j++)
						{
							if(L1.get(i)%j == 0)
							{
								temp += j;
							}
					    }
						if(temp == L1.get(i)) {
							L2.add(L1.get(i));
						}
					}
					
					return L2;
					
			
			
		   } 
		
		public static void myproblem1() {
			
					System.out.println("Enter total number of elements to insert:");
					int n = scan.nextInt();
			System.out.println("Enter the elements");
			while(n>0) {
				L1.add(scan.nextInt());
				n--;
			}
			System.out.println("Input (p1): "+ L1);
			
			
			LinkedList<Integer> l = new LinkedList<Integer>();  
			 l = Problemone.testProblem1(L1);
					
		
			System.out.println("Output (2): "+ l); 
	
		
		}
		
		
		

		
	}
	
