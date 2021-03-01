public class Test
{
	public static void main(String[] args)
	{
		Lion myLion = new Lion();
		System.out.println("Lion speaks: ");
		myLion.speak();
		
		Bear myBear = new Bear();
		System.out.print("Bear speaks: ");
		myBear.speak();
		
		Dog myDog = new Dog();
		System.out.println("Dog speak: ");
		myDog.speak();
	}
}