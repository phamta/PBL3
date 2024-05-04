package VIEW;

public class Item {
	public String Name;
	public String Image;
	public String Price;

	public Item(String name, String image, String price) {
		super();
		Name = name;
		Image = image;
		Price = price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public Item() {
		super();
	}

}
