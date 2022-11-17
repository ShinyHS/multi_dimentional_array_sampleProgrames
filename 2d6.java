class md6{
    public static void main(String[] args) {
        int r=3,c=3;
        //int arr[][]=new int[r][c];
        int arr[][]={{1,2,3},{10,20,30},{1,5,3}};//0,0 1,0 2,0 0,1,1,1
        int arr1[][]=new int[r][c];
        int a[]=new int[3];
        int x=0;
        for(int i=0;i<r;i++)
        {
            x=0;
            for(int j=0;j<c;j++)
            {
                a[j]=arr[x][i];
                x++;
            }
            // for(int j=0;j<3;j++)
            // {
            //     arr1[i][j]=a[j];
            // }
            for(int j=0;j<a.length-1;j++)
            {
                for(int k=0;k<a.length-1;k++)
                {
                    if(a[k]>a[k+1])
                    {
                        int t=a[k];
                        a[k]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            int y=0;
            for(int j=0;j<3;j++)
            {
                arr1[y][i]=a[j];
                y++;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr1[i][j]+" "); 
            }
            System.out.println();
        }
    }
}