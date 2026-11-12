# CODSOFT – Java Development Internship

A collection of Java console-based projects developed as part of my **CodSoft Java Development Internship**. These projects demonstrate Core Java programming, problem-solving, object-oriented programming, and Java Collections.

## Internship Tasks

1. **Number Game** – Guess a randomly generated number with hints and a limited number of attempts.

2. **Student Grade Calculator** – Calculate total marks, average percentage, grade, and pass/fail result.

3. **ATM Interface** – Simulate balance enquiry, deposits, and withdrawals with transaction validation.

5. **Student Course Registration System** – View available courses, register using a course code, and remove registered courses.

## Project Details

### 1. Number Game

- Generates a random number between 1 and 100.
- Accepts guesses from the user.
- Provides hints when a guess is too high or too low.
- Limits the number of attempts per round.
- Allows the user to play multiple rounds.
- Displays the player's score.

**Java concepts:** `Random`, `Scanner`, loops, conditional statements, and `break`.

### 2. Student Grade Calculator

- Accepts marks for multiple subjects.
- Validates marks entered by the user.
- Calculates total marks and average percentage.
- Assigns a grade based on the average.
- Displays the final result as pass or fail.

**Java concepts:** `Scanner`, `for` loop, `if-else-if`, arithmetic operations, `double`, and `printf`.

**Grade scale used in this implementation:**

- A: 90% and above
- B: 80% to below 90%
- C: 70% to below 80%
- D: 60% to below 70%
- E: 40% to below 60%
- F: Below 40%

### 3. ATM Interface

- Displays an ATM menu.
- Allows the user to check the account balance.
- Supports depositing and withdrawing money.
- Validates transaction amounts.
- Prevents withdrawals when the balance is insufficient.

**Java concepts:** classes, objects, constructors, encapsulation, methods, `switch`, loops, and conditional statements.

**Initial sample balance:** Rs. 10,000.

### 5. Student Course Registration System

- Displays available courses and remaining slots.
- Allows a student to register using a course code.
- Prevents duplicate registrations.
- Checks course capacity before registration.
- Allows students to remove registered courses.
- Displays the courses registered by the student.

**Java concepts:** classes, objects, constructors, `ArrayList`, loops, and conditional statements.

**Note:** This is a console-based, single-student demonstration. Course and registration data are stored in memory and reset when the application closes. Database persistence is not included.

## Technologies Used

- **Programming Language:** Java
- **Development Kit:** Java Development Kit (JDK)
- **IDE:** IntelliJ IDEA
- **Core Topics:** Object-Oriented Programming, loops, conditional statements, methods, and collections

## Suggested Repository Structure

```text
CODSOFT/
│
├── README.md
│
└── CODSOFT_TASKSNO/
    ├── Task1_NumberGame/
    │   └── NumberGame.java
    │
    ├── Task2_StudentGradeCalculator/
    │   └── StudentGradeCalculator.java
    │
    ├── Task3_ATMInterface/
    │   └── ATMInterface.java
    │
    └── Task5_CourseRegistration/
        └── StudentCourseRegistration.java
```

*Adjust the folder and file names in this example if your actual repository uses a different structure.*

## How to Run

1. Install a Java Development Kit (JDK).
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA or another Java IDE.
4. Open the folder containing the task's `.java` file.
5. Run the class containing the `main()` method.

You can also compile and run a Java file using the terminal. For example:

```bash
javac NumberGame.java
java NumberGame
```

Run these commands from the directory containing the source file. Replace `NumberGame` with the class name of the task you want to execute.

## Learning Outcomes

- Practised Java input and output operations.
- Used loops and conditional statements.
- Generated random numbers.
- Created classes, objects, constructors, and methods.
- Applied encapsulation in a simple application.
- Used `ArrayList` to manage collections of objects.
- Built menu-driven console applications.
- Improved problem-solving and input-validation skills.

## Internship Information

- **Organization:** CodSoft
- **Program:** Java Development Internship
- **Repository:** CODSOFT

These projects were developed for learning and practice as part of the CodSoft Java Development Internship tasks.

---

**Thank you for visiting my repository!**
