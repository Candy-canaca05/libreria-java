package edu.unah.poo;

public class Encendido implements Estado {

	@Override
	public void encerder(Auto auto) {
		System.out.println("ya estoy encendido");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar(Auto auto) {
		System.out.println("apagandome");
		this.apagar(auto);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar(Auto auto) {
		System.out.println("acelerando");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar(Auto auto) {
		System.out.println("frenando");
		// TODO Auto-generated method stub
		
	}
	

}
