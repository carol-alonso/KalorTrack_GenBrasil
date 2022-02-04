package ProjetoG2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consumo {

	Scanner leia = new Scanner(System.in);

	// atributo
	private double kcalConsumoDia;

	// metodo construtor
	public Consumo() {

	}

	// vari�vel
	int opcAli, unidade;
	double kcalAli;
	boolean continueLoop = true;

	// m�todo simples
	public void listaAlimentos() {

		do {
			do {
				continueLoop = true;
				try {

					System.out.println("\n\tESCOLHA SEU ALIMENTO");
					System.out.println("\n1-Arroz");
					System.out.println("2-Feij�o");
					System.out.println("3-Frango");
					System.out.println("4-Macarronada");
					System.out.println("5-P�o");
					System.out.println("6-Volta");
					System.out.print("=>:");

					opcAli = leia.nextInt();
					continueLoop = false;

				} catch (InputMismatchException ex) {
					System.err.println("Op��o inv�lida, entre com um valor v�lido");
					leia.nextLine();
				}
			} while (continueLoop);

			switch (opcAli) {
			case 1:
				do {
					continueLoop = true;
					try {

						kcalAli = 111;
						System.out.println("\nQuantas escumadeiras de arroz voc� comeu?");
						unidade = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);
				kcalConsumoDia += kcalAli * unidade;
				break;

			case 2:
				do {
					continueLoop = true;
					try {

						kcalAli = 99;
						System.out.println("\nQuantas conchas de feij�o voc� comeu?");
						unidade = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);
				kcalConsumoDia += kcalAli * unidade;
				break;

			case 3:
				do {
					continueLoop = true;
					try {

						kcalAli = 165;
						System.out.println("\nQuantos fil�s de frango voc� comeu?");
						unidade = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);
				kcalConsumoDia += kcalAli * unidade;
				break;

			case 4:
				do {
					continueLoop = true;
					try {

						kcalAli = 126;
						System.out.println("\nQuantas escumadeiras de macarronada voc� comeu?");
						unidade = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);
				kcalConsumoDia += kcalAli * unidade;
				break;

			case 5:
				do {
					continueLoop = true;
					try {

						kcalAli = 149;
						System.out.println("\nQuantos p�es voc� comeu?");
						unidade = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);
				kcalConsumoDia += kcalAli * unidade;
				break;

			case 6:
				break;

			default:
				System.err.println("Op��o inv�lida, entre com um valor v�lido");
				break;
			}
		} while (opcAli != 6);
	}

	// Getter & Setter
	public double getKcalConsumoDia() {
		return kcalConsumoDia;
	}

	public void setKcalConsumoDia(double kcalConsumoDia) {
		this.kcalConsumoDia = kcalConsumoDia;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public int getOpcAli() {
		return opcAli;
	}

	public void setOpcAli(int opcAli) {
		this.opcAli = opcAli;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public double getKcalAli() {
		return kcalAli;
	}

	public void setKcalAli(double kcalAli) {
		this.kcalAli = kcalAli;
	}
	// teste
}