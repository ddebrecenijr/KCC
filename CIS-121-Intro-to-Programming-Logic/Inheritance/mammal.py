# This is the SuperClass
class Mammal:
    def __init__(self, species):
        self.__species = species

    def show_species(self):
        print(f"I am a {self.__species}")

    def make_sound(self):
        print(f"Grrrrrrr")

# This is the SubClass
class Dog(Mammal):
    def __init__(self):
        Mammal.__init__(self, "Dog")

    # This is a polymorphic function
    def make_sound(self):
        print("Woof! Woof!")