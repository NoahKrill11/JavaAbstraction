abstract class species
{
	public abstract void dog();
	public abstract void cat();
}
public class animals extends species
{
	public void dog()
	{
		System.out.println("hello i am a dog");
	}
	public void cat()
	{
		System.out.println("hello i am a cat");
	}
}