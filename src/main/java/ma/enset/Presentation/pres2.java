package ma.enset.Presentation;

import ma.enset.Metier.IMetier;
import ma.enset.dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src\\main\\java\\ma\\enset\\config.txt"));
        String daoClassName= scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        //System.out.println(dao.getData());
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao" , IDao.class);
        method.invoke(metier,dao);

        System.out.println("Résultat : "+ metier.calcul());

    }
}
