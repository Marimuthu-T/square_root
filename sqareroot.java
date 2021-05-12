import java.util.Scanner;

public class sqaureroot {
    public static void main(String[] args) {
        double n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        double lower=1;
        double upper=n;
        double error_rate=0.0001;
        double mid=(lower+upper)/2.0;
        long count=0;
        while(Math.abs((mid*mid)-n)>error_rate)
        {
            if((mid*mid)>n)
                upper=mid;
            else
                lower=mid;
            mid=(lower+upper)/2.0;
            count++;
        }
        System.out.println(mid+"\nSystem:"+Math.sqrt(n)+"\n Result: "+mid*mid+"\n Count: "+count);

    }

}
