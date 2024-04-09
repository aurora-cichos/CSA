public class Fill3x5 {
  public static void main(String[] args) {
    int[][] arr = new int[3][5];
    int num = 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 5; j++) {
        arr[i][j] = num;
        System.out.print(arr[i][j] + "\t");
        num++;
      }
      System.out.println();
    }

    int totalSum = 0;

    for (int i = 0; i < 3; i++) {
      int sum = 0;
      for (int j = 0; j < 5; j++) {
        sum += arr[i][j];
        totalSum += arr[i][j];
      }
      System.out.println("Row " + i + " total is " + sum);
    }

    for (int i = 0; i < 5; i++) {
      int sum = 0;
      for (int j = 0; j < 3; j++) {
        sum += arr[j][i];
      }
      System.out.println("Column " + i + " total is " + sum);
    }

    System.out.println("Sum total of array is " + totalSum);
  }
}
