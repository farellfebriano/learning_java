package String_35;

public class StringS {
    public static void main(String[] args) {
        /*
         * in general string is a imutable.
         * once the string is set to variable, it cant be changed.
         * when we iterate the name with febriano, farell is not actually
         * gone from the memory but it create new object and the "name" variable 
         * reference that new object in the memory
         */
        
        String name = "farell";
        name += " febriano";
        System.out.println(name);

        String s1="g";
        String s2="g";
        System.out.println(s1==s2);

        /*
         * StringBuffer Vs StringBuilder
         * 
         * StringBuffer --> it is not thread safe. all of the method is 
         * not synchronized
         * 
         * StringBuilder --> it is thread safe. All of its methods are 
          synchronized, meaning it's safe to use in a multithreade 

         * Basically saying that if the using The same string builder object will 
         * technically, the instance will actually overide eachother
         */
        StringBuffer thread1=new StringBuffer();
        StringBuffer thread2=new StringBuffer();
        thread1.append("farell");
        thread1.append("febriano");
        thread2.setLength(0);
        System.out.println("thread1 after clearing thread 2:" + thread1.toString() + thread2.toString());

        
    }

}
