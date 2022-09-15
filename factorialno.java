class factorialno
{
public static void main(String[] args)
{
int n,num=5;
long fact=1;
if(num<0)
{
System.out.println("no factorial of -ve number");
}
else
{
n=num;
while(num>1)
{
fact*=num;
num--;
}
System.out.println("factorial of"+n+"===>"+fact );
}
}
}