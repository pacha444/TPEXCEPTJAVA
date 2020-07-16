package exec;

import com.compte.Compte;
import com.compte.cpteepargneprev;
import com.membre.Groupement;

import mesexceptions.numcompteexception;

public class testapp {

	public static void main(String[] args) throws numcompteexception {
		// TODO Auto-generated method stub
		
		
		
    Groupement cli = null ;
    Compte cpte=null;
    String cinmandataire="1870198702386";
    int fraisouve=4000;
    
    if(cinmandataire.length()<=11)
    {
    	throw new numcompteexception("La longueur doit etre egale à 12");
    }
    else
    {
    	cli= new Groupement(1,"+221781277881", "pamoussacisse@gmail.com", "Kundal Group", "238761", "12JZER", "papa moussa cisse", "1870198702386") ;
    	    if (fraisouve<5000)
    	    {

    	    	throw new numcompteexception("Les frais d'ouverture doivent etre égals à 5000");
    	    }
    	    else
    	    {
    	    	cpte=new cpteepargneprev("123", "AGENCE A", 12000, cli, 5000);
    	    }
    	
    }
   
   System.out.println("afficher: "+cli.getIdclient()+" "+"compte="+cpte.getIdcompte());
	}

}
