package uk.ac.cam.wz337.Q5_tail_recursive_test;

public class Main {
    static int REC_DEPTH = 100000000;
    public static void recursion_test(int depth) {
        // n: the depth of recursion
        if (depth == REC_DEPTH) {
            return;
        }
        recursion_test(depth + 1);
    }

    public static void main(String[] args) {
        try {
            recursion_test(1);
        }
        catch (StackOverflowError e) {
            System.out.println("Stack overflow");
        }
        System.out.println("If not see stack overflow msg then test passed.");
    }
}
