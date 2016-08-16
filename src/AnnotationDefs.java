import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;

/**
 * Created by Jirka on 16.8.2016.
 */


public class AnnotationDefs {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface RequestForEnhancement {
        int id();
        String synopsis();
        String engineer() default "[unassigned]";
        String date() default  "[unimplemented]";

    }

    @AnnotationDefs.RequestForEnhancement(
            id = 2868724,
            synopsis = "Enable time-travel",
            engineer = "Mr.Pearbody",
            date = "4/1/3007"

    )
    public static void travelThroughTime (Date destination) {

    }






}
