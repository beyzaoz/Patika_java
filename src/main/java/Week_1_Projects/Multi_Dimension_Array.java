package Week_1_Projects;

public class Multi_Dimension_Array {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = 0;
        for( int i =0;i< matrix.length;i++){ //Satirlari temsil eder.
            for(int j = 0; j< matrix[i].length;j++){ //Sutunlari temsil eder.
                if (i == j){
                    sum+=matrix[i][j];

                }

            }
        }
        System.out.println("SUM= " + sum);
    }
}
