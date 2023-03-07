package com.bl.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(9);
        l.add(8);
        l.add(6);
        l.add(2);

        System.out.println("Original List"+l);
       //Map
       List sqr = l.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(sqr);

        //Filter
       List even = l.stream().filter(num-> num % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        l.stream().forEach(t -> System.out.println(t));

        //sorted
        List sort = l.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Pallavi");
//        arrayList.add("Sayali");
//        arrayList.add("Priya");
//        arrayList.add("Nakul");

       //Filter Starts with
        List<String>names = List.of("pallavi","akshay","nayan");
        List<String>names1= names.stream().filter(e->e.startsWith("p")).collect(Collectors.toList());
        System.out.println(names1);

        //map
        List<Integer>number= List.of(2,5,7,3,9);
        List<Integer> list1 =number.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(list1);

//foreach
        names.stream().forEach(e-> System.out.println(e));

//sorted
        number.stream().sorted().forEach(System.out::println);

//min
        Integer integer= number.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min: " + integer);
//max
        Integer in= number.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("max: " + in);



        List<Integer>list= List.of(2,5,7,3,8,2,3);
        //allMatch
        boolean res = list.stream().allMatch(num->num%2==0);
        System.out.println("allMatch result : "+res);

        //anyMatch
        boolean anymatch = list.stream().anyMatch(num->num%2==0);
        System.out.println("Any Match result : "+anymatch);

        //NoneMatch
        boolean nonematch = list.stream().noneMatch(num->num%2==0);
        System.out.println("none match result :"+nonematch);

        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Element : "+distinct);

        //FirstElement
        Optional<Integer> first = list.stream().findFirst();
        System.out.println("First Element : "+first.get());

        //findAnyelement
        Optional<Integer> t = list.stream().findAny();
        System.out.println("Find Any Element : "+t.get());

        System.out.println("PEEK METHOD ");
        list.stream().peek(System.out::println).collect(Collectors.toList());

        //Count the elements of stream
        long count = list.stream().peek(System.out::println).count();
        System.out.println("Count "+count);



    }
}







//    int even1 = list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
//
//        System.out.println(even);