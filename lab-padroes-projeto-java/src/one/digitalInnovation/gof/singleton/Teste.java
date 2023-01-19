package one.digitalInnovation.gof.singleton;

import one.digitalInnovation.gof.facade.Facade;
import one.digitalInnovation.gof.strategy.Comportamento;
import one.digitalInnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalInnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalInnovation.gof.strategy.ComportamentoFurtivo;
import one.digitalInnovation.gof.strategy.ComportamentoNormal;
import one.digitalInnovation.gof.strategy.ComportamentoPulo;
import one.digitalInnovation.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		//System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		//System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		//System.out.println(eager);
		eager = SingletonEager.getInstancia();
		//System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		//System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		//System.out.println(lazyHolder);
		
		/*
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento pulo = new ComportamentoPulo();
		Comportamento furtivo = new ComportamentoFurtivo();
		
		
		Robo robo = new Robo();
		System.out.println("Novo jogo sendo inciciado..");
		System.out.println("*************************************");
		System.out.println("Jogo iniciado!");
		System.out.println("Peronagem pronto para a a��o!");
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		System.out.println("O personagem est� em perigo! Aten��o!!");
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);
		System.out.println("O personagem precisa fugir imediatamente!");
		robo.mover();
		robo.mover();
		robo.mover();
		
		robo.setComportamento(pulo);
		System.out.println("H� um obst�culo a frente!");
		robo.mover();
		
		robo.setComportamento(furtivo);
		System.out.println("O personagem conseguiu fugir, mas ainda h� perigo na regi�o!");
		robo.mover();
		
		System.out.println("O personagem conseguiu despistar o inimigo!");
		*/
		
		
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Fabricio", "41.456-349");
		System.out.println("*************************************");
		facade.consultaCliente("", "");
		
	}

}
