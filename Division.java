import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        int k,addition=0,loop=0;
        double average;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        k=input.nextInt();

       for (int i=0; i<=k;i++){
           if (i%3==0 && i%4==0){
               loop++;
               addition+=i;
               System.out.println(i);
           }

       }
       average= (double) loop /addition;
        System.out.println(average);
    }
}
