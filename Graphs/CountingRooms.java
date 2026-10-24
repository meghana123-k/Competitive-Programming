import java.util.*;;

class CountingRooms {
    public static void helper(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length)
            return;
        if (grid[i][j] == '#')
            return;
        grid[i][j] = '#';
        helper(grid, i - 1, j);
        helper(grid, i, j + 1);
        helper(grid, i + 1, j);
        helper(grid, i, j - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = sc.next().toCharArray();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.') {
                    cnt++;
                    helper(grid, i, j);
                }
            }
        }
        System.out.println(cnt);
    }

}