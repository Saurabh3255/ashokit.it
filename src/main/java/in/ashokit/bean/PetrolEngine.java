package in.ashokit.bean;

public class PetrolEngine implements IEngine {
	
	
	public PetrolEngine()
	{
		System.out.println("Petrol Engine Construtor");
	}
 
	public int start()
	{
		System.out.println("Petrol Engine Started");
		return 1;
	}
}
