import java.util.concurrent.ConcurrentLinkedQueue;

public class Specialist extends Thread {


    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true) {

            Call call = Main.calls.poll();
            if (call != null) {
                answerTheCall(call);
            } else {
                break;
            }
        }
    }

    public void answerTheCall(Call call) {

        System.out.println(Thread.currentThread().getName() + " ответил на " + call.toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " закончил " + call.toString());
    }
}
