public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in the number is 165 = "+ sumDigits(165));
        System.out.println("The sum of the digits in the number is 15 = "+ sumDigits(15));
        System.out.println("The sum of the digits in the number is 1 = "+ sumDigits(1));
    }
    private static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum=0;
        //125-> 125/10=12 -> 12*10=12 -> 125-120=5
        while (number>0){
            //extract the least-significant digit
            int digit = number%10;
            sum+=digit; //increment
            // drop the least-significant digit
            number/=10;  //same as number = number/10;
        }
        return sum;
    }

}

