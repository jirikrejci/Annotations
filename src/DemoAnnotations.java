/**
 * Created by Jirka on 16.8.2016.
 */



import java.util.Date;

@SuppressWarnings("unused")
public class DemoAnnotations extends MyBaseClass {
    private int j;



    public static void main (String[] args) {
        int i;  // unused variable
        System.out.println("´hello from DemoAnnotations");
        new MyBaseClass().testMethod();


    }

    @SuppressWarnings("deprecation")
    public void foo () {
        int j = 5;
        System.out.println("value of j: " + j);
        Date d = new Date ();
        d.getDay(); // deprecated method

    }



    @Override
    public void testMethod () {
        super.testMethod();
        System.out.println("po volání předka");
        System.out.println("testMethod from DemoAnnotations");
    }
}
