package vis�o;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
public class Principal {

	public static void main(String[] args) throws ParseException {
		
	
		diferenca();
		 
	}
	public static void diferenca() throws ParseException {
		Pessoa p = new Pessoa();
		Scanner ler = new Scanner(System.in);
		
		
		
		System.out.println("Diga o dia de admissao");
		p.setDiaa(ler.nextInt());
		System.out.println("Diga o mes de admiss�o");
		p.setMesa(ler.nextInt());
		System.out.println("Diga o ano de admiss�o");
		p.setAnoa(ler.nextInt());
		
		System.out.println("Diga o dia de demiss�o");
		p.setDiab(ler.nextInt());
		System.out.println("Diga o mes de demiss�o");
		p.setMesb(ler.nextInt());
		System.out.println("Diga o ano de demiss�o");
		p.setAnob(ler.nextInt());
		
		
		LocalDate data1 = LocalDate.of(p.getAnoa(), p.getMesa(), p.getDiaa());
		LocalDate data2 = LocalDate.of(p.getAnob(), p.getMesb(), p.getDiab());
		Period tempo = Period.between(data1, data2);
		
		int ano = tempo.getYears();
		int mes = tempo.getMonths();
		int dias = tempo.getDays();
		
		
		System.out.println("Voc� trablha a "+ano+" ano "+mes+" meses e " +dias+" dias" );
		
	}

}
