package main;

public class StringCalculator {

    private StringCalculator(){
    }

    public static int add(String number) {

        // if null or empty return 0
        if (number == null || number.isEmpty()) {
            return 0;
        }

//        // avoid more than 2 elements in argument
//        if (number.length() - number.replace(",", "").length()>1) {
//            throw new RuntimeException();
//        }

        int sum=0;

        String[] numbers_list = number.split(",");

        for (String numb : numbers_list){
            sum+=Integer.parseInt(numb);
        }
        return sum;
    }

}
