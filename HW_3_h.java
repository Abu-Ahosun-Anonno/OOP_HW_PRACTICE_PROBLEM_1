public class HW_3_h {
    public static void main(String[] args) {
        int n = 12;
        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(first);
            } else {
                System.out.print(first + ", ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
