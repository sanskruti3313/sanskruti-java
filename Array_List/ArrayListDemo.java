package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruitList=new ArrayList<String>();
        fruitList.add("mango");
        fruitList.add("jackfruit");
        fruitList.add("pineapple");
        fruitList.add("apple");
        fruitList.add("banana");
        System.out.println("list of fruits is:"+fruitList);
        Collections.sort(fruitList);
        System.out.println("after sorting "+fruitList);
        Iterator itr=fruitList.iterator();
        System.out.println("after itreator list is:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }

    }
    
}
