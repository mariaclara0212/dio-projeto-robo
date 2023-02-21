package Strategy;

public class Robo {

	//ESTRATÉGIA DE COMPORTAMENTO PARA O ROBÔ
	private ComportamentosRobo strategy;

	public void setStrategy(ComportamentosRobo strategy) {
		this.strategy = strategy;
	}
	
	public void mover() {
		strategy.mover();
	}
	

}
