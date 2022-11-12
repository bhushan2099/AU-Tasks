package math.calculator;

import java.util.LinkedList;

public class AddNumberInString {

    public static void main(String[] args) {

        String numInString = "abc234xyz567";

        LinkedList<String> numStringLinkedList = new LinkedList<>();

        int sum = 0;
        for(int i =0;i<numInString.length();i++){
            if(Character.isLetter(numInString.charAt(i))){
                numStringLinkedList.offer(Character.toString(numInString.charAt(i)));
            }
            else {
                sum = sum+Character.getNumericValue(numInString.charAt(i));
            }
        }

        System.out.println(sum);

        numStringLinkedList.offer(Integer.toString(sum));

        System.out.println(numStringLinkedList);
        for (String ele: numStringLinkedList){
            System.out.println(ele);

        }

    }


}
