package tourofjava.ch2.lab1;


import java.util.function.IntFunction;

public class Test {

    IntFunction<Integer> mul(int x) {
        return (var y) -> x * y;
    }

    public static void main(String[] args) {
    }
}
