import java.util.Scanner;

public class ExercicoCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimir("Escolha a opera��o que deseja fazer: " + "\n(0) Adi��o" + "\n(1) Subtra��o: ");
		Integer escolhaUsuario = scanner.nextInt();
		
		imprimir("Digite um numero: ");
		Double num1 = recebendoNumero (scanner);
		imprimir ("Digite o segundo numero: ");
		Double num2 = recebendoNumero (scanner);
		
		
		
		
		scanner.close();
	}
		
		static Double recebendoNumero (Scanner scanner) {
			Double numero = scanner.nextDouble();
			return numero;
		}
		
		static Double adicao (Double numeroUm, Double numeroDois) {
			Double resultadoAdicao = numeroUm + numeroDois;
			return resultadoAdicao;	
		}
		
		static Double subtracao (Double numeroUm, Double numeroDois) {
			Double resultadoSubtracao = numeroUm - numeroDois;
			return resultadoSubtracao;
		}
		
		static Double operacaoEscolhida (Integer operacao, Double numeroUm, Double numeroDois) {
			Double resultado = null;
			
			switch (operacao) {
			case 0: 
				resultado = adicao(numeroUm, numeroDois);
				break;
				
			case 1:
				resultado = subtracao(numeroUm, numeroDois);
				break;
				
			default:
				System.err.println("N�mero inv�lido!");
				System.exit(0);
			
			}
			return resultado; 
				
			
		}
		static void imprimir(String texto) {
			System.out.println(texto);

		}
	}
