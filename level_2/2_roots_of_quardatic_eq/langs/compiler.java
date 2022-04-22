class Driver{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        Solution sol = new Solution();
        System.out.print(sol.solution(a, b, c));
    }
}