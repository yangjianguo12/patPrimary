import java.util.Scanner;

public class test {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		int n = 0;
		while( value < 1000 && value!=1) {
			if(value %2 == 0 ) {
				value = value/2;
			}else {
				value = (3*value +1 )/2 ; 
			}
			n ++ ;
		}
		
		
		System.out.println(n);

		}
}
