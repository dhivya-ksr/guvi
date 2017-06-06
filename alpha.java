import java.io.*;
import java.util.*;
class alpha
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    char a=sc.next().charAt(0);
    if(a>='a'&&a<='z'||a>='A'&&a<='Z')
    {
    System.out.println("alphabet");
    }
    else
    {
        System.out.println("not alphabet");
    }
}
}
