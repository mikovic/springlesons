package lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLesson1 {

    public static void main(String args[ ]){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Clinica clinica = context.getBean("clinica",Clinica.class);
        Retiree retiree = context.getBean("retiree", Retiree.class);
        Student student = context.getBean("student", Student.class);
        clinica.show();
        clinica.getDoctor().show();
        clinica.treatment(clinica.getHuman());
        clinica.setDoctor(clinica.getTerapevt());
        clinica.getDoctor().show();
        clinica.setHuman(retiree);
        clinica.treatment(retiree);
        clinica.setHuman(student);
        clinica.treatment(student);
        clinica.setDoctor(clinica.getDantist());
        clinica.getDoctor().show();
        clinica.treatment(student);

    }
}
