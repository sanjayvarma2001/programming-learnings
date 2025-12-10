n1 = int(input("Enter num1: "))
n2 = int(input("Enter num2: "))
n3 = int(input("Enter num3: "))

if n1 >= n2 and n1 >= n3:
    result = n1
elif n2>=n1 and n2 >= n3:
    result = n2
else: 
    result = n3

print(f"Max: {result}")