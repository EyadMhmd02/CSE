# Introduction to Python Basics

# Variables
# A variable is a reserved memory location to store values.
# Python is dynamically typed, meaning we don't declare types explicitly.

# Variable Declaration and Assignment
x = 10  # Integer
y = 3.14  # Float
name = "Alice"  # String
is_active = True  # Boolean

# Printing variable types
print(type(x))  # Output: <class 'int'>
print(type(y))  # Output: <class 'float'>
print(type(name))  # Output: <class 'str'>
print(type(is_active))  # Output: <class 'bool'>

# Multiple Assignments
a, b, c = 1, 2.5, "Hello"

# Assigning the same value to multiple variables
p = q = r = 42


# Operators
# Arithmetic Operators: +, -, *, /, //, %, **
sum_value = 5 + 3  # Addition
diff_value = 10 - 4  # Subtraction
product = 6 * 7  # Multiplication
quotient = 10 / 3  # Division (float)
floor_div = 10 // 3  # Division (integer)
modulus = 10 % 3  # Remainder
power = 2 ** 3  # Exponentiation

# Comparison Operators: ==, !=, >, <, >=, <=
is_equal = (5 == 5)  # True

# Logical Operators: and, or, not
logic_test = (5 > 3 and 2 < 4)  # True


# Type Casting
# Convert data types using int(), float(), str(), bool()
num_str = "100"
num_int = int(num_str)  # Converts "100" to 100


# Input and Output
user_input = input("Enter your name: ")  # Always returns a string
age = int(input("Enter your age: "))  # Convert input to integer


# Lists
# Lists store multiple items and are mutable
fruits = ["apple", "banana", "cherry"]
print(fruits[0])  # Access first item

# List Methods
fruits.append("orange")  # Adds an element to the end
fruits.remove("banana")  # Removes the specified element
fruits.sort()  # Sorts the list
fruits.reverse()  # Reverses the list

# Slicing
print(fruits[1:3])  # Gets a subset of the list

# List Comprehension
squares = [x**2 for x in range(10) 
]


# Tuples
# Tuples store multiple items but are immutable
colors = ("red", "green", "blue")
print(colors[1])  # Accessing elements


# Sets
# Sets store unique elements and are unordered
unique_numbers = {1, 2, 3, 4, 4, 5}
unique_numbers.add(6)  # Adding an element


# Dictionaries
# Key-value pairs used for storing data
person = {"name": "Alice", "age": 25, "city": "New York"}
print(person["name"])  # Accessing values
person["age"] = 26  # Updating a value


# Conditional Statements
# If-elif-else to control program flow
num = 10
if num > 0:
    print("Positive number")
elif num == 0:
    print("Zero")
else:
    print("Negative number")


# Loops
# For Loop: Iterating through a list
for fruit in fruits:
    print(fruit)

# While Loop: Repeating until a condition is met
count = 5
while count > 0:
    print(count)
    count -= 1


# Functions
# Define a function using 'def'
def greet(name):
    return f"Hello, {name}!"

print(greet("Alice"))  # Calling the function


# Lambda Function (Anonymous Function)
double = lambda x: x * 2
print(double(5))  # Output: 10


# Exception Handling
try:
    x = int("Hello")  # This will cause an error
except ValueError as e:
    print(f"Error: {e}")


# Recursion
def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n - 1)

print(factorial(5))  # Output: 120


# File Handling
with open("file.txt", "w") as file:
    file.write("Hello, Python!")

with open("file.txt", "r") as file:
    content = file.read()
    print(content)


# Thanks! This is a basic summary of Python fundamentals.
