package OOPs;

import java.util.Arrays;

public class VariableArgumentPassing {
    public static void main(String[] args) {

        //variable arguments always comes last
        fun(1232,213,432,234);
    }
    public static void fun(int ... demo){
        System.out.println(Arrays.toString(demo));
    }
}


