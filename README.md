
# 🛒 Ecom

A sample e-commerce application built using **Spring Boot**, providing a robust RESTful API for managing the platform. It handles all server-side operations, including product management, database interactions, and file uploads.

---

## ✨ Features

* **RESTful APIs**: Endpoints for managing products (CRUD operations).
* **Database Integration**: Uses PostgreSQL for data persistence.
* **File Uploads**: Supports image uploads for products.
* **Search Functionality**: Search products by name, brand, description, or category.
* **Layered Architecture**: Clean separation of concerns with Controller, Service, and Repository layers.
* **Error Handling**: Custom exception handling for better API responses.

---

## 🛠️ Tech Stack

* **Framework**: Spring Boot
* **Database**: PostgreSQL
* **ORM**: JPA (Java Persistence API)
* **Build Tool**: Maven
* **Utilities**: Lombok for reducing boilerplate code

---

## 📁 Folder Structure

```
├── controller       # Handles incoming HTTP requests
│   └── ProductController.java
├── service          # Business logic
│   └── ProductService.java
├── repository       # JPA repository interfaces
│   └── ProductRepo.java
├── model            # Entity classes
│   └── Product.java
├── exception        # Custom exceptions and handlers
```

---

## 📌 Key Endpoints

### 📦 Product Management

* **Get All Products**: `GET /api/products`
* **Get Product by ID**: `GET /api/products/{id}`
* **Search Products**: `GET /api/products/search?keyword={keyword}`
* **Add Product**: `POST /api/products`
* **Update Product**: `PUT /api/products/{id}`
* **Delete Product**: `DELETE /api/products/{id}`

### 🖼️ File Uploads

* **Upload Product Image**: `POST /api/products/{id}/upload`

---

## 🚀 Future Enhancements

* Add user authentication and authorization using **Spring Security**.
* Implement **order management** and **payment integration**.
* Add **caching** for frequently accessed data using **Redis**.
* Deploy the backend to cloud platforms like **AWS** or **Azure**.

