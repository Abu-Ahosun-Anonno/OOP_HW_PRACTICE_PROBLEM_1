public class HW_3_e {
  public  static void main(String[] args) {
      int number=23;
      boolean prime=true;
      if(number<2){
          System.out.println("Not Prime");
      }
       else{
           for(int i=2;i*i<=number;i++){
               if(number%i ==0){
                   prime=false;
                   break;
               }
           }
      }
       if(prime){
           System.out.println("Prime");
       }
       else{
           System.out.println("Not Prime");
       }
    }
}
