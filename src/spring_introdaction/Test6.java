import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introdaction.MyConfig;
import spring_introdaction.Person;
import spring_introdaction.Pet;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        cat1.say();

//        Person person =context.getBean("personBean",Person.class);
//        person.callYourPet();
        context.close();
    }
}
