class md2{
    public static void main(String[] args) {
        int r=3,c=3;
        //int arr[][]=new int[r][c];
        int arr[][]={{1,2,3},{1,2,3},{1,5,3}};
         
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                // if(i==j)
                // {
                //     arr[i][j]=0;
                // }
                if(i+j==r-1)
                {
                    arr[i][j]=0; 
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                 System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }

    }
}