import java.io.*;
import java.util.*;
import java.util.Scanner;
class pack2
{
public static void main(String args[])
{
int i,b,sum=0;
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
while(s!=0)
{
b=s%10;
s=s/10;
sum++;
}
System.out.println(sum);
}
}
