/*
Heath Jinkins
11/6/2016
Object-Oriented Design
Eddy Borera
*/

public class MetaPaint{
	protected String painting;
	protected String artist;
	protected String value;

	public MetaPaint()
	{
		this.painting = "";
		this.artist = "";
		this.value = "";
	}

	public MetaPaint(String t, String n)
	{
		this.painting = t;
		this.artist = n;
		this.value = "400";
	}

	public void display()
	{
		System.out.println("Name of Painting: " + painting);
		System.out.println("Name of Artist: " + artist);
		System.out.println("Value: $" + value);
	}

	
}