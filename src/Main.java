import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
	
		String produit = new String();
		String entree;
		int prixTotal = 0 ;
		Scanner sc = new Scanner(System.in);
		int compteurCerise = 0 ;
		int compteurApple = 0 ;
		int compteurMele = 0 ;
		int compteurPommes = 0 ;
		int compteurBanane = 0 ;
		int compteurFruit = 0 ;
		int i = 0;
		while ( true ){	
			
			entree = sc.nextLine(); 
			
			String[] myTab = entree.split(",");
			for ( i= 0 ; i<  myTab.length ; i++ )
			{
				
				compteurFruit ++ ;
				if ( compteurFruit == 5)
				{
					prixTotal -= 200;
					compteurFruit = 0 ;
				}
				produit = myTab[i];
				
				if ( produit.equals("Pommes"))
				{
					 compteurPommes++;
					 prixTotal += 100;
					 if ( compteurPommes == 4)
					 {
						 prixTotal -= 100;							
					 }
					
				}
				if ( produit.equals("Apples"))
				{
					 compteurApple++;
					prixTotal += 100;
					
					if ( compteurApple == 3  )
					{
					compteurApple = 0;
					prixTotal -= 100;
					}
					
				
				}
				if ( produit.equals("Mele"))
				{
					compteurMele++;
					if ( compteurMele == 2  )
					{
					compteurMele = 0;
					prixTotal -= 50;
					}
					else
					prixTotal += 100;
					
				}
				
				else if (produit.equals("Cerises")){
					
					compteurCerise++;
					prixTotal += 75;
					if ( compteurCerise == 2  )
						{
						compteurCerise = 0;
						prixTotal -= 20;
						}
							
				}
				else if(produit.equals("Bananes")){
					
					compteurBanane++;
					if ( compteurBanane == 2 )
					{
						compteurBanane = 0;
					}
					else
					prixTotal += 150; 
									
				}
				
				
			}
			System.out.println(prixTotal);
		}		
	}
}
