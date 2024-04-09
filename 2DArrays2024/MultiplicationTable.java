public class MultiplicationTable {
  public static void main(String[] args) {
    int[][] table = new int[10][10];

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        table[i][j] = i*j;
      }
    }

    for (int i = 0; i < 10; i++) {
      table[0][i] = i;
      table[i][0] = i;
    }

    for (int[] row: table) {
      for (int val: row) {
        System.out.print(val + "\t");
      }
      System.out.println();
    }
  }
}
