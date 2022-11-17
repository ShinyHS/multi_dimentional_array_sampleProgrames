class md7{
    public static void main(String[] args) {
        int r=3,c=3;
        //int arr[][]=new int[r][c];
        int arr[][]={{1,2,3},{10,20,30},{1,5,3}};
        int small=arr[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]<small)
                {
                    small=arr[i][j];
                }
            }
        }
        System.out.println("small "+small);
        int big=arr[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]>big)
                {
                    big=arr[i][j];
                }
            }
        }
        System.out.println("big "+big);
    }
}