# 🎡 Multi-Platform Random Wheel of Fortune

A versatile randomization suite implemented in **C++, Python, Java, and HTML/JavaScript**. This project allows users to input a custom list of elements and pick a winner at random using a fair selection process across different programming environments.

---

## 🚀 How to Run the Programs

### 1. C++ Version
**Prerequisites:** A C++ compiler (like `g++` or `clang`).

1.  Save the code into a file named `wheel.cpp`.
2.  Open your terminal or command prompt.
3.  Compile the program:
    ```bash
    g++ wheel.cpp -o wheel
    ```
4.  Run the executable:
    * **Windows:** `wheel.exe`
    * **Mac/Linux:** `./wheel`

---

### 2. Python Version
**Prerequisites:** Python 3.x installed.

1.  Save the code into a file named `wheel.py`.
2.  Open your terminal.
3.  Run the script directly:
    ```bash
    python wheel.py
    ```

---

### 3. Java Version
**Prerequisites:** Java Development Kit (JDK) installed.

1.  Save the code into a file named `Main.java` (the filename must match the class name).
2.  Open your terminal.
3.  Compile the Java file:
    ```bash
    javac Main.java
    ```
4.  Run the compiled class:
    ```bash
    java Main
    ```

---

### 4. HTML/JavaScript Version (Interactive)
**Prerequisites:** Any modern web browser (Chrome, Firefox, Edge, Safari).

1.  Save the code into a file named `index.html`.
2.  **Double-click** the `index.html` file to open it in your browser.
3.  Features:
    * Type your list in the text area (one item per line).
    * Watch the wheel update in real-time.
    * Click the **"SPIN THE WHEEL"** button to start the animation.

---

## 🛠️ Technical Comparison

| Feature | C++ | Java | Python | HTML/JS |
| :--- | :--- | :--- | :--- | :--- |
| **Logic** | Static Arrays | Scanner/Random | Dynamic Lists | Canvas API |
| **Randomness** | `rand()` % n | `nextInt(n)` | `randint()` | `Math.random()` |
| **Input Type** | Typed (int, string, etc) | Typed (Scanner) | Dynamic/Cast | String (Web) |
| **UI** | Command Line | Command Line | Command Line | Interactive Web UI |

## 📝 Notes
* **Case Sensitivity:** All versions are designed to handle both uppercase and lowercase inputs for type selection (e.g., 'I' or 'i' for Int).
* **Validation:** Every version includes a check to ensure the number of elements is greater than zero to prevent errors.
