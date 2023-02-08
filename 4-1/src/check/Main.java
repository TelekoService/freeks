package check;

import constants.Constants;

public class Main {

	//課題①
	private String firstName;
	private String lastName;	
	
	Main() {
		this.firstName = "槁本";
		this.lastName = "悠";
	}
	
	//課題②
	private String printName(String firstName, String lastName) {
		return firstName + lastName;		
	}
	
	public static void main(String[] args) { 
		
		//課題③
		Main main = new Main();
		System.out.println("printNameメソッド → " + main.printName(main.firstName, main.lastName));
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
		
	}
}
