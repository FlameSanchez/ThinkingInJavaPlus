package generics.myTest;

import generics.Fibonacci;
import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {

    private static int fib(int n) {
        if(n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args) {
        for(int i = 0; i < Integer.valueOf(args[0]); i++)
            System.out.print(fib(i) + " ");
    }
}
