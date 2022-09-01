import java.util.Scanner;

public class selecionaVogais 
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        for(int i = 0; i < nome.length(); i++)
        {
            char c = nome.charAt(i); 
            if(c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o'|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                System.out.println(c); 
            }
        }
    } 
}