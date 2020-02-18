import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        System.out.println("Algorytm sprawdza czy rok jest przestępny");
        System.out.println("Podaj rok: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Rok przestępny!");
        }
        else{
            System.out.println("Rok nie przestepny!");
        }

    }
}
