public class Fibonacci {
    public static void main(String[] args){

        int first =  0;
        int second = 1;

        for (int i = 0; i <= 10; i++){
            
            int next = first + second;
            System.out.print(next + ",");
            first = second;
            second = next;
            
        }
    }
}
