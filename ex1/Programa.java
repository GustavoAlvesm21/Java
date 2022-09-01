import java.util.Scanner;

public class Programa {
    @SuppressWarnings("resource")
	public static void main(String[] args) 
	{

		System.out.println("Inserir quantidade de tringulos a serem calculados: ");
		Scanner sc0 = new Scanner(System.in);

		int qtd = sc0.nextInt(); 

        for(int i=0;i<qtd;i++)
		{
			System.out.println("Inserir valor da base do tringulo " +i+ ":");
			Scanner sc = new Scanner(System.in); 

			float base = sc.nextInt(); 

			System.out.println("Inserir valor da altura do tringulo " +i+ ":");
			Scanner sc2 = new Scanner(System.in); 

			float altura = sc2.nextInt();

			float area = base * (altura/2); 

			System.out.println("area do triangulo " +i+ " é:" +area); 
	
		} 
    }
}