import java.util.*;

public class r {
    public static void main(String[] args) {
        Random r = new Random();
        
        int n = r.nextInt();

        if(n%2==0){
            System.out.println("bkb");
        }
        else if(n%3==0){
            System.out.println("badminton");
        }
        else{
            System.out.println("hello world");
        }
    }
}
