import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayRange {
    public static int[] subArrayCalc(int arr[],int s,int r){
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=s;i<=r;i++)
        {
            list.add(arr[i]);
        }
        int resut[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            resut[i]=list.get(i);
        }
        return resut;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sie of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the start Index ");
        int s=sc.nextInt();
        System.out.println("Enter the end Index ");
        int e=sc.nextInt();
        int res_array[]=subArrayCalc(arr,s,e);
        for(int i=0;i<res_array.length;i++){
            System.out.println(res_array[i]);
        }
    }
}