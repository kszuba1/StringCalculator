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
        // default delimiter is coma
        String delimiter = ",";
        // check if there is custom delimiter
        if (number.startsWith("//")) {
            delimiter = number.substring(2, number.indexOf("\n"));

            // remove delimiter signature
            number = number.substring(number.indexOf("\n") + 1);
        }

        // replace all newLines with delimiter
        number = number.replace("\n", delimiter);

        String[] numbers_list = number.split(delimiter);

        for (String numb : numbers_list){
            sum+=Integer.parseInt(numb);
        }
        return sum;
    }

}
