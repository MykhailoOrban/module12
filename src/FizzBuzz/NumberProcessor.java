package FizzBuzz;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

public class NumberProcessor extends Thread {
    private int number;

    private Consumer<Integer> processor;
    private AtomicBoolean isNumberProcessed = new AtomicBoolean(true);


    public NumberProcessor(Consumer<Integer> processor){
        this.processor = processor;
    }
    public boolean isNumberProcess(){
        return isNumberProcessed.get();
    }

    public void processed (int number){
        this.number = number;
        this.isNumberProcessed.set(false);
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (isNumberProcessed.get()){
                continue;
            }
            processor.accept(number);
            isNumberProcessed.set(true);


        }
    }
}
