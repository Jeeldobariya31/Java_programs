public class HolowSqure {
    public static void main(String[] args) {
        int n = 5,m=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(m+" ");
                     m++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
