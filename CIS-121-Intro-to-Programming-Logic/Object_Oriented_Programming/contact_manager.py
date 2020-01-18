from contact import Contact
import pickle

# Global constants for menu
LOOK_UP = 1
ADD = 2
CHANGE = 3
DELETE = 4
QUIT = 5

FILENAME = "contacts_db.dat"

def load_contacts():
    try:
        input_file = open(FILENAME, 'rb')
        contact_dict = pickle.load(input_file)
        input_file.close()
    except IOError:
        contact_dict = {}

    return contact_dict

def get_menu_choice():
    print()
    print('Menu')
    print('-------------------------')
    print('1. Look up a contact')
    print('2. Add a new contact')
    print('3. Change an existing contact')
    print('4. Delete a contact')
    print('5. Quit the program')
    print()

    choice = int(input('Enter your choice: '))

    while choice < LOOK_UP or choice > QUIT:
        choice = int(input('Enter your choice: '))

    return choice

def look_up(mycontacts):
    name = input('Enter the name: ')
    print(mycontacts.get(name, 'That name is not found.'))

def add(mycontacts):
    name = input('Name: ')
    phone = input('Phone Number: ')
    email = input('Email: ')

    entry = Contact(name, phone, email)

    if name not in mycontacts:
        mycontacts[name] = entry
        print('Contact was added.')
    else:
        print('That contact already exists!')

def change(mycontacts):
    name = input('Enter the name of the contact to change: ')

    if name in mycontacts:
        phone = input('Enter the new phone number: ')
        email = input('Enter the new email: ')

        contact = mycontacts[name]
        contact.set_phone(phone)
        contact.set_email(email)
        mycontacts[name] = contact
        
        print('Contact has been updated')
    else:
        print('That name is not found')

def delete(mycontacts):
    name = input('Enter a name: ')

    if name in mycontacts:
        del mycontacts[name]
        print('Contact deleted')
    else:
        print('Contact not found')

def save_contacts(mycontacts):
    output_file = open(FILENAME, 'wb')
    pickle.dump(mycontacts, output_file)
    output_file.close()

def main():
    my_contacts = load_contacts()

    choice = 0

    while choice != QUIT:
        choice = get_menu_choice()

        if choice == LOOK_UP:
            look_up(my_contacts)
        elif choice == ADD:
            add(my_contacts)
        elif choice == CHANGE:
            change(my_contacts)
        elif choice == DELETE:
            delete(my_contacts)

    save_contacts(my_contacts)

if __name__ == "__main__":
    main()