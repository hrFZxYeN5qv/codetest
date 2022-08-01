package Test; 

import java.util.*;

public class TreeSetTest{
    Integer runCount;

    public static void main(String[] arg){
        var tree= new TreeSet<>();

        int[] org={33,44,22,66,-23,4,65,34,86,-2,-99,-43,-84};

        //tree.addAll(org);
        
        for(int n : org){
            tree.add(n);
        } 
        
        System.out.println("all the tree");
        System.out.println(tree);

        System.out.println("First one is "+tree.first());
        System.out.println("Last one is "+tree.last());

        Scanner keyin = new Scanner(System.in);

        int in=0;
        while(true){
            try{
                System.out.print("add your element ");
                in=Integer.parseInt(keyin.nextLine());
            }catch(NumberFormatException ex){
                System.out.println("need input number!");
            }
            if(in == -2){
                break;

            }else{
                if(!tree.add(in)){
                    System.out.println("your input is same as element in tree");
                }
            }
        }
        System.out.println("Now, the tree are:"+tree);

        while(true){
            try{
                System.out.print("Input your number ");
                in=Integer.parseInt(keyin.nextLine());
            }catch(NumberFormatException ex){
                System.out.println("error input , try again");
                continue;
            }

            if(in < (int)tree.first() || in > (int)tree.last()){
                continue;
            }else{
                break;
            }
        }
        System.out.print("equal or bigger then "+in+" are:");
        System.out.println(tree.tailSet(in));
        keyin.close();
    }
}