Absolutely! Here's a **copy-paste ready** `README.md` for your project:

---

```markdown
# 📚 Online Book Store (Spring Boot + HTML/CSS/JS)

A full-stack online bookstore web application built with Spring Boot and a responsive frontend. Supports user registration, login, browsing books, cart management, placing orders, and admin features like adding books.

---

## ✅ Feature Overview

| Feature                 | Status     | Description                                                |
|------------------------|------------|-------------------------------------------------------------|
| 🏠 Home Page           | ✅ Done    | Landing page with search and filters                       |
| 📚 Book Listing        | ✅ Done    | Dynamic book listing from backend                          |
| ➕ Add Book (Admin)    | ✅ Done    | Admin-only book upload form                                |
| 👤 Signup/Login        | ✅ Done    | Auth with role-based redirection                           |
| 🔐 Role-Based Access   | ✅ Done    | ADMIN → admin.html, USER → books.html                      |
| 🛒 Cart + Order        | ✅ Done    | View cart, remove items, place orders                      |
| 🔐 Spring Security     | ✅ Configured | Secured APIs & static resource access                   |
| 🧠 MySQL Database      | ✅ Connected | Auto-creates book, user, orders tables                   |
| 🧪 Testing             | 🟡 In Progress | Manual tests done, unit tests pending                  |
| 🧑‍💻 Admin Panel       | ✅ Partial | UI done, links under development                             |

---

## 📁 Project Directory Structure

```

onlinebookstore/
├── src/
│   └── main/
│       ├── java/com.example.onlinebookstore/
│       │   ├── controller/
│       │   │   ├── BookController.java
│       │   │   ├── UserController.java
│       │   │   └── OrderController.java
│       │   ├── model/
│       │   │   ├── Book.java
│       │   │   ├── User.java
│       │   │   └── Order.java
│       │   ├── repository/
│       │   │   ├── BookRepository.java
│       │   │   ├── UserRepository.java
│       │   │   └── OrderRepository.java
│       │   ├── service/
│       │   │   ├── BookService.java
│       │   │   ├── BookServiceImpl.java
│       │   │   ├── UserService.java
│       │   │   ├── UserServiceImpl.java
│       │   │   ├── OrderService.java
│       │   │   └── OrderServiceImpl.java
│       │   ├── config/
│       │   │   └── SecurityConfig.java
│       │   └── OnlinebookstoreApplication.java
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── books.html
│           │   ├── login.html
│           │   ├── add-book.html
│           │   ├── cart.html
│           │   ├── admin.html
│           │   ├── contactus.html
│           │   ├── about.html
│           │   └── style.css
│           └── application.properties
├── pom.xml

````

---

## 🧰 Tech Stack

- **Backend:** Spring Boot, Spring Security, Spring Data JPA
- **Frontend:** HTML5, CSS3, JavaScript (Vanilla)
- **Database:** MySQL
- **Build Tool:** Maven
- **Security:** BCryptPasswordEncoder, Role-based Access

---

## ⚙️ Setup Instructions

### 1. Clone Repository

```bash
git clone https://github.com/Btw-Harsh/Online-Book-Store.git
cd Online-Book-Store
````

### 2. Configure MySQL DB

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/onlinebookstore
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the App

```bash
mvn spring-boot:run
```

### 4. Open in Browser

```
http://localhost:8080
```

---

## 🧪 API Endpoints (Sample)

| Endpoint                | Method | Description                 |
| ----------------------- | ------ | --------------------------- |
| `/api/books`            | GET    | Get all books               |
| `/api/books`            | POST   | Add a new book (Admin only) |
| `/api/users/register`   | POST   | Register a new user         |
| `/api/users/login`      | POST   | Login                       |
| `/api/orders`           | POST   | Place an order              |
| `/api/orders/user/{id}` | GET    | Get orders by user ID       |

---

## 📦 Future Plans

* 🔜 Add unit and integration tests
* 🔜 Admin panel → manage users/orders
* 🔜 JWT Authentication
* 🔜 Swagger API Docs
* 🔜 Dockerize project
* 🔜 Replace static HTML with React or Thymeleaf

---

## 🧑‍💻 Author

**Harsh**
GitHub: [@Btw-Harsh](https://github.com/Btw-Harsh)

---

## 📄 License

This project is licensed under the MIT License.

```

---

✅ Just copy and paste this into a file named `README.md` in your root project folder.

Let me know if you want me to include GitHub badges (like build passing, license, etc.) or a short walkthrough video/GIF integration!
```
