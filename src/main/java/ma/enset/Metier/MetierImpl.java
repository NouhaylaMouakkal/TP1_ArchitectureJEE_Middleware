package ma.enset.Metier;

import ma.enset.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao ; // couplage faible

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
//Inecter dans la  variable dao un object d'une classe qui implement l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
