import java.io.*;
import java.util.*;
import java.util.Scanner;
class pack1
{
public static void main(String args[])
{
int i,sum=0;
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int a[]=new int[s];
for(i=0;i<s;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println(sum);
}}
