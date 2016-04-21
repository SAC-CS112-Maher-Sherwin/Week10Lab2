
package week10labs;

public class RandomNumber {
        
    int r;
   
    public int getRandomNumber (int number1){
    
        r = 1 + (int) (Math.random() * 6);  
        
        return r;
    }
    
}
