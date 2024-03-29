import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want count days");
        int month = scanner.nextInt();

         String DayOfMonth;
        switch (month) {
            case 2 :
                DayOfMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                DayOfMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DayOfMonth = "30";
                break;
            default:
                DayOfMonth ="";
        }
        if(DayOfMonth != "") {
            System.out.printf("The month "+ month + " has days "+DayOfMonth);
        } else {
            System.out.print("Invalid input");
        }
    }
}
