import java.util.*;
public class MyClass {
    static int find(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            boolean flag=true;
           for(int j=i+1;j<s.length();j++)
           {
               if(s.charAt(i)==s.charAt(j))
               {
                   flag=false;
               }
           }
           if(flag)
           return i;
        }
        return -1;
    }
    public static void main(String args[]) {
     Scanner scan=new Scanner(System.in);
     String s=new String("loveleetcode");
    System.out.print(find(s));
    }
}