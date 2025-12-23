# SOLID Principles

## Introduction

SOLID is a set of five object-oriented design principles that help
developers write **maintainable, scalable, and clean code**.\
These principles are especially important in **Low-Level Design (LLD)**
and are frequently tested in **interviews**.

SOLID stands for: - **S** -- Single Responsibility Principle - **O** --
Open/Closed Principle - **L** -- Liskov Substitution Principle - **I**
-- Interface Segregation Principle - **D** -- Dependency Inversion
Principle

------------------------------------------------------------------------

## S --- Single Responsibility Principle (SRP)

### Definition

A class should have **only one reason to change**.

### Explanation

Each class should focus on **one responsibility**. If a class handles
multiple concerns, changes in one concern may affect others.

### Real-Life Example

📄 **Employee** - Calculating salary → HR responsibility - Saving
employee data → Database responsibility - Sending emails → Communication
responsibility

Instead of one class doing all this, separate them into different
classes.

### Benefit

-   Easier maintenance
-   Better readability
-   Simpler testing

### Applying SRP
- Split responsibilities into separate classes
- Ensure each class has a single, well-defined purpose
- Changes in one responsibility should not impact others

## Key Points to Remember

- SRP is about **reasons to change**, not the number of methods
- A class can have many methods and still follow SRP
- SRP encourages high cohesion and low coupling
- SRP is the foundation of SOLID and clean architecture

------------------------------------------------------------------------

## O — Open–Closed Principle (OCP)

### Definition
Software entities (classes, modules, functions) should be open for extension but closed for modification.

---

### Explanation
Once a class is implemented and tested, its existing code should not be changed when new requirements are introduced.
Instead of modifying the class, new behavior should be added by extending it using abstraction, inheritance, or polymorphism.

This ensures existing functionality remains stable while allowing the system to grow.

---

### Real-Life Example
Vehicle Insurance System
- Car insurance → Car-specific calculation
- Truck insurance → Truck-specific calculation
- Bike insurance → Bike-specific calculation

If all insurance logic is written using `if-else` or `instanceof` checks in one class, adding a new vehicle requires modifying that class.

By letting each vehicle calculate its own insurance, new vehicle types can be added without changing existing code.

---

### Benefit
- Prevents breaking existing functionality
- Improves maintainability
- Enhances scalability
- Reduces risk of bugs during changes

---

### Applying OCP
- Use interfaces or abstract classes
- Prefer polymorphism over conditionals
- Avoid `if-else`, `switch`, or `instanceof` based logic
- Add new functionality by creating new classes instead of modifying existing ones

---

### Key Points to Remember
- OCP does not mean code should never change
- Existing, tested code should remain untouched
- New behavior should be added through extension
- Conditional logic based on types is a common OCP violation
- OCP is commonly implemented using Strategy and Factory patterns

---

### Interview One-Liner
Open–Closed Principle means a class should allow adding new functionality without modifying its existing code.