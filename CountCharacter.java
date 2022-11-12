package math.calculator;

public class CountCharacter {

    public static void main(String[] args) {

        String name = "bbbbhuushhannnn";

        int maxCount=0;
        int index=0;

        for(int i = 0;i<name.length();i++){

            int count = 0;

            for(int j=0;j<name.length();j++){
                if(name.charAt(j)==name.charAt(i)) {
                    count += 1;
                }
            }

            if(count>maxCount){
                maxCount = count;
                index = i;

            }
        }

        System.out.println(name.charAt(index)+" "+maxCount);

    }
}
