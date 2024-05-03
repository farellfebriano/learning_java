class Switch{
    public static void main(String[]a){
        Switch.whatDay(11);
        System.out.println(Switch.whatDayNew(11));
        
    }

    static void whatDay(int num){

        /*
         * this is an old way to do the switch statement, 
         * if the there are no return statement taht is 
         * specified, we need to use break or return statement
         * to stop the matching session
         * 
         * swith statement also allows to have mulltiple statement
         * under one case. like the ( case 1,11 ). These exaplme
         * allow multiple if in one case 
         */
        switch (num) {
            case 1,11:
               System.out.println("it is monday");
               break;
            case 2:
                System.out.println("it is tuesday");
                break;
            case 3:
                System.out.println("it wednesday");
                break;
            case 4:
                System.out.println("it thursday");
                break;
            case 5:
                System.out.println("it friday");
                break;
            case 6:
                System.out.println("it saturday");
                break;
            case 7:
                System.out.println("it sunday");
                break;
            default:
                System.out.println("the number is to big x must <= 7");
                break;
        }
    }
    /**
     * in this new looks of the switch statement 
     * we can omit the break and instead use the arrow 
     * that acts as break 
     * 
     * we can also assign the switch result into variable 
     * like what we do in example bellow. 
     */

    static String whatDayNew(int num){
        String result="";

        result=switch (num) {
            case 1,11 -> "it is monday";
            case 2 ->"it is tuesday";
            case 3 -> "it wednesday";
            case 4 -> "it thursday";
            case 5 -> "it friday";
            case 6 -> "it saturday";
            case 7 -> "it sunday";
            default -> "the number is to big x must <= 7";
        };
        return result;
    }
    
}