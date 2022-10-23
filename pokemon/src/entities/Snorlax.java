package entities;

public class Snorlax extends Pokemon{

	public Snorlax() {
		nome = "Snorlax";
		vida = 842;
		forcaAtaque = 61;
		danoCritico = 10;
	}
		
	@Override
	public int apanhar(int ataqueSofrido) {
		return vida -= ataqueSofrido;
	}


	@Override
	public void status(int danoSofrido) {
		if (vida > 0) {
		System.out.println(nome + "\nVida: " + vida);
		System.out.println();
		} else {
			System.out.println("Seu pokemon derroutou o " + nome + "!\nParabéns, pegue sua insígnia!\n");
		}
	}

	@Override
	public String toString() {
		return nome + "\nVida = " + vida + "\nForça = " + forcaAtaque + "\nDano Crítico = " + danoCritico + "%";
	}

	@Override
	public int resetVida() {
		return this.vida = 842;
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
		return forcaAtaque = 61;
	}

	@Override
	public void cura() {
	}

}
