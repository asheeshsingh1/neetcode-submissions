class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        list1 = [0] * 26
        list2 = [0] * 26
        for ch in s:
            asci = ord(ch) - ord('a')
            count = list1[asci]
            count = count + 1
            list1[asci] = count

        for ch in t:
            asci = ord(ch) - ord('a')
            count = list2[asci]
            count = count + 1
            list2[asci] = count

        for index,item in enumerate(list1):
            if item != list2[index]:
                return False

        return True