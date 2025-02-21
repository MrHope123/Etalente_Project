# 🌱 Enviro365 Waste Sorting API  

## 📌 Project Overview  
The **Enviro365 Waste Sorting API** is a **Spring Boot** application that provides RESTful endpoints to support a mobile application for **sustainable waste management**.  
This API enables users to:  
✅ Retrieve waste categories  
✅ Access disposal guidelines  
✅ Get recycling tips  

The project is designed to be **scalable, efficient, and user-friendly**, leveraging **Spring Boot, H2 Database, and Jakarta Validation**.  

---

## 🛠️ Tech Stack  
- **Backend**: Java 17, Spring Boot, Spring Data JPA  
- **Database**: H2 (In-Memory)  
- **Build Tool**: Maven  
- **Validation**: Jakarta Validation  
- **API Documentation**: Postman  

---

## ⚙️ Project Structure  



---

## 🚀 API Endpoints  

### 📌 **Disposal Guidelines**
| Method | Endpoint              | Description |
|--------|----------------------|-------------|
| `GET`  | `/api/guidelines`     | Get all disposal guidelines |
| `POST` | `/api/guidelines`     | Create a new disposal guideline |

📌 **Example Request:**  
json
POST /api/guidelines
{
    "guideline": "Plastic waste should be recycled at designated centers"
}


📌 Example Response:

json
{
    "id": 1,
    "guideline": "Plastic waste should be recycled at designated centers"
}


📌 Recycling Tips
Method	Endpoint	Description
GET	/api/tips	Get all recycling tips
POST	/api/tips	Add a new recycling tip
📌 Example Request:

json
Copy
Edit
POST /api/tips
{
    "tip": "Separate glass and plastic before disposal"
}
📌 Example Response:

json
Copy
Edit
{
    "id": 1,
    "tip": "Separate glass and plastic before disposal"
}
🛠️ How to Run the Project

1️⃣ Clone the Repository
sh


git clone https://github.com/your-username/enviro365-waste-sorting.git
cd enviro365-waste-sorting

2️⃣ Run the Application

mvn spring-boot:run

3️⃣ Access the API in Postman

Base URL: http://localhost:8080

Example Endpoint: http://localhost:8080/api/guidelines

📝 Author
👤 Fulufhelo Maluleke







