package day16;

public class CountFrom10To1 {
    public static void main(String[] args) {
        // i want to start with 10, then increase the value by one
        //so i count get out of the loop
        int count =10;
      //  while (count>=1 ){
      //      System.out.println(count);
        //    --count;
        while (count!=0){
            System.out.println(count);
            --count;
        }
        System.out.println("final value of count" + count);
    }
}
