def is_prime(n):
    if n <=1:
        return False
    if n<=3:
        return True
    if n%2==0:
        return False
    i=3
    while i**2 <= n:
        if n%i == 0:
            return False
        i+=2
    return True

def main():
    try:
        n = int(input("Enter a Number: "))
    except ValueError:
        print("Enter a vaild number")
        return
    print(f"{n} is prime: {is_prime(n)}")

if __name__ == "__main__":
    main()