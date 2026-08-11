public class HW_3_d {
   public static void main(String[] args) {


    int[] array={10,13,15,17,20,30,60};
    int max=array[0];
    for(int i=0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
    System.out.println("Max Number: "+ max);
}
}