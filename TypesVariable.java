/* Types of variable and Scope of variable 
   instance varible, default value of int is 0 */ 

class sample1 {
    int i;  

    public static void main(String... args) {
        int j = 10; 
        sample1 s = new sample1();
        System.out.println("j value is " + j);   
        System.out.println("i value is " + s.i); 
    }
}

