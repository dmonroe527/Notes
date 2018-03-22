# Chapter 2

In this chapter we talk about programing: ideas on how to be better at it; structures and basic building blocks; and approaches.

We will look at two methods to express your approach to solving a problem.
1 pseudocode - natural language description, in a language like english
2 flow chart
  * rectangles for steps in the solution
  * diamonds for decisions that need to be made
  * arrows going from one shape to another to direct the flow of the answer.


#### Algorithms 
If the steps you put together will lead to a solution to the problem, then you have an algorithm for it.

How do you know if it leads to a solution?  You have to know what the solution looks like before you can figure out how to get there.  ( You also have to know what things can make up the algorithm (the tools) before you can construct it.)
  * Planning a trip: where to, for how long, for what goal?
  
Problem:
  You are part of an organization where the members do not see each other all that often, however some members are willing to meet up.  You know who these pairs are.  How long will it take you to get a message out to all the members about the next meeting, if you want the message to be hand delivered to everyone?
  * graph
  * time
  * plan
  
  Start this with pseudocode
  
#### Variables
These are named places to hold information in your program.  The informaiton can be of different types: a char, a sequence of characters (String), an integer, a number with a decimal (Float), a list, a dictionary(include array and etc) , a grid of one of these types.

Each variable is like a pad of sticky notes.  You can write on the front sheet, and when you want, you can rip that sheet off, and write something (possibly different) on the newly exposed sheet.  The variable name holds the information on the currently showing sticky note.

#### Operators
You are familar with multiple binary operators (meaning in they work on two items at once).  Multiplication * , Division / , Addition + , Subtraction - . Modulo(%) is used instead of division (/) when dealing with int because if there is a decimal it is trunkated(cutout)

Does order matter with the operands of an operator?  (the order of the items that are passed to the operator?)

If we are only able to use integers for the above operations, what piece of information are we loosing when we store the answer back to an integer?  The operator to get this info with one step is the % operator.

We have a special operator, it is the assignment operator.  This is the operator that removes the top sheet of the stickynote pad and writes a value on the next sheet.  In Java we will use a single equals sign to indicate this.  In your book they use a left pointing arrow in pseudocode to represent this.  You can probably guess that a variable must be on the left side (the sticky note pad we are going to place a value on for later use), and a value of the appropriate type on the right hand side.


if all letters in the next lines are integers, is the following valid, why:
  * a = b + c
  	when evaluating the statement above the addition is done first (all of the rules of operand is done) and assignment done last
		as it process it does the following a=(b+c)
  **g = h / i
  	Same as first *
	
  *** r + s = t * u
  	INVAILD- does not work


There are other operators that we will talk about as the class progresses.

##### testing operators

There are operators that return true or false instead of a numeric value.  Many of these you are already familar with, and most are BINARY (take two operands):
  (1) <     less than
  (2) >     greater than
  (3) <=    less than or equal to
  (4) >=    greater than  or equal to
  (5) ==    equal to
  (6) !=    not equal to
  
You can also combine logic tests together with the operators:
  (7) &&    'and' returns true if the items on either side are both true
  (8) ||    'or'  returns true if at least one of the items on it's sides is true.
  
Finally our first UNARY operator (meaning it only takes one operand)
  * !     'not' returns false if the operand following it is true, and returns true if that operand is false
  	** Can be used to negate statements 
		ie: !(a==5) reads as return true for a not equal to 5

#### Tracing a program
This is a skill that helps you track down what is happening during a program to find why it is not giving you the result you expected it to.

We will start by doing this on paper, and as we get towards coding, we will learn about some of the tools on the computer to aid in this process.
  


#### Input and Output
A computer is a great tool, and it can do a lot.  However if we can't communicate with it, it does us little good.


This is just trying to make you aware that we need tha ability to provide informaiton to our programs, and for our programs to provide information back to us if we want the programs to truely be useful.


For the sake of flowcharts, you can use the words input and output (print) for these steps.  The book also uses these terms in it's fomalized pseudocode examples.

#### Logic Steps  (Flow of Control)
We can string these above steps together, but we need ways to only do the steps some of the time or to do a few of them many times.

##### If structure:
  * if                 do this poriton of code only if the test is true
  * if - else          same as the if, but has a second portion of code that is followed only if the test is not true.
  * if - else if       Same as if-else, however only runs the second poriton if the first test if false and a second is true.
  
How to determine which to use?  Partially practice, and being *lazy*.



Write out an example of a program that gives an indication of a kid of what they should wear based upon the tempature.

##### Loop structure:
  * while
  * do - while
  * for

What does the flow chart diagram look like for each of these?

Notice that each has a test in it.

What would our algorithm look like to sum the numbers from 1 to 50?  from 1 to a number entered by a user?

How do we approach stoping a loop?  The most common is to use a variable to count up from 0 and test if it is less than a vlue equal to the number of times you want the loop to hapen.

The book describes this and two other methods of using a loops test to stop the computer from going into the loop again.

##### Combining these control structures:






