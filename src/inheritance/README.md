# Inheritance in Object-Oriented Programming

## Types of Inheritance
1. Single (Simple) Inheritance.
2. Hierarchical Inheritance.
3. Multiple Inheritance.(NOT ALLOWED IN JAVA!!)
4. Multi-level Inheritance.
5. Hybrid Inheritance.

## Polymorphism
### Types of polymorphism
1. Method Overloading
- Changing the behaviour of a method on the basis of parameters (inputs).
- we can change the number of parameters.
- we can change the type of parameters.
 
2. Method Overriding
- Changing the behaviour of a method on the basis of the object that calls it.
- the method signature needs to be exactly same, no exceptions!

## Visibility Modifiers In Inheritance
1. public
2. private
3. protected
4. default>.

--- 
## Binding
It is the association of a method call to its method body, done by the compiler.

### Static Binding
It is performed at the compile-time (before the execution of the code),
by the compiler. It is also known as `early binding`.

### Dynamic Binding
The compiler is not able to reolve the method call at compile time.
Ex - method overriding.

## Dynamic Method Dispatch
- It is a mechanism by which we can achieve runtime polymorphism for overridden methods 
in Java.

- It is implemented with the help of a reference variable of the superclass (parent class).

- A reference variable of the parent class can refere to the reference value of 
an object of the child class.

- There can be many subclasses (children classes) inherited from a single parent class.

- Each child class will have its own version of the overridden method.

- The compiler will use Dynamic Method Dispatch to choose the correct version of
the overridden method that should be executed.
 
 
---
We already know that we have 4 types of program units in Java, so far
we have been working with one of the types extensively.
1. Classes (Definition class or an Execution Class)
2. Abstract Classes
3. Interfaces
4. Enums

## Abstract Classes in Java
- There are some situations in which when we declare a parent-class, and some child classes,
it may happen that, we do not want to initialize a parent class by declaring its objects,
but we want the child classes to override the methods of the parent class and use them.
- OR Every method created in the parent class is overridden in every child class,
so, no child class is actually using the functionality of the method defined in the 
parent class.


## Interfaces in Java