public class HW_3_c {
    public static void main(String[] args) {
        double salesPercentage = 95.0;
        double attendancePercentage = 100.0;
        int bonus;

        if (salesPercentage >= 95.0 && attendancePercentage >= 100.0) {
            bonus = 60;
        } else if ((salesPercentage >= 95.0 && attendancePercentage >= 90.0) ||
                (salesPercentage >= 80.0 && attendancePercentage >= 100.0)) {
            bonus = 40;
        } else if (salesPercentage >= 80.0 && attendancePercentage >= 90.0) {
            bonus = 20;
        } else {
            bonus = 5;
        }

        System.out.println("Bonus: " + bonus + "%");
    }
}