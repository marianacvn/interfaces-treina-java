package interfaces.e.polimorfismo;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
	private int aresta;
	private int area;
	private int volume;
	
	
	
	
	public Cubo(String nome, String cor, int aresta, int area, int volume) {
		super(nome, cor);
		this.aresta = aresta;
		this.area = area;
		this.volume = volume;
	}

	public int getAresta() {
		return aresta;
	}

	public void setAresta(int aresta) {
		this.aresta = aresta;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void calcularVolume() {
		volume = aresta *3;
		System.out.println(volume);
	}

	@Override
	public void calcularArea() {
		area = aresta * 2;
		System.out.println(area);
	}

}
