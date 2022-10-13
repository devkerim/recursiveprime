import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner intscanner = new Scanner(System.in);
        int a ;
        System.out.println("Sayı giriniz: ");
        a = intscanner.nextInt();
        boolean t = isprime(a,2);
        if(t==true){System.out.println("Sayı asaldır");}
        else{System.out.println("Sayı asal değildir.");}

    }
    static boolean isprime(int a,int i){
        if(a<=1){return false;}
        if(a==2){return true;}
        if(a%i==0){return false;}
        if(i*i>a){return true;}

        return isprime(a,i+1);

    }
}
