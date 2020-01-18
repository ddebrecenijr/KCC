# The BankAccount class simulates a bank account.

class BankAccount:
    def __init__(self, name, balance):
        self.__name = name
        self.__balance = balance

    def __str__(self):
        return 'The balance of your account is $' + format(self.__balance, ',.2f')

    def deposit(self, amount):
        self.__balance += amount

    def withdraw(self, amount):
        self.__balance -= amount

    def get_balance(self):
        return self.__balance
    
    def get_name_on_account(self):
        return self.__name