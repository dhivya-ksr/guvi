import java.io.*;
import java.util.*;
import java.util.Scanner;
class pack
{
public static void main(String args[])
{
int i,j,sum=0;
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int a[]=new int[s];
for(i=0;i<s;i++)
{
a[i]=sc.nextInt();
if(a[i]>=0)
{
sum=sum+a[i];
}}
System.out.println("sum is "+sum);

}
}
