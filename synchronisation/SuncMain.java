package synchronisation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SuncMain {
    public static void main(String[] args) {
        try(CommonResource resource = new CommonResource("data\\TT.txt")) {
            UseFileThread thread1 = new UseFileThread("First", resource);
            UseFileThread thread2 = new UseFileThread("Second", resource);
            thread1.start();
            thread2.start();

            TimeUnit.SECONDS.sleep(6);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
