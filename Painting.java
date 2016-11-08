/*
Heath Jinkins
11/6/2016
Object-Oriented Design
Eddy Borera
*/

import java.util.Scanner;

public class Painting extends MetaPaint{

	public Painting()
	{
		super();
	}

	public Painting(String t, String n)
	{
		super.painting = t;
		super.artist = n;
		value = "25,000";
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MetaPaint[] list = new MetaPaint[10];

		for(int i = 0; i < 10; i++)

		{
			System.out.println("");
			
			System.out.print("Enter Painting Title: ");
			String painting = sc.nextLine();

			System.out.print("Enter Artist's Name: ");
			String artist = sc.nextLine();

			if(artist.equalsIgnoreCase("Degas") || artist.equalsIgnoreCase("Monet") || artist.equalsIgnoreCase("Picasso") || artist.equalsIgnoreCase("Rembrandt"))

			{
				list[i] = new Painting(painting,artist);
			}

			else{
				list[i] = new MetaPaint(painting,artist);
			}
		}

		for(int i = 0; i < 10; i++)

		{
			System.out.println("");
			list[i].display();
		}
	}
}