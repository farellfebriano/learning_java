class Create_object{
    /**
     * in this project, we want to create 2 simple 
     * class create an object
     */
    public static void main(String [] a){
        /**
         * creating a Calculator instance so then we can use 
         * the addition method
         */
        int result;
        Calculator calculator = new Calculator();
        result=calculator.addition(1, 2);
        System.out.println(result);
        
    
    }
}

class Calculator{
    public int addition(int num1, int num2){
        return num1+num2;
    }
}