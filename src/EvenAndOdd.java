import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAndOdd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s = reader.readLine();

            int a = Integer.parseInt(s);
            int b = s.length();

            for (int i=0; i<b; i++) {
                if (a%2==0) even++;
                else odd++;
                a=a/10;
            }

            System.out.println("Even: " +even+ " Odd: " +odd);
        }
    }

