# DSA-OOP

# Contact Management System

## Overview

This Java code represents a simple contact management system with a graphical user interface (GUI) implemented using Java Swing. The application allows users to add, display, delete, and search contacts. Contacts are stored in an ArrayList and can be written to and read from a file.

## Classes

1. **ContactUI**: Main GUI window with components for entering contact information and buttons for various operations. Also provides functionality for reading and writing contacts to a file.

2. **Contact**: Defines the structure of a contact with fields for first name, last name, email, and phone number. Contacts are stored in an ArrayList.

3. **Business**: Extends the Contact class and introduces a "type" field to differentiate between regular contacts and business contacts.

## GUI Components

- **Text Fields**: `firstnameTF`, `lastnameTF`, `emailTF`, `phoneTF` - Used for entering contact details.
- **Labels**: `firstnameLBL`, `lastnameLBL`, `emailLBL`, `phoneLBL` - Display labels for respective text fields.
- **Buttons**: `addBTN`, `displayBTN`, `deleteBTN`, `searchBTN`, `fileBTN`, `readfromfileBTN`, `exitBTN`, `clearBTN`, `typeTOGGLE` - Perform various operations such as adding, displaying, deleting, searching contacts, and managing file operations.
- **Text Area**: `displayTA` - Displays the list of contacts.

## Operations

- **Add Contact**: Checks for empty fields and adds the contact to the ArrayList.
- **Display Contacts**: Lists all contacts in the TextArea.
- **Delete Contact**: Removes a contact based on the provided phone number.
- **Search Contact**: Finds and displays a contact based on the provided phone number.
- **File Operations**: Allows writing and reading contacts to and from a file.

## Running the Application

The application is implemented using Java Swing. To run the program, execute the `main` method in the `ContactUI` class. The GUI window will appear, allowing users to interact with the contact management system.

## License

This code is created by Eskadnar Atrakchi, and you are free to use and modify it as needed.
