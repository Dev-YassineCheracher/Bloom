# Bloom - Inclusive Skincare Website

![Bloom Website Screenshot](src/main/resources/static/assets/homepage-view.png)

Bloom is a responsive and elegant e-commerce front-end for a fictional skincare brand. The project demonstrates a modern web application built with a Java Spring Boot backend serving server-side rendered pages using Thymeleaf, and a clean, modern HTML & CSS front-end.

## Table of Contents

- [About The Project](#about-the-project)
- [Features](#features)
- [Built With](#built-with)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Project Structure](#project-structure)
- [Contact](#contact)

## About The Project

This project brings to life "Bloom," a pioneering beauty brand dedicated to harnessing the untapped potential of the ocean’s bounty, with a focus on sustainability and natural ingredients sourced from Morocco.

The application serves as a comprehensive demonstration of building a modern, server-side rendered web application. The backend is powered by the robust Spring Boot framework, which handles URL routing and serves dynamic HTML pages. The front-end is crafted with semantic HTML and styled with CSS to be fully responsive, providing an optimal viewing experience across all devices. Thymeleaf is used as the template engine to seamlessly integrate backend data with the front-end views.

## Features

- **Homepage:** A stunning landing page introducing the brand and its products.
- **Collection Page:** Displays all the products available in the Bloom skincare line.
- **Product Detail Pages:** Four unique, detailed pages for each featured product:
  - Gold Elixir
  - Decadent Cream
  - Hydra-Gel
  - Double Dip
- **About Us Page:** Tells the story and vision behind the Bloom brand.
- **Responsive Design:** A mobile-first approach ensures the site looks great on desktops, tablets, and smartphones.
- **Interactive Elements:** Features interactive modals for writing reviews and asking questions, powered by vanilla JavaScript.

## Built With

This project was built using the following technologies:

- **Backend:**
  - [Java](https://www.java.com/)
  - [Spring Boot](https://spring.io/projects/spring-boot)
  - [Spring Web](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- **Frontend & Templating:**
  - [Thymeleaf](https://www.thymeleaf.org/)
  - HTML5
  - CSS3
- **Build & Dependency Management:**
  - [Apache Maven](https://maven.apache.org/)

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

Make sure you have the following installed on your machine:
- Java Development Kit (JDK) 17 or higher.
- Apache Maven.
- A Git client.

### Installation

1.  **Clone the repository**
    ```sh
    git clone git@github.com:Dev-YassineCheracher/Bloom.git
    ```
2.  **Navigate to the project directory**
    ```sh
    cd Bloom
    ```
3.  **Run the application using the Maven wrapper**
    - On macOS/Linux:
      ```sh
      ./mvnw spring-boot:run
      ```
    - On Windows:
      ```sh
      mvnw.cmd spring-boot:run
      ```
4.  **View the application**
    Open your browser and navigate to `http://localhost:8080`.

## Project Structure

The project follows a standard Maven and Spring Boot directory structure:

```
bloom/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/bloom/bloom/
│   │   │       ├── BloomApplication.java  (Main entry point)
│   │   │       └── controller/
│   │   │           └── controller.java    (Handles URL routing)
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── assets/                (Images, videos)
│   │       │   └── css/                   (Stylesheets)
│   │       ├── templates/                 (Thymeleaf HTML files)
│   │       └── application.properties     (Spring configuration)
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml                            (Maven project configuration)
```

-   **`src/main/java`**: Contains all the Java source code, including the main application class and controllers.
-   **`src/main/resources/static`**: Holds all static assets. This includes CSS files, images, videos, and JavaScript files.
-   **`src/main/resources/templates`**: Contains the Thymeleaf HTML templates that are rendered by the controller.
-   **`pom.xml`**: The Project Object Model file for Maven, which defines project dependencies and build configurations.

## Future Enhancements & Roadmap

The current state of the Bloom project serves as a fully-responsive front-end showcase. The long-term vision is to develop it into a complete, full-stack e-commerce application. The following is a roadmap of planned features to be implemented using the Spring Boot ecosystem.

### 1. User Authentication & Management
-   **Implement Security:** Integrate **Spring Security** to build a robust user registration and login system with password hashing.
-   **User Profiles:** Create dedicated user profile pages where customers can view their order history, manage shipping addresses, and update their personal information.
-   **Role-Based Access:** Secure endpoints to ensure that actions like placing orders or writing reviews are restricted to authenticated users. Introduce an `ADMIN` role for managing products and users.

### 2. Dynamic Product & Review System
-   **Database Integration:** Connect the application to a relational database (e.g., PostgreSQL or H2 for development) using **Spring Data JPA**.
-   **Dynamic Products:** Migrate product information from static HTML to the database. Product details will be fetched dynamically and rendered on the collection and product pages.
-   **Persistent Reviews:** Rework the review functionality so that user-submitted reviews are saved to the database, linked to both the user and the product. The average rating for each product will be calculated and displayed dynamically.

### 3. Shopping Cart & Order Processing
-   **Shopping Cart:** Develop a full-featured shopping cart. Users will be able to add, update quantities, and remove items from their cart, with the session managed by Spring.
-   **Checkout Flow:** Design and implement a multi-step checkout process to collect shipping information and confirm order details.
-   **Order Persistence:** Upon a successful checkout, create and persist an order record in the database. The order will be linked to the user's account and will detail the products purchased, quantities, and total price.

### 4. Payment Integration
-   **Payment Gateway:** Integrate a secure, third-party payment gateway like the **Stripe API** to handle credit card transactions.
-   **Transaction Handling:** Implement logic to process payments during checkout. The application will need to securely send payment details to the gateway and handle the response.
-   **Order Status Updates:** Use webhooks or API callbacks from the payment gateway to automatically update the order status in the database (e.g., from `PENDING` to `PAID` or `FAILED`).

### How to Contribute

Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request.
1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Feat: Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

## Contact

Yassine Cheracher - [@Dev-YassineCheracher](https://github.com/Dev-YassineCheracher)

Project Link: [https://github.com/Dev-YassineCheracher/Bloom](https://github.com/Dev-YassineCheracher/Bloom)

