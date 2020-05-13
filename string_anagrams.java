import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        if(a.length()!=b.length())
        {
            return false;
        }
        else
       {
        a=a.toUpperCase();
        b=b.toUpperCase();
        char c[]=new char[a.length()];
        char d[]=new char[b.length()];
        for(int i=0;i<c.length;i++)
        {
            c[i]=a.charAt(i);
            d[i]=b.charAt(i);
        }
        int k=0,p=0;
        for(int j=0;j<c.length;j++)
        {
            for(int k1=0;k1<d.length;k1++)
            {
                if(c[j]==d[k1])
                {
                    k++;
                }
                if(c[j]==c[k1])
                {
                    p++;
                }
            }
        }
        if(k==p)
        {
            return true;
        }
        else
        {
            return false;
         }
    }
   }

 public static void main(String[] args) 
 {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
