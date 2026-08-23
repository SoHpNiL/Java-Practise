import java.io.*;
import java.util.*;

public class A2Q1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String line;
    while ((line = br.readLine()) != null) {
      line = line.trim();
      if (line.isEmpty()) continue; // skip blank lines just in case

      int nextNum = Integer.parseInt(line);
      if (nextNum == 0) {
        break;
      }

      // read table
      double[][] table = new double[nextNum][nextNum];
      for (int j = 0; j < nextNum; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nextNum; i++) {
          table[j][i] = Double.parseDouble(st.nextToken());
        }
      }

      // busy = all absolute traffic values in the row
      double[] busy = new double[nextNum];
      for (int j = 0; j < nextNum; j++) {
        double s = 0;
        for (int i = 0; i < nextNum; i++) {
          s += Math.abs(table[j][i]);
        }
        busy[j] = s;
      }

      // read for new speed (may be on one line)
      double[] speed = new double[nextNum];
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int k = 0; k < nextNum; k++) {
        speed[k] = Double.parseDouble(st.nextToken());
      }
      Arrays.sort(speed);

      // make an array of nextNum size and sort it
      Integer[] sorted = new Integer[nextNum];
      for (int j = 0; j < nextNum; j++) sorted[j] = j;
      Arrays.sort(
          sorted,
          (a, b) -> {
            if (busy[b] != busy[a]) return Double.compare(busy[b], busy[a]);
            return Integer.compare(a, b);
          });

      // assign the fastest speed to busiest router
      double[] assigned = new double[nextNum];
      for (int k = 0; k < nextNum; k++) {
        assigned[sorted[k]] = speed[nextNum - 1 - k];
      }

      for (int j = 0; j < nextNum; j++) {
        if (j > 0) sb.append(' ');

        String numToString; // Change number to string
        if (assigned[j] == Math.floor(assigned[j])) {
          numToString = Long.toString((long) assigned[j]);
        } else numToString = Double.toString(assigned[j]);

        sb.append(j + 1).append('-').append(numToString);
      }
      sb.append('\n');
    }

    System.out.print(sb);
  }
}