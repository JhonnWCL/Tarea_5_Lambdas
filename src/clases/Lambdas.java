package clases;
import helper.Print;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas {
    //exercise 1
    public List<String> search(List<String> list){
        Predicate<String> word=s->s.replaceAll("[^a-zA-Z]", "").length()==3&&s.startsWith("a");
        return list.stream().filter(word).collect(Collectors.toList());
    }

    //exercise 2
    public String getString(List<Integer> list){
        return list.stream().map(x->(x%2==0?("e"+x):"o"+x)).collect(Collectors.joining(","));
    }

    //exercise 3
    public String getString3(List<String> list){
        return list.stream().map(x->(x.substring(0, 1))).collect(Collectors.joining(","));
    }

    //exercise 4
    public void getListWordOddLength(List<String> list){
        list=list.stream().filter(x->(x.length()%2==0)).collect(Collectors.toList());
         Print.printList(list);
    }
    //exercise 5
    public void getListWordUpperCase(List<String> list){
        List<String> newList=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        Print.printList(newList);
    }
    //exercise 6
    public String getLStringMap(Map<String, Integer> map){
        Stream<Map.Entry<String, Integer>> list=map.entrySet().stream().sorted(Map.Entry.comparingByKey());
        return list.map(x->x.getKey()+"="+x.getValue()).collect(Collectors.joining(","));
    }
    //exercise 7
    public void threadPrintNL(List<Integer>list, PrintStream out){
        Thread thr=new Thread(()->list.forEach(x->out.print(x+" ")));
        thr.start();
    }
}
