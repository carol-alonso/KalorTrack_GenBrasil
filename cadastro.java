package ProjetoG2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner; //

public class cadastro {

	Scanner leia = new Scanner(System.in);

	Consumo consumo = new Consumo();

	Gasto gasto = new Gasto();

	private String nome, sexo;
	private int  idade, op = 0, altura;
	private double peso, imc = 0, tmb = 0;
	private List<Double> historicoCons = new ArrayList<Double>();
	private List<Double> historicoGast = new ArrayList<Double>();


	public cadastro(String nome, String sexo, int idade, int op, int altura, double peso, double imc, double tmb) {

		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.op = op;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
		this.tmb = tmb;
	}

	boolean continueLoop = true;

	public String getNome() {
		return nome;
	}

	public List<Double> getHistoricoCons() {
		return historicoCons;
	}

	public void setHistoricoCons(List<Double> historicoCons) {
		this.historicoCons = historicoCons;
	}

	public List<Double> getHistoricoGast() {
		return historicoGast;
	}

	public void setHistoricoGast(List<Double> historicoGast) {
		this.historicoGast = historicoGast;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double getTmb() {
		return tmb;
	}

	public void setTmb(double tmb) {
		this.tmb = tmb;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

	public void inicioCadastro() {

		int opLiga = 0;
		do {

			do {
				continueLoop = true;
				try {

					System.out.println("\tSELECIONE UMA OPÇÃO\n");
					System.out.println("1 - Inserir novos dados");
					System.out.println("2 - Já tenho cadastro");
					System.out.print("=>:");
					opLiga = leia.nextInt();
					System.out.println();
					continueLoop = false;

				} catch (InputMismatchException ex) {
					System.err.println("Opção inválida, entre com um valor válido");
					leia.nextLine();
				}
			} while (continueLoop);

			switch (opLiga) {

			case 1: // CADASTRO/NOVOS DADOS

				System.out.println("\n\tOlá! Insira seus dados abaixo.");
				System.out.print("\nNome:");
				nome = leia.next();
				do {
					continueLoop = true;
					try {

						System.out.print("\nIdade:");
						idade = leia.nextInt();
						continueLoop = false;

					} catch (InputMismatchException ex) {
						System.err.println("Opção inválida, entre com um valor válido");
						leia.nextLine();
					}
				} while (continueLoop);

				do {
					continueLoop = true;
					try {
						System.out.print("\nSexo (F ou M):");
						sexo = leia.next();
						sexo = sexo.toUpperCase();
						if (sexo.equals("M") || sexo.equals("F")) {
							continueLoop = false;
						} else {
							System.err.println("Opção inválida, entre com um valor válido");
						}

					} catch (InputMismatchException ex) {
						System.err.println("Opção inválida, entre com um valor válido");
						leia.nextLine();
					}
				} while (continueLoop);

				do {
					continueLoop = true;
					try {

						System.out.print("\nAltura em cm:");
						altura = leia.nextInt();
						if (altura > 0) {
							continueLoop = false;
						} else {
							System.err.println("Opção inválida, entre com um valor válido");
						}

					} catch (InputMismatchException ex) {
						System.err.println("Opção inválida, entre com um valor válido");
						leia.nextLine();
					}
				} while (continueLoop);

				do {
					continueLoop = true;
					try {

						System.out.print("\nPeso:");
						peso = leia.nextDouble();
						if (peso > 0) {
							continueLoop = false;
						} else {
							System.err.println("Opção inválida, entre com um valor válido");
						}

					} catch (InputMismatchException ex) {
						System.err.println("Opção inválida, entre com um valor válido");
						leia.nextLine();
					}
				} while (continueLoop);

				imc = peso / (altura * altura) * 10000;

				if (sexo.equals("M")) {
					tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
					tmb *= 1.25;
				} else if (sexo.equals("F")) {
					tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
					tmb *= 1.20;
				}
				historicoCons.clear();
				historicoGast.clear();
				consumo.setKcalConsumoDia(0.0);
				gasto.setKcalGastoDia(0.0);
				
				break;

			case 2:

				if (peso < 1 || altura < 1 || (!sexo.equals("M") && !sexo.equals("F"))) {
					System.err.println("Cadastro não contém as informações necessárias, favor refazê-lo!");
					opLiga = 3;
				}
				break;
			default:
				System.err.println("Opção inválida, entre com um valor válido");
				break;
			}
		} while (opLiga > 2 || opLiga < 0);

	}

	public void appSelect() {

		Scanner leia = new Scanner(System.in);

		do {
			int opApp = 0;
			do {
				continueLoop = true;
				try {

					System.out.println("\n\tSELECIONE UMA OPÇÃO\n");
					System.out.println("1 - Iniciar um novo dia");
					System.out.println("2 - Adicionar consumo");
					System.out.println("3 - Adicionar gastos");
					System.out.println("4 - Resumo diário");
					System.out.println("5 - Histórico");
					System.out.println("6 - Opções");
					System.out.print("=>:");
					
					opApp = leia.nextInt();
					continueLoop = false;

				} catch (InputMismatchException ex) {
					System.err.println("Opção inválida, entre com um valor válido");
					leia.nextLine();
				}
			} while (continueLoop);

			switch (opApp) {

			case 1: // MÉTODO NOVO DIA
				if (consumo.getKcalConsumoDia() != 0 || gasto.getKcalGastoDia() != 0) { // Salva só se for != 0

					if (historicoCons.size() == 7 || historicoGast.size() == 7) { // Desloca Lista pra liberar ultimo
																					// espaço
						historicoCons.remove(0);
						historicoGast.remove(0);
					}

					historicoCons.add(consumo.getKcalConsumoDia());
					historicoGast.add(gasto.getKcalGastoDia() + tmb);

					consumo.setKcalConsumoDia(0);
					gasto.setKcalGastoDia(0);
					System.out
							.println("Você iniciou um novo dia! Os dados de ontem " + "foram salvos no seu histórico!");

				} else {
					System.err.println("\t\tAinda não foram inseridos dados no dia de hoje!");
				}
				break;

			case 2:

				consumo.listaAlimentos();

				break;

			case 3:

				gasto.listaExercícios(peso);

				break;

			case 4: // MÉTODO DIÁRIO

				System.out.printf("Até o momento você já consumiu: %.2f Kcal!%n", consumo.getKcalConsumoDia());
				System.out.printf("Até o momento você já gastou: %.2f Kcal!%n", (gasto.getKcalGastoDia() + tmb));// Atvd
																													// vida
																													// diaria

				if (consumo.getKcalConsumoDia() + 75 > gasto.getKcalGastoDia() + tmb) {
					System.out.println("Você consumiu mais calorias do que gastou, está seguindo para um"
							+ " caminho de ganho de peso!");
				} else if (gasto.getKcalGastoDia() + tmb + 75 > consumo.getKcalConsumoDia()) {
					System.out.println("Você gastou mais calorias do que consumiu, está seguindo para um"
							+ " caminho de perda de peso!");
				} else {
					System.out.println("Você consumiu e gastou de maneira semelhante, está seguindo para um"
							+ "caminho de manutenção de peso!");
				}
				break;

			case 5: // MÉTODO HISTÓRICO
				int op5 = 0;
				if (historicoCons.size() >= 1) {
					do {
						do {
							continueLoop = true;
							try {

								System.out.println("\n\n\tSELECIONE UMA OPÇÃO\n");
								System.out.println("1 - Média dos seus resumos");
								System.out.println("2 - Média dos seus consumos");
								System.out.println("3 - Média dos seus gastos");
								System.out.println("4 - Voltar");
								System.out.print("=>:");
								op5 = leia.nextInt();
								continueLoop = false;

							} catch (InputMismatchException ex) {
								System.err.println("Opção inválida, entre com um valor válido");
								leia.nextLine();
							}
						} while (continueLoop);

						switch (op5) {
						case 1:

							double somaHisCons = 0;
							double somaHisGast = 0;

							for (int i = 0; i < historicoCons.size(); i++) {

								somaHisCons += historicoCons.get(i);
							}

							for (int i = 0; i < historicoGast.size(); i++) {

								somaHisGast += historicoGast.get(i);
							}

							double mediaHis = (somaHisCons - somaHisGast) / historicoCons.size();

							System.out.print("Nos últimos " + historicoCons.size() + " dias você ficou em ");

							if (mediaHis > 75) {
								System.out.printf("um superávit em média de %.2f Kcal por dia!"
										, mediaHis, "%nIsso indica um ganho de peso!%n");
							} else if (mediaHis < 75) {
								System.out.printf("um déficit em média de %.2f Kcal por dia!"
										, (mediaHis * -1), "%nIsso indica uma perda de peso!%n");
							} else {

								if (mediaHis < 0) {
									mediaHis = mediaHis * -1;
								}
								System.out.printf("uma média de %.2f Kcals por dia!"
										, mediaHis, "%nEsse baixo valor indica manutenção de peso!%n");
							}

							break;
						case 2:
							double somaConsumo = 0;

							for (int i = 0; i < historicoCons.size(); i++) {

								somaConsumo += historicoCons.get(i);
							}

							System.out.println("Nos últimos " + historicoCons.size() + " dias, você consumiu em média "
									+ (somaConsumo / historicoCons.size()) + "Kcals!");

							break;
						case 3:

							double somaGasto = 0;

							for (int i = 0; i < historicoGast.size(); i++) {

								somaGasto += historicoGast.get(i);
							}

							System.out.println("Nos últimos " + historicoGast.size() + " dias, você gastou em média "
									+ (somaGasto / historicoGast.size()) + "Kcals!");
							break;

						case 4:
							break;
						default:
							System.err.println("Opção inválida, entre com um valor válido");
							break;
						}

					} while (op5 > 4 || op5 < 1);

				} else {
					System.err.println("Você ainda não possui nenhum dado armazenado em seu histórico!"
							+ "\nInicie seu segundo dia para poder acionar essa opção!");
				}
				break;

			case 6: // MÉTODO OPÇÕES
				int op6 = 0;
				do {
					do {
						continueLoop = true;
						try {

							System.out.println("\n\n\t\tSelecione uma opção");
							System.out.println("1 - Iniciar um novo cadastro");
							System.out.println("2 - Alterar meu peso");
							System.out.println("3 - Alterar minha idade");
							System.out.println("4 - Voltar");
							System.out.print("=>:");
							op6 = leia.nextInt();
							continueLoop = false;

						} catch (InputMismatchException ex) {
							System.err.println("Opção inválida, entre com um valor válido");
							leia.nextLine();
						}
					} while (continueLoop);

					switch (op6) {
					case 1:
						inicioCadastro();
						break;
					case 2:
						System.out.println("Insira o novo peso:");
						peso = leia.nextDouble();
						imc = peso / (altura * altura) * 10000;

						if (sexo.equals("M")) {
							tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
						} else if (sexo.equals("F")) {
							tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
						}
						break;
					case 3:
						System.out.println("Insira a nova idade:");
						idade = leia.nextInt();
						imc = peso / (altura * altura) * 10000;

						if (sexo.equals("M")) {
							tmb = 66.5 + (13.75 * peso) + (5.003 * altura) - (6.755 * idade);
						} else if (sexo.equals("F")) {
							tmb = 655.1 + (9.563 * peso) + (1.850 * altura) - (4.676 * idade);
						}
						break;
					case 4:
						break;
					default:
						System.err.println("Opção inválida, entre com um valor válido");
					}
				} while (op6 > 4 || op6 < 1);

				break;

			default:
				System.err.println("Opção inválida, entre com um valor válido");
			}

		} while (true);

	}
}
