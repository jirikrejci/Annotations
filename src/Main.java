import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by Jirka on 16.8.2016.
 */
public class Main {

    AnnotatedClass ac;

    public Main () {   // constructor hlavního programu - dobrá finta

        System.out.println("Ahoj, snad jsme se konečeně dohrabali k použití anotací???");
        ac = new AnnotatedClass();

    }

    public void printAnnotations () {
        Class c = ac.getClass();

        Annotation[] annotations = c.getAnnotations();
        int numberOfAnnotations = annotations.length;
        System.out.println("Počet anotací objektu " + c.getName() + ": " + numberOfAnnotations);

        for (int i = 0; i < numberOfAnnotations; i++) {
            System.out.println("Anotace " + i + ": " + annotations[i].toString());

        }
    }

    public static void  main(String [] args) {
        Main ar = new Main();

        ar.printAnnotations();
    }



}





