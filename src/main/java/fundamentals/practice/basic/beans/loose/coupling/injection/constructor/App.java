package fundamentals.practice.basic.beans.loose.coupling.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basicBeansLooseCoupling.xml");

        UserManager userManager_mongoDB = (UserManager) context.getBean("userManager_mongoDB");
        userManager_mongoDB.showUserDetails();

        UserManager userManager_sql = (UserManager) context.getBean("userManager_sql");
        userManager_sql.showUserDetails();

        UserManager userManager_webService = (UserManager) context.getBean("userManager_webService");
        userManager_webService.showUserDetails();
    }
}
