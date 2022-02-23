package model.entities;

import java.util.Scanner;

/**
 * Classe que represente o segundo DESAFIO DE PROGRAMA��O - ACADEMIA CAPGEMINI
 * 
 *@author Nascimento, Rafael
 */

public class SegundoDesafio implements Desafio{
	
	/**
	 * M�todo utilizado para validar senhas, dado duas Strings, entradaDoNome e entradaDaSenha.
	 */
	public void desafio() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome:");
		String entradaDoNome = sc.nextLine();
		
		int parametroDeValidacaoWhile = 0;

		while (parametroDeValidacaoWhile == 0) {
			System.out.print("Digite a senha:");
			String entradaDaSenha = sc.nextLine();

			if (entradaDaSenha.matches("(?=.*[!@#$%^&*()-+])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?!.*[\s]).{6,20}")) {
				System.out.println(entradaDoNome + " seu cadastro foi realizado !");
				parametroDeValidacaoWhile = 1;
			}
			if (entradaDaSenha.matches("(?!.*[a-z]).{1,20}")) {
				System.out.println("A senha precisa conter no m�nimo 1 letra min�scula");
			}
			if (entradaDaSenha.matches("(?!.*[A-Z]).{1,20}")) {
				System.out.println("A senha precisa conter no m�nimo 1 letra mai�scula");
			}
			if (entradaDaSenha.matches("(?!.*[0-9]).{1,20}")) {
				System.out.println("A senha precisa conter no m�nimo 1 numeral");
			}
			if (entradaDaSenha.matches("(?!.*[!@#$%^&*()-+]).{1,20}")) {
				System.out.println("A senha precisa conter no m�nimo 1 caracter especial");
			}
			if (entradaDaSenha.matches("(?=.*[}{,.?~=_|/\\[\\]]).{1,20}")) {
				System.out.println("voc� digitou um caractere especial n�o aceito");
				System.out.println("Os caracteres especiais aceitos s�o: !@#$%^&*()-+");
			}
			if (entradaDaSenha.matches("(?=.*[\s]).{1,20}")) {
				System.out.println("A senha n�o aceita espa�o");
			}
			if (6 > entradaDaSenha.length()) {
				System.out.println("A senha precisa ter 6 ou mais caractere(s)");
				System.out.println("Faltam: " + (6 - entradaDaSenha.length()) + " caracteres");
			}
		}
	}
}
