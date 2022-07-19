import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    static ConcurrentLinkedQueue<Call> calls = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) throws InterruptedException {

        final int specialistsQty = 4;

        TelephoneSwitch telephoneSwitch = new TelephoneSwitch();
        telephoneSwitch.start();

        for (int i = 0; i < specialistsQty; i++) {
            new Specialist().start();
        }
    }
}
