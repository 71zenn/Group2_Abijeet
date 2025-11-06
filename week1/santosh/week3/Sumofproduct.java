public class Sumofproduct{
    public static void main(String[] args){
        int sumofeven = 0;
        int oddproduct = 1;
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                sumofeven +=i;
            } else {
                oddproduct *= i;
            }
        }
        System.out.println("Sum of even number: " + sumofeven);
        System.out.println("Product of odd numbers: " + oddproduct);
    }
}