class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = [None] * 2
        flag = False
        for i in range(len(nums)):
            if flag:
                break
            for j in range(1, len(nums)):
                if i == j:
                    continue
                if nums[i] + nums[j] == target:
                    result[0] = i
                    result[1] = j
                    flag = True
                    break
        return result
    