# 🎯 Career Path Recommendation API

A simple yet effective Java Spring Boot REST API that provides personalized career suggestions based on a user's education, skills, and interests.

---

## 🔧 Tech Stack

- ☕ Java 17
- 🌱 Spring Boot 3.5.3
- 🌐 REST API
- 🧪 Postman (for API testing)

---

## 📌 Features

- Accepts input via JSON request
- Returns a recommended career path based on demo logic
- Built using clean and modular Spring Boot architecture
- Easily extendable for future improvements (ML, database, etc.)

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

---

## ▶️ Running the App
- ./mvnw spring-boot:run
- POST http://localhost:8080/api/recommend

## 🙋‍♀️ Author
Saara Darakshan
Connect with me on GitHub