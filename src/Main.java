import java.util.Scanner;
import java.lang.String;

public class Main {
    public static Scanner in = new Scanner(System.in);


    //Problem 1
    //O(n)
    public static void minimum(int[] arr, int n, int l, int minimum) {

        if (l == n) {
            System.out.println(minimum);
            return;
        }
        if (arr[l] < minimum) {
            minimum = arr[l];
        }
        minimum(arr, n, l + 1, minimum);
    }


    // Problem 2
    //O(n)
    public static void average(int n, int[] arr, int l, float sum) {
        if (l == n) {

            System.out.println(sum / (n));
            return;
        }
        sum += arr[l];
        average(n, arr, l + 1, sum);

    }

    //Problem 3
    //O(N)
    public static void isPrime(int n, int l, int p) {
        if (n <= 1) {
            System.out.println("Incorrect input");
        }
        if (n == l) {
            if (p >= 1) {
                System.out.println("Composite");
            } else
                System.out.println("Prime");
            return;
        }
        if (n % l == 0) {
            p++;
        }
        isPrime(n, l + 1, p);
    }

    //Problem 4
    //O(n)
    public static void factorial(int n, int l, int fact) {
        if (n == l - 1) {
            System.out.println(fact);
            return;
        }
        fact = fact * l;
        factorial(n, l + 1, fact);
    }

    //Problem 5
    //O(2^n)
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    //Problem 6
    //O(n)
    public static void power_of_n(int a, int n, int power, int l) {
        if (l == n) {
            System.out.println(power);
            return;
        }
        power = power * a;
        power_of_n(a, n, power, l + 1);
    }

    //Problem 7

    public static String swap(String str, int a, int b) {
        char[] charArray = str.toCharArray();
        char temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;
        return new String(charArray);
    }

    //O(n!)
    public static void string_permutation(String str, int k, int l) {
        if (k == l) {
            System.out.println(str);
        } else {
            for (int i = k; i <= l; i++) {
                str = swap(str, k, i);
                string_permutation(str, k + 1, l);
                str = swap(str, k, i);
            }
        }
    }



    //Problem8
    public static void is_all_digits(char[] str, int l, int k) {
        if (str.length == l) {
            if (k > 0) {
                System.out.println("no");
            } else
                System.out.println("yes");
            return;
        }
        if (Character.isDigit(str[l]) == false) {
            k++;
        }
        is_all_digits(str, l + 1, k);
    }


    //Problem 9
    //O(2^n)
    public static int binomiamCoeffficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return binomiamCoeffficient(n - 1, k - 1) + binomiamCoeffficient(n - 1, k);
    }

    //Problem10
    public static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }

        return gcd(m, n % m);
    }

    public static void task_1() {
        int n;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        minimum(arr, n, 0, 999999999);
        return;
    }

    public static void task_2(){
        int n;
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        average(n,arr,0,0);
    }

    public static void task_3(){
        int n;
        n=in.nextInt();
        isPrime(n,2,0);
    }

    public static void task_4(){
        int n;
        n=in.nextInt();
        factorial(n,1,1);
    }

    public static void task_5(){
        int n;
        n=in.nextInt();
        System.out.println(fibonacci(n));
    }
    public static void task_6(){
        int a,n;
        a=in.nextInt();
        n=in.nextInt();
        power_of_n(a,n,1,0);
    }

    public static void task_7(){
        String str = in.next();
        string_permutation(str,0,str.length()-1);
    }

    public static void task_8(){
                String a;
                a=in.nextLine();
                char[] b;
                b = a.toCharArray();
                is_all_digits(b,0,0);
    }

    public static void task_9(){
        int n,k;
        n=in.nextInt();
        k=in.nextInt();
        System.out.println(binomiamCoeffficient(n ,k));
    }

    public static void task_10(){
        int n,k;
        n=in.nextInt();
        k=in.nextInt();
        System.out.println(gcd(n,k));
    }


    public static void main(String[] args) {
        // task_number();
    }
}