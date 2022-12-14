package entities;

import util.Utilitarios;

public class Venusaur extends Pokemon{

	public Venusaur() {
		nome = "Venusaur";
		vida = 590;
		forcaAtaque = 71;
		danoCritico = 10;
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
		return nome + "\nVida = " + vida + "\nFor?a = " + forcaAtaque + "\nDano Cr?tico = " + danoCritico + "%";
	}

	@Override
	public int resetVida() {
		return this.vida = 590;
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
		return forcaAtaque = 71;
	}
}