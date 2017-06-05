import java.io.*;
import java.util.*;
class rev1
{
public static void main(String args[])
{
    int rev=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
while(a!=0)
{
    rev=rev*10;
    rev=rev+(a%10);
    a=a/10;
}
System.out.println(rev);
}
}

