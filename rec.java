public class rec {

    public static int interativeSum(int n){
        int a = 0;
        while(n != 0){
            a += n;
            n--;
        }
        return a;
    }

    public static int recursiveSum(int n){
        if(n != 0){
            return n + recursiveSum(n-1);
        }
        return n;
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static int exp(int base, int e){
        if(e == 0){
            return 1;
        }
        else{
            return base* exp(base, e-1);
        }
    }

    public static int multiply(int n, int k){
        if(k == 1){
            return n;
        }
        return n + multiply(n, k-1);
    }

    public static String mystery(int n){
        if(n == 0){
            return "^";
        }
        if(n % 2 == 0){
            return "*" + mystery(n-1);
        }
        else{
            return "-" + mystery(n-1);
        }
    }

    public static String takeX(String in){
        if(in.length() == 0){
            return "";
        }
        if(in.charAt(0) == 'x'){
            return in.charAt(0) + takeX(in.substring(1, in.length()));
        }
        return takeX(in.substring(1,in.length()));
    }



    public static void main(String[] args){
        System.out.println(interativeSum(1));
        System.out.println(recursiveSum(1));

        System.out.println(factorial(3));
        System.out.println(exp(2,3));

        System.out.println(multiply(4,5));
        System.out.println(multiply(4,1));

        System.out.println(mystery(4));

        System.out.println(takeX("Hello x worldx! You'x gx"));
        System.out.println(takeX("Hello world"));

    }
}
