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