def playlist(songs):
    map_song = {}
    res = 0
    for s in songs:
        map_song[s] = map_song.get(s, 0) + 1
    for s in songs:
        r = 60 - s % 60
        if r in map_song.keys() and map_song.get(r) > 0:
            res += 1
            map_song[r] -= 1
            map_song[s] -= 1
    return res

def uniqueChars(s):
    chars = [0] * 26
    for c in s:
        chars[ord(c) - ord('a')] += 1
    for i in range(len(s)):
        c = s[i]
        if chars[ord(c) - ord('a')] == 1:
            return i + 1
    return -1
    