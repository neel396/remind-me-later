
#  Remind-me-later API

A simple Spring Boot REST API that allows users to schedule reminders by providing a date, time, message, and reminder type (Email or SMS).  
This project is designed to support additional reminder types in the future.

---

##  Features

- Accepts reminder details (date, time, message, type)
- Stores reminder in a MySQL database
- Extensible design for future reminder types (e.g., WhatsApp, Push Notification)
- Built using Java, Spring Boot, and JPA

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Git & GitHub

---

##  API Endpoint

###  POST `/api/reminders`

Used to create a new reminder.

####  Request Body (JSON)
```json
{
  "date": "2025-05-15",
  "time": "14:30",
  "message": "Doctor Appointment",
  "reminderType": "Email"
}
```

####  Sample Response
```json
{
  "id": 1,
  "date": "2025-05-15",
  "time": "14:30",
  "message": "Doctor Appointment",
  "reminderType": "Email"
}
```

---

##  Project Structure

```
remindmelater/
├── controller/
│   └── ReminderController.java
├── dto/
│   └── ReminderRequest.java
├── entity/
│   └── Reminder.java
├── repository/
│   └── ReminderRepository.java
├── service/
│   └── ReminderService.java
├── RemindMeLaterApplication.java
└── application.properties
```

---

##  Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/neel396/remind-me-later.git
   ```

2. **Update MySQL Configuration**
   In `src/main/resources/application.properties`, update your DB credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/remindmelaterdb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Run the Application**
   - Using Eclipse/IntelliJ: Run `RemindMeLaterApplication.java`
   - Or use terminal:
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Test the API**
   Use Postman or cURL to send a POST request to:
   ```
   http://localhost:8080/api/reminders
   ```

---

##  Sample Database Table

### `reminders` Table Fields:
| Field         | Type     | Description               |
|---------------|----------|---------------------------|
| id            | Long     | Primary Key (Auto-ID)     |
| date          | String   | Reminder date (YYYY-MM-DD)|
| time          | String   | Reminder time (HH:mm)     |
| message       | String   | Reminder message          |
| reminder_type | String   | Type (Email or SMS)       |

