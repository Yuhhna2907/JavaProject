public class FindMax2DArray {
    public static void main(String[] args) {
        int[][]array={
                {12,7,9,5,15},
                {8,22,3,10,6},
                {14,18,30,2,11},
                {4,17,25,36,19},
                {9,20,16,1,23}
        };
        int max=array[0][0];
        int row=0;
        int col=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println("Max value is "+max+" at position ["+ row +"][" + col + "]");
    }
}
