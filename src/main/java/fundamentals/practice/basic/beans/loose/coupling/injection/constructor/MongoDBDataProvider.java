package fundamentals.practice.basic.beans.loose.coupling.injection.constructor;

public class MongoDBDataProvider implements UserDataProvider
{
    private String user;

//    public MongoDBDataProvider(String user) {
//        this.user = user;
//    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String getUserData()
    {
        return "MongoDB user data: " + this.user;
    }
}
