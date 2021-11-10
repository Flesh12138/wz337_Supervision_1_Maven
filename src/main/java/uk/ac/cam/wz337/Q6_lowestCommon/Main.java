package uk.ac.cam.wz337.Q6_lowestCommon;

public class Main {
    public static int lowestCommon(long a, long b) {
        int count_bit = 0;
        while (!(a == 0 && b == 0)) {
            if (a % 2 == b % 2) {
                return count_bit;
            }
            a /= 2;
            b /= 2;
            count_bit++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(lowestCommon(14, 25));
    }
}
