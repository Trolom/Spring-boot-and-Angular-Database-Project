# Spring-boot-and-Angular-Database-Project

## Description

This project is a full-stack web application that combines the strengths of Spring Boot, Angular, and MongoDB. The backend, powered by Spring Boot, establishes a connection to the MongoDB database, managing entities, repositories, services, and components for each table. On the frontend, Angular is used to create a dynamic and interactive user interface.

## Backend (Spring Boot)

Entities: Model the data structure in the MongoDB database. Each entity corresponds to a table, defining the fields and relationships.

Repositories: Custom repositories interact with the MongoDB database, providing essential methods for CRUD operations on entities.

Services: The service layer contains the business logic and orchestrates the flow of data between the controllers and repositories. It contains methods that implement the specific functionality required by the application, such as processing data, applying business rules, and orchestrating multiple repository calls.

Components: The backend includes components for each table. Each particular component class extends a generic class that implements the, otherwise, redundant code for CRUD operations.

## Frontend (Angular)
Navigation: The Angular frontend incorporates a navigation bar in app.component.html, offering easy access to different tables within the application.

Models: Define models corresponding to entities on the backend, ensuring a consistent data structure between the frontend and spring boot.

Services: Angular services facilitate communication with the backend by making HTTP requests to the Spring Boot API, enabling CRUD operations on entities. A generic class was also used here to minimize the redundant code.

Components: Angular components are created for each model, responsible for rendering the UI. The HTML of each component includes a table displaying existing elements, along with buttons for creating, editing, and deleting entities.

User Interface: The HTML of each component provides a user-friendly interface. It includes a create button that triggers a pop-up for entering necessary values. Additionally, edit and delete buttons are available for each existing entity, streamlining user interaction with the data.



## Conclusion

This comprehensive web application seamlessly integrates Spring Boot, Angular, and MongoDB to deliver a robust and user-friendly solution. The backend, powered by Spring Boot, efficiently manages data entities, repositories, services, and components. The modular design, featuring a generic service and component, ensures scalability and code reusability.

