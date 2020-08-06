// import static java.util.System.*;
import java.util.Random;

public class HeadsorTails{
    public static void main(String[] args){
        int i;
        
        int heads = 0;
        int tails = 0;
        System.out.println("Tossing a coin...");
        for(i=0; i<3; i++){
            int a = new Random().nextInt(2);
            if(a==0){
                System.out.println("Round "+i+ ": "+"Heads");
                heads++;
            }
            else if(a==1){
                System.out.println("Round "+i+": "+"Tails");
                tails++;
            }
        }
        System.out.print("Heads: "+heads);
        System.out.println(", Tails: "+tails);

        if(heads > tails){
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}