import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas pessoas quer adicionar?");
		int numeroPessoas=scanner.nextInt();
		
		//cleaner do scanner
		scanner.nextLine();
		
		Pessoa[] pessoa = new Pessoa[numeroPessoas];
		
		for(int i=0;i<numeroPessoas;i++) {
			pessoa[i] = new Pessoa();
			System.out.println("Nome da pessoa "+ (i+1));
			pessoa[i].nome=scanner.nextLine();
		}

		for(int i=0;i<numeroPessoas;i++) {
			System.out.println("Nome da pessoa "+ (i+1) +": "+pessoa[i].nome);
		}
	}

}
