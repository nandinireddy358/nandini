import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Queue{

public static void main(String[] args) throws IllegalStateException {
            Queue<Integer>Q=new LinkedList<>();
            Q.add(1);
            Q.add(2);
            Q.add(3);
            Q.add(4);
            Q.add(5);
            Q.add(6);
            Q.add(7);
            Q.add(8);
            Q.add(9);
            Q.add(10);
            System.out.println("Queue:"+Q);
            int n;
            System.out.println("how many elements do you want to remove:");
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int i;
            for(i=1;i<=n;i++){
                System.out.println(Q.remove());
            }
            int[] removedElements=new int[n];
            for ( i = 0; i<n; i++){
                removedElements[i]=Q.remove();
            }
            System.out.print(Arrays.toString(removedElements));
        }
    }
