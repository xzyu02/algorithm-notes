class Solution:
    def isValidSudoku(self, b: List[List[str]]) -> bool:
        row, col = collections.defaultdict(set), collections.defaultdict(set)
        square = collections.defaultdict(set) # key (row // 3, col // 3)
        for i in range(9):
            for j in range(9):
                if b[i][j] == '.':
                    continue
                if (b[i][j] in row[i] or
                    b[i][j] in col[j] or
                    b[i][j] in square[(i // 3, j // 3)]):
                    return False
                row[i].add(b[i][j])
                col[j].add(b[i][j])
                square[(i // 3, j // 3)].add(b[i][j])
        return True