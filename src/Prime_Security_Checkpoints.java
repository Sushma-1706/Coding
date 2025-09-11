import java.util.Scanner;
class Prime_Security_Checkpoints{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int val) {
        if(val==2) return true;
        else if (val == 0 || val == 1||val%2==0) return false;
        for(int i=3;i*i<=val;i+=2){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
}