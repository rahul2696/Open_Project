import java.util.Scanner;

public class CDACCenter {

	private int id;
	private String name;
	private String location;
	private String address;
	private String coordinator;
	public CDACCenter(int id, String name, String location, String address, String coordinator) {
	//	super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.address = address;
		this.coordinator = coordinator;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCoordinator() {
		return coordinator;
	}
	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}
	@Override
	public String toString() {
		return "CDACCenter [id=" + id + ", name=" + name + ", location=" + location + ", address=" + address
				+ ", coordinator=" + coordinator + "]";
	}

	
	public static void main(String[] args) {
		
		CDACCenter []center=new CDACCenter[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<center.length;i++)
		{
		//	sc.nextLine();
			center[i]=new CDACCenter(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next());
		//	center[i].toString();
System.out.println(center[i]);
		}
		
	
	}}