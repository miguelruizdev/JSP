package menu;

public class Salir extends MenuItem {

	public Salir ()
	{
		super ("Salir",0,()->{ System.out.println("Bye");});
	}
	
}
