class TimeMap:

    def __init__(self):
        self.map = collections.defaultdict(list) # [val, time]

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.map[key].append([value, timestamp])

    def get(self, key: str, timestamp: int) -> str:
        res = ""

        if key not in self.map:
            return res

        values = self.map[key]
        l, r = 0, len(values) - 1
        while l <= r:
            m = l + (r - l) // 2
            if values[m][1] <= timestamp:
                res = values[m][0]
                l = m + 1
            else:
                r = m - 1 # invalid time stamp

        return res