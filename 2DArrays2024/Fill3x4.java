public class Fill3x4 {
  public static void main(String[] args) {
    int[][] arr = new int[3][4];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        arr[i][j] = (int) (Math.random() * 10);
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }

    printCoords(arr);
  }

  static void printCoords(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == 5) {
          System.out.println("Coords:\t" + i + "\t" + j);
        }
      }
    }
  }
}
