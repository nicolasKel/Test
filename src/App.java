
public class App {

	public static void main(String[] args) 
	{
		PileEntierPositifOuNul test = new PileEntierPositifOuNul();
		PileEntierPositifOuNul test2 = new PileEntierPositifOuNul(10);
		
		for (int i=0; test.empiler(i) != PileEntierPositifOuNul.ERREUR_PILE_PLEINE; i++)
		{
			test.empiler(i);
		}
			
		//System.out.println(test.empiler(5));
		//System.out.println(test.empiler(4));
		//System.out.println(test2.empiler(8));
		
		System.out.println(test.obternirSommetPile());
		System.out.println(test2.obternirSommetPile());
		
		//System.out.println(test2.depiler());
		//System.out.println(test2.depiler());
		//System.out.println(test.empiler(3));
		//test.empiler(2);
		//test.empiler(1);
		//System.out.println(test.empiler(0));
		//System.out.println(test2.empiler(-9));
		
		//System.out.println(test.obternirSommetPile());
		//System.out.println(test2.obternirSommetPile());
	}

}
