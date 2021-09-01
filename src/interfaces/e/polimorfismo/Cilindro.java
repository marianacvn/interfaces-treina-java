package interfaces.e.polimorfismo;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
	private int area;
	private int areaLateral;
	private int areaBase;
	private int altura;
	private int volume;
	
	

	public Cilindro(String nome, String cor, int area, int areaLateral, int areaBase, int altura, int volume) {
		super(nome, cor);
		this.area = area;
		this.areaLateral = areaLateral;
		this.areaBase = areaBase;
		this.altura = altura;
		this.volume = volume;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getAreaLateral() {
		return areaLateral;
	}

	public void setAreaLateral(int areaLateral) {
		this.areaLateral = areaLateral;
	}

	public int getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(int areaBase) {
		this.areaBase = areaBase;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void calcularVolume() {
		volume = areaBase * altura;
		System.out.println(volume);
	}

	@Override
	public void calcularArea() {
		area = (areaBase*2)+areaLateral;
		System.out.println(area);
		
	}

}
