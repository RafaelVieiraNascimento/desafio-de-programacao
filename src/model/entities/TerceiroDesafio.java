package model.entities;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe que represente o terceiro DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI
 * 
 *@author Nascimento, Rafael
 */

public class TerceiroDesafio implements Desafio {

	private String validacaoDeAnagrama = null;
	private String validacaoDeAnagramaParaComparacao = null;
	private int contadorDoTotalDeAnagramas = 0;
	private int parametroDeValidacaoFor = 0;
	private char[] vetorDaEntradaDaPalavraDePesquisa;
	private char[] vetorParaOrdenarAnagrama;

	/**
	 * Método utilizado para ordenar de forma alfabetica os anagramas.
	 * @param validacaoDeAnagrama vai receber o conjunto de caracteres para ordenar em ordem alfabética, das posições itera1 e itera2 do vetorDaEntradaDaPalavraDePesquisa.
	 * @param itera1 posição de onde o conjunto de caracteres deve ser pego do vetorDaEntradaDaPalavraDePesquisa para passar para validacaoDeAnagrama.
	 * @param itera2quantidade de caracteres que deve ser pego do vetorDaEntradaDaPalavraDePesquisa para passar para validacaoDeAnagrama.
	 */
	private void concatenaAnagrama(String validacaoDeAnagrama, int itera1, int itera2) {
		validacaoDeAnagrama = String.copyValueOf(vetorDaEntradaDaPalavraDePesquisa, itera1, itera2);
		vetorParaOrdenarAnagrama = validacaoDeAnagrama.toCharArray();
		Arrays.sort(vetorParaOrdenarAnagrama);
	}
	
	/**
	 * Método utilizado para realizar a pesquisa de pares de anagramas, dado uma String entradaDaPalavraDePesquisa.
	 */

	public void desafio() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra para a pesquisa de anagrama:");
		String entradaDaPalavraDePesquisa = sc.next();
		vetorDaEntradaDaPalavraDePesquisa = entradaDaPalavraDePesquisa.toCharArray();

		for (int k = 1; k < entradaDaPalavraDePesquisa.length(); k++) {
			parametroDeValidacaoFor++;

			for (int i = 0; i <= entradaDaPalavraDePesquisa.length() - parametroDeValidacaoFor; i++) {
				concatenaAnagrama(validacaoDeAnagrama, i, k);
				validacaoDeAnagrama = new String(vetorParaOrdenarAnagrama);

				for (int j = i + 1; j <= entradaDaPalavraDePesquisa.length() - parametroDeValidacaoFor; j++) {
					concatenaAnagrama(validacaoDeAnagramaParaComparacao, j, k);
					validacaoDeAnagramaParaComparacao = new String(vetorParaOrdenarAnagrama);

					if (validacaoDeAnagrama.equals(validacaoDeAnagramaParaComparacao)) {
						System.out.println("[" + String.copyValueOf(vetorDaEntradaDaPalavraDePesquisa, i, k) + ","
								+ String.copyValueOf(vetorDaEntradaDaPalavraDePesquisa, j, k) + "]");
						contadorDoTotalDeAnagramas++;
					}
				}
			}
		}
		System.out.println("Total de: " + contadorDoTotalDeAnagramas);
	}
}
