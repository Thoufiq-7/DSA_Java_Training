import java.util.*;

class HummingDist {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = x^y;
        System.out.print(Integer.bitCount(ans));
    }
}
