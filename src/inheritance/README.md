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
 