import java.util.Arrays;
import java.util.Random;

public class CounterArrayGenerator {

    public static void main(String[] args) {

        CounterArrayGenerator counterArrayGenerator = new CounterArrayGenerator();
        System.out.println(Arrays.toString(counterArrayGenerator.genCounterArray(4)));
    }

    public int[] genCounterArray( int size){
        int[] arr = new int[size];
        Random random = new Random();
        for(int i=0; i< arr.length; i++){
            arr[i] = random.nextInt(1000)+1;
        }

        return arr;
    }
}
