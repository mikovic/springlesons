package lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("clinica")
public class Clinica implements Doctor {
    @Autowired(required = false)
    private Shtat shtat;
    @Autowired(required = false)
    @Qualifier("dantist")
    private Doctor doctor;
    @Autowired(required = false)
    @Qualifier("student")
    private Human human;
    @Value("Районная поликлиника")
    private String title;



    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public void treatment(Human human) {
        doctor.treatment(human);
    }

    @Override
    public void show() {
        System.out.println(getTitle());

    }

    @Override
    public String getTitle() {
        return title;
    }

    Doctor getTerapevt() {

        return shtat.getTerapevt();
    }
    Doctor getDantist() {

        return shtat.getDantist();
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        System.out.println("Новый доктор");
        this.doctor = doctor;
    }
}
