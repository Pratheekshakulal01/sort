import java.util.Scanner;
class sort{
    public static void bubbleSort(int[] a,int n){
        for(int i=0;i<n-1 ;i++)  //n-1
        for(int j=i+1;j<n;j++)   //n(n-1)
          if(a[i]>a[j]){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
          System.out.println("after bubble sort");
          for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
        }   
    public static void selectionSort(int[] a,int n){
        int min;
        for(int i=0;i<n;i++){
            min=i;
        for(int j=i+1;j<n;j++){
            if(a[min]>a[j])
            min=j;
            }
        
        int temp=a[i];
        a[i]=a[min];
        a[min]=temp;
        }
        System.out.println("after selection sort");
          for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
    }
    public static void insertionSort(int[]a,int n){
        for(int i=1;i<n;i++){
            int ce=a[i];
            int j=i-1;
                while(j>=0&&ce<=a[j]){
                    a[j+1]=a[j];
                    j--;
                    }
                     a[j+1]=ce;
           }
         System.out.println("after insertion sort");
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
        System.out.println("\n1.bubble sort\n2.selection sort\n3.insertion sort\n4.exit");
        while(true){
        System.out.println("\nenter ur choice");
        int ch =sc.nextInt();
        switch(ch){
            case 1:bubbleSort(a,n);
            break;
            case 2:selectionSort(a,n);
            break;
            case 3:insertionSort(a,n);
            break;
            case 4:System.exit(0);
            break;
            default:System.out.println("invalid choice");
            break;
        }
        }
        
        
    }
}
