package application;

import java.util.Scanner;

/**
 * Classe que represente o Main do programa.
 * 
 *@author Nascimento, Rafael
 */

import model.entities.Desafio;
import model.entities.MenuDesafio;
import model.entities.PrimeiroDesafio;
import model.entities.SegundoDesafio;
import model.entities.TerceiroDesafio;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int menu;
		Desafio desafio = null;
		MenuDesafio.menuDesafio();
		menu = sc.nextInt();

		while (menu != 0) {

			switch (menu) {
			case 1:
				desafio = new PrimeiroDesafio();
				break;
			case 2:
				desafio = new SegundoDesafio();
				break;
			case 3:
				desafio = new TerceiroDesafio();
				break;
			}
			if (menu <= 3 && menu != 0) {
				desafio.desafio();
			}
			System.out.println();
			MenuDesafio.menuDesafio();
			menu = sc.nextInt();
		}
		System.out.println("Aplicação finalizada.");
		sc.close();
	}
}
