import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>(11);
		Random random = new Random();
		System.out.println("escriba TipoA o TipoB : ");
		//String val = sc.nextLine();
		String val = "TipoA";
		
		if(val=="TipoA") {
			numbers.add(5);
			numbers.add(4);
		for (int i=1;i<=9;i++){
			 int valorDado = random.nextInt(9)+1; 
			   numbers.add(valorDado);
			}
		}else if(val=="TipoB") {
			numbers.add(0);
			numbers.add(8);
		for (int i=1;i<=9;i++){
			 int valorDado = random.nextInt(9)+1; 
			   numbers.add(valorDado);
			}
		}else if(val==null) {
			System.out.println("no se puede ejecutar la operacion");
		}
		
		
		for (int i=0;i<numbers.size();i++) {
		      
		      System.out.println(numbers.get(i));
		    }
		}
		}
	 

