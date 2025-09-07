package Day1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();

        System.out.println("YES");
        for(long i=l;i<=r;i+=2){//since pair will make it half so loop should run half times so two jump required
            System.out.println(i +" "+(i+1));

        }

    }
}
