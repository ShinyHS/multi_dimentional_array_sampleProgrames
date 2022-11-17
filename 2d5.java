class md5{
    public static void main(String[] args) {
        int r=3,c=3;
        //int arr[][]=new int[r][c];
        int arr[][]={{3,2,3},{10,20,30},{1,5,3}};
        int arr1[][]=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++)
        {
            int a[]=arr[i];
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
            arr1[i]=a;
            // for(int j=0;j<c;j++)
            // {
            //     System.out.print(a[j]+" ");
            // }
            // System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr1[i][j]+" "); 
            }
            System.out.println();
        }
        
    }
}