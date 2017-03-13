package items;

public class LenthSize {

	float width;
	float length;
	float height;
	
	
	public LenthSize(float width, float length, float height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}


	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "LenthSize [width=" + width + ", length=" + length + ", height=" + height + ", getWidth()=" + getWidth()
				+ ", getLength()=" + getLength() + ", getHeight()=" + getHeight() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
