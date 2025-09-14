package fundamentals.practice.basic.beans.loose.coupling.injection.constructor;

public class WebServiceDataProvider implements UserDataProvider
{
    private String user;

//    public WebServiceDataProvider(String user) {
//        this.user = user;
//    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String getUserData()
    {
        return "Web Service: " + this.user;
    }
}
