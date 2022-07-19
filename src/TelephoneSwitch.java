public class TelephoneSwitch extends Thread {

    @Override
    public void run() {

        final int callsQty = 10;

        for (int i = 0; i < 10; i++) {
            Call newCall = new Call();
            Main.calls.add(newCall);
            System.out.println("Принят входящий звонок " + newCall.toString());

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
}
