import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        List<Produit>  produits = GivenData.produits();

        Map<Integer, Optional<Produit>> produits1 = produits.stream()
                .filter( produit -> produit.getYear() == 2018)

                .collect(Collectors.groupingBy( Produit::getMonth, Collectors.maxBy(Comparator.comparingInt(Produit::getPrice))));


        //List<Optional<Produit>> p =  produits1.values().stream().collect(Collectors.toList());

        List<Produit> p3 =  produits1.values().stream().map( p2 -> p2.get()).collect(Collectors.toList());

        //p.forEach( produit ->  p3.add(produit.get()));


        System.out.println(p3);

    }
}
