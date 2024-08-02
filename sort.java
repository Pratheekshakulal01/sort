import java.util.Scanner;
class sort{
    public static void bubbleSort(int[] a,int n){
        for(int i=0;i<n-1 ;i++) //n-1
        for(int j=i+1;j<n;j++)  //n(n-1)
          if(a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
          System.out.println("after bubble sort");
          for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        bubbleSort(a,n);
        
    }
}
