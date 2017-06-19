import java.io.*;
import java.util.*;
class Swap
{
    public static void main(String args[])
    {
        char temp;
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char ch[]=a.toCharArray();
        for(int i=0;i<ch.length;i=i+2)
        {
           temp=ch[i];
           ch[i]=ch[i+1];
           ch[i+1]=temp;
        }
        System.out.println(ch);
    }
}
