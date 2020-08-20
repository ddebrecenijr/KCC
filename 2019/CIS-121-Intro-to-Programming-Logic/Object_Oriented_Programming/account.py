import bankaccount

def main():
    name = input('Enter your name: ')
    start_bal = float(input('Enter your starting balance: '))

    savings = bankaccount.BankAccount(name, start_bal)

    pay = float(input('Enter how much you just got paid: '))
    print('I will deposit this for you into your Savings')
    savings.deposit(pay)

    print(savings)

    cash = float(input('How much would you like to withdraw? '))
    print('I will withdraw this cash for you.')
    savings.withdraw(cash)

    print(savings)


if __name__ == '__main__':
    main()