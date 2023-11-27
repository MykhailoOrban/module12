package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessorTest {
    public static void main(String[] args) {
        NumberProcessor np1 = new NumberProcessor((n) -> {
            if(n % 3 == 0 && n % 5 != 0){
                System.out.println(n + "FIZZ");
            }
        });
        NumberProcessor np2 = new NumberProcessor((n) -> {
            if(n % 5 == 0 && n % 3 != 0){
                System.out.println(n + "BUZZ");
            }
        });
        NumberProcessor np3 = new NumberProcessor((n) -> {
            if(n % 3 == 0 && n % 5 == 0){
                System.out.println(n + "FIZZBUZZ");
            }
        });
        NumberProcessor np4 = new NumberProcessor((n) -> {
            if(n % 3 != 0 && n % 5 != 0 ){
                System.out.println(n);
            }
        });
        List<NumberProcessor> nps = new ArrayList<>();
        nps.add(np1);
        nps.add(np2);
        nps.add(np3);
        nps.add(np4);


        for(NumberProcessor np : nps){
            np.start();
        }

        for(int i = 0; i < 20; i++){
            for(NumberProcessor np : nps){
                np.processed(i);
            }

            while(true){
                int processedNumberCount = 0;
                for(NumberProcessor np : nps){
                    if(np.isNumberProcess()){
                        processedNumberCount++;
                    };
                }

                if (processedNumberCount == 4){
                    break;
                }
            }
        }
    }
}
