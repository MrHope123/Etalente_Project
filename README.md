# 🌱 Enviro365 Waste Sorting API  

## 📌 Project Overview  

## Enviro365 Waste Sorting App - Spring Boot REST API

This repository contains the Spring Boot REST API for the Enviro365 waste sorting mobile application.  It provides endpoints for managing waste categories, disposal guidelines, and recycling tips.
 
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


*   **Project:** Etalente Project [Spring Boot]
*   **src**
    *   **main**
        *   **java**
            *   **com.enviro.assessment.grad001.fulufhelomaluleke**
                *   **controller**
                    *   DisposalGuidelineController.java
                    *   RecyclingTipController.java
                    *   WasteCategoryController.java
                *   **exception**
                    *   GlobalExceptionHandler.java
                    *   ResourceNotFoundException.java
                *   **model**
                    *   DisposalGuideline.java
                    *   RecyclingTip.java
                    *   WasteCategory.java
                *   **repository**
                    *   DisposalGuidelineRepository.java
                    *   RecyclingTipRepository.java
                    *   WasteCategoryRepository.java
                *   **service**
                    *   DisposalGuidelineService.java
                    *   RecyclingTipService.java
                    *   WasteCategoryService.java
                *   Application.java (Main Spring Boot application class - annotated with `@SpringBootApplication`)
        *   **resources**
            *   static (Directory - For static assets like CSS, JavaScript, images if used)
            *   templates (Directory - For Thymeleaf or other template files if used)
            *   application.properties (File - Spring Boot configuration)




---

## 🚀 API Endpoints  

### 📌 **Disposal Guidelines**
| Method | Endpoint              | Description |
|--------|----------------------|-------------|
| GET  | /api/guidelines     | Get all disposal guidelines |
| POST | /api/guidelines     | Create a new disposal guideline |

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
GET     /api/tips	Get all recycling tips
POST	/api/tips	Add a new recycling tip

📌 Example Request:

json

POST /api/tips
{
    "tip": "Separate glass and plastic before disposal"
}
📌 Example Response:

json

{
    "id": 1,
    "tip": "Separate glass and plastic before disposal"
}
🛠️ How to Run the Project

1️⃣ Clone the Repository

git clone https://github.com/MrHope123/Etalente_Project.git
cd Etalente_Project

2️⃣ Run the Application

mvn spring-boot:run

3️⃣ Access the API in Postman

Base URL: http://localhost:8080

Example Endpoint: http://localhost:8080/api/guidelines

📝 Author
👤 Fulufhelo Maluleke







