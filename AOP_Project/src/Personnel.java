
public class Personnel {
	
	public String name;
	protected OnBoardComputer system;
	
	Personnel (String name, OnBoardComputer system) {
		this.name = name;
		this.system = system;
	}
	
	public String toString() {
		return name;
	}
	

}
