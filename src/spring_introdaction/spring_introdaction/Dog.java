package spring_introdaction;

import org.springframework.stereotype.Component;

@Component ("dogBean")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bin is created ");
    }

    @Override
    public void say() {
        System.out.println("gav-gav");
    }

    protected void init() {
        System.out.println("Class Dog: init method");

    }
   private void destroy(){
        System.out.println("Class Dog : destroy method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
