num1 = float(input("Enter number 1: "))
num2 = float(input("Enter number 2: "))
op = str(input("Enter Operation (+, -, *, /, //): "))

if op == "+":
    result = num1 + num2
elif op == "-":
    result = num1 - num2
elif op == "*":
    result = num1 * num2
elif op == "/":
    if num2 != 0:
        result = num1 / num2
    else:
        print("Enter Value >0")
        exit()
elif op == "//":
    if num2 != 0:
        result = num1 // num2
    else:
        print("Enter Value >0")
        exit()
else:
    print("not a Valid Operator")
    exit()

print(result)