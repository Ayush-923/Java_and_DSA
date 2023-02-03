public class factorial {

    public static int fact(int n){  //n = 5
        if(n == 0)
        {
            return 1;
        }
        fact(n-1);  //fact(4) -> fact(3) -> fact(2) -> fact(1) -> fact(0)
        int fn = n * fact(n-1); // 1*fact(0) = 1*1 = 1
                                //2*fact(1)  = 2*1 = 2
                                //3*fact(2) = 3*2 = 6
                                //4*6= 24
                                //5*24 = 120;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
