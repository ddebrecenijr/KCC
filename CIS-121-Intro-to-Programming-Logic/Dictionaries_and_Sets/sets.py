# A set contains a collection of unique values and works like a mathematical set

# Creating a set
my_set = set() # Empty set
my_set = set(['a', 'b', 'c'])
print(my_set)
my_set = set('abc')
print(my_set)

# Can't do this
# my_set = set('a', 'b', 'c')
# print(my_set)

# Sets are unique
my_set = set('aaaabbbbbcccccdddddeeee')
print(my_set)

# Getting the number of elements in the set
my_set = set([1, 2, 3, 4, 5, 6, 7, 8, 9, 0])
print(len(my_set), my_set)

# Add or Remove elements from the set
my_set = set()
my_set.add("Ben")
my_set.add("Alex")
my_set.add("Mac")
my_set.add("Mac")
print(my_set)
my_set.remove("Mac")
print(my_set)

# Update a set
my_set = set([1, 2, 3])
my_set.update([4, 5, 6])
print(my_set)

# We can loop over a set
my_set = set(range(10))
for num in my_set:
    print(num)

print(9 in my_set)
print(10 in my_set)
print(99 not in my_set)

# Finding the Union of Sets
set1 = set(['Alex', 'Ben', 'Mac'])
set2 = set(['Josh', 'Kaylee', 'Sam'])

set3 = set1.union(set2)
print(set3)
# or
set4 = set1 | set2
print(set4)

# Finding the Intersection of Sets
set1.add('Josh')
set1.add('Kaylee')

set3 = set1.intersection(set2)
print(set3)
# or
set4 = set1 & set2
print(set4)

# Find the difference between Sets
set1 = set([1, 2, 3, 4])
set2 = set([3, 4, 5, 6])

# Not a mathematical subtraction
set3 = set1.difference(set2)
print(set3)
set4 = set2.difference(set1)
print(set4)
# OR
set3 = set1 - set2
set4 = set2 - set1
print(set3, set4)

# Finding the Symmetric Difference of Sets
# contains the elements that are not shared
set3 = set1.symmetric_difference(set2)
set4 = set2.symmetric_difference(set1)
print(set3, set4)
# OR
set3 = set1 ^ set2
set4 = set2 ^ set1
print(set3, set4)

# Subset and Supersets
set1 = set([1, 2, 3, 4])
set2 = set([2, 3])

print("Subset:", set2.issubset(set1))
print("Subset:", set1.issubset(set2))
# OR
print("Subset:", set2 <= set1)

print("Superset:", set1.issuperset(set2))
print("Superset:", set2.issuperset(set1))
# OR
print("Superset:", set1 >= set2)
