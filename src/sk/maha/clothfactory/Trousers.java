package sk.maha.clothfactory;

public class Trousers implements Clothes {

	private int size;
	private String color;

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
}
