package math.calculator;

import java.util.LinkedList;

public class AddZerosAtEnd {

    public static void addZerosAtEnd(int[] arr){

        LinkedList<Integer> list = new LinkedList<>();

        int countOfZeros=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                countOfZeros+=1;
            }
            else{
                list.offer(arr[i]);
            }
        }
        for(int j =0;j<countOfZeros;j++){
            list.offer(0);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] numsArray = {-1,2,4,-6,0,8,0,12,3,-6};

        addZerosAtEnd(numsArray);

    }
}
