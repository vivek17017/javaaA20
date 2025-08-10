package assignments;
import java.util.Scanner;

public class A20 {
    Scanner sc;
    public void driver(){
        f5();
    }
    {
        sc=new Scanner(System.in);
    }
    public void f1()
    {
        int N;
        System.out.println("Enter a length of array: ");
        N=sc.nextInt();
        int []arr=new int[N];
        System.out.println("Enter elements");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public void f2(){
        int N;
        System.out.println("Enter a length of array: ");
        N=sc.nextInt();
        int []arr=new int[N];
        System.out.println("Enter elements");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<N;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("greatest number is "+max);

    }
    public void f3(){
        int N;
        System.out.println("Enter a length of array: ");
        N=sc.nextInt();
        int []arr=new int[N];
        System.out.println("Enter elements");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<N;i++){
            if(arr[i]<max)
                max=arr[i];
        }
        System.out.println("smallest number is "+max);

    }
    public void f4(){
        int N;
        System.out.println("Enter a length of array: ");
        N=sc.nextInt();
        int []arr=new int[N];
        System.out.println("Enter elements");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<N;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum is "+sum);

    }
    public void f5(){
        int N;
        System.out.println("Enter a length of array: ");
        N=sc.nextInt();
        int []arr=new int[N];
        System.out.println("Enter elements");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for (int i=0;i<N;i++){
            sum=sum+arr[i];
        }
        double avg=sum/N;
        System.out.println("average is "+avg);

    }







}

