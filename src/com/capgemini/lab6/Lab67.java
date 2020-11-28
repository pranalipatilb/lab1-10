package com.capgemini.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab67 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        //        System.out.println("Enter number of students:");
        //        int size= Integer.parseInt(scanner.nextLine());
        //        //fixed-size, cannot be expanded nor decreased
        //        String names[]= new String[size];

 

        //default capacity: 10
        //memory is allocated to hold 10 references of type, String
        //default capacity increment : 50%
        //Back-end data structure for ArrayList is 
        //contiguous block of memory
        //        List<String> namesList= new ArrayList<>();
        //        namesList.add(new String("Virat Kohli"));
        //        namesList.add(new String("Rohit Sharma"));
        //        namesList.add(new String("Mahesh Singh Dhoni"));
        //        
        //        System.out.println(namesList.size());
        //        System.out.println(namesList.get(0));
        //        namesList.add(0, "Hardik Pandya");
        //        System.out.println(namesList.get(0));
        //        System.out.println(namesList.size());
        //        namesList.set(1, "Bill Gates");
        //        System.out.println(namesList.size());
        //        Iterator<String> iterator= namesList.iterator();
        //        while(iterator.hasNext()) {
        //            String name= iterator.next();
        //            if(name.equals("Rohit Sharma")) {
        //                iterator.remove();
        //            }
        //            System.out.println(name);
        //        }
        //        System.out.println("-------------------");
        //        iterator= namesList.iterator();
        //        while(iterator.hasNext()) {
        //            System.out.println(iterator.next());
        //        }
        //        
        //        System.out.println(namesList.size());
        //        
        //        ListIterator<String> listIterator= 
        //                        namesList.listIterator();
        //        
        //        while(listIterator.hasNext()) {
        //            System.out.println(listIterator.next());
        //        }
        //        System.out.println("In reverse order...");
        //        while(listIterator.hasPrevious()) {
        //            System.out.println(listIterator.previous());
        //        }
        //        
        //        namesList.add("Hardik Pandya");
        //        System.out.println(namesList.size());
        //        for(int i=0; i<namesList.size();i++) {
        //            System.out.println(namesList.get(i));
        //        }

 

        Integer [] list= new Integer[4];
        list[0]=205;
        list[1]=115;
        list[2]=501;
        list[3]=101;
        int status=getSorted(list);
        if(status==1) {
            for(Integer m: list) {
                System.out.println(m);
            }
        }else {
            System.out.println("Unable to sort");
        }
        
        
        Integer checkList[]= getSortedAgain();
        
        for(Integer m: checkList) {
            System.out.println(m);
        }

 

    }
    private static Integer[] getSortedAgain() {
        Integer [] list= new Integer[4];
        list[0]=205;
        list[1]=115;
        list[2]=501;
        list[3]=101;
        String [] reverseNumbers = new String[list.length];

 

        for(int i=0;i<list.length;i++) {
            reverseNumbers[i]= list[i].toString();
            StringBuffer sb= new StringBuffer(reverseNumbers[i]);
            reverseNumbers[i]=sb.reverse().toString();
            list[i]= Integer.parseInt(reverseNumbers[i]);

 

        }        

 

        Arrays.sort(list);
        return list;
    }
    
    
    private static int getSorted(Integer[] list) {

 

        String [] reverseNumbers = new String[list.length];

 

        for(int i=0;i<list.length;i++) {
            reverseNumbers[i]= list[i].toString();
            StringBuffer sb= new StringBuffer(reverseNumbers[i]);
            reverseNumbers[i]=sb.reverse().toString();
            list[i]= Integer.parseInt(reverseNumbers[i]);

 

        }        

 

        Arrays.sort(list);
        return 1;
    }

 

}