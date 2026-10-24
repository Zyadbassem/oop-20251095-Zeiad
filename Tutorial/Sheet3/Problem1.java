public abstract class Problem1 {
        public static void main(String[] args) {
            int evenSum = 0;
            for(int i = 2; i <= 100; i+=2)
            {
                evenSum += i;
            }

            System.out.println("Sum: " + evenSum);
        }
}
