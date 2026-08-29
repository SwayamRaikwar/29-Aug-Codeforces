import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine().trim());
        long totalFaces = 0;
        
        for (int i = 0; i < n; i++) {
            String name = br.readLine().trim();
            
            // Checking the first character is faster than full string comparison
            switch (name.charAt(0)) {
                case 'T':
                    totalFaces += 4;
                    break;
                case 'C':
                    totalFaces += 6;
                    break;
                case 'O':
                    totalFaces += 8;
                    break;
                case 'D':
                    totalFaces += 12;
                    break;
                case 'I':
                    totalFaces += 20;
                    break;
            }
        }
        
        System.out.println(totalFaces);
    }
}
