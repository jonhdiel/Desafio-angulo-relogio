import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) {
    System.out.println("Favor informar a hora entre 0 e 12:00");
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a hora:");
    int hora = sc.nextInt();
    System.out.print("Digite o minuto:");
    int minuto = sc.nextInt();
    
    if (hora <0 || minuto < 0 || hora >12 || minuto > 60) {
        System.out.println("Entrada inválida!");
        return ;
    }
    Relogio relogio = new Relogio(); 
		//00:00
		GregorianCalendar g = new GregorianCalendar(2018, 02, 23, hora, minuto);
		long diferenca = relogio.retornaAnguloRelogio(g);
  
  System.out.println("A diferença dos ângulo entre os 2 ponteiros do relógio é: " + diferenca);
    
  }
  
  
}
