package model.entities;

import java.util.Scanner;

/**
 * Classe que represente o primeiro DESAFIO DE PROGRAMA��O - ACADEMIA CAPGEMINI
 * 
 *@author Nascimento, Rafael
 */

public class PrimeiroDesafio implements Desafio {

	int n = 0;
/**
 * M�todo utilizado para gerar uma escada impressa de espa�os e asteriscos, dado um numero int de entrada.
 */
	public void desafio() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para a escada de asterisco: ");
		
		int numeroDeEntrada = sc.nextInt();
		
		int parametroDeValidacaoFor = numeroDeEntrada;

		while (numeroDeEntrada != 0) {
			for (int i = 1; i < numeroDeEntrada; i++) {
				System.out.print(" ");
			}
			for (int i = parametroDeValidacaoFor; i >= numeroDeEntrada; i--) {
				System.out.print("*");
			}
			System.out.println();
			numeroDeEntrada--;
		}
	}
}
