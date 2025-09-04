# 🎯 Career Path Recommendation API

A simple yet effective Java Spring Boot REST API that provides personalized career suggestions based on a user's education, skills, and interests.

---

## 🔧 Tech Stack

- ☕ Java 17
- 🌱 Spring Boot 3.5.3
- 🌐 REST API
- 🧪 Postman (for API testing)
- 💻 HTML/CSS (Frontend UI)
  
---

## 📌 Features

- Accepts user profile input via JSON  
- Returns a personalized **career recommendation**  
- Clean and modular Spring Boot architecture  
- Can be extended to use machine learning, a real database, or authentication
  
---

## 🚀 API Endpoint

| Method | Endpoint          | Description                 |
|--------|-------------------|-----------------------------|
| POST   | `/api/recommend`  | Returns career recommendation |

---

## 🧪 Sample Input (JSON)

```json
{
  "education": "12th",
  "skills": ["Java", "Problem Solving"],
  "interests": ["Tech"]
}
```

---

📤 Sample Output (JSON)

```json
{
    "recommendedCareer": [
        "Software Engineer"
    ]
}
```
---

## ▶️ How to Run the App
1. Start backend

./mvnw spring-boot:run

2. Make a POST request using Postman

- URL: http://localhost:8080/api/recommend
- Method: POST
- Headers: Content-Type: application/json
- Body: Use raw JSON as shown above

3. View the Frontend UI
Open index.html in your browser. Enter your data and click "Get Recommendation".

---

## 🖼️ Screenshots

🔧 Postman Testing Example
![Screenshot 2025-06-29 185132](https://github.com/user-attachments/assets/b636b5cb-f973-49db-8455-eda8896cbdf6)

🌐 User Interface Page
![Screenshot 2025-06-29 160734](https://github.com/user-attachments/assets/73709b3b-78db-4e25-b520-c6696ffa98a6)

---

## 🙋‍♀️ Author
Saara Darakshan
Full Stack Web Developer | Open Source Contributor | Tech Enthusiast
📌 Connect with me on GitHub (https://github.com/DarakshanSaara)
