## Codveda Internship Project - Level 1 Task 2

## 🔧 Features / User Stories

- 🎲 Random number is generated between 1 and 100.
- ⌛ User has only **5 unique guesses** to find the number.
- 📢 Immediate feedback: "Too high", "Too low", "Correct".
- ⚠️ Repeated guesses are not allowed.
- 🔄 Reset button starts a new game with a fresh number.
- 🛑 After 5 attempts, the correct answer is revealed.



## 🖼️ Screenshots

1. **Game Start:**  
   ![Start](https://github.com/Prajapatikapil41/NumberGuessingGame/blob/main/Images/Screenshot%20(141).png?raw=true)

2. **Guess Feedback:**  
     ![Feedback](https://github.com/Prajapatikapil41/NumberGuessingGame/blob/main/Images/Screenshot%20(142).png?raw=true)
     ![Feedback](https://github.com/Prajapatikapil41/NumberGuessingGame/blob/main/Images/Screenshot%20(143).png?raw=true)
     ![Feedback](https://github.com/Prajapatikapil41/NumberGuessingGame/blob/main/Images/Screenshot%20(144).png?raw=true)
     ![Feedback](https://github.com/Prajapatikapil41/NumberGuessingGame/blob/main/Images/Screenshot%20(145).png?raw=true)

4. **Game Over:**  
     ![Start](https://github.com/Prajapatikapil41/NumberGuessingGame/blob/main/Images/Screenshot%20(146).png?raw=true)

5. **After Reset:**  
   ![Reset](https://github.com/Prajapatikapil41/NumberGuessingGame/blob/main/Images/Screenshot%20(147).png?raw=true)

---

## 🖥️ System Design

> Follows a simple Client-Server architecture.

- **Frontend:** HTML, CSS, JavaScript
- **Backend:** Java, Spring Boot, REST API

```text
Frontend sends guess using fetch() → Backend validates and responds → Frontend displays result
````

---

## 🗂️ Project Structure

```
D:\
└── Codveda\
    └── level_1\
        └── Task_2\
            ├── NumberGuessingGame\
            │   ├── frontend\
            │   │   ├── index.html
            │   │   ├── style.css
            │   │   └── script.js
            │   └── backend\
            │       ├── src\
            │       │   └── main\
            │       │       └── java\
            │       │           └── com\
            │       │               └── example\
            │       │                   └── game\
            │       │                       ├── GameApplication.java
            │       │                       └── GuessingGameController.java
            │       ├── pom.xml
            │       └── application.properties
```

---

## 🧰 Technology Stack

| Area      | Technology                                       |
| --------- | ------------------------------------------------ |
| Front-End | HTML5, CSS3, JavaScript, Live Server (npm)       |
| Back-End  | Java 21, Spring Boot 3.4.7, Maven, Tomcat Server |
| Tools     | VS Code, npm, Git, GitHub                        |

---

## ▶️ Steps to Run Application

### ✅ Start Backend (Spring Boot)

```bash
cd D:\Codveda\level_1\Task_2\NumberGuessingGame\backend
mvn spring-boot:run
```

> Default Port: `8080`
> To change port:

```properties
# application.properties
server.port=8081
```

---

### ✅ Start Frontend (Live Server)

```bash
cd D:\Codveda\level_1\Task_2\NumberGuessingGame\frontend
npm init -y                   # Run once
npm install live-server --save-dev
npx live-server
```

> Open in browser at: `http://localhost:5500/`

---

## 🔍 How It Works

1. User starts the game with the **Start Game** button.
2. A number is generated in the backend using `Random`.
3. User submits a guess from the frontend.
4. Backend validates and checks:

   * Is it within range?
   * Has it been guessed before?
   * Is it correct?
5. Response is shown instantly with number of attempts left.
6. After 5 attempts or a correct guess, user can reset the game.

---

## 💡 Future Enhancements

* 🎯 Add difficulty levels (Easy, Medium, Hard)
* 🧠 Add guess history on screen
* 💾 Track high scores with localStorage
* 🔁 Add timer for challenge mode
* 🎨 Use animations and sound effects
* 🌍 Convert to multilingual UI

---
## 👨‍💻 Author

|                                                                                                     Photo                                                                                                    | **Kapil Prajapati**                                                                                                                                                                                                                                                 |
| :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [<img src="https://avatars.githubusercontent.com/u/81869156?s=400&u=ff6de7017b51e4d96dbfb1ae39c7a459d5e13ea8&v=4" width="120" height="120" style="border-radius:50%;">](https://github.com/Prajapatikapil41) | - 🧑‍💻 **GitHub:** [Prajapatikapil41](https://github.com/Prajapatikapil41)<br> - 💼 **LinkedIn:** [Kapil LinkedIn](https://www.linkedin.com/in/kapil-prajapati-7ba4b51b7/)<br> - 📧 **Email:** [kapilprajapati0403@gmail.com](mailto:kapilprajapati0403@gmail.com) |

---

