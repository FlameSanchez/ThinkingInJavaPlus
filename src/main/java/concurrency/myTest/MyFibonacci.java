package concurrency.myTest;

public class MyFibonacci {

//求第n个数
    static int f(int n) {
       if (n<2) return 1;
       return f(n - 1) + f(n - 2);}

//给个n,返回一个序列
        static String s(int n) {
        if (n==0)return "1";
        return s(n - 1) +","+f(n); }



    public static void main(String[] args) {

        System.out.println(s(6));
    }
}
