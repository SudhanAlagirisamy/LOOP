import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        printPrimeNumbers(n1, n2);
    }

    public static boolean checkPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if (n%i==0)
            {
                return false;
            }

        }
        return true;
    }

    public static void printPrimeNumbers(int n1, int n2) {
       for(int i=n1;i<=n2;i++){
        if (checkPrime(i))
        {
            System.out.print(i +" ");
        }
       }
    }
}
