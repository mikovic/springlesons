package lesson1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



    @Configuration
    @ComponentScan("lesson1")
    public class AppConfig {
        @Bean(name="clinica")
        public Clinica clinica() {
            return new Clinica() ;
        }

        @Bean(name="shtat")
        public Shtat shtat(){
            Shtat shtat = new Shtat();
            shtat.add(terapevt());
            shtat.add(dantist());
            return shtat;
        }

        @Bean(name="dantist")
        public Dantist dantist() {
            return new Dantist() ;
        }
        @Bean(name="terapevt")
        public Terapevt terapevt() {
            return new Terapevt() ;
        }
        @Bean(name="retiree")
        public Retiree retiree() {
            return new Retiree() ;
        }
        @Bean(name="student")
        public Student student() {
            return new Student() ;
        }

    }


