package parcial_POO;
import java.util.Scanner;
public class ejercicio_5 {
    private static Scanner teclado;
	public static void main(String[] args) {
		teclado = new Scanner (System.in);
		System.out.println("ingrese la cadena: ");
	       String x = teclado.nextLine();
	              x = x.replace(" ", "");
	       int lenght = x.length();
	       char [] cadenaChar = x.toCharArray();
	       int n = lenght;
	       if ( lenght % 2 != 0){
	           lenght = lenght + 1;
	        }
	      
	       boolean palindromo = true;
	       
	       for (int i = 0; i < lenght/2 ; i++) {
	                      
	           char a = cadenaChar[i];
	           char b = cadenaChar[n - 1 -i];
	           
	            if(a == b){
	               
	           }
	           else{
	               palindromo = false;
	               
	               break;
	            }
	       }
	       
	       if (palindromo == true){
	           System.out.println(" es palindromo");
	       }
	       else{
	           System.out.println(" no es palindromo");
	       }
	        
	        
	    }
}
