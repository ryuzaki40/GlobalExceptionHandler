# 🛡️ GlobalExceptionHandler (Spring Boot)

A reusable component for centralized exception handling in Spring Boot REST APIs using `@RestControllerAdvice`.

---

## 💡 Features

- Handles custom exceptions like `ResourceNotFoundException`
- Returns clear, consistent error responses
- Uses standard HTTP status codes
- Easy to plug into any Spring Boot application

---

## ⚙️ How It Works

The component listens for exceptions thrown by controllers and handles them gracefully. It wraps error details in a structured `ErrorResponse` object and returns it as a response.

---

## 🧪 Example API Behavior

When a resource is not found:

```http
GET /api/users/123
