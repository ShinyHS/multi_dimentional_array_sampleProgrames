class md9{
    public static void main(String[] args) {
        int r=3,c=3;
        //int arr[][]=new int[r][c];
        int arr[][]={{1,2,3},{10,20,30},{1,5,3}};
        //int[] b;
        int ba[]=new int[3];
        int sum=0;
        int b=1000;
        for(int i=0;i<r;i++)
        {
            sum=0;
            int a[]=arr[i];
            for(int j=0;j<a.length;j++)
            {
                sum=sum+a[j];
            }
            if(sum<b)
            {
                b=sum;
                for(int j=0;j<a.length;j++)
                ba[j]=a[j];
            }
          
        }
        System.out.println(b);
        for(int k=0;k<ba.length;k++)
        System.out.print(ba[k]+" ");
    }

}