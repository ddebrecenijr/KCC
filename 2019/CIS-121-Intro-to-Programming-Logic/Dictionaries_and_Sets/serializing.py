"""
Serializing a object is the process of converting the object to
a stream of bytes that can be saved to a file for later retrieval
"""

import pickle
import random
grade_book = {
    "Mac": random.randint(0, 100),
    "Ben": random.randint(0, 100),
    "Alex": random.randint(0, 100),
    "Josh": random.randint(0, 100),
    "Kaylee": random.randint(0, 100),
    "Sam": random.randint(0, 100),
    "Brodie": random.randint(0, 100),
    "Skyler": random.randint(0, 100),
    "Farhad": random.randint(0, 100),
    "Kate": random.randint(0, 100),
    "Sebastian": random.randint(0, 100),
}

serialized_file = open('grade_book.dat', 'wb')
pickle.dump(grade_book, serialized_file)
serialized_file.close()


deserialized_file = open('grade_book.dat', 'rb')
opened_grades = pickle.load(deserialized_file)

for key in opened_grades:
    print(key, opened_grades[key])