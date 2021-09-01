package interfaces.e.polimorfismo;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	private int circunferencia;
	private int raio;

	public int getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(int circunferencia) {
		this.circunferencia = circunferencia;
	}

	public int getRaio() {
		return raio;
	}






	public void setRaio(int raio) {
		this.raio = raio;
	}



	public Circulo(String nome, String cor, int raio, int cincurferencia) {
		super(nome, cor);
		this.raio = raio;
		this.circunferencia = circunferencia;
	}

	@Override
	public void calcularArea() {
		int area = raio*2;
		System.out.println(area);
		
	}

}
