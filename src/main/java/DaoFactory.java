import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            Config config = new Config();
            try{
                adsDao = new MySQLAdsDao(config);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return adsDao;
    }
}
