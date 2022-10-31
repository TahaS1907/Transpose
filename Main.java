public class Main {
    public static void main(String[] args) {

        int[][] matrix={{1,2,3,5},{8,3,6,7}};
        int[][] size=new int[4][2];
        for(int i=0;i<size.length;i++){
            for(int j=0;j< matrix.length;j++){
                size[i][j]=matrix[j][i];

            }

        }for (int row = 0; row < size.length; row++) {
            for (int column = 0; column < size[row].length; column++) {
                System.out.print(size[row][column] + " ");
            }
            System.out.println();
        }

    }
}