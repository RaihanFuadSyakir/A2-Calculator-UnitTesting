# **Kelompok A2**
# Project Calculator Unit Testing
## 1. Directory Tree project
```md
A2-Calculator-UnitTesting (project-root)
│   gradlew
│   gradlew.bat
│   README.md
│   settings.gradle.kts
├───app
│   │   build.gradle.kts
│   ├───build
│   │   ├───reports
│   │   │   └───tests
│   │   │       └───test
│   │   │           │   index.html
│   │   │           ├───classes
│   │   │           │       main.test.CalculatorTest.html
│   │   │           ├───css
│   │   │           │       base-style.css
│   │   │           │       style.css
│   │   │           ├───js
│   │   │           │       report.js
│   │   │           └───packages
│   │   │                   main.test.html
│   └───src
│       ├───main
│       │   ├───java
│       │   │   └───a2
│       │   │       └───calculator
│       │   │           └───unittesting
│       │   │                   App.java
│       │   │                   Calculator.java
│       │   └───resources
│       └───test
│           ├───java
│           │   └───a2
│           │       └───calculator
│           │           └───unittesting
│           │                   CalculatorTest.java
│           │                   RaihanTest.java
│           └───resources
└───gradle
```

## 2. Cara Membuat Test Script
buat file (.java) pada ```app/src/test/java/a2/calculator/unittesting/```

misal **app/src/test/java/a2/calculator/unittesting/RaihanTest.java**

didalam test script yang harus diperhatikan :
* **package** disinni digunakan sehingga tidak perlu menginport file dari modul yang ingin di test
* Import junit yang digunakan, disini menggunakan default sudah ada depedency saat membuat project awal yaitu **junit jupiter**
* Tag **@Test** ini diperlukan untuk menandai bahwa method dibawahnya merupakan unit test
* Pastikan **nama method representatif** dari test apa yang akan dilakukan karena nama method tersebut yang akan muncul di report
* lalu gunakan notasi test yang ada berdasarkan junit yang digunakan, dikarenakan ada **perbedaan notasi yang digunakan jika berbeda versi junit misal junit 4 dan 5**
```java
package a2.calculator.unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RaihanTest {
    @Test
    public void testAdd() {
        assertEquals(4.0, Calculator.add(2.0, 2.0));
        assertEquals(-3.0, Calculator.add(-5.0, 2.0));
        assertEquals(0.0, Calculator.add(0.0, 0.0));
    }
}
```

## 3. Cara menjalankan test script
jalankan ```./gradlew test```

## Hasil report 
laporan pengujian yang digenerate oleh gradle ada pada ```app/build/reports/index.html```
