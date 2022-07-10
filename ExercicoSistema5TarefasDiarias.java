import java.util.Scanner;

public class ExercicoSistema5TarefasDiarias {
	
	public static void main(String[] args) {
		String[] tarefas = new String [5];
		
		System.out.println("Digite as 5 principais tarefas diarias:");
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("1°: ");
		tarefas[0] = scanner.next();
		
		System.out.print("2°: ");
		tarefas[1] = scanner.next();
		
		System.out.print("3°: ");
		tarefas[2] = scanner.next();
		
		System.out.print("4°: ");
		tarefas[3] = scanner.next();
		
		System.out.print("5°: ");
		tarefas[4] = scanner.next();
		
		System.out.println("Suas tarefas principais de hoje, são: ");
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println(tarefas[i]);
		}
		
		
		scanner.close();		
		
	}
}
