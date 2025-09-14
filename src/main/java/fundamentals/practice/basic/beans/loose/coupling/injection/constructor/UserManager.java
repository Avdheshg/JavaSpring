package fundamentals.practice.basic.beans.loose.coupling.injection.constructor;

public class UserManager
{
    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider)
    {
        this.userDataProvider = userDataProvider;
    }

    public void showUserDetails()
    {
        System.out.println("User Details: " + userDataProvider.getUserData());
    }

}
