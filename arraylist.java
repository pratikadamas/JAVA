//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> mark=new ArrayList<Integer>();
        mark.add(56);
        mark.add(78);
        mark.add(78);
        mark.add(25);
        System.out.println("get marks at index 2 "+mark.get(0));
        System.out.println("removes marks at index 1 "+mark.remove(1));
        for(int x:mark){
            System.out.println(" "+x);
        }
        System.out.println("after sorting marks a");
        Collections.sort(mark);
        for(int x:mark){
            System.out.println(" "+x);
        }
        System.out.println("in reverse order marks ");
        Collections.reverse(mark);
        for(int x:mark){
            System.out.println(" "+x);
        }

       int  arr[]={2,5,6,1,0};
        Arrays.sort(arr);
        for(int x:arr){
            System.out.println(" "+x);
        }
    }
}
