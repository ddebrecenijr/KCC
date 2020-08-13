# Dictionaries are Key-value pairs (kv-pair)
sam = {
    "Name": "Sam",
    "Age": 17,
    "Height": 6.0
}

# Getting an element from a dictionary by key
print(sam["Name"])
print(sam["Age"])
print(sam["Height"])

# 'in' operators
phonebook = {"Dave": "111-222-3333", "Mom": "444-555-6666", "Dad": "777-888-9999"}

if "Dave" in phonebook:
    print(phonebook["Dave"])

if "Brother" not in phonebook:
    print("Brother not found")

# Delete an element from the dictionary
del phonebook["Dave"]
print(phonebook)

# Add an element to the dictionary
phonebook["Mac"] = "111-222-3333"
print(phonebook)

# Length of a dictionary
print(len(phonebook))

# More complex
grades = {
    "Mac": [100, 80, 37, 78],
    "Ben": [0, 87, 67, 98],
    "Alex": [10, 20, 30, 40],
    "Brodie": [0, 0, 0, 0]
}

# So dictionaries can be used for models!
# Use a for loop to loop over the dictionary
for student_name in grades:
    test_scores = grades[student_name]
    average = sum(test_scores) / len(test_scores)

    print("Average for", student_name, ":", average)

# Empty Dictionaries
empty_dictionary = {}

# Some Helpful Methods

fun_states = {
    "Florida": ["Beach", "Disney World", "Universal Studios"],
    "Minnesota": ["Duluth", "Shopping"],
    "Pennsylvania": ["Philadelphia", "Cheesesteaks", "Fishtown"],
    "Iowa": [] 
}

# Getting an item
print(fun_states.get("Pennsylvania"))
# Getting all items
print(fun_states.items())
# Getting the keys
print(fun_states.keys())
# Getting the values
print(fun_states.values())

# Removing an item
boring_states = fun_states.pop("Iowa")
print(boring_states)

# Remove random item
random_state = fun_states.popitem()
print(random_state)

# Remove all items
fun_states.clear()
print(fun_states)
