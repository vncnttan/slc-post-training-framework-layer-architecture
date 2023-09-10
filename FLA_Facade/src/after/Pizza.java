package after;

public class Pizza {
	
	private String type;
	private String size;
	private String topping;
	
	public Pizza(String type, String size, String topping) {
		super();
		this.type = type;
		this.size = size;
		this.topping = topping;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	

}
