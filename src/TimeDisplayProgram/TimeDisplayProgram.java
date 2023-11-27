package TimeDisplayProgram;

public class TimeDisplayProgram {

    public static void main(String[] args) {
        Thread timeThread = new Thread(new TimeDisplay());
        timeThread.start();
        Thread messageThread = new Thread(new DisplayMessageEvery5Seconds());
        messageThread.setDaemon(true);
        messageThread.start();
    }
}


