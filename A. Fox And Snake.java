import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                // Odd rows are completely filled with '#'
                for (int j = 0; j < m; j++) {
                    result.append('#');
                }
            } else {
                // Even rows alternate the position of '#'
                if (i % 4 == 2) {
                    // '#' at the end
                    for (int j = 0; j < m - 1; j++) {
                        result.append('.');
                    }
                    result.append('#');
                } else {
                    // '#' at the start
                    result.append('#');
                    for (int j = 0; j < m - 1; j++) {
                        result.append('.');
                    }
                }
            }
            result.append('\n');
        }
        
        System.out.print(result);
        sc.close();
    }
}
