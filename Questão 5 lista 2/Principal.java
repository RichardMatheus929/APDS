package Visão;

import java.awt.Rectangle;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
	
		Retangulo ra = new Retangulo();
		Retangulo rb = new Retangulo();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Diga o caminho do seu arquivo");
		String caminho = ler.nextLine();
		Scanner a = new Scanner(new FileReader(caminho));
		
		ra.setA(a.nextInt());
		ra.setL(a.nextInt());
		ra.setX(a.nextInt());
		ra.setY(a.nextInt());
		rb.setA(a.nextInt());
		rb.setL(a.nextInt());
		rb.setX(a.nextInt());
		rb.setY(a.nextInt());
	
		Rectangle rectOne = new Rectangle (ra.getA(), ra.getL(), ra.getX(), ra.getY());
		Rectangle rectTwo = new Rectangle (rb.getA(), rb.getL() ,rb.getX(), rb.getY());
		boolean x = rectOne.intersects ( rectTwo );
		
		if(x) {
			System.out.print("O seu retângulo ("+ra.getA()+" "+ra.getL()+" "+ra.getX()+" "+ra.getY()+") ");
			System.out.println("Colidiu(1) com o retângulo");
			System.out.println("( "+rb.getA()+" "+rb.getL()+" "+rb.getX()+" "+rb.getY()+" )");
		} else {
			System.out.print("O seu retângulo ("+ra.getA()+" "+ra.getL()+" "+ra.getX()+" "+ra.getY()+") ");
			System.out.println("Não colidiu(0) com o retângulo");
			System.out.println("( "+rb.getA()+" "+rb.getL()+" "+rb.getX()+" "+rb.getY()+" )");
		}
		
		
				
	}
	
	

}
