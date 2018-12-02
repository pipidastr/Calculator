import java.util.ArrayList;
import java.util.Stack;

public class Calculation {

    ArrayList <String> arrayList = new ArrayList<>();


    Stack<String> ops = new Stack<String>();
    Stack<Double> vals = new Stack<Double>(){};



    public void getArrayList(String expression){

        char  arr[] = new char[expression.length()];
        expression.getChars(0, expression.length(), arr, 0);

        String element = "";

        for (int i = 0; i < expression.length(); i++){

            switch (arr[i]){

                case '1':  element +=arr[i];
                    break;

                case '2':  element +=arr[i];
                    break;

                case '3':  element +=arr[i];
                    break;

                case '4':  element +=arr[i];
                    break;

                case '5':  element +=arr[i];
                    break;

                case '6':  element +=arr[i];
                    break;

                case '7':  element +=arr[i];
                    break;

                case '8':  element +=arr[i];
                    break;

                case '9':  element +=arr[i];
                    break;

                case '0':  element +=arr[i];
                    break;

                case '+':{
                    arrayList.add(element);
                    element = "";
                    arrayList.add("+");
                }
                    break;

                case '-':  {
                    arrayList.add(element);
                    element = "";
                    arrayList.add("-");
                }
                    break;

                case '/':  {
                    arrayList.add(element);
                    element = "";
                    arrayList.add("/");
                }
                    break;

                case '*': {
                    arrayList.add(element);
                    element = "";
                    arrayList.add("*");}
                    break;

                case '.':  element +=arr[i];
                    break;

                case '=':
                    arrayList.add(element);
                    break;


            }


        }

        arrayList.add("=");

    }

    public int getPriority (String s ){

       int priority = 0;

       switch (s){

           case "-": priority = 1; break;
           case "+": priority = 1; break;
           case "*": priority = 2; break;
           case "/": priority = 2; break;
       }

       return priority;
    }




    public String expressionValue(){

      for(String element : arrayList){
          if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")){

              if(ops.isEmpty()) ops.push(element);

              else if (getPriority(ops.peek()) >= getPriority(element)) {
                  getСomputation();
                  ops.push(element);
              }

              else if (getPriority(ops.peek()) < getPriority(element)) ops.push(element);



          }

          else if (element.equals("=")) {

              while (!ops.isEmpty()) getСomputation();

          }

          else vals.push(Double.parseDouble(element));

      }
      return vals.peek().toString();

    }


    public void getСomputation(){

        double y = vals.pop();
        double x = vals.pop();
        String op = ops.pop();

        switch (op){

            case "+": vals.push(x+y); break;
            case "-": vals.push(x-y); break;
            case "*": vals.push(x*y); break;
            case "/": vals.push(x/y); break;
        }
    }


}


