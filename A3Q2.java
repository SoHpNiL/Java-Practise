import java.io.*;
import java.util.*;

public class A3Q2 {
    static final int lengthOfTable = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[] table = new boolean[lengthOfTable];
        int stored = 0;

        String line;
        while ((line = nextNonBlank(reader)) != null) {
            int n = Integer.parseInt(line.trim());
            if (n == 0) {
                break;
            }

            int[] deg = new int[n];
            for (int i = 0; i < n; i++) {
                String adj = reader.readLine();
                if (adj == null) {
                    adj = "";
                } else {
                    adj = adj.trim();
                }
                if (adj.isEmpty()) {
                    deg[i] = 0;
                } else {
                    deg[i] = adj.split("\\s+").length;
                }
            }
            Arrays.sort(deg);

            StringBuilder ds = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                ds.append(deg[i]);
            }

            if (stored == lengthOfTable) {
                continue;
            }
            String s = ds.toString();
            int pos = h1(s);
            int step = h2(s);
            while (table[pos]) {
                pos = (pos + step) % lengthOfTable;
                if (step > 1) {
                    step--;
                }
            }
            table[pos] = true;
            stored++;
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < lengthOfTable; i++) {
            if (table[i]) {
                output.append('1');
            } else {
                output.append('0');
            }
            output.append('\n');
        }
        System.out.print(output);
    }

    // returns either next line or null if empty or no next lines
    static String nextNonBlank(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                return line;
            }
        }
        return null;
    }

    // Find hashvalue from middle three digits of degree sequence
    static String findMiddleDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        // If even or less than three add a 0 to ensure we can identify middle numbers
        while (sb.length() < 3 || sb.length() % 2 == 0) {
            sb.append('0');
        }

        int start = (sb.length() - 3) / 2;
        return sb.substring(start, start + 3); // middle values
    }

    static int h1(String ds) {
        int d = Integer.parseInt(findMiddleDigits(ds));
        
        // square d for hashvalue
        return Integer.parseInt(findMiddleDigits(Integer.toString(d * d)));
    }

    // Find first three digits of DS plus one
    static int h2(String ds) {
        StringBuilder sb = new StringBuilder(ds);
        // If length is less than three keep adding 0 to the front
        while (sb.length() < 3) {
            sb.insert(0, '0');
        }
        return Integer.parseInt(sb.substring(0, 3)) + 1;
    }
}