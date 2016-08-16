/**
 * Created by Jirka on 16.8.2016.

 */

public class VideoStore {

    // annotaion interface 1
    public @interface secured {
    }

    @secured
    public static void storeVideo (String videoName) {
        System.out.println("Video \"" + videoName + "\" stored.");
    }

    // annotation interface 2
    public @interface secured2 {
        public String role();      // metoda
    }

    @secured2 (role = "user")    // anotace s parametrem
    public static void storeVideoByUser (String videoName) {
        System.out.println("Video \"" + videoName + "\" stored.");
    }
}
