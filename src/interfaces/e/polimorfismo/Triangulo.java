package interfaces.e.polimorfismo;

public class Triangulo extends Figura2D implements DimensaoSuperficial {
	private int base;
	private int altura;
	private int area;
	
	
	

	public int getBase() {
		return base;
	}




	public void setBase(int base) {
		this.base = base;
	}




	public int getAltura() {
		return altura;
	}




	public void setAltura(int altura) {
		this.altura = altura;
	}




	public int getArea() {
		return area;
	}




	public void setArea(int area) {
		this.area = area;
	}




	public Triangulo(String nome, String cor, int base, int altura, int area) {
		super(nome, cor);
		this.base = base;
		this.altura = altura;
		this.area = area;
	}




	@Override
	public void calcularArea() {
		area = (base * altura)/2;
		System.out.println(area);
	}

}
