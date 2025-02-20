import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your birth month [1-12]: ");
        if (in.hasNextInt())
        {
            int birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }
        else
        {
            String trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
        }
    }
}
