import matplotlib.pyplot as plt

def main():
    x_coords = [0, 1, 2, 3, 4]
    y_coords = [2, 3, 0, 4, 1]

    plt.plot(x_coords, y_coords, marker='o')
    plt.title('Sales by year')
    plt.xlabel('Year')
    plt.ylabel('Sales')
    plt.xticks([0, 1, 2, 3, 4], ['2016', '2017', '2018', '2019', '2020'])
    plt.yticks([0, 1, 2, 3, 4], ['$0m', '$1m', '$2m', '$3m', '$4m'])
    plt.grid(True)

    plt.show()

if __name__ == '__main__':
    main()
