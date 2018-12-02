import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class TwoLevelСache {

    ArrayList<String> arrayList = new ArrayList<>();

    public boolean SearchArrayList (String s, JTextField textField, LinkedList<String> linkedList){

        boolean check = false;

        for(int i = 0; i < arrayList.size(); i++){

            if(arrayList.get(i).startsWith(s)) {

                check = true;
                String s2 = arrayList.get(i);
                String lastLinkedList = linkedList.getLast();
                linkedList.removeLast();
                linkedList.addFirst(s2);
                arrayList.remove(i);
                arrayList.add(0,lastLinkedList);
                textField.setText(s2);

                System.out.println("взято из кэша 2 уровня");
            }
        }

        return check;
    }

}
