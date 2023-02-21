package Strategy;

public class TesteRobo {
	
	public static void main(String[] args) {
		
		ComportamentosRobo andar = new ComportamentoAndar();
		ComportamentosRobo pegar = new ComportamentoPegar();
		ComportamentosRobo pular = new ComportamentoPular();
		ComportamentosRobo dancar = new CompotamentoDancar();
		ComportamentosRobo levantarB = new ComportamentoLevantar();
		
		Robo robo = new Robo();
		
		robo.setStrategy(andar);
		robo.mover();
		robo.mover();
		
		robo.setStrategy(pegar);
		System.out.println("");
		robo.mover();
		
		robo.setStrategy(pular);
		System.out.println("");
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
		
		robo.setStrategy(dancar);
		System.out.println("");
		robo.mover();
		robo.mover();
		
		robo.setStrategy(levantarB);
		System.out.println("");
		robo.mover();
		
		
	
 }

}
