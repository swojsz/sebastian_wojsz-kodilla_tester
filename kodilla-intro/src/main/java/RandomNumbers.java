import java.util.Random;
public class RandomNumbers {
    int sum = 0;
    int maxNum = 0;
    int minNum = 30;
    int result = 0;

    public int makeRandomResult() {
        Random random = new Random();
        int result = random.nextInt(31);
        this.result = result;
        return result;
    }
    public int getResult(){return result;}

    public int randomSumUpTo5000() {
        int max = 5000;
        while (sum <= max)  {
            sum = sum + makeRandomResult();}
        return sum;
    }
    public int getMinNum() {

        if (result < minNum) {
            minNum = result;
        }
        return minNum;
    }
    public int getMaxNum() {
        if (getResult() > maxNum) {
            maxNum = getResult();
        }
        return maxNum;
    }
    public static void main(String[] args) {
        RandomNumbers numbers = new RandomNumbers();

        int resultSum = numbers.randomSumUpTo5000();
        System.out.println(resultSum);
        int resultNumber = numbers.getResult();
        System.out.println(resultNumber);
        int minNumber = numbers.getMinNum();
        System.out.println(minNumber);
        int maxNumber = numbers.getMaxNum();
        System.out.println(maxNumber);
    }
}