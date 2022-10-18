package Visão;

import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Retangulo {
	
	public String caminho;
	public int a;
	public int l;
	public int x;
	public int y;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	
	public void ler() throws FileNotFoundException {
		
		Retangulo ra = new Retangulo();
		Retangulo rb = new Retangulo();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Diga o caminho do seu arquivo");
		ra.setCaminho(ler.nextLine());
		Scanner lerarquivo = new Scanner(new FileReader(ra.getCaminho()));
		
		ra.setA(lerarquivo.nextInt());
		ra.setL(lerarquivo.nextInt());
		ra.setX(lerarquivo.nextInt());
		ra.setY(lerarquivo.nextInt());
		rb.setA(lerarquivo.nextInt());
		rb.setL(lerarquivo.nextInt());
		rb.setX(lerarquivo.nextInt());
		rb.setY(lerarquivo.nextInt());
		
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
