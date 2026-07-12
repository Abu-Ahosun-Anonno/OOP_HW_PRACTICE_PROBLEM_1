public class practice_problem_2_b {
    public static void main(String[] args){
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i1 = 2;
        while (i1 <= 20) {
            System.out.print(i1 + " ");
            i1 += 2;
        }
        System.out.println();

        int i2 = 2;
        do {
            System.out.print(i2 + " ");
            i2 += 2;
        } while (i2 <= 20);
        System.out.println();

        for (int j = 1; j <= 19; j += 2) {
            System.out.print(j + " ");
        }
        System.out.println();

        int j1 = 1;
        while (j1 <= 19) {
            System.out.print(j1 + " ");
            j1 += 2;
        }
        System.out.println();

        int j2 = 1;
        do {
            System.out.print(j2 + " ");
            j2 += 2;
        } while (j2 <= 19);
        System.out.println();

        int sumFor1 = 0;
        for (int k = 2; k <= 20; k += 2) {
            sumFor1 += k;
        }
        System.out.println(sumFor1);

        int sumWhile1 = 0, k1 = 2;
        while (k1 <= 20) {
            sumWhile1 += k1;
            k1 += 2;
        }
        System.out.println(sumWhile1);

        int sumDoWhile1 = 0, k2 = 2;
        do {
            sumDoWhile1 += k2;
            k2 += 2;
        } while (k2 <= 20);
        System.out.println(sumDoWhile1);

        int sumFor2 = 0;
        for (int m = 1; m <= 19; m += 2) {
            sumFor2 += m;
        }
        System.out.println(sumFor2);

        int sumWhile2 = 0, m1 = 1;
        while (m1 <= 19) {
            sumWhile2 += m1;
            m1 += 2;
        }
        System.out.println(sumWhile2);

        int sumDoWhile2 = 0, m2 = 1;
        do {
            sumDoWhile2 += m2;
            m2 += 2;
        } while (m2 <= 19);
        System.out.println(sumDoWhile2);


    }
}
