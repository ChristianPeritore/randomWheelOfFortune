import random
import time
random.seed(time.time())
print("-----RANDOM WHEEL OF FORTUNE-----")
n = int(input("Hi, enter the number of elements you want\n"))
while n <= 0:
    print("Error: number below or equal to 0. Try again")
    n = int(input())
print("What type of elements do you want? (i/d/s/c)")
t = input().lower() 
elements = []
if t == 'i':
    for i in range(n):
        val = int(input(f"Enter the element {i + 1}\n"))
        elements.append(val)
elif t == 'd':
    for i in range(n):
        val = float(input(f"Enter the element {i + 1}\n"))
        elements.append(val)
elif t == 's' or t == 'c':
    for i in range(n):
        val = input(f"Enter the element {i + 1}\n")
        elements.append(val)
if elements:
    random_index = random.randint(0, n - 1)
    print(f"The random element is {elements[random_index]}")