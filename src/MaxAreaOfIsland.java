public class MaxAreaOfIsland {

   static int[] dx={-1,1,0,0};
   static int[] dy={0,0,-1,1};

    static int dfs(int i, int j, int n, int m, int[][]grid){
        if(i<0 || j<0 || i== n || j==m || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;

        int count =0;
        for(int k=0; k<4; k++){
            int nx = i + dx[k];
            int ny = j+ dy[k];

            count += dfs(nx,ny,n, m,grid);

        }return count;
    }



    public static int maxAreaOfIsland(int [][]grid){
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(grid[i][j]==1){
                int result = dfs(i, j,n, m, grid);
                max = Math.max(max,result);
            }
            }
        }return max;
    }



    public static void main(String[] args) {

    }
}
