package ProjetoG2;

import java.util.Scanner;

public class KalorTrack {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		cadastro cad = new cadastro(null, null, 0, 0, 0, 0, 0, 0);

		int ligado = 1;

		do {
			System.out.println("||||||BEM VINDE AO KALORTRACK||||||");
			System.out.println("|||||||||||||||||||||||||||||||||||");
			cad.inicioCadastro();

			cad.appSelect();

		} while (ligado == 1);
	}
}