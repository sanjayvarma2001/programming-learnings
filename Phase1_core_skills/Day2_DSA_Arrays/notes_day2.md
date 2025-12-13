# Day 2 DSA Problems

---

# 1. TwoSum.py

    1. Problem - Given an integer array and a target, return indices of two numbers whose sum equals the target (exactly one valid pair, no reuse of same index).
    2. Brute-force idea: Use two nested loops; for each i, try all j > i and check nums[i] + nums[j] == target. Return (i, j) when found.
        Time: O(n^2), space: O(1).
    3. Optimal idea (hash map): Scan array once, maintain value → index map. For each nums[i], compute complement = target - nums[i]; if complement is already in the map, return (map[complement], i), else store nums[i] in the map.
        Time: o(n), Space: O(1)
    4. Example: nums = [7, 2, 11, 15], target = 9 → map after first step {7: 0}; at i = 1, nums[1] = 2, complement 7 is in map → answer (0, 1).

- Example -
  nums = [7,2,11,15] and target = 9
  so here, we can see 7+2 =9
  required indexes are (0,1)

  but, how can we implement it in code.
  using brute force, hashmap, two pointers

  # Brute Force Approach

  we use nested for loop to perform brute force to apply fetching with all element so as are finding pair or sum of two numbers we for loop twice (nested).

  time complexity - O(n^2)

  if the number pair gets increased time complexity increases.

  here, the code is

  for i in range(len(nums)): - > this is outer loop
  complement = target - nums[i] - > this gets the left value after subtracting the nums[i] from target. nums[i] - position of value
  for j in range(i+1, len(nums)): - > this is inner loop
  if nums[j]==complement: - > verifies the complement availability in nums
  return (i,j) - > returns the position of the values which gives pair of sum
  basically, - outer loop pairs with inner loop until inner loop ends. - for example,
  [1,2,3]
  here,
  the pairs are (1,2),(1,3),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3).

  # Hashmap Approach

  Hashmap is data structure which stores the value with key (index). here, it can be used as a verification array like it explore each index until it found the match.

  for the instance of the same above example,
  [7,2,11,15]
  seen ={} - > dict declaration
  for i in range(len(nums)): - > initiating for loop
  complement = target - nums[i] - > complement finding as above
  if complement in seen: - > now we are verifying the complement in seen dict
  return (seen[complement],i) - > returns the position of the pair

  time complexity - O(n)

  # Two Pointers Approach

  Two Pointers it uses a strategy to perform check between two elements. it takes two end point left and right in a array compares left and right value by reducing 1 either left or right until the end of the array. This can be applied on sorted array.

  for this i applied sorting to the array first and then applied the algorithm,

  paired = [(key,value) for key, value in enumerate(nums)] - > make a list of nums adding key to it
  paired.sort(key = lambda p:p[1]) - > apply sorting to the list
  n=len(paired)  
   left, right = 0, n-1 - > assigning the initial and last value
  while left < right:  
   if nums[left] + nums[right] < target: - > verify the sum less than target or not.
  left +=1 - > if yes it it moves the index 1 towards right
  elif nums[left] + nums[right] > target: - > verify the sum greater than target or not
  right -=1 - > if yes it moves to the 1 position towards left
  else:
  return (paired[left][0],paired[right][0]) - > found the match required

  return None

-----------------------------------------------------Making notes on it--------------------------------------------------------------------------

# 2. RemoveDuplicatesSorted.py -

- You are given with a sorted list with duplicates. we need to get the count of all unique values. here, the possible ways are Brute Force, Two Pointers, new list & set (not recommended for leet code)

  1. Problem: Given daily stock prices, choose one day to buy and a later day to sell to get the maximum profit; if no profit is possible, return 0.​
  2. Brute-force idea: Try every pair (buy, sell) with buy < sell, compute prices[sell] - prices[buy], and track the maximum profit. Time: O(n^2), Space: O(1).
  3. Optimal idea (single pass): Keep min_price_so_far and max_profit. For each price p:
     - Update profit candidate as p - min_price_so_far and update max_profit.
     - Update min_price_so_far = min(min_price_so_far, p).
     - Time - O(n), Space: O(1)
  4. Example: prices = [7, 1, 5, 3, 6, 4] → min so far goes 7 → 1; best profit candidates: 0, 4, 2, 5, 3 → maximum is 5 (buy at 1, sell at 6).

  # Brute Force

  i = 0
  While i< len(nums):
  if nums[i] == nums[i+1]:
  nums.pop(nums[i])
  else:
  i+=1
  print(len(nums))

# 3. MaxProfitStock.py -

    1. Problem: Given a sorted array, remove duplicates in-place so each element appears once, and return the new length; only O(1) extra space allowed.​
    2. Brute-force idea (not final solution): Use an extra list or set to collect unique elements and then copy them back to the array; works but violates the constant extra-space requirement.​
    3. Optimal idea (two pointers): Use slow to mark the index of the last unique element and fast to scan. When nums[fast] != nums[slow], move slow forward and set nums[slow] = nums[fast]. After the loop, the new length is slow + 1, and the first slow + 1 positions hold the unique values. Time: O(n), space: O(1).​
    4. Example: nums = [1, 1, 2, 2, 3] → final array prefix becomes [1, 2, 3, _, _] and function returns 3 as the new length.
