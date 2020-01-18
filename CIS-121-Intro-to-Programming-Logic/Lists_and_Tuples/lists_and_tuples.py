"""
Sequence (Collections): An object that holds multiple items of data, stored one after another.

List: Is a type of sequence. They are mutable, elements can be modified, and also dynamic (Elements can be added or removed).
"""
even_numbers = [2, 4, 6, 8, 10] # List of integers

names = ['Mac', 'Ben', 'Alex'] # List of strings

daves_info = ['Dave Debreceni', 24, 370.26] # List of str, int, float

# Convert somethign to a list
odd_numbers = list(range(1, 10, 2))
# [1, 3, 5, 7, 9]

# Repition Operator *
# list * n 
# This will make multiple copies of the list and join them all together

numbers = [1, 2, 3] * 3
#print(numbers)

# for num in numbers:
#     print(num)

my_list = [10, 20, 30, 40]
# print(my_list[0], my_list[3])

# index = 0
# while index < 4:
#     print(my_list[index])
#     index += 1

print(my_list[-1], my_list[-2], my_list[-3], my_list[-4])

# len function
my_list = [10, 20, 30, 40]
size = len(my_list)
print(size)

index = 0
while index < len(my_list):
    print(my_list[index])
    index += 1

# Lists are mutable
numbers = [1, 2, 3, 4, 5]
print(numbers)
numbers[3] = 123456789

print(numbers)

# This will not change the numbers
# for num in numbers:
#     num += 1
# print(numbers)

# This will change the numbers
# index = 0
# while index < len(numbers):
#     numbers[index] += 1
#     index += 1
 
# print(numbers)

# See sales_list.py

# Concatenating Lists
list1 = [1, 2, 3, 4]
list2 = [5, 6, 7, 8, 9]
list3 = list1 + list2
print(list3)

front_row = ['Mac', 'Ben', 'Alex']
back_row = ['Sebastian']

class_row = front_row + back_row
class_row += ['Kate']
print(class_row)

# List Slicing

days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']

weekdays = days[1:6]
print(weekdays)

# If there is no end, defaults to last element
mon_to_sat = days[1:]
print(mon_to_sat)

# If there is no start, defaults to first element
sun_to_fri = days[:6]
print(sun_to_fri)

# Finding elements in a list

students = ['Ben', 'Alex', 'Kate']

print('Alex' in students)
print('Kaylee' in students)

# See in_list.py

# Helpful List Methods

my_list = ['abc']

# Append something to the end of the list
my_list.append(1234)
my_list.append('blah')
my_list.append(30)
my_list.append('snowy')
print(my_list)

# Find an item
print(my_list.index('blah'))

# Insert an element at a specific position
my_list.insert(2, 'hello')
print(my_list)

# Sorting
numbers = [5, 7, 42, 69, 10, 11, 3, 420, 169, 7]
numbers.sort()
print(numbers)

# Reverses the Order, not sort backwards
numbers.reverse()
print(numbers)

letters = ['a', 'c','m', 'e']
letters.reverse()
print(letters)

# Removing an item
my_list.remove('blah')
print(my_list)

del my_list[4]
print(my_list)

# Min and Max
print('min:', min(numbers))
print('max:', max(numbers))

# Example: Increment a list of numbers by 1
print('Numbers:', numbers)
index = 0
while index < len(numbers):
    numbers[index] += 1
    index += 1

print('Numbers:', numbers)
print('Min:', min(numbers))
print('Max:', max(numbers))

# Copying Lists
# Don't do this:
list1 = ['_', '_', '_']
list2 = list1
list3 = list2
list1[1] = 'X'

print('list1:', list1)
print('list2:', list2)
print('list3:', list3)

# Do this:
list1 = [1, 2, 3, 4]
list2 = []

for element in list1:
    list2.append(element)

list1[2] = 69
print(list2)

# Processing Lists see barista_pay.py

# Total
pay = [32.19, 64.38, 85.84, 128.76]

total = 0
for num in pay:
    total += num

# Average

average = total / len(pay)

print('Total Payout: $', format(total, ',.2f'))
print('Average Pay:  $', format(average, ',.2f'))

# Tuples
my_tuple = (1, 2, 3, 4, 5)
# my_tuple[0] = 69

my_list = list(my_tuple)
print(my_list)
my_list[0] = 69
my_tuple = tuple(my_list)
print(my_tuple)

# Plotting see line_graphy.py

