public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.enQueue(30);
        solution.enQueue(60);
        solution.enQueue(90);

        System.out.println(solution.dequeue().data);
    }
}
