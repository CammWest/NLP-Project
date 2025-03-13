# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram
![alt text](<Unit 6 - UML Diagram.png>)

## Video



![alt text](<Unit 6 - UML Diagram.png>)([youtube-URL-here](https://youtu.be/Rz6V57rfsrA))

## Project Description

Our goal for this project was to create a program that gets the user's input and converts it to armeneninan. The code breaks down the user's sentence and translates it word by word and then prints it out in the new translated sentence. Then the program asks if they want to translate another sentence and if they put 1 (yes) it prints the first prompt again, but if they put 2 (no) the program ends and the scanner is closed.

## NLP Techniques

The Natural Language Proccessing technique we used was the translator. We used it by accessing the user input and checking if it equaled an english word in our txt file and if it did we would print it's translation. However, if the word does not match a word in our txt file then the error message, "No translation found" is printed for the user