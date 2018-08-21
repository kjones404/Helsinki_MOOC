# <a name="01.01.00.00"></a>1. The program and the source code

## <a name="01.01.01.00"></a>1.1 Source code

A computer program is composed of commands written in the *source code*. A computer generally runs *commands* in the source code from *top to bottom* and *from left to right*. Source code is saved in a textual format and will be *executed* somehow.

## <a name="01.01.02.00"></a>1.2 Commands

Computers execute different *operations*, or actions, based on the commands. For example, when printing the text "Hello world!" on the screen, it is done by the command `System.out.println`.

```
System.out.println("Hello world!");
```

The `System.out.println` command prints the string given inside the brackets on the screen. The suffix `ln` is short for the word *line*. Therefore, this command prints out a line. This means that after the given string has been printed, the command will also print a line break.

## <a name="01.01.03.00"></a>1.3 Compiler and interpreter

Computers do not directly understand the programming language we are using. We need a *compiler* between the source code and the computer. When we are programming using the command line interface, the command `javac Hello.java` will compile the `Hello.java` file into *bytecode*, which can be executed using the Java interpreter. To run the compiled program, you can use the command `java Hello` where Hello is the name of the original source code file.

When using a modern development environment (more on this later), it will take care of compiling the source code. When we choose to run the program, the development environment will compile and execute the program. All development environments compile source code while it is being written by the programmer, which means that simple errors will be noticed before executing the program.

## <a name="01.01.04.00"></a>1.4 Components of commands

### <a name="01.01.04.01"></a>1.4.1 Semicolon

A semicolon `;` is used to separate different commands. The compiler and the interpreter both ignore line breaks in the source code, so we could write the entire program on a single line.

In the example below we will use the `System.out.print` command, which is similar to the `System.out.println` command except that it will not print a line break after printing the text.

__Example of how the semicolons are used__

```
System.out.print("Hello "); System.out.print("world");
System.out.print("!");
```

```
Hello world!
```

Even though neither the compiler nor the interpreter need line breaks in the source code, they are very important when considering human readers of the source code. Line breaks are required to divide source code in a clear manner. Readability of source code will be emphasized throughout this course.

### <a name="01.01.04.02"></a>1.4.2 Parameters (information passed to commands)

The information processed by a command are the *parameters of a command*. They are passed to the command by placing them between `()` brackets that follow the command name. For example, the `System.out.print` command is given the text *hello* as a parameter as follows: `System.out.print("hello")`.

### <a name="01.01.04.03"></a>1.4.3 Comments

*Comments* are a useful way to make notes in the source code for yourself and others. Everything on a line after two forward slashes `//` is treated as a comment.

### <a name="01.01.04.04"></a>1.4.4 Example of using comments

```
// We will print the text "Hello world"
System.out.print("Hello world");

System.out.print(" and all the people of the world."); // We print more text to the same line.

// System.out.print("this line will not be executed, because it is commented out");
```

The last line of the example introduces a particularly handy use for comments: you can comment out code instead of completely deleting it if you want to temporarily try out something.

## <a name="01.01.05.00"></a>1.5 More about printing

As we can see from the examples above, there are two commands for printing.

*  `System.out.print` prints the text without the line break at the end
*  `System.out.println` prints the text and the line break

The printed text can contain both traditional characters and special characters. The most important special character is \n, which stands for a line break. There are also other [special characters](https://en.wikipedia.org/wiki/Escape_character).

```
System.out.println("First\nSecond\nThird");
```

When executed, the example above prints:

```
First
Second
Third
```

# <a name="01.02.00.00"></a>2. Main program body

The body for a program named "Example" is as follows:

```
public class Example {
    public static void main(String[] args) {
        // program code
    }
}
```

The program is stored in a text file named after the program with the `.java` extension. For a program named *Example*, the file should be named `Example.java`.

The execution of the program begins at the part marked with the *// program code* comment above. During our first week of programming, we will limit ourselves to this part. When we are talking about commands such as printing, we need to write the commands into the program body. For example: `System.out.print("Text to be printed");`

```
public class Example {
    public static void main(String[] args) {
        System.out.print("Text to be printed");
    }
}
```

From this point on, the main program body will be omitted from the examples.

# <a name="01.03.00.00"></a>3. Getting to know your development environment

Programming these days takes place in development environments almost without exceptions. The development environment provides several tools and features to assist the programmer. Although the development environment does not write the program on behalf of the programmer, it contains several handy features such as hinting about mistakes in code and assisting the programmer to visualize the structure of the program.

In this course, we will use the [NetBeans](http://netbeans.org/) development environment. A guide for using NetBeans is available [here](http://mooc.fi/courses/general/programming/how-to-get-started.html#completing-and-submitting-the-programming-assignments).

Until you become familiar with NetBeans, follow the guides and steps precisely. Most of the following exercises show what needs to be printed to the screen for the program to function correctly.

__Note:__ Do not do the exercises by writing code and then clicking the test button. You should also execute the code manually (green arrow) and observe the result on the screen. This is especially useful if an exercise fails to pass the tests.

In the following exercises, we will practice the use of NetBeans and printing of text on the screen.

__Remember to read the [guide on using NetBeans](http://mooc.fi/courses/general/programming/how-to-get-started.html#completing-and-submitting-the-programming-assignments) before you continue!__

Please answer to our survey: here. It will take less than five minutes.

* Exercise 1: Name

* Exercise 2: Hello world! (And all the people of the world)

* Exercise 3: Spruce

__Note:__ You probably wrote `System.out.println("...")` quite a few times. Try typing only `sout` on an empty line in NetBeans and then press the [tab key](http://en.wikipedia.org/wiki/Tab_key). What happened? This tip will save a lot of your time in the future!
