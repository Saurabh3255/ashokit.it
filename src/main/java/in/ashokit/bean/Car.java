package in.ashokit.bean;

public class Car {
	
	private IEngine eng;
	
	public Car()
	{
		System.out.println("Car constortor");
	}
	
	
	public void setEng(IEngine eng)
	{
		System.out.println("Setter() of Car class is called");
		this.eng=eng; 
	}
	
	public void drive()
	{
		int status=eng.start();
		if(status>=1)
		{
			System.out.println("Petrol engine started");
		}
		else
		{
			System.out.println("Diesal Engine started");
		}
	}
}
