NUM_EMPLOYEES = 4

def main():
    hours = [0] * NUM_EMPLOYEES

    for index in range(NUM_EMPLOYEES):
        print('Enter the hours worked by employee ', index + 1)
        hours[index] = float(input())

    pay_rate = float(input('Enter the hourly pay: '))

    for index in range(NUM_EMPLOYEES):
        gross_pay = hours[index] * pay_rate
        print('Gross pay for employee', index+1, ': $', format(gross_pay, ',.2f'))

if __name__ == "__main__":
    main()
