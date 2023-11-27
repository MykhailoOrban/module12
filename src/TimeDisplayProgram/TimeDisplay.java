package TimeDisplayProgram;


    class TimeDisplay implements Runnable {
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            while (true) {
                long currentTime = System.currentTimeMillis();
                long elapsedTime = (currentTime - startTime) / 1000;
                System.out.println("Пройшло часу: " + elapsedTime + " секунд");
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}
