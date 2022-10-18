package visão;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
public class Principal {

	public static void main(String[] args) throws InterruptedException {
		int op = 33;
		do {
			Scanner ler = new Scanner(System.in);
			Calcular c = new Calcular();
			System.out.println("Bem vindo!");
			System.out.println("1 - Calcular tempo");
			System.out.println("2 - sair");
			op = ler.nextInt();
			
			switch(op) {
			case 1: c.calcula();
				break;
			case 2: c.fim();
				break;
		} }while(op != 2);
	}
}
