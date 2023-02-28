import java.util.Scanner;

public class fivetable {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
for(int i=1;i<=20;i++){
	int temp=a*i;
	System.out.println(a+ " * " + i + " = " + temp);
   }
}
	*/
	
	public static void main(String[] args) {
		System.out.print("enter a table = ");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		for(int f=1;f<=10;f++) {
		int tab=b*f;
		System.out.println(b+ " * " + f + " = " + tab);
		
		}
	}
}
