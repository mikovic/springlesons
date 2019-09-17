package lesson1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("terapevt")
public class Terapevt implements Doctor {
    @Value("Михаил Михайлович")
    private String name;
    @Value("Терапевт")
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
        System.out.println("Мое имя " + getName() +" Я терапевт.");
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
