import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Example excercise 1
 * Created by Jirka on 16.8.2016.
 */
public class AnnotationsMain {

    // definice

    private String name;
    private int id;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Mutator1_value {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Mutator2_variable {
        String variable();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Mutator3_valuexxx {
        String valuexxx();
    }

    // využití


    @Mutator1_value("xyz_value")   // value = "xyz"
    public void setName(String name) {
        this.name = name;
    }

    @Mutator2_variable(variable = "xyz_variable")
    public int getId() {
        return  id;
    }

    @AnnotationsMain.Mutator3_valuexxx(valuexxx = "xyz_valuexxx")
    public void setId(int id) {
        this.id = id;
    }

}
