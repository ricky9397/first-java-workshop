package ws1.java2.entity;

public class Car extends Vehicle{

	private int mileage;
	
	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" ��տ��� : " + mileage + "km/l");
	}
}
