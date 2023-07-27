import java.util.scanner;
public interface calci
{
public int getsum(int n1,int n2);
}
class calciImpl implements calci
{
public int getsum(int n1,int n2){
return n1+n2;
}
}
public class calciDriver
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 nos to find sum");
int n1=sc.nextInt();
int n2=sc.nextInt();
calciImpl c=new calciImpl();
int sum=c.getsum(n1,n2);
System.out.println(sum);
}
}