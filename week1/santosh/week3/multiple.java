import java.util.Scanner;

public class multiple {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i =1;i <= n;i++){

    
            if(i % 4 == 0){
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }    
}