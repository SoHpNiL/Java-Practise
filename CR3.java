import java.util.ArrayList;
public class CR3 {
    public static void main(String[] args) {
        Accumulator acc4 = new Accumulator();
        acc4.addValue(5);
        acc4.addValue(-3);
        System.out.println("after 2 additions, one being negative: " + acc4.getSum());
    }

}


class Accumulator {
    ArrayList<Integer> NumList = new ArrayList<Integer>();

    public Accumulator(){
        // in the future intialize within constructors and declare on fields instead
    }

    public void addValue(int value) {
        if (value < 0){
            return;
        }
        NumList.add(value);
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < NumList.size(); i++) {
            sum += NumList.get(i);
        }
        return sum;
}

    
}