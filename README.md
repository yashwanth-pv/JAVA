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
> Inside jvm we have **JRE** (java runtime evironment).
> Inside **JRE** there is **JIT** (just in time).
   .compiles when you start writing.
> **JDK** - Java development kit.
  . For writing java program.
