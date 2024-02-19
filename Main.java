 package LumacangActivity2;

 
public class Main {

  
    public static void main(String[] args) {
      
        int[] numbers = {8, 22, 23, 30, 143};
        
        System.out.println("Arrays: " + numbers [0]);
        System.out.println("Arrays: " + numbers [1]);
        System.out.println("Arrays: " + numbers [2]);
        System.out.println("Arrays: " + numbers [3]);
        System.out.println("Arrays: " + numbers [4]);
        
        int summation = numbers [0] + numbers [1] + numbers [2] + numbers [3] + numbers [4];
        System.out.println("Sum of all arrays: " + summation);
        
        int maximum = Math.max(numbers [0], Math.max(numbers [1], Math.max(numbers [2], Math.max(numbers [3], numbers [4]))));
        System.out.println("Maximum value: " + maximum);
       
                  }
    
}
