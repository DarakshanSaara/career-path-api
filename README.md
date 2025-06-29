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
(https://github.com/user-attachments/assets/1cf775f7-1620-4bf5-b633-73987245566e)

🌐 User Interface Page
(https://github.com/user-attachments/assets/aba6f85d-014c-4931-935c-f4f9884097f8)

---

## 🙋‍♀️ Author
Saara Darakshan
📌 Connect with me on GitHub
