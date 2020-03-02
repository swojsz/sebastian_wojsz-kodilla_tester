import java.util.Random;
public class RandomNumbers {
    int sum = 0;
    static int maxNum = new Random().nextInt(31);
    static int minNum = new Random().nextInt(31);

    public int randomSumUpTo5000() {

        while (sum <= 5000)  {
            int wylosowanaLiczba = new Random().nextInt(31);
            getMinNum(wylosowanaLiczba);
            getMaxNum(wylosowanaLiczba);

            sum = sum + new Random().nextInt(31);
        }
        return sum;
    }

    public int getMinNum(int number) {

        if (number < minNum) {
            minNum = number;
        }

        System.out.println("Minimalna wylosowana liczba " + minNum);
        return minNum;
    }
    public int getMaxNum(int number) {
        if (number > maxNum) {
            maxNum = number;
        }

        System.out.println("Minimalna wylosowana liczba " + maxNum);
        return maxNum;
    }

    public static void main(String[] args) {
        RandomNumbers numbers = new RandomNumbers();

        int resultSum = numbers.randomSumUpTo5000();
        System.out.println(resultSum);

        System.out.println("Wartosc minimalna " + minNum);
        System.out.println("Wartosc maksymalna " + maxNum);
    }
}