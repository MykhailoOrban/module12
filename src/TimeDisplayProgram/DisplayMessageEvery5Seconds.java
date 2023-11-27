package TimeDisplayProgram;

public class DisplayMessageEvery5Seconds implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Минуло 5 секунд");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
