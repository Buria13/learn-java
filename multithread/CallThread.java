package multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CallThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            System.out.println("Call " + i);
            builder.append("Call" + i);
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return builder.toString();
    }
}
