### README: Number Guessing Game

#### Introduction:
This is a simple Java program that implements a number guessing game. The program generates a random number between 1 and 9 (inclusive) and prompts the user to guess the number. If the guess is incorrect, the user is encouraged to try again until the correct number is guessed.

#### How It Works:
1. A random number between 1 and 9 is generated using Math.random().
2. The user is asked to guess the number via console input.
3. If the guessed number does not match the randomly generated number, the program keeps prompting the user for guesses.
4. Once the correct number is guessed, the program congratulates the user and displays the randomly chosen number.
5. The program ends once the correct guess is made.

#### Prerequisites:
- Java Development Kit (JDK) installed on your system.
- A code editor or IDE for Java development (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

#### How to Run:
1. Copy the code into a file named number_guessing.java.
2. Open your terminal or command prompt.
3. Navigate to the directory where the file is saved.
4. Compile the program using the command: 
   
   javac number_guessing.java
   
5. Run the program using the command:
   
   java number_guessing
   

#### Sample Output:

Guess the number (between 1 to 9) : 3
Wrong guess another number (between 1 to 9) : 5
Wrong guess another number (between 1 to 9) : 7
Congrats !!! you guessed it correctly.
Computer chose 7


#### Key Features:
- Simple and interactive console-based program.
- Random number generation ensures fairness.
- Encourages the user to keep guessing until they succeed.

#### Limitations:
- The program handles only single-digit numbers (1-9).
- If a user enters invalid input (like a string or special character), the program may throw an error.

#### Possible Enhancements:
1. Add input validation to handle incorrect or invalid input gracefully.
2. Provide an option to quit the game if the user does not wish to continue guessing.
3. Increase the range of the random number or allow dynamic customization of the range.

Enjoy the challenge of guessing! Feel free to customize the code for added functionality. 😊
