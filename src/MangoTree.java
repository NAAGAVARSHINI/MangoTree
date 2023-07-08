import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int col=sc.nextInt();
        int tree= sc.nextInt();
        if(tree >=1 && tree<=row || tree%col==0 || tree%col==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
