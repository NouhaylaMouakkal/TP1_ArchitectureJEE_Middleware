package ma.enset.dao;

public class DaoImpl implements  IDao{
    @Override
    public double getData() {
        // se connecter à la BD pour récupérer la température
        System.out.println("Version Base De Données ");
        double temp = Math.random()*40;
        return temp;
    }
}
