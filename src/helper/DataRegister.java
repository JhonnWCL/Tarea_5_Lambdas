package helper;

import java.util.*;

public class DataRegister {
    public static List<String> getListEjercice1(){
        return  new ArrayList<>(Arrays.asList("alcohol", "ala", "aword","a  l   r","a123;sd  % .","a2 ls"));
    }
    public static List<Integer> getListEjercice2(){
        return  new ArrayList<>(Arrays.asList(2,21,5,2,11));
    }
    public static List<String> getListEjercice3(){
        return  new ArrayList<>(Arrays.asList("hola", "mundo", "java"));
    }
    public static List<String> getListEjercice4(){
        return  new ArrayList<>(Arrays.asList("holas", "como", "esta","usted"));
    }
    public static List<String> getListEjercice5(){
        return  new ArrayList<>(Arrays.asList("holA", "mundo", "Cbba"));
    }
    public static Map<String, Integer> getListEjercice6(){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("key1",1);map.put("key3",3);map.put("key2",2);map.put("key4",4);
        return  map;
    }
    public static List<Integer> getListEjercice7(){
        return  new ArrayList<>(Arrays.asList(2,21,5,2,11));
    }
}
