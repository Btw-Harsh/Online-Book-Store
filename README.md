# 📚 Online Book Store (Spring Boot + HTML/CSS/JS)

A full-stack online bookstore web application with a secure Spring Boot backend and responsive frontend. This project supports user registration, login, browsing books, cart management, placing orders, and admin functions like adding books.

---

## 🌐 Live Features

| Feature                      | Status     | Description                                                                 |
|-----------------------------|------------|-----------------------------------------------------------------------------|
| 🏠 Home Page                | ✅ Done    | Landing page with search and filtering                                     |
| 📚 Book Listing             | ✅ Done    | Dynamic book list populated via REST API                                   |
| ➕ Add Book (Admin Only)    | ✅ Done    | POST new book via form to backend                                          |
| 👤 Signup/Login             | ✅ Done    | Authentication with role-based redirects                                  |
| 🔐 Role-Based Access        | ✅ Done    | Admins redirected to dashboard, users to book listing                      |
| 🛒 Cart + Order             | ✅ Done    | Add/remove books from cart, place orders                                   |
| 🔐 Spring Security          | ✅ Configured | BCrypt password encryption, path-based access control                     |
| 🧠 MySQL Database           | ✅ Connected | Schema auto-generated using JPA                                            |
| 🧪 Testing                  | 🟡 In Progress | Manual tests complete; unit tests pending                              |
| 🧑‍💻 Admin Panel            | ✅ Partial | UI complete, backend integration in progress                               |

---

## 📁 Project Structure (Backend + Frontend)

onlinebookstore/
├── src/
│ └── main/
│ ├── java/com.example.onlinebookstore/
│ │ ├── controller/ # REST Controllers
│ │ │ ├── BookController.java
│ │ │ ├── UserController.java
│ │ │ └── OrderController.java
│ │ ├── model/ # Entity Models
│ │ │ ├── Book.java
│ │ │ ├── User.java
│ │ │ └── Order.java
│ │ ├── repository/ # JPA Repositories
│ │ │ ├── BookRepository.java
│ │ │ ├── UserRepository.java
│ │ │ └── OrderRepository.java
│ │ ├── service/ # Business Logic
│ │ │ ├── BookService.java
│ │ │ ├── BookServiceImpl.java
│ │ │ ├── UserService.java
│ │ │ ├── UserServiceImpl.java
│ │ │ ├── OrderService.java
│ │ │ └── OrderServiceImpl.java
│ │ ├── config/
│ │ │ └── SecurityConfig.java
│ │ └── OnlinebookstoreApplication.java
│ └── resources/
│ ├── static/ # Frontend Pages
│ │ ├── index.html
│ │ ├── books.html
│ │ ├── login.html
│ │ ├── add-book.html
│ │ ├── cart.html
│ │ ├── admin.html
│ │ ├── contactus.html
│ │ ├── about.html
│ │ └── style.css
│ └── application.properties # DB credentials, server port
├── pom.xml # Maven dependencies

yaml
Copy
Edit

---

## ⚙️ Technologies Used

- **Backend:** Spring Boot, Spring Security, Spring Data JPA
- **Frontend:** HTML5, CSS3, Vanilla JS
- **Database:** MySQL
- **Security:** BCryptPasswordEncoder, Role-based Access Control
- **Build Tool:** Maven

---

## 🛠 Setup Instructions

### 🔧 Prerequisites

- Java 17+
- Maven
- MySQL Server

### 📥 Installation Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/Btw-Harsh/Online-Book-Store.git
   cd Online-Book-Store
Configure Database
Edit src/main/resources/application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/onlinebookstore
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
Run the Application

bash
Copy
Edit
mvn spring-boot:run
Access the App
Open your browser: http://localhost:8080

🧪 Testing (In Progress)
Manual UI testing is currently being performed

Unit and integration tests with JUnit & Mockito to be added

🔐 Security Highlights
Role-based redirects (ADMIN vs USER)

Passwords hashed with BCrypt

Only static pages are open; all API endpoints protected

📦 API Endpoints (Sample)
Endpoint	Method	Description
/api/books	GET	Fetch all books
/api/books	POST	Add a new book (admin)
/api/users/register	POST	Register a new user
/api/users/login	POST	Authenticate user
/api/orders	POST	Place an order
/api/orders/user/{id}	GET	View user's orders

✨ Future Enhancements
✅ Unit & Integration Testing

✅ Admin panel with view/edit/delete support

🔜 JWT-based Authentication

🔜 REST API Documentation (Swagger/OpenAPI)

🔜 Switch to Thymeleaf or React for frontend

🔜 Dockerization

📄 License
This project is licensed under the MIT License.

🤝 Contributing
Contributions and feedback are welcome!

Fork the project

Create a feature branch: git checkout -b feature-name

Commit changes: git commit -am 'Add feature'

Push: git push origin feature-name

Create a pull request

🙋‍♂️ Contact
Built by @Btw-Harsh


