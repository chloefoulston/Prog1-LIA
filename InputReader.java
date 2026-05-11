import java.util.Scanner;
/**
 * Write a description of class InputReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InputReader
{
    private Scanner scanner;
    public InputReader()
    {
        scanner = new Scanner(System.in);
    }
    public String getString()
    {
        return scanner.nextLine();
    }
    public int getInt()
    {
        while (!scanner.hasNextInt()){
            System.out.println("Enter a valid rating from 1-5");
            scanner.nextLine();
        }
            int rating = scanner.nextInt();
            scanner.nextLine();
            
            return rating;
    }
    
    public String getChoice()
    {
        return scanner.nextLine().trim().toLowerCase();
    }
}