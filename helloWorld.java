import java.util.Scanner;

class subscribe {
    public static void main(String[] args)
    {
        String creator;

        System.out.print("Name of creator? ");

        Scanner myScanner = new Scanner(System.in);
        creator = myScanner.nextLine();

        System.out.format("Subscribe to %s!\n", creator);
    }
}