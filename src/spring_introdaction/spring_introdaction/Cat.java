package spring_introdaction;

import org.springframework.stereotype.Component;

//@Component("catBean") // можно не писать и будет дефолтный cat
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bin is created ");
    }

    public void say() {
        System.out.println("miy-miy");

    }
}
