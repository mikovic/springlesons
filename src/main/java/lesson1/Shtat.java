package lesson1;

import org.springframework.stereotype.Component;

import java.util.HashSet;
@Component("shtat")
public class Shtat {
    private HashSet<Doctor> set;
    public Shtat(){
        this.set = new HashSet<Doctor>();
    }
    void add(Doctor doctor){
        set.add(doctor);
    }
    Doctor getTerapevt() {
        Doctor doctor = null;
        for (Doctor doc : set){
            if (doc.getTitle().equals("Терапевт")){
                doctor = doc;
                break;
            }

        }
        return doctor;
    }
    Doctor getDantist() {
        Doctor doctor = null;
        for (Doctor doc : set){
            if (doc.getTitle().equals("Дантист")){
                doctor = doc;
                break;
            }

        }
        return doctor;
    }
}
