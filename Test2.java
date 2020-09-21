import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        CashRegister cashRegister = new CashRegister();
        while ((line = in.readLine()) != null) {
            cashRegister.calculateChange(line.split(";"));
        }
    }
    static class CashRegister{
        public void calculateChange(String[] numbers){
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.CEILING);

            double pp = Double.parseDouble(numbers[0]);
            double ch = Double.parseDouble(numbers[1]);
            double change = ch - pp;
            ArrayList<String> changeStrings = new ArrayList<String>();


            if(ch < pp)
                System.out.println("ERROR");
            else if(ch == pp)
                System.out.println("ZERO");
            else {
                while((int) change >= 100){
                    changeStrings.add("ONE HUNDRED");
                    change -= 100;
                }
                while((int) change >= 50){
                    changeStrings.add("FIFTY");
                    change -= 50;
                }
                while((int) change >= 20){
                    changeStrings.add("TWENTY");
                    change -= 20;
                }
                while((int) change >= 10){
                    changeStrings.add("TEN");
                    change -= 10;
                }
                while((int) change >= 5){
                    changeStrings.add("FIVE");
                    change -= 5;
                }
                while((int) change >= 2){
                    changeStrings.add("TWO");
                    change -= 2;
                }
                while((int) change >= 1){
                    changeStrings.add("ONE");
                    change -= 1;
                }
                while((float) change >= 0.5){
                    changeStrings.add("HALF DOLLAR");
                    change -= 0.5;
                }
                while((float) change >= 0.25){
                    changeStrings.add("QUARTER");
                    change -= 0.25;
                }
                while((float) change >= 0.1){
                    changeStrings.add("DIME");
                    change -= 0.1;
                }
                while((float) change >= 0.05){
                    changeStrings.add("NICKEL");
                    change -= 0.05;
                }
                while(Double.parseDouble(decimalFormat.format((float) change - 1e-4)) >= 0.01){
                    changeStrings.add("PENNY");
                    change -= 0.01;
                }
            }

            Collections.sort(changeStrings);

            for(int i = 0; i < changeStrings.size(); i++){
                if(!(i == changeStrings.size()-1))
                    System.out.println(changeStrings.get(i) + ",");
                else
                    System.out.println(changeStrings.get(i));
            }

        }

    }
}