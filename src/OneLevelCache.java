import javax.swing.JTextField;
import java.util.LinkedList;




public class OneLevelCache {

    LinkedList<String> linkedList = new LinkedList<>();



    public boolean SearchLinkedList (String s, JTextField textField){

        boolean check = false;

        for(int i = 0; i < linkedList.size(); i++){

            if(linkedList.get(i).startsWith(s)) {

                check = true;
                String comp = linkedList.get(i);

                textField.setText(comp);
                linkedList.remove(i);
                linkedList.addFirst(comp);

                System.out.println("взято из кэша 1 уровня");
            }
        }

        return check;
    }


}




