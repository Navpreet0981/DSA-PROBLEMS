
public class get_ithBit {
    public static void getith(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n & (1 << i));
        }
    }

    public static int setith(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static int clearithBit(int n, int i) {
        return n & (~(1 << i));
    }

    public static int updateithbit(int n, int i, int newBit) {
        n = (n & (~(1 << i)));
        return n | newBit << i;

    }

    public static int clearbitsInRange(int n, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;
        return n & (a | b);
    }

    public static boolean ispoweroftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countsetBit(int n) {
        int count = 0;
        for (int i = n; i > 0; i++) {
            if ((n & 1) != 0) {
                count++;

            }
            n = (n >> 1);
        }
        return count;
    }

    public static int exponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        getith(5);

        System.out.println(setith(5, 1));

        System.out.println(clearithBit(14, 1));

        System.out.println(updateithbit(10, 2, 1));

        System.out.println(clearbitsInRange(10, 1, 2));

        System.out.println(ispoweroftwo(4));
        System.out.println(ispoweroftwo(3));

        System.out.println(countsetBit(15));

        System.out.println(exponentiation(5, 100));
    }

}
