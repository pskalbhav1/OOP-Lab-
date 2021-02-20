interface Details {
	public void typeOrCategory();
	public void manufacturerOrTypeofos();
}

//Class Hardware
class Hardware implements Details {
	String category,manufacturer;
	
	public Hardware(String s1,String s2) {
		this.category = s1;
		this.manufacturer = s2;
	}
	
	@Override
	public void typeOrCategory() {
		System.out.println("Category:"+this.category);
	}

	@Override
	public void manufacturerOrTypeofos() {
		System.out.println("Manufacturer:"+this.manufacturer);
	}

	public void display() {
		this.typeOrCategory();
		this.manufacturerOrTypeofos();
	}
	
}

//Class Software
class Software implements Details {
	String type,os;
	
	public Software(String t,String o) {
		this.type = t;
		this.os = o;
	}
	
	@Override
	public void typeOrCategory() {
		System.out.println("Type:"+this.type);
	}

	@Override
	public void manufacturerOrTypeofos() {
		System.out.println("OS:"+this.os);
	}

	public void display() {
		this.typeOrCategory();
		this.manufacturerOrTypeofos();
	}
	
}

public class L8R1 {

	public static void main(String[] args) {
		Hardware ob = new Hardware("Keyboard","Tata");
		Software sb = new Software("Android","Linux");
		
		ob.display();
		sb.display();
	}

}
