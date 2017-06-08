import java.io.*;
import java.util.*;
class Pack4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b,sum=0,c;
c=a;
while(a!=0)
{
b=a%10;
sum=sum*10+b;
a=a/10;
}
if(c==sum)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}}
