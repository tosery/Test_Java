
public class Customer 
{
	int custid;
	String custname;
	String address;
	String phone;

	public Customer() { }
	
	public Customer(int custid, String custname, 
					String address, String phone) {
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.phone = phone;
	}
	
	
	
	public void printcustomer1() {
		System.out.print(custid +"\t");
		System.out.print(custname +" ");
		System.out.print(address + " ");
		System.out.println(phone);
		
	}

	public void setcustid(int custid) {
		this.custid = custid;
	}
	public void setcustname(String custname) {
		this.custname = custname;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public int getcustid() {
		return custid;
	}
	public String getcustname() {
		return custname;
	}
	public String getaddress() {
		return address;
	}
	public String getphone() {
		return phone;
	}
	
	
	
	

}
