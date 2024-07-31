public class prac1_6 {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        //int n=10;
        int sum=0;
        System.out.println(n1);
        System.out.println(n2);
       
        for(int i=0;i<8;i++)
        { int  n3=n1+n2;
           n1=n2;
           n2=n3;
           System.out.println(n3);
           sum+=n3;
        }
        System.out.println(sum);
        
    }
}
