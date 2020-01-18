def main():
    prod_nums = ['V475', 'F987', 'A123']

    search = input('Enter a product number: ')

    if search in prod_nums:
        print(search, 'was found in the list.')
    else:
        print(search, 'was not found in the list.')

if __name__ == "__main__":
    main()
