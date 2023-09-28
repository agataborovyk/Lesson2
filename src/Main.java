import java.util.Random;


public class Main {
    public static void main(String[] args) {

        int maxA = 20;
        int minB = -20;
        int numC = 10;
        Random random = new Random();

        int s = random.nextInt(maxA - minB + 1) + minB;
        System.out.print("answer: ");
        System.out.println(s);
        int t = s + numC;
        System.out.println(s + "+" + numC  + "=" + t);

        }
    }
