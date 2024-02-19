package ma.enset.ext;

import ma.enset.dao.IDao;

public class DaoImplWS implements IDao {
    @Override
    public double getData() {
        System.out.println(" Version Web Service : ");
        return 90;
    }
}
