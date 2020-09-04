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
- The abstract methods are not fully defined in the super class.
- Only the subclasses contain the method body of the overridden methods.
- Any class that has any number of abstract methods has to be declared as an abstract
class.
- If the parent class is declared as an abstract class, it is necessary for all its
child classes to implement (override) all the abstract methods.
- There should at least 1 abstract method in any abstract class.a

## Interfaces in Java
- We know that in Java, we cannot implement multiple inheritance by using classes.
- A single class can have only a single parent class.
- We can overcome this problem using Interfaces in Java.

### Similarities between an Interface and a Class.
1. Declaring an interface is similar to declaring a class; we just use the 
`interface` keyword instead of the `class` keyword.
2. Interfaces can also have visibility modifers just like classes.
 Interfaces can be `public` or `<default>`.
3. We can create reference variables of Interfaces just like classes.
4. An interface can contain inner classes and/or inner interfaces. 
5. Since Java 8, we can define methods in an Interface with the `<default>` or 
the `static` keywords.

### Difference between an Interface and a Class.
1. Interfaces cannot implement other interfaces, we need a class.
2. In classes, we can have method with bodies, but interfaces have abstract methods.
Since Java 8, we can have methods with bodies in Interfaces also.
3. The methods declared in interfaces are implicitly public.
4. An interface does not contain instance variables.
5. The variables in an interface are public, static and final.
6. Interfaces cannot have constructors.
7. An interface cannot extend a class only interfaces.
8. A class can extend only one class  but an interface can extend many interfaces.
