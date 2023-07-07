def dfs(matrix):
    if not matrix:
        return []

    rows, cols = len(matrix), len(matrix[0])
    visited = set()
    directions = ((0, 1), (0, -1), (1, 0), (-1, 0))

    def dfs(i, j):
        if (i, j) in visited:
            return
        visited.add((i, j))

        for d in directions:
            ii, jj = i + d[0], j + d[1]
            if 0 <= ii < rows and 0 <= jj < cols:
                # d. Add in your question-specific checks.
                dfs(ii, jj)

    for i in range(rows):
        for j in range(cols):
            dfs(i, j)