package HomeworkCurs11;
/*
 * 
 * Clasa Customer care contine trei variabile private ”name”, ‘address’,
“email”
2. Valoarea variabilelor se va seta la chemarea constructorului in clasa de
executie( customer = new Customer (“ion”, ”adresa”, etc))
 * 
 */
public class Customer {
	
	private String name, address, email;
	public Customer(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	

}
