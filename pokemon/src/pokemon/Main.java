package pokemon;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import util.Utilitarios;

import entities.Blastoise;
import entities.Charizard;
import entities.Pokemon;
import entities.Snorlax;
import entities.Venusaur;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Seja muito bem vindo(a) ao meu ginásio pokemon!");
		TimeUnit.SECONDS.sleep(3);
		System.out.print("Qual é o seu nome? ");
		String nomeJogador = sc.nextLine();

		Pokemon charizard = new Charizard();
		Pokemon snorlax = new Snorlax();
		Pokemon blastoise = new Blastoise();
		Pokemon venusaur = new Venusaur();

		char restart;
		do {
			charizard.resetVida();
			blastoise.resetVida();
			venusaur.resetVida();
			snorlax.resetVida();
			Utilitarios.linhaPontilhada();
			System.out.println(nomeJogador + ", seu adversário será: \n\nNome = " + snorlax.toString());
			TimeUnit.SECONDS.sleep(3);
			System.out.println("\nEscolha o seu Pokemon para a batalha: \n");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("1 = " + charizard.toString());
			Utilitarios.linhaPontilhada();
			System.out.println("2 = " + blastoise.toString());
			Utilitarios.linhaPontilhada();
			System.out.println("3 = " + venusaur.toString());
			Utilitarios.linhaPontilhada();
			int escolhaPokemon = sc.nextInt();

			snorlax.setVida(842);
			
			switch (escolhaPokemon) {

			case 1:
				while (charizard.getVida() > 0 && snorlax.getVida() > 0) {

					System.out.println("\nEscolha uma das opções: ");
					System.out.println("1 = Atacar!\n" + "2 = Curar!");
					int opcaoBatalha = sc.nextInt();
					Utilitarios.linhaPontilhada();

					if (opcaoBatalha == 1) {
						TimeUnit.SECONDS.sleep(1);
						snorlax.apanhar(charizard.dano());
						System.out.println("\nSeu pokemon atacou o " + snorlax.getNome() + " e causou "
								+ charizard.getForcaAtaque() + " de dano.");
						snorlax.status(charizard.getForcaAtaque());
						charizard.resetDano();
						Utilitarios.linhaPontilhada();

					} else if (opcaoBatalha == 2) {
						charizard.cura();
					} else {
						System.out.println("Opção inválida, você perdeu o seu turno!");
					}

					if (snorlax.getVida() > 0) {
						 TimeUnit.SECONDS.sleep(3);
						charizard.apanhar(snorlax.dano());
						System.out.println("\nO " + snorlax.getNome() + " causou " + snorlax.getForcaAtaque()
								+ " de dano em seu pokemon.");
						 TimeUnit.SECONDS.sleep(1);
						charizard.status(snorlax.getForcaAtaque());
						snorlax.resetDano();
						 TimeUnit.SECONDS.sleep(2);
						Utilitarios.linhaPontilhada();
					}
				}

				break;
			case 2:
				while (blastoise.getVida() > 0 && snorlax.getVida() > 0) {

					System.out.println("\nEscolha uma das opções: ");
					System.out.println("1 = Atacar!\n" + "2 = Curar!");
					int opcaoBatalha = sc.nextInt();
					Utilitarios.linhaPontilhada();

					if (opcaoBatalha == 1) {
						TimeUnit.SECONDS.sleep(1);
						snorlax.apanhar(blastoise.dano());
						System.out.println("\nSeu pokemon atacou o " + snorlax.getNome() + " e causou "
								+ blastoise.getForcaAtaque() + " de dano.");
						snorlax.status(blastoise.getForcaAtaque());
						blastoise.resetDano();
						Utilitarios.linhaPontilhada();

					} else if (opcaoBatalha == 2) {
						blastoise.cura();
					} else {
						System.out.println("Opção inválida, você perdeu o seu turno!");
					}

					if (snorlax.getVida() > 0) {
						 TimeUnit.SECONDS.sleep(3);
						blastoise.apanhar(snorlax.dano());
						System.out.println("\nO " + snorlax.getNome() + " causou " + snorlax.getForcaAtaque()
								+ " de dano em seu pokemon.");
						 TimeUnit.SECONDS.sleep(1);
						blastoise.status(snorlax.getForcaAtaque());
						snorlax.resetDano();
						 TimeUnit.SECONDS.sleep(2);
						Utilitarios.linhaPontilhada();
					}
				}

				break;
			case 3:
				while (venusaur.getVida() > 0 && snorlax.getVida() > 0) {

					System.out.println("\nEscolha uma das opções: ");
					System.out.println("1 = Atacar!\n" + "2 = Curar!");
					int opcaoBatalha = sc.nextInt();
					Utilitarios.linhaPontilhada();

					if (opcaoBatalha == 1) {
						TimeUnit.SECONDS.sleep(1);
						snorlax.apanhar(venusaur.dano());
						System.out.println("\nSeu pokemon atacou o " + snorlax.getNome() + " e causou "
								+ venusaur.getForcaAtaque() + " de dano.");
						snorlax.status(venusaur.getForcaAtaque());
						venusaur.resetDano();
						Utilitarios.linhaPontilhada();

					} else if (opcaoBatalha == 2) {
						venusaur.cura();
					} else {
						System.out.println("Opção inválida, você perdeu o seu turno!");
					}

					if (snorlax.getVida() > 0) {
						 TimeUnit.SECONDS.sleep(3);
						venusaur.apanhar(snorlax.dano());
						System.out.println("\nO " + snorlax.getNome() + " causou " + snorlax.getForcaAtaque()
								+ " de dano em seu pokemon.");
						 TimeUnit.SECONDS.sleep(1);
						venusaur.status(snorlax.getForcaAtaque());
						snorlax.resetDano();
						 TimeUnit.SECONDS.sleep(2);
						Utilitarios.linhaPontilhada();
					}
				}

				break;
			default:
				System.out.println("Opção inválida");
			}

			System.out.println("Gostaria de jogar novamente? (S/N)");
			restart = sc.next().charAt(0);
			if (restart != 's' && restart != 'S' && restart != 'n' && restart != 'N') {
				System.out.println("Resposta inválida, tente novamente.");
				restart = sc.next().charAt(0);
			}

		} while (restart == 's' || restart == 'S');

		Utilitarios.linhaPontilhada();
		System.out.println("\nObrigado por jogar!\n" + "Te vejo na proxima o/");

		sc.close();
	}
}
