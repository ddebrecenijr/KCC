# A class is code that specifies the data attributes and methods for a particular type of object

import random

# We want simulate a coin that can be flipped

# To create a class, we specify the keyword 'class'
class Coin:

    # The __init__ method initializes the class, it is run on every new instance of a class.
    # 'self' is a parameter that describes the class itself
    def __init__(self, value):
        # Data attribute called sideup == 'Heads'
        # self.sideup = 'Heads' # This is a public member, which means we allow anyone to modify it
        self.__sideup = 'Heads' # This is a private member, only the class can modify this
        self.__value = value

    def flip(self):
        if random.randint(0, 1) == 0:
            self.__sideup = 'Heads'
        else:
            self.__sideup = 'Tails'

    def get_sideup(self):
        return self.__sideup

    def get_value(self):
        return self.__value

# # I created a variable called coin and set it equal to a brand new instance of our class Coin
# coin = Coin()
# for _ in range(5):
#     coin.flip()
#     print(coin.get_sideup())