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