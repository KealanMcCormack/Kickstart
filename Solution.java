import java.util.*;
import java.io.*;
public class Solution { //Solution for Kickstart 2020 round F Question 1
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int x = in.nextInt();

            String order = "";
            LinkedList<person> line = new LinkedList<>();
            for(int count = 0;count < n;count++){
                person p = new person(in.nextInt(), count + 1);
                line.add(p);
            }

            int j = 0;
            while(line.size() > 0){
                line.get(j).cash -= x;
                if(line.get(j).cash <= 0){
                    order = order + line.get(j).position + " ";
                    line.remove(j);
                    j--;
                }
                j++;



                if(j >= line.size()){
                    j = 0;
                }
            }
            System.out.println("Case #" + i + ": " + order.trim());
        }
    }
}

class person{
    int cash;
    int position;

    person(int cash, int position){
        this.cash = cash;
        this.position = position;
    }
}