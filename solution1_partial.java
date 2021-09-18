import java.util.*;
public class Solution{

    public static int calculateMin(HashSet<Integer> hs,int x){
      int min=Integer.MAX_VALUE;
      Iterator<Integer> it = hs.iterator();
      while (it.hasNext()){
          int var=it.next();
          if(Math.abs(x-var)<min)
            min=Math.abs(x-var);
      }
      return min;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int count=1;
        for(int c=1;c<=test;c++){
            int n=sc.nextInt();
            String str=sc.next();
            
            HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='1')
                    hs.add(i);
            }
            long ans=0;
            for(int i=0;i<n;i++){
                if(!hs.contains(i)){
                    ans+=calculateMin(hs,i);    
                }
                
            }

            System.out.println("Case #"+c+": "+ans);
        }
    }
}