package ma.enset.Presentation;

import ma.enset.Metier.MetierImpl;
import ma.enset.dao.DaoImpl;
import ma.enset.ext.DaoImpl2;

public class presentation {
    public static void main(String[] args){
        // Injection des dependances par instanciation statique => new
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat : "+metier.calcul());


    }
}
