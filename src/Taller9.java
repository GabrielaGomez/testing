import java.util.Date;


public class Taller9 {
	
	public static void main (String [] args){
			
			int i = 10;

			Customer[] cus = new Customer[i];
			
			for(int j=0; j < i; j++){
				cus [j] = new Customer();
			}
			for(Customer c : cus){
				System.out.println( c );
			}
	}
}