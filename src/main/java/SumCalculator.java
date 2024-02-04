import java.util.ArrayList;

public class SumCalculator {

    public int sum(int n){
        int sum = 0;
        if(n == 0){
            throw new IllegalArgumentException("The value should be equal 1 or more");
        }
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i = 1; i <= n; i++){
            arr.add(i);
            sum += arr.get(i-1);
        }
        return sum;
    }
}
