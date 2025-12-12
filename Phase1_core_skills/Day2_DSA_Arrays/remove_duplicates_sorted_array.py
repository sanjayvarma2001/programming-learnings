#TwoPointer or Brute force without creating new list and using while or nested loops
def rem_dupl_brute_for(nums):
    write = 0
    for i in range(len(nums)):
        if i == 0 or nums[i] != nums[i-1]:
            nums[write] = nums[i]
            write += 1
    return write

nums = [0,1,2,2,3,3,3]
k = rem_dupl_brute_for(nums)
print(nums[:k])

#Brute force using while loop
def rem_dupl_brute_while(nums):
    i=0
    while i < len(nums)-1:
        if nums[i] == nums[i+1]:
            nums.pop(i+1)
        else:
            i+=1
    return nums

print(rem_dupl_brute_while(nums))

#newlist Approach
def rem_dupl_new_list(nums):
    n = len(nums)-1
    new_list = []
    for i in range(1,n):
        if nums[i] != nums[i-1]:
            new_list.append(nums[i])
    return new_list

#using set
def rem_dupl_set(nums):
    seen = set()
    res = []
    for i in range(len(nums)-1):
        if nums[i] not in seen:
            res.append(nums[i])
            seen.add(nums[i])
        
    return res
