package torre_hanoi;

import java.util.Scanner;

public class Main {
	
	private static int c=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("numero de discos");
		
		hanoi(sc.nextInt(),"origen","auxiliar","destino");
		System.out.println(c);
	}
	
	public static void hanoi(int n, String origen,String auxiliar,String destino) {
		
		if(n==1) {
			System.out.println("Mover disco "+n+ " de "+origen+" a "+destino);
		}else {
			hanoi(n-1,origen,destino,auxiliar);
			System.out.println("Mover disco "+n+" de "+origen+" a "+destino);
			hanoi(n-1,auxiliar,origen,destino);
		}
		c++;
		
	}

}
