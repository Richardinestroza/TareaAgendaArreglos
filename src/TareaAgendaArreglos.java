import java.util.Scanner;
public class TareaAgendaArreglos 
{

	public static void main(String[] args) 
	{
		Scanner mi_s = new Scanner(System.in);
		int arr[]=new int [5];

		System.out.println("Ingrese un numero 1: ");
		arr[0]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		arr[1]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		arr[2]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		arr[3]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		arr[4]= mi_s.nextInt();
		
		
		System.out.println("Agenda: ");

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}

}
