import java.util.Scanner;

public class ProductInInterval {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
		int m = sc.nextInt();
		int num = n;
		long product = 1;
		do{
			product *= num;
			num++;
		}while(num<=m);
		System.out.println("Product [n...m] = " + product);
	}

}
