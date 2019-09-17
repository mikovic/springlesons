package lesson1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("retiree")
public class Retiree extends Patient implements Human {
    @Value("Петрович")
    String name;
    public Retiree() {
        this.age = 70;
    }

    @Override
    public String ocupation() {
        return "Пенсионер";
    }

    @Override
    public String health() {
        return "Зубы болят";
    }

    @Override
    public double getAge() {
        return this.age;
    }

    @Override
    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
