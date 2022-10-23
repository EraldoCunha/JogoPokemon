package entities;

import util.Utilitarios;

public class Blastoise extends Pokemon{

	public Blastoise() {
		nome = "Blastoise";
		vida = 493;
		forcaAtaque = 85;
		danoCritico = 14;
	}

	@Override
	public int apanhar(int ataqueSofrido) {
		return vida -= ataqueSofrido;
	}

	@Override
	public void cura() {
		vida += 145;
		System.out.println("\nSeu " + nome + " curou 145 de sua vida.\n");
		Utilitarios.linhaPontilhada();
	}

	@Override
	public void status(int danoSofrido) {
		if (vida > 0) {
			System.out.println(nome + "\nVida: " + vida);
			System.out.println();
		} else {
			System.out.println("Seu pokemon foi derrotado, treine e volte quando se sentir preparado!\n");
		}
	}

	@Override
	public String toString() {
		return nome + "\nVida = " + vida + "\nForça = " + forcaAtaque + "\nDano Crítico = " + danoCritico + "%";
	}

	@Override
	public int resetVida() {
		return this.vida = 493;
	}

	@Override
	public int dano() {
		int x = (int) (Math.random()*100);
		if (x <= danoCritico) {
			forcaAtaque *= 2;
		}
		return forcaAtaque;
	}

	@Override
	public int resetDano() {
		return forcaAtaque = 85;
	}
}