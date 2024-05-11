package Tenary_14;

public class Tenary {
    public static void main(String[] args) {
        System.out.println(ifFunction(8));
        System.out.println(tenaryFunction(8));
        
    }
    // this is a  regular if function that return odd and even number 
    public static String ifFunction(int n){
        if(n%2==0){
            return String.format("the num: %d is even", n);
        }else{
            return String.format("the num: %d is odd", n);
        }
    }
    public static String tenaryFunction(int n){
       return n%2==0? String.format("the num: %d is even", n):String.format("the num: %d is odd", n);
    }
}
