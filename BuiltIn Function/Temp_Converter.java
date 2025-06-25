import java.util.*;
public class Temp_Converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose conversion:\\n" + //
                        "1. Fahrenheit to Celsius\\n" + //
                        "2. Celsius to Fahrenheit");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter Fahrenheit: ");
            double f=sc.nextDouble();
            System.out.println("Celsius:"+fahrenheitToCelsius(f));
        }   else if(choice==2){
            System.out.println("Enter Celsius:");
            double c=sc.nextDouble();
            System.out.println("Fahrenheit: "+celsiusToFahrenheit(c));
        }else{
            System.out.println("Invalid Choice");
        }
    }
    static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
    static double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
}