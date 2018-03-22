## Chapter 3

In this chapter we will start coding and talking about how the various portions of the Java language work.

### How do we convert our flow charts to code?

We have been using three things in our flowcharts:

#### Statements:
~~~
+---------------------------+
| Decrease the counter by 1 |
+---------------------------+
~~~
~~~
+---------------+
| Print "Hello" |
+---------------+
~~~
If they are simple, these will generally translate into a sngle line of code:
~~~
counter = counter -1;

system.out.print("Hello");
~~~
If they are complex, then we need to break them down further.  As an example think of the statements in my algorithm where I asked does everyone know about the meeting.

#### Conditionals:
~~~
          |
          |
          v
         / \
        /   \       Yes
   if our counter \-----------+
      equals 5    /           |
        \   /                 v
         \ /          +---------------+
          |           | Statement 1   |
       No |           +---------------+
          v                   |
+-----------------+           v
| Statement 3     |   +---------------+
+-----------------+   | Statement 2   |
          |           +---------------+
          |                   |
          +-------------------+
          |
          v
~~~

This translates into the code:
~~~
if( counter == 5 )
{
   Statement 1
   Statement 2
}
else
{
   Statement 3
}
~~~

#### loops

Any time we have an edge going back to a previous step, we have a loop.  Thi is an indication that we want to do some steps multiple times.

When we have a loop either it has a conditional in it somewhere that has oneoption tht leaves the loop, or we have a never ending, infinate loop.  We don't want infinate loops, so I'm going to assume that you have such a conditional in the sequence of steps that is repeated, similar to below:
~~~
          |
          v
  +---------------+
  | Statement 5   |
  +---------------+
          |
+-------->|
|         |
|         v
| +---------------+
| | Statement 6   |
| +---------------+
|         |
|         v
|        / \
|       /   \          Yes      +---------------+
|   if temp is less \ --------->| Statement 9   |
|      than 50      /           +---------------+
|       \   /                           |
|        \ /                            |
|         | No                          |
|         v                             |
| +---------------+                     |
| | Statement 7   |                     |
| +---------------+                     |
|         |                             |
|         v                             |
| +---------------+                     |
+-| Statement 8   |                     |
  +---------------+                     |
                                        v
  ~~~

For this we will wait to start the loop until we get to the conditional, then we will create a loop with the exit condition:

~~~
Statement 5
Statement 6
while( temp >= 50 )
{
   Statement 7
   Statement 8
   Statement 6
}
Statement 9
~~~

Note that with this condition we had to invert it, as the written test in the flowchart tested to exit the loop, not stay in it.

#### Tests
How can we test things in conditionals and loops?
~~~
When we test something we want the result to be true or false.  We know of some of these and use them regularly:
* <  less than
*  >  greater than
* == is equal to
* <= less than or equal to
*  >= greater than or equal to
~~~
What if we need something to not be one of these things?  For that we have a not opperator: 
* !

it can be used with the is equal to opperator to modifyit:
* != is not equal to

or it can be used with any test:
* !( 5 > 8 )

note the parenthesis here to indicate what we want the oppisite truth value of (parenthesis still evaluate before the not opperator.)

How could you write the above "temp is less than 50" test other than changing the less than opperator?


So you may be asking "What do I do if things get more complicated?"  For example what if you needed to test if a value was less than 10 or greater than 90?

There are multiple ways to do this, but to introduce you to one more tool for tests, I'm going to choose the method that is closest to what was written:
* (value < 10) || (value > 90)

There are two of these opperators:
* || logical OR.  If the item on either side is true, then return true, otherwise return false.
* && logical AND.  Only when the item on both sides is true, return true, otherwise return false.


This allows us to build up some wild sentances and translate them into logic:
If it is not the case that either the sky is blue or the water is red.

becomes:
if( !( (sky == blue) || (water == red) ) )

### Comments in Java
~~~
Use // to indicate that everything after is a comment *works for one row*
Use /*_____*/ to indicate that everything in between is to be seen as a comment
          Use comments for assistance too many can be very messy and unneccessary
~~~

### Initial Set Up
~~~
- public class (NAME of File)
  { 
          public static void main(String[]args)  (*** These two things are needed to have java run/ This MAIN is a function**)
          {
          }
  }
~~~
### Switch Statements
~~~
int i
switch(i%5)
{
case 0:
 -insert commands if condition met for this case -
case 1
case 2
case 3
case 4
default:
print 'i is a multiple of 5"
}

~~~
