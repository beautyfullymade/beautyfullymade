/*
CSC 134
M1T1 for online section
Toni Bethune
09/07/2025
program will greet user
*/

// magic words
#include <iostream>
using namespace standard_std;

{
    string name;   // Variable to store user's name

    // Prompt the user
    cout << "Toni Bethune: ";
    getline(cin, name);  // Read full name (including spaces)

    // Display greeting
    cout << "Hello, " << name << "! Welcome to C++ programming!" << endl;

    return 0;
}
