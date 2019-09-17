package lesson1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("danist")
public class Dantist implements Doctor {
    @Value("Иван Иваныч")
    private String name;
    @Value("Дантист")
    private String title;
    private Human human;

    @Override
    public void treatment(Human human) {

        System.out.println("Мой пациент :" + human.ocupation() + " И ему "+ human.getAge());
        System.out.println("Его здоровье :" + human.health()
                + " И он пришел на осмотр");
    }

    @Override
    public void show() {
        System.out.println("Мое имя " + getName() + " Я дантист.");
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getTitle() {
        return title;
    }
}
