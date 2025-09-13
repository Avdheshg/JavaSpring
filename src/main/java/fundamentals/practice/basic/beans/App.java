package fundamentals.practice.basic.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basicBeansApplication.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("basicBeans_car.xml");

        SchoolClass eightClass = (SchoolClass) context.getBean("schoolClass");
        System.out.println();
        eightClass.showClassDetails();

//        Car seltos = (Car) context.getBean("car");
//        System.out.println(seltos.toString());
    }
}
