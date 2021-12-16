package Poliformismo;

public class Cachorro extends Animal {


	public Cachorro(String nome, Integer idade) {
		super(nome, idade);
	}

	@Override
	public void falar() {
		System.out.println("Latindo cordialmente");
	}

	@Override
	public void mover() {
		System.out.println("Correndo como um cachorro");	
	}
}
