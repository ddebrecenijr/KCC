NUM_DAYS = 5

def main():
    sales = [0] * NUM_DAYS

    index = 0

    print("Enter the sales for each day.")

    while index < NUM_DAYS:
        print('Day #', index + 1, ': ')
        sales[index] = float(input())
        index += 1

    print('Here are the sales for the', NUM_DAYS, 'days')
    for sale in sales:
        print(sale)

if __name__ == "__main__":
    main()
