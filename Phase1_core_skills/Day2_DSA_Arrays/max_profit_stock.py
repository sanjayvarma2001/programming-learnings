#Brute force using for loop
def max_profit_stock(prices):
    profit = 0
    for i in range(len(prices)):
        for j in range(i+1,len(prices)):
            if prices[j] - prices[i]> profit:
                profit = prices[j] - prices[i]
    return profit

prices = [7,3,5,1,2,3]
print(max_profit_stock(prices))

#Sliding window
def max_profit_stock_slid(prices):
    min_price = float('inf')
    max_profit = 0
    for price in prices:
        min_price = min(price, min_price)
        if price <min_price:
            min_price = price
        else:
            profit = price - min_price
            if profit > max_profit:
                max_profit = profit
    return max_profit

prices1 = [7,2,1,3,4]
print(max_profit_stock_slid(prices1))