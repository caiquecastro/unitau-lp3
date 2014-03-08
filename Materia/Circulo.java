public class Circulo {
	private int x, y, r;
	public Circulo() {
		super(); //invoca o construtor da classe pai
		x = y = r = 0;
	}
	public Circulo(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getR() {
		return this.r;
	}
	public void mover(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	public void mudarTamanho(int dr) {
		this.r += dr;
	}
	public String toString() {
		return "Circulo (R: " + this.r + " X: " + this.x + " Y: " + this.y + ")";
	}
}