abstract class species
{
	public abstract void dog();
	public abstract void cat();
	//public abstract void area();
}

public class animals extends species implements location
{
	public void dog()
	{
		System.out.println("hello i am a dog");
	}
	public void cat()
	{
		System.out.println("hello i am a cat");
	}
	public void area()
	{
		System.out.println("Columbus");
	}
}