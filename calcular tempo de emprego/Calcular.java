package visão;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Calcular {
	
	public void calcula() {
		
		Scanner ler = new Scanner(System.in);
		Principal main = new Principal();
		ArrayList <Pessoa> trabai = new ArrayList<Pessoa>();
	
		Pessoa p = new Pessoa();
		System.out.println("Qual seu nome?");
		p.setNome(ler.nextLine());
		System.out.println("Qual sua empresa?");
		p.setEmpresa(ler.nextLine());
		System.out.println("Diga o dia de admissao");
		p.setDiaa(ler.nextInt());
		System.out.println("Diga o mes de admissão");
		p.setMesa(ler.nextInt());
		System.out.println("Diga o ano de admissão");
		p.setAnoa(ler.nextInt());
		
		System.out.println("Diga o dia de demissão");
		p.setDiab(ler.nextInt());
		System.out.println("Diga o mes de demissão");
		p.setMesb(ler.nextInt());
		System.out.println("Diga o ano de demissão");
		p.setAnob(ler.nextInt());
		trabai.add(p);
		
		
		
		for (int i = 0;i < trabai.size();i++) {
			
		LocalDate data1 = LocalDate.of(trabai.get(i).anoa, trabai.get(i).getMesa(),trabai.get(i).diaa);
		LocalDate data2 = LocalDate.of(trabai.get(i).anob, trabai.get(i).getMesb(),trabai.get(i).diab);
		Period tempo = Period.between(data1, data2);
		int ano = tempo.getYears();
		int mes = tempo.getMonths();
		int dias = tempo.getDays();
		
		
		System.out.println(trabai.get(i).getNome() + " trabalha a "+ano+" ano(s) "+mes+" mes(es) e " +dias+" dia(s) na empresa "+trabai.get(i).getEmpresa() );
		}
	}
	
	public void fim() throws InterruptedException {
		
			System.out.println("");
			System.out.println("");
			System.out.print("FIM ");
			Thread.sleep(500);
			System.out.print("DO ");
			Thread.sleep(500);
			System.out.println("CÓDIGO");
			Thread.sleep(500);
			System.out.println("OBRIGADO!");
		}
	}
