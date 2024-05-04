package VIEW;

public class itemplus {
	public String Name;
	public String Price;
	public String Quantity;
	public String Total;

	public itemplus(String name, String price, String quantity, String total) {
		super();
		Name = name;
		Price = price;
		Quantity = quantity;
		Total = total;
	}

	public itemplus() {
		super();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getTotal() {
		return Total;
	}

	public void setTotal(String total) {
		Total = total;
	}

}
