#Brute-Force Approach
def twosum(nums,target):
    for i in range(len(nums)):
        complement = target - nums[i]
        for j in range(i+1, len(nums)):
            if complement in nums:
                return (i,j)
    return "Found no pair"
            #OR#
    """
    for i in range(len(nums-1)):
        for j in range(i+1,len(nums)-1):
            if (nums[i] + nums[j]) == target:
                return (i,j)
    return None
    """

nums = [11,15,2,7]
target = 17
print(twosum(nums,target))

#Hashmap Approach
def twosum_hash(nums,target):
    seen ={}
    for i in range(len(nums)):
        complement = target - nums[i]
        if complement in seen:
            return (seen[complement],i)
        seen[nums[i]] =i
    return None

#two pointer Approach
def twosum_two_pointer(nums, target):
    paired = [(key,value) for key, value in enumerate(nums)]
    paired.sort(key = lambda p:p[0])
    n=len(paired)
    for i in range(n-1):
        left, right = 0, n-1
        if nums[left] + nums[right] < target:
            left +=1
        elif nums[left] + nums[right] > target:
            right -=1
        else:
            return (paired[left][1],paired[right][1])
        