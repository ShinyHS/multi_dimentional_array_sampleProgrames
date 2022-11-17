class md10{
    public static void main(String[] args) {
        int r=3,c=3;
        //int arr[][]=new int[r][c];
        int a[]=new int[r];
        int a1[]=new int[c];
        int arr[][]={{1,2,3},{10,20,30},{1,5,3}};
        int x=0,sum=0,b=0;
        for(int i=0;i<r;i++)
        {
            x=0;
            sum=0;
            for(int j=0;j<c;j++)
            {
                a[j]=arr[x][i];
                x++;
            }
            for(int j=0;j<a.length;j++)
            {
                sum=sum+a[j];
            }
            if(sum>b)
            {
                b=sum;
                for(int j=0;j<a.length;j++)
                a1[j]=a[j];
            }
        }
        System.out.println(b);
        for(int i=0;i<a1.length;i++)
        System.out.print(a1[i]+" ");
    }
}