def maxSubArray(nums):
    current_sum=0
    max_sum=float('-inf')
    for num in nums:
        current_sum+=num
        max_sum=max(max_sum,current_sum)
        if current_sum<0:
            current_sum
    return max_sum
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
print(maxSubArray(nums))