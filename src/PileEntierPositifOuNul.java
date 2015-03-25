
public class PileEntierPositifOuNul 
{
	public static final int ERREUR_NEGATIF = -1;
	public static final int ERREUR_PILE_PLEINE = -2;
	public static final int ERREUR_PILE_VIDE = -3;
	public static final int SUCCES = -4;	
	
	private final int []pile;
	private final int taillePileMax;
	private int taillePile;

	public PileEntierPositifOuNul() 
	{
		this.taillePileMax = 5;
		this.taillePile = 0;
		this.pile = new int[taillePileMax];
	}
	
	//une édition qui sert à rien ^^
	
	public PileEntierPositifOuNul(int taille) 
	{
		if (taille > 0)
		{
		this.taillePileMax = taille;
		}
		else
		{
			this.taillePileMax = 5;
		}
		this.taillePile = 0;
		this.pile = new int[taillePileMax];
	}
	

	public int getTaillePileMax() 
	{
		return taillePileMax;
	}
	

	public int getTaillePile() 
	{
		return taillePile;
	}
	
	
	public int empiler(int element)
	{
		if (element < 0)
		{
			return ERREUR_NEGATIF;
		}
		
		if (taillePile != taillePileMax-1)
		{
		this.pile[taillePile] = element;
		taillePile++;
		return SUCCES;
		}
		
		else
		{
			return ERREUR_PILE_PLEINE;
		}
	}
	
	
	public int depiler()
	{
		if (taillePile != 0)
		{
			int inter = this.pile[taillePile];
			this.taillePile -= 1;
			return inter;
		}
		
		else
		{
			return ERREUR_PILE_VIDE;
		}
	}
	
	
	public int obternirSommetPile()
	{
		if (taillePile == 0)
		{
			return ERREUR_PILE_VIDE;
		}
		
		else
		{
			return this.pile[taillePile-1];
		}

	}
}
