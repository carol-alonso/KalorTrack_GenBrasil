package ProjetoG2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gasto {

	public Gasto() {
	}

	Scanner leia = new Scanner(System.in);

	// atributo
	private double kcalGastoDia;

	// vari�vel
	int opcExerc, tempo;
	double kcalExerc;
	boolean continueLoop = true;

	// m�todo simples
	public void listaExerc�cios(double peso) {
		do {
			continueLoop = true;
			try {

				System.out.println("\n\tESCOLHA SEU EXERC�CIO");
				System.out.println("\n1-Caminhada");
				System.out.println("2-Corrida");
				System.out.println("3-Bicicleta");
				System.out.println("4-Muscula��o");
				System.out.println("5-Alongamento");
				System.out.println("6-Volta");
				System.out.print("=>:");

				opcExerc = leia.nextInt();
				continueLoop = false;

			} catch (InputMismatchException ex) {
				System.err.println("Op��o inv�lida, entre com um valor v�lido");
				leia.nextLine();
			}
		} while (continueLoop);

		do {
			switch (opcExerc) {
			case 1:
				do {
					continueLoop = true;
					try {

						System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
						tempo = leia.nextInt();
						kcalExerc = (3.3 * peso * tempo) / 60;
						kcalGastoDia += kcalExerc;
						System.out.printf("Voc� gastou %.2f Kcal! Continue assim!%n", kcalExerc);
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				break;

			case 2:
				do {
					continueLoop = true;
					try {

						System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
						tempo = leia.nextInt();
						kcalExerc = (8 * peso * tempo) / 60;
						kcalGastoDia += kcalExerc;
						System.out.printf("Voc� gastou %.2f Kcal! Continue assim!%n", kcalExerc);
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				break;

			case 3:
				do {
					continueLoop = true;
					try {

						System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
						tempo = leia.nextInt();
						kcalExerc = (8 * peso * tempo) / 60;
						kcalGastoDia += kcalExerc;
						System.out.printf("Voc� gastou %.2f Kcal! Continue assim!%n", kcalExerc);
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				break;

			case 4:
				do {
					continueLoop = true;
					try {

						System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
						tempo = leia.nextInt();
						kcalExerc = (5.5 * peso * tempo) / 60;
						kcalGastoDia += kcalExerc;
						System.out.printf("Voc� gastou %.2f Kcal! Continue assim!%n", kcalExerc);
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				break;

			case 5:
				do {
					continueLoop = true;
					try {

						System.out.println("\nPor quantos minutos voc� praticou esse exerc�cio?");
						tempo = leia.nextInt();
						kcalExerc = (2.5 * peso * tempo) / 60;
						kcalGastoDia += kcalExerc;
						System.out.printf("Voc� gastou %.2f Kcal! Continue assim!%n", kcalExerc);
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Op��o inv�lida, entre com um valor v�lido");
						leia.nextLine();
					}
				} while (continueLoop);

				break;

			case 6:
				break;

			default:
				System.err.println("Op��o inv�lida, entre com um valor v�lido");
				break;
			}
		} while (opcExerc > 6 || opcExerc < 0);
	}

	// Getter & Setter
	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}

	public double getKcalGastoDia() {
		return kcalGastoDia;
	}

	public void setKcalGastoDia(double kcalGastoDia) {
		this.kcalGastoDia = kcalGastoDia;
	}

	public int getOpcExerc() {
		return opcExerc;
	}

	public void setOpcExerc(int opcExerc) {
		this.opcExerc = opcExerc;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public double getKcalExerc() {
		return kcalExerc;
	}

	public void setKcalExerc(double kcalExerc) {
		this.kcalExerc = kcalExerc;
	}

}