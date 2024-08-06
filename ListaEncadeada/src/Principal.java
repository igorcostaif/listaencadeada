import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l = new Lista();
		Scanner in = new Scanner(System.in);
		
		Random g = new Random();
		
		for(int cont=0;cont<1000;cont++) {
			
			l.adicionarComeco("Teste"+g.nextInt());
			
		}
		
		l.adiconarPorPosicao(3, "TestePosicao");
	
	
		
		System.out.println("=====Remover Início====");
		
		l.removerInicio();

		System.out.println("====Remover Final====");
		
		l.removerDoFinal();
		

		
		System.out.println("====Remover por Posição===");
		
		l.removerPorPosicao(800);

	}
	
	


}
