package acadview;
import java.util.Scanner; 
public class reverse {
	
	public static void main(String[] args){
		
	
	Scanner sc=new Scanner(System.in);
	
System.out.println("enter number");
int a = sc.nextInt();

int b, c=0;
int d=a;
while(a>0){
	b= a%10;
	a=a/10;
	c=c*10+b;
}
System.out.println(""  +c);

	}
	
}
