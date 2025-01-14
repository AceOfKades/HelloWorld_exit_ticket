public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("How old are you?");
        System.out.println(getSum(1, 5, 7, 3, 9));
    }

    public static int getSum(int...range){
        int sum = 0;
        for(int num : range) {
            sum += num;
        }
        return sum;
    }
}