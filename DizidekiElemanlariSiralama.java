import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz: ");
        int n = input.nextInt();
        int[] numbers =new int[n];
        for(int i = 0; i <numbers.length; i++){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Dizinin "+ (i+1) +". elemani : ");
            int n1 = input.nextInt();
            numbers[i] = n1;
        }


        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));





    }

}
