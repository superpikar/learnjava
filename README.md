# Learn Java, We Want To Make a Decent Website
Learn Java

## Java (Java Memory Model)
- C/C++ without manual memory allocation
- Stack vs Heap
- OS allocate stack and Heap
- Stack attached to thread, usually one heap per application
- Memory cleaning (grabrage collector) happens in Heap

## OOP (Object Oriented Programming)
OOP is designated to make complex project more manageable
- A lot of overhead
- Slower and unnecessary for smaller project

OOP
- Encapsulation (Class, access, modifier). [example](/examples/oop/encapsulation/Vehicle.java)
- Inheritance [example](/examples/oop/inheritance/Truck.java)
- Polymorphism (Abstract vs Interface)
  - Abstract [example](/examples/oop/abstractt/SportCar.java)
  - Interface [example](/examples/oop/interfacee/AirPlane.java)
  - Composition over Inheritance. comparing the source code of [inheritance](/examples/oop/inheritance/KiaCityCar.java) vs [composition](/examples/oop/compositionoverinheritance/HyundaiCityCar.java)
  - Coding to Interface [example](/examples/oop/compositionoverinheritance/HyundaiCityCar.java)
  - [Dependency Injection](/docs/oop-dependencyinjection) [example](/examples/oop/dependencyinjection)
  - [Test Driven Development](/docs/oop-tdd)

## Good Coding Practice
- Single responsibility : A class/method should have only one purpose.
- Open/closed : Open for extension, closed for modification.
- Liskov substitution : Child and parent class need to be compatible, use inheritance if sub class add extra de restriction. ex: Square Extend Rectangle
- Interface Regregration : Many client-spesific interface
- Dependency Inversion : Depend on abstraction not concretion

## Typical Application Module
- Datasource and Connection
- Transaction and Logging
- Security and Access Control
- Preference & Configuration
- Modular Design
  - Control Layer
  - Business Logic
  - Presentation Layer
- Mail & Messaging
- Social Features

## Spring Framework
- Released 2003
- Singleton is default Bean Behaviour
- Goals :
  - Easier enterprise app Development
  - Eliminate common task
  - Promote good programming practice
  - Focus on problem

## Java Style Guidline
- Methods follow some logical order
  - grouped by functionality
  - never split overloaded function/method
- Always use braces, even for "if" with single statement
  - KR&R style braces (egyptian brackets)
  - no line break after opening braces
  - line break after opening brace
  - line break before opening brace
  - line break after the closing brace if it terminate method, class
  - empty block brace no line-break
- vertical alignment (blank line break)
- horizontal alignment (permitted, not neccessary)
- one variable per declaration
- local variable devlared close to where it's used, must be initialized directly, masrk with final if it is immutable
- square brackets array, part of the type
  - String[] args, not String args[]
- Package name all lower case
- Class name TitleClase
- Method name camelCase
- Constant CONSTANT_CASE
- Javadoc must be present for every public and protected methods
- Tab indentation
