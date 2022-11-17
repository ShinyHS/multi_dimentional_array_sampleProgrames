class md3{
    public static void main(String[] args) {
        int r=3,c=3;
        int sum=0;
        //int arr[][]=new int[r][c];
        /*
         1 2 3 //6
         1 2 3 //6
         1 5 3 //9
         */
        int arr[][]={{1,2,3},{1,2,3},{1,5,3}};
        //  for(int i=0;i<r;i++)
        //  {
        //     sum=0;
        //     for(int j=0;j<c;j++)
        //     {
        //         sum+=arr[i][j];
        //     }
        //     System.out.println(sum);
        //  }
        int x;
        for(int i=0;i<r;i++)
        {
           sum=0;
           x=0;
           for(int j=0;j<c;j++)
           {
               sum+=arr[x][i];
               x++;
           }
           System.out.println(sum);
        }

         
        

    }
}