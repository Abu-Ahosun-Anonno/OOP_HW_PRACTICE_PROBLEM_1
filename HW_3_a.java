public class HW_3_a {
   public static void main(String[] args) {
        double[] numbers={13.7,14.2,15.9,20.1,13.2};
        double sum=0.0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        double average=sum/numbers.length;
       System.out.println(average);
    }
}
