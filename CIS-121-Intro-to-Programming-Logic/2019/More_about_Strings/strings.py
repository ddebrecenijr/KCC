name = "Dave"

# A string is nothing more a list of characters (char)

# We can find the length and index a string
print(len(name))
print(name[0])
print(name[3])

# We can loop over a string
for letter in name:
    print(letter)

# String concatenation
my_str = 'abc' + 'def' + 'ghi' + name
print(my_str)

# String immuatable
new_name = "Brodie"
print(new_name, hex(id(new_name)))
new_name = new_name + " Pasker"
print(new_name, hex(id(new_name)))
old_name = "Brodie"
print(old_name, hex(id(old_name)))

# Can't modify it
# old_name[2] = 'O'

# String Slicing
print(new_name, new_name[2:7])
print(new_name[:9])
print(new_name[2:])

# In operators
lincoln = "Four score and seven years ago"
print('score' in lincoln)
print('asdfasdfasdfasdf' not in lincoln)
print('SCORE' in lincoln)

# Repition Operator
letters = 'abcde' * 5
print(letters)

# Splitting a string
lincoln = "Four score and seven years ago"
word_list = lincoln.split()
print(word_list)
word_list = lincoln.split('e')
print(word_list)

# Changing characters by unicode
print(chr(ord('a') + 1))
print(chr(ord('z') + 1))
