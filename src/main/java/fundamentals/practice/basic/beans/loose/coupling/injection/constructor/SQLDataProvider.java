package fundamentals.practice.basic.beans.loose.coupling.injection.constructor;

public class SQLDataProvider implements UserDataProvider
{
    private String user;

//    public SQLDataProvider(String user) {
//        this.user = user;
//    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String getUserData()
    {
        return "SQL Data Provider" + this.user;
    }
}
