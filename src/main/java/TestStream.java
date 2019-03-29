/**
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ajd
 *
 */
public class TestStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// cr�ation d'une liste de 3 personnes 
		List<Personnes> listPersons = Arrays.asList(
				new Personnes(12, "Ali", "Kamal"),
				new Personnes(23, "Brahim", "Omar"),
				new Personnes(34, "Jean", "Reno"),
				new Personnes(7, "Louis", "MArie"),
				new Personnes(7, "Jeanne", "Louise"));
		
		
		//1-ce premier exemple va filtrer avec les personnes qui ont l'age 12
		// et afficher le r�sultat
		
		System.out.println("1******Afficher la liste filtr� par l'age 12 **************");
		Personnes personne1 = listPersons.stream()//convertir liste en Stream
				.filter(x->x.getAge() == 12)     //Filtrer la liste avec les personnes ayant l'age 12
				.findAny()                      //rechercher l'objet
				.orElse(null);                  //s'il n'est pas trouv� retourner null
		
        System.out.println(personne1.getNom()+" "+personne1.getPrenom());//afficher le nom + pr�nom de l'objet trouv�
		
		System.out.println("2******Afficher la liste filtr� par l'age 23 et nom Brahim **************");

        
      //2-ce premier exemple va filtrer avec les personnes qui ont l'age 12
      		// et afficher le r�sultat
      		Personnes personne2 = listPersons.stream()//convertir liste en Stream
      				.filter(x->x.getAge() == 23 && x.getNom().equals("Brahim"))     //Filtrer la liste avec les personnes ayant l'age 12 et le nom BRahim
      				.findAny()                      //rechercher l'objet
      				.orElse(null);                  //s'il n'est pas trouv� retourner null
      		
              System.out.println(personne2.getNom()+" "+personne2.getPrenom());//afficher le nom + pr�nom de l'objet trouv�
      	
              System.out.println("3******Afficher la liste tri� par l'age **************");
            
              //3-Trier la liste avec l'age
              List<Personnes> triListePersonnes = listPersons.stream(). //convertir al liste en stream
            		  sorted(Comparator.comparing(Personnes::getAge))   //trier avec l'age
            		  .collect(Collectors.toList());
              for(Personnes perso : triListePersonnes){
            	    System.out.println(perso.getNom() + " " + perso.getPrenom()+ " " + perso.getAge());
              }

              System.out.println("4******Afficher la liste tri� par l'age invers�**************");

              //4-Trier la liste avec l'age invers�
              List<Personnes> triListePersonnesInv = listPersons.stream(). //convertir la liste en Stream
            		  sorted(Comparator.comparing(Personnes::getAge)       //trier avec l'age invers�
            				  .reversed())            		  
            		  .collect(Collectors.toList());                       //
              for(Personnes perso : triListePersonnesInv){
            	    System.out.println("reversed:"+perso.getNom() + " " + perso.getPrenom()+ " " + perso.getAge());
              }

              //5-Trier la liste avec l'age puis avec le nom en combinaison
              System.out.println("5******Afficher la liste tri� par l'age + le nom **************");

              List<Personnes> triListePersonnesAvecPlusieursCriteres = listPersons.stream(). // convertir la liste en Stream
            		  sorted(Comparator.comparing(Personnes::getAge)                         //Trier avec l'age
            				  .thenComparing(Personnes::getNom))            		         //+ Trier avec le nom
            		  .collect(Collectors.toList());
              for(Personnes perso : triListePersonnesAvecPlusieursCriteres){
            	    System.out.println("reversed:"+perso.getNom() + " " + perso.getPrenom()+ " " + perso.getAge());
              }
            
              System.out.println("6******Afficher la liste Filtr� par l'age 7 et tri� par le nom **************");

            //6-Filter avec l'age + Trier la liste avec le nom  en combinaison

              List<Personnes> filterAndSortListe = listPersons.stream()        // convertir la liste en Stream
            		  .filter(x->x.getAge() == 7)                              //filter avec l'age 7
            		  .sorted(Comparator.comparing(Personnes::getNom))         //trier par nom         				              		  
            		  .collect(Collectors.toList());
              for(Personnes perso : filterAndSortListe){                       //afficher le r�sultat du tri + filtre
            	    System.out.println("filter + Tri:"+perso.getNom() + " " + perso.getPrenom()+ " " + perso.getAge());
              }
	}

}
