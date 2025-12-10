def add(a,b):
    print(a+b)
def sub(a,b):
    print(a-b)
def mul(a,b):
    print(a*b)
def div(a,b):
    if b !=0:
        print(a/b)
    else:
        print("Zero can't accept")
def div_flo(a,b):
    if b !=0:
        print(a//b)
    else:
        print("Zero can't accept")

def calculate(a, b, op="add"):
    if op == "add":
        return add(a,b)
    elif op == "sub":
        return sub(a,b)
    elif op == "mul":
        return mul(a,b)
    elif op == "div":
        return div(a,b)
    
op = str(input("use add,mul,sub,div :"))
calculate(20,40,op)

def func( a, b, c=10, d=20):
    #for first case
    sum = a+b
    sub = d-c
    return print(sum + sub)

func(20,12)
func(20,12,20)
func(20,12,20,10)