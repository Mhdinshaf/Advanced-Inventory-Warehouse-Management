# 📦 Advanced Inventory & Warehouse Management System

A robust, enterprise-grade backend solution designed to streamline warehouse operations, inventory tracking, and resource management. Built using **Spring Boot** with a strict adherence to **Layered Architecture** for maximum scalability and maintainability.

## 🚀 Architectural Overview

This project implements a clean separation of concerns through a structured layered approach:
- **Controller Layer:** Handles REST API endpoints and request/response mapping.
- **Service Layer:** Contains core business logic and service implementations (`ServiceImpl`).
- **Repository Layer:** Manages data persistence using Spring Data JPA.
- **Entity Layer:** Defines the database schema and relationships (MySQL).
- **DTO (Data Transfer Object):** Facilitates secure and optimized data transfer between layers.
- **Config & Util:** Handles application-wide configurations (Swagger, Bean definitions) and helper classes.

## ✨ Key Features

- **Warehouse Management:** Full CRUD operations for managing multiple storage facilities.
- **User & Role Management:** System to handle Warehouse Managers and staff permissions.
- **Relationship Mapping:** Complex data mapping, including One-to-Many relationships (e.g., Manager to Warehouses).
- **Automated Object Mapping:** Utilizes **ModelMapper** for seamless Entity-to-DTO conversion.
- **API Documentation:** Integrated **SpringDoc OpenAPI (Swagger)** for interactive testing.

## 🛠️ Tech Stack

- **Language:** Java 17
- **Framework:** Spring Boot 4.0.0
- **Database:** MySQL
- **ORM:** Spring Data JPA / Hibernate
- **Libraries:**
  - **Lombok:** To reduce boilerplate code (Getters, Setters, Constructors).
  - **ModelMapper:** For clean object-to-object mapping.
  - **SpringDoc OpenAPI:** For automated API documentation.
  - **Maven:** For dependency management.

## 📂 Project Structure

```text
src/main/java/com/vibeit/inventory
├── config/         # System configurations (Swagger, Beans)
├── controller/     # REST Controllers
├── dto/            # Data Transfer Objects
├── entity/         # Database Entities
├── repository/     # JPA Repositories
├── service/        # Service Interfaces
│   └── impl/       # Service Implementations (Business Logic)
└── util/           # Utility classes and Constants
