import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		String nome; //pq aqui eu n�o precisei cirar a variavel?
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Qual seu nome?");
		nome = ler.next();
		System.out.println("Ol� " + nome);
	}
}
