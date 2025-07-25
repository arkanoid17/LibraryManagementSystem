# Library Management System

## Project Overview
Build a library system where:
- The library can have Books, Magazines, and Journals.
- Some items can be loaned, others are for reading at the library only.
- Users (Members: Students, Professors) can borrow and return different types of library items.
- Books have categories (Fiction, Non-fiction, Academic).
- A loan management system keeps track of issued books.
- Features include late fees and borrowing limits.

---

## Milestone A: Represent User Structure

### Task 1: Create the Base User Class
- Define a class `User` with private attributes:
  - `String userId`
  - `String name`
  - `String contactInfo`
- Add getter and setter methods for `name` and `contactInfo` (encapsulation).

### Task 2: Add Constructors to User
- Implement:
  - Default constructor (initializes `userId` using `generateUniqueId` method; return 0 for now).
  - Parameterized constructor (initializes `name` and `contactInfo`).
  - Copy constructor (copies attributes from another `User`).
- Test constructors by creating instances in a test class.

### Task 3: Make User an Abstract Class
- Mark `User` as abstract.
- Declare abstract methods:
  - `void displayDashboard()`
  - `boolean canBorrowBooks()`
- These methods are abstract to enable polymorphism.

### Task 4: Create a Subclass Member
- Create a concrete subclass `Member` that extends `User`.
- Add private attributes:
  - `int borrowedBooksCount`
  - Constant `MAX_BORROW_LIMIT = 5`
- Override abstract methods:
  - `displayDashboard()` displays Member Dashboard and books borrowed.
  - `canBorrowBooks()` returns true if `borrowedBooksCount < MAX_BORROW_LIMIT`.
- Add constructors to initialize `Member`.

### Task 5: Create a Subclass Librarian
- Create a subclass `Librarian` that extends `User`.
- Add private attribute: `String employeeNumber`.
- Override abstract methods:
  - `displayDashboard()` displays Librarian Dashboard and employee number.
  - `canBorrowBooks()` always returns true.
- Add methods for librarian actions (implementations as comments):
  - `void addNewBook(Book book)`
  - `void removeBook(Book book)`

### Task 6: Demonstrate Static and Final Concepts
- Add a static counter `totalUsers` and method `getTotalUsers()` to track total users.
- Write a `generateUniqueId()` method (marked `final`) to create unique user IDs.
- Ensure `generateUniqueId` cannot be overridden and `totalUsers` tracks users accurately.

---

## Milestone B

### Task 1: Create the Lendable Interface
- Define the `Lendable` interface with methods:
  - `boolean lend(User user)`
  - `void returnBook(User user)`
  - `boolean isAvailable()`
- Interfaces enable compile-time polymorphism.
- Create a test class to simulate borrowing a book with a dummy class implementing `Lendable`.

### Task 2: Implement the Abstract Book Class
- Create the abstract `Book` class implementing `Lendable` with private attributes:
  - `String isbn`, `String title`, `String author`, `boolean isAvailable`
- Implement `Lendable` methods:
  - `lend(User user)`: If available and user can borrow, mark as unavailable and return true.
  - `returnBook(User user)`: Mark as available.
  - `isAvailable()`: Return status.
- Add abstract method: `void displayBookDetails()`.

---

## Milestone C

### Task 1: Set Up Collections
- Create `LibraryManagementSystem` class with:
  - `List<Book> bookInventory` (all books)
  - `List<User> registeredUsers` (all users)
- Add methods:
  - `addBook(Book book)`
  - `registerUser(User user)`
- Test by adding books/users and printing details.

### Task 2: Implement Search Functionality
- Add static method `searchBooks(String criteria)` to search by title/author.
- Overload with `searchBooks(String criteria, String type)` to filter by book type (e.g., "TextBook", "NovelBook").
- Test overloaded methods with different inputs.

### Task 3: Integrate Book and User Management
- In `main` method:
  - Create instances of `TextBook` and `NovelBook` and add to library.
  - Create `Member` and `Librarian` instances and register them.
  - Print details of all books and users.

### Task 4: Demonstrate Lending Functionality
- Simulate lending a book:
  - Attempt to lend a `TextBook` to a `Member` using `lend(User user)`.
  - Print success message if lending is successful.
- Handle scenarios:
  - Book already lent.
  - User exceeds borrowing limit.
- Test lending with different book/user types.

### Task 5: Manage Returns
- Simulate returning a book with `returnBook(User user)`.
- Ensure book can be lent again after return.
- Test by printing availability before/after returning.

### Task 6: Advanced Features
- Add `displayAllBooks` to print all books.
- Add `displayRegisteredUsers` to print all users.
- Demonstrate searching by title/author and by type.

### Task 7: Add Constructors to the Book Class
- Add:
  - Default constructor (sets `isAvailable` to true).
  - Parameterized constructor (for `isbn`, `title`, `author`).
  - Copy constructor (from existing `Book`).
- Test by creating objects with each constructor.

### Task 8: Create TextBook Class
- Define `TextBook` as a subclass of `Book` with:
  - `String subject`, `int edition`
- Add parameterized constructor for all attributes.
- Override `displayBookDetails()`.
- Test by creating and calling methods.

### Task 9: Create NovelBook Class
- Define `NovelBook` as a subclass of `Book` with:
  - `String genre`
- Add parameterized constructor for all attributes.
- Override `displayBookDetails()`.
- Test by creating and calling methods.

---

## Resources
- [Static Keyword in Java](https://www.scaler.com/topics/static-keyword-in-java/)
- [Final Keyword in Java](https://www.scaler.com/topics/java/final-keyword-in-java/)

---

## Notes
- Follow object-oriented principles: encapsulation, inheritance, abstraction, and polymorphism.
- Use comments and test classes to demonstrate and verify each milestone.
