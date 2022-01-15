class Prime
{
public static void main(String[] args)
{
int n=12,i;
boolean flag=false;
if(n>1)
{
for(i=2;i<n/2;i++)
{
if(n%i==0)
{
flag=true;
break;
}
}
}
if(!flag)
 System.out.println("prime number");
else
 System.out.println("Not a prime");

}
}
