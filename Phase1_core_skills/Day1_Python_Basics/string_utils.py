def reversed(string):
    return string[::-1]
def vowels(string):
    vow=['a','e','i','o','u']
    count =0
    for char in string.lower():
        if char in vow:
            count +=1
    return count

def main():
    string = input("Enter the String: ")
    print(f"Reversed: {reversed(string)}")
    count= vowels(string)
    print(f"Vowels: {count}")

if __name__ =="__main__":
    main()