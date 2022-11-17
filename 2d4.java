class md4{
    public static void main(String[] args) {
        int r=3,c=3;
        //int arr[][]=new int[r][c];
        int arr[][]={{1,2,3},{10,20,30},{1,5,3}};
        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=arr[i][j]+10;
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}