package lab8_POO;

public class Contexto {

	// 4a estrat�gia via interface
	private Strategy estrategia;

	public void setEstrategia(Strategy estrategia) {
		System.out.println("Setando a estrat�gia: " + estrategia + "\n");

		this.estrategia = estrategia;
	}

	public int executar(int a, int b) {
		if (estrategia == null) {
			System.out.println("ERRO: estrat�gia n�o definida.");

			return 0;
		}
		return estrategia.execute(a, b);
	}

}