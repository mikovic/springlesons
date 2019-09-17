package lesson1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student extends Patient implements Human {
    @Value("Петр")
    String name;
    public Student() {
        this.age = 18;
    }
    @Override
    public String ocupation() {
        return "студент";
    }

    @Override
    public String health() {
        return "Здоров как бык";
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

}
