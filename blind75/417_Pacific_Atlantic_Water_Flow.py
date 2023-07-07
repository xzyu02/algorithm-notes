class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        m, n = len(heights), len(heights[0])
        pacific, atlantic = set(), set()
        directions = ((0, 1), (0, -1), (1, 0), (-1, 0))

        def dfs(i, j, sea):
            if (i, j) in sea:
                return
            sea.add((i, j))
            for d in directions:
                ii, jj = i + d[0], j + d[1]
                if 0 <= ii < m and 0 <= jj < n:
                    if heights[ii][jj] >= heights[i][j]:
                        dfs(ii, jj, sea)

        for i in range(m):
            dfs(i, 0, pacific)
            dfs(i, n-1, atlantic)

        for j in range(n):
            dfs(0, j, pacific)
            dfs(m-1, j, atlantic)

        return list(atlantic & pacific)