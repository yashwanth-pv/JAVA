# JAVA
Java is a high-level, general-purpose, object-oriented programming language designed to have as few implementation dependencies as possible. Originally developed by James Gosling at Sun Microsystems in 1995, its core philosophy is "Write Once, Run Anywhere" (WORA). This means compiled Java code can run on any platform that supports Java without the need for recompilation.

# The "Oak" Era (1991–1994)
* Secret Beginnings: The project began in June 1991. Gosling initially named the programming language Oak, after an oak tree that stood outside his office window.
* The Star7 (1992): The team built a handheld home-entertainment controller called the Star7, featuring a cartoon mascot named Duke (who remains Java's official mascot today).
* The Pivot: The digital cable television market was too immature for their technology. Realising the massive rise of the internet, the team refocused Oak to run inside web browsers.
* The Name Change: Due to a trademark conflict with Oak Technology, the team renamed the language Java in 1995, inspired by the large quantities of Java coffee they drank.

# Literals
Definition

Literals in Java are fixed constant values written directly in a program. They do not change during program execution and include integer, floating-point, character, string, boolean, and null literals.
In Java, **literals** are fixed values written directly in the source code. They represent constant values assigned to variables or used in expressions.

| Type               | Example              | Description                    |
| ------------------ | -------------------- | ------------------------------ |
| **Integer**        | `100`, `-25`, `0`    | Whole numbers                  |
| **Floating-point** | `3.14`, `2.5f`       | Decimal numbers                |
| **Character**      | `'A'`, `'7'`, `'\n'` | A single character             |
| **String**         | `"Hello"`            | A sequence of characters       |
| **Boolean**        | `true`, `false`      | Represents true/false          |
| **Null**           | `null`               | Represents no object reference |

# Variables
variables are containers used to store data values in memory during program execution. Every variable is assigned a specific data type, which determines the type and size of the values it can hold

Here’s a clean, GitHub-ready README section:

# Local Variables and Global Variables in Java

## Local Variables

A **local variable** is declared inside a method, constructor, or block. It can only be accessed within the area where it is declared.


## Global Variables

Java does not technically have **global variables** like some other programming languages. However, variables declared inside a class but outside methods are often referred to as **global variables** or **class-level variables**.


## Difference Between Local and Global Variables

| Feature        | Local Variable                       | Global/Class-Level Variable                  |
| -------------- | ------------------------------------ | -------------------------------------------- |
| Declaration    | Inside a method or block             | Inside a class, outside methods              |
| Scope          | Limited to the block or method       | Accessible according to access modifiers     |
| Initialization | Must be initialized before use       | Gets default values                          |
| Lifetime       | Exists during method/block execution | Exists as long as the object or class exists |
| Types          | Local variables                      | Instance or static variables                 |

# JVM memory (java virtual memory)
The Java Virtual Machine (JVM) is a software engine that loads, verifies, and executes Java bytecode, turning it into instructions your computer hardware can understand.

                 HOW A JAVA PROGRAM GETS EXECUTED
                 ────────────────────────────────

        CLASS LOADER                         JVM
        ────────────                         ───

        Loads main()              ┌─────────────────────────┐
              │                   │         STATIC          │
              │                   │                         │
              └──────────────────►│    Method Area          │
                                  │                         │
                                  ├─────────────────────────┤
                                  │         HEAP            │
                                  │                         │
                                  │    Objects & Arrays     │
                                  │                         │
                                  ├─────────────────────────┤
                                  │      JAVA STACK         │
                                  │                         │
                                  │ Local Variables         │
                                  │ Method Calls            │
                                  │                         │
                                  └─────────────────────────┘

* class loader is a program which loads main function in jvm.
* Static variables store in static area.

## where we can run java program 
* Inside jvm we have **JRE** (java runtime evironment).
* Inside **JRE** there is **JIT** (just in time).
   - └──► compiles when you start writing.
* **JDK** - Java development kit.
   - └──► For writing java program.

# Tokens
Tokens are the smallest elements of a program that is meaningful to the compiler. They are also known as the fundamental building blocks of the program. Tokens can be classified as follows:

1. Keywords
2. Identifiers
3. Constants/Literals
4. Operators
5. Separators * ► [] -> Brackets
              * ► {} -> Brases
              * ► () -> Paranthesis
              * ► : -> Colon
              * ► ; -> Semi colon
              * ► . -> Dot operator

# Keywords 
Keywords are the reserved words which we cannot use as variable name. There are 52 key words.

| No. | Keyword        | Description                                                               |
| --: | -------------- | ------------------------------------------------------------------------- |
|   1 | `abstract`     | Declares an abstract class or abstract method.                            |
|   2 | `assert`       | Tests a condition during debugging.                                       |
|   3 | `boolean`      | Declares a Boolean variable with values `true` or `false`.                |
|   4 | `break`        | Terminates a loop or `switch` statement.                                  |
|   5 | `byte`         | Declares an 8-bit integer variable.                                       |
|   6 | `case`         | Defines a branch inside a `switch` statement.                             |
|   7 | `catch`        | Handles an exception thrown inside a `try` block.                         |
|   8 | `char`         | Declares a single 16-bit Unicode character.                               |
|   9 | `class`        | Declares a class.                                                         |
|  10 | `const`        | Reserved but not used in Java.                                            |
|  11 | `continue`     | Skips the current loop iteration and continues with the next iteration.   |
|  12 | `default`      | Specifies the default branch in a `switch` statement.                     |
|  13 | `do`           | Starts a `do-while` loop.                                                 |
|  14 | `double`       | Declares a double-precision floating-point variable.                      |
|  15 | `else`         | Executes code when an `if` condition is false.                            |
|  16 | `enum`         | Declares an enumeration.                                                  |
|  17 | `extends`      | Indicates that a class inherits from another class.                       |
|  18 | `final`        | Prevents modification, overriding, or inheritance depending on its usage. |
|  19 | `finally`      | Defines code that executes after a `try` or `catch` block.                |
|  20 | `float`        | Declares a single-precision floating-point variable.                      |
|  21 | `for`          | Starts a loop that repeats based on a condition.                          |
|  22 | `goto`         | Reserved but not used in Java.                                            |
|  23 | `if`           | Executes code when a condition is true.                                   |
|  24 | `implements`   | Indicates that a class implements an interface.                           |
|  25 | `import`       | Imports classes or packages.                                              |
|  26 | `instanceof`   | Tests whether an object belongs to a particular type.                     |
|  27 | `int`          | Declares a 32-bit integer variable.                                       |
|  28 | `interface`    | Declares an interface.                                                    |
|  29 | `long`         | Declares a 64-bit integer variable.                                       |
|  30 | `native`       | Indicates that a method is implemented using native code.                 |
|  31 | `new`          | Creates a new object or array.                                            |
|  32 | `package`      | Declares the package to which a class belongs.                            |
|  33 | `private`      | Restricts access to within the same class.                                |
|  34 | `protected`    | Allows access within the same package and subclasses.                     |
|  35 | `public`       | Allows access from anywhere.                                              |
|  36 | `return`       | Exits a method and optionally returns a value.                            |
|  37 | `short`        | Declares a 16-bit integer variable.                                       |
|  38 | `static`       | Declares a member that belongs to the class rather than an object.        |
|  39 | `strictfp`     | Ensures consistent floating-point calculations across platforms.          |
|  40 | `super`        | Refers to the parent class object or constructor.                         |
|  41 | `switch`       | Selects one of several code blocks based on an expression.                |
|  42 | `synchronized` | Controls access to a block or method by multiple threads.                 |
|  43 | `this`         | Refers to the current object.                                             |
|  44 | `throw`        | Explicitly throws an exception.                                           |
|  45 | `throws`       | Declares exceptions that a method may throw.                              |
|  46 | `transient`    | Prevents a field from being serialized.                                   |
|  47 | `try`          | Defines a block of code for exception handling.                           |
|  48 | `void`         | Indicates that a method does not return a value.                          |
|  49 | `volatile`     | Indicates that a variable may be modified by multiple threads.            |
|  50 | `while`        | Starts a loop that continues while a condition is true.                   |
|  51 | `_`            | Reserved as a keyword since Java 9.                                       |
|  52 | `yield`        | Produces a value from a `switch` expression.                              |

# Operators
Java operators are special symbols used to perform computations and operations on variables and values.

# Arithmetic Operators
Arithmetic operators are used to perform common mathematical operations.
* a+b Addition
* a-b Subtraction
* a*b Multiplication
* a/b Division
* a%b MOdulus
* a++ Increment
* a-- Decrement

# Assignment Operator
Assignment operators are used to assign values to variables.
a = 20

# Relational Operators
Relational operators in Java are used to compare two values, variables, or expressions.
| Operator | Description |
|----------|-------------|
| `==` | Checks if two values are equal. |
| `!=` | Checks if two values are not equal. |
| `>` | Checks if the left value is greater than the right value. |
| `<` | Checks if the left value is less than the right value. |
| `>=` | Checks if the left value is greater than or equal to the right value. |
| `<=` | Checks if the left value is less than or equal to the right value. |

# Logical Operators
Logical operators are used to determine the logic between variables or values, by combining multiple conditions.
| Operator | Description |
|----------|-------------|
| `&&` (AND) | Returns `true` if both conditions are true. |
| `\|\|` (OR) | Returns `true` if at least one condition is true. |
| `!` (NOT) | Reverses the logical state of a condition. |

# Data types
|byte	|
|short |
|int |
|long	|
|float |
|double |
|boolean |
|char |
|string|

# Conditional statements
1. if
2. if-else
3. if-else if-else
4. switch-case
5. break
6. continue

Here’s the text extracted from the photo, cleaned up while keeping the original structure:

# Functions
Functions are block of code which will get executed only when you will call or invoke.**

### How to write a function
* You have to make the function inside the class.
* You can make the function above or below the main function.
* Function name always should be small letter or first letter.
* Types of functions:
  1. Functions without parameters
  2. Functions with parameters
