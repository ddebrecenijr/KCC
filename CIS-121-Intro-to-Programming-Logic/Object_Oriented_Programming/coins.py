from coin import Coin

# Create 5 different instances of Coin
penny = Coin(1)
nickel = Coin(5)
dime = Coin(10)
quarter = Coin(25)
half_dollar = Coin(50)

# Prove that they are in fact different
print(hex(id(penny)))
print(hex(id(nickel)))
print(hex(id(dime)))
print(hex(id(quarter)))
print(hex(id(half_dollar)))
