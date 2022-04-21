class Driver{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        Solution sol = new Solution();
        System.out.print(Character.toString(sol.solution(input)));
    }
}