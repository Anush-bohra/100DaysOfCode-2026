'''
Find the Sum of Array Elements
Explanation
Write an efficient function to calculate the sum of all elements in an integer array.
'''
n = int(input("Enter the number of elements: "))
arr = []

b = input("Enter elements: ").split()
for a in b:
    arr.append(int(a))

print("Sum of array elements:", sum(arr))