package math.calculator;

import java.util.ArrayList;

public class _AblsentLeastPositiveNumInArray {

    public static void checkLeastAbsentPositiveNum(int[] arr){

        ArrayList<Integer> myArrayList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            myArrayList.add(arr[i]);
        }
        int x=0;
        for(int j = 1; j<= myArrayList.size(); j++){

            if(!myArrayList.contains(j)){
                System.out.println(j);
                x=1;
                break;
            }

        }
        if(x==0){
            System.out.println(myArrayList.size()+1);
        }

    }

    public static void main(String[] args) {

        int[] myarr = {1,-2,-3, -4,-5, -6, -7, -8};
        checkLeastAbsentPositiveNum(myarr);


    }
}
