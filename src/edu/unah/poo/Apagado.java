package edu.unah.poo;

public class Apagado implements Estado {

	@Override
	public void encerder(Auto auto) {
		System.out.println("Encendido");
		this.encerder(auto);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar(Auto auto) {
		System.out.println("Apagandome,por fin descansare");
		
	}

	@Override
	public void acelerar(Auto auto) {
		System.out.println("No puedo acelerar mas");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar(Auto auto) {
		System.out.println("Frenando,pero el motor sigue caliente");
		// TODO Auto-generated method stub
		
	}
	

}
