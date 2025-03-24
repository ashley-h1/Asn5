import java.util.ArrayList;
public class Asn5{
    public static void main(String[] args){
        ArrayList<String> stringArr = new ArrayList<String>();
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        stringArr.add("One");
        stringArr.add("Two");
        stringArr.add("Four");
        stringArr.add("Three");
        for (String i : stringArr){
            System.out.println(i);
        }
        stringArr.set(2, "Three");
        stringArr.set(3, "Four");
        for (String i : stringArr){
            System.out.println(i);
        }
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        for (int i : intArr){
            System.out.println(i);
        }
        stringArr.clear();
        System.out.println("Is stringArr empty? " + stringArr.isEmpty());
        //add everything in intarr
        int x = 0;
        for (int i = 0; i < intArr.size(); i++){
            x += intArr.get(i);
        }
        System.out.println(x);
        System.out.println("Does intArr have 5? " + intArr.contains(5));
        //multiply everything in intarr
        x = 1;
        for (int i = 0; i < intArr.size(); i++){
            x *= intArr.get(i);
        }
        System.out.println(x);
        intArr.replaceAll(n -> n*5);
        System.out.println("Does intArr have 5? " + intArr.contains(5));
    }
}