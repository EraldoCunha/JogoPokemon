package entities;

public abstract class Pokemon {

	protected String nome;
	protected int vida;
	protected int forcaAtaque;
	protected int danoCritico;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getForcaAtaque() {
		return forcaAtaque;
	}

	public void setForcaAtaque(int forcaAtaque) {
		this.forcaAtaque = forcaAtaque;
	}
	
	public int getDanoCritico() {
		return danoCritico;
	}

	public void setDanoCritico(int danoCritico) {
		this.danoCritico = danoCritico;
	}

	public abstract String toString();
	
	public abstract int apanhar(int ataque);
	
	public abstract void status(int ataque);
	
	public abstract void cura();
	
	public abstract int resetVida();
	
	public abstract int dano();
	
	public abstract int resetDano();

	

	
}
