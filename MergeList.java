package Genarate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String [] args){
        List<Integer>prime=new ArrayList<>(Arrays.asList(2,3,5));
        System.out.println("First List"+prime);

        List<Integer>even=new ArrayList<>(Arrays.asList(4,6));
        System.out.println("Second List"+even);

        List<Integer>odd=new ArrayList<>(Arrays.asList(3,5));
        System.out.println("Third List"+odd);

        List<Integer>lessFive=new ArrayList<>(Arrays.asList(4,3,2,1));
        System.out.println("Fourth List"+lessFive);

        Stream<Integer>list1=prime.stream();
        Stream<Integer>list2=even.stream();
        Stream<Integer>list3=odd.stream();
        Stream<Integer>list4=lessFive.stream();
        Stream<Integer> merged = Stream.concat(list1, list2);
        Stream<Integer>merged2=Stream.concat(list3,list4);


        // convert the merged stream into list
        List<Integer> numbers = merged.collect(Collectors.toList());
        List<Integer> numbers2=merged2.collect(Collectors.toList());

        System.out.println("Merged List: " + numbers);
        System.out.println("Merged Second List:"+numbers2);

    }
}

