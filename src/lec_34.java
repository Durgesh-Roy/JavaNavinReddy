public class lec_34 {
    public static void main(String[] args) {
        //Jagged array
        int nums[][]=new int[3][];
        nums[0]=new int[3];
        nums[1]=new int[4];
        nums[2]=new int[1];
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
        for(int a[]:nums){
            for(int num:a){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}