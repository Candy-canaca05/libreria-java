package edu.unah.poo;

public class SobreCalentado implements Estado {

	@Override
	public void encerder(Auto auto) {
		System.out.println("Estoy encendido, pero el motor debera ser apagado pronto");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar(Auto auto) {
		System.out.println("Apagandome, por fin descansare");
		this.apagar(auto);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar(Auto auto) {
		System.out.println("No puedo acelerar mas");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar(Auto auto) {
		System.out.println("Frenando, pero el motor sigue caliente");
		// TODO Auto-generated method stub
		
	}
	

}
