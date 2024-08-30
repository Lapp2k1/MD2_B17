package BT4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer");
        List<Integer> list = new ArrayList<Integer>();

        String str = "abc123";
        String[] strs = str.split("");

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < strs.length; i++) {
            try{
                list.add(Integer.parseInt(strs[i]));
            }catch (NumberFormatException e){
                list.add(0);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}