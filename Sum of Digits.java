import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = findSumOfDigits(num);
        System.out.println(sum);
    }

    public static int findSumOfDigits(int num) {
        int sum=0;
        int rem=0;
       while(num>0){
        rem=num%10;
        sum=sum+rem;
        num=num/10;
       }
       return sum ;
    }
}
