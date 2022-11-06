import java.util.*;

class HighestLowest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] arr = new long[N];
        for(int i=0;i<N;++i) arr[i] = scan.nextLong();
        scan.close();

        Arrays.sort(arr);
        ArrayList<Long> list = new ArrayList<>();
        
        int f=0,b=N;
        for(int i=0;i<N;++i)
        {
            if(i%2==0)
            {
                list.add(arr[--b]);
            }
            else
            {
                list.add(arr[f++]);
            }
        }
        for(long i:list) System.out.print(i+" ");
    }
}