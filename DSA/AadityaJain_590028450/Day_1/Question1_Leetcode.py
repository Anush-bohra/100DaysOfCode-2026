'''
Missing Number
Explanation
Write an efficient function to find the missing number in an array containing n distinct numbers from the range [0,n].
'''

class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)
        arrsum = sum(nums)
        total = (n * (n + 1)) // 2
        return total - arrsum

        
        