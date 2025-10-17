# NomNom

## Introduction
NomNom is a real-time chat application that allows users to communicate instantly over the web. It leverages modern web technologies and protocols to provide a smooth, interactive chatting experience. The backend is built using Spring Boot, ensuring robust and scalable server-side communication via WebSockets and STOMP messaging. The frontend dynamically renders content with Thymeleaf, and uses JavaScript libraries like SockJS and STOMP.js for real-time message handling.

## Tech Stack

### Backend (Server-Side)
- Spring Boot
- Spring WebSocket
- Spring Messaging (STOMP - Simple Text Oriented Messaging Protocol)
- Thymeleaf

### Frontend (Client-Side)
- Thymeleaf
- JavaScript (ES6)
- SockJS
- STOMP.js
- HTML/CSS

### Development and Instruction Tools
- Maven

---

**Note:**  
Thymeleaf is a server-side template engine used to dynamically render HTML elements.

---

## Library and Integration Badges

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-green?logo=spring)](https://spring.io/projects/spring-boot)  
[![WebSocket](https://img.shields.io/badge/WebSocket-API-blue)](https://developer.mozilla.org/en-US/docs/Web/API/WebSockets_API)  
[![STOMP](https://img.shields.io/badge/STOMP-Over_WebSocket-orange)](https://stomp.github.io/)  
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-yellowgreen)](https://www.thymeleaf.org/)
[![JavaScript](https://img.shields.io/badge/JavaScript-ES6-yellow?logo=javascript)](https://developer.mozilla.org/en-US/docs/Web/JavaScript)  
[![SockJS](https://img.shields.io/badge/SockJS-v1.6-blueviolet)](https://github.com/sockjs/sockjs-client)  
[![STOMP.js](https://img.shields.io/badge/STOMP.js-v2.3-lightgrey)](https://github.com/stomp-js/stompjs)  
[![HTML5](https://img.shields.io/badge/HTML5-orange?logo=html5)](https://developer.mozilla.org/en-US/docs/Web/HTML)  
[![CSS3](https://img.shields.io/badge/CSS3-blue?logo=css3)](https://developer.mozilla.org/en-US/docs/Web/CSS)
[![Maven](https://img.shields.io/badge/Maven-3.8-red?logo=apachemaven)](https://maven.apache.org/)

---

## Getting Started

1. **Clone the repository**  
    ```bash
   git clone https://github.com/SriSailesh3320/NomNom.git
   cd NomNom/application
   ```


2. **Build the project**  
   Using Maven, clean and install dependencies:  
    ```bash
      mvn clean install
   ```



3. **Run the application**  
   Start the Spring Boot server:  
    ```bash
    mvn spring-boot:run
    ```




4. **Open in browser**  
   Visit `http://localhost:8080/chat` to access the chat UI and start chatting in real-time.

---

## Conclusion
NomNom demonstrates the power of WebSocket technology combined with Spring Boot for building responsive, real-time web applications. Its clean architecture utilizing STOMP messaging over WebSockets and seamless integration of Thymeleaf templates for dynamic frontend rendering make it a practical example for developers wanting to implement live chat features. Using open-source libraries like SockJS and STOMP.js ensures broad compatibility and ease of use on modern browsers. This project serves as a solid foundation for learning and expanding real-time communication systems.