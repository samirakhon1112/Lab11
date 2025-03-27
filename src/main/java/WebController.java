import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class WebController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "<h2>Our Services</h2><ul><li>Web Development</li><li>Mobile App Development</li><li>SEO Optimization</li></ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a web application demonstrating Spring Boot features.";
    }

    @GetMapping("/faq")
    public String faq() {
        return "Frequently Asked Questions: Q1: ... A1: ...";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "Contact us at contact@example.com";
    }

    @GetMapping("/team")
    public String team() {
        return "Meet our amazing team of developers and designers!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    @GetMapping("/double/{num}")
    public String doubleValue(@PathVariable int num) {
        return "Double of " + num + " is " + (num * 2) + ".";
    }

    @GetMapping("/length/{text}")
    public String length(@PathVariable String text) {
        return "Length of the text is " + text.length() + ".";
    }

    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @GetMapping("/concat/{str1}/{str2}")
    public String concat(@PathVariable String str1, @PathVariable String str2) {
        return str1 + str2;
    }

    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }

    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference is " + (x - y) + ".";
    }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        return y != 0 ? "The result is " + (x / (double) y) + "." : "Cannot divide by zero.";
    }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        return "The remainder is " + (x % y) + ".";
    }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return "Result: " + Math.pow(base, exp);
    }

    @GetMapping("/student")
    public String getStudent() {
        return "Student: Ali, Age: 21";
    }

    @PostMapping("/update-student/age")
    public String updateStudentAge(@RequestParam int age) {
        return "Student age updated to: " + age;
    }

    @GetMapping("/teacher")
    public String getTeacher() {
        return "Teacher: Mr. Smith, Subject: Math";
    }

    @GetMapping("/course")
    public String getCourse() {
        return "Course: Java Programming, Duration: 40 hours";
    }

    @GetMapping("/book")
    public String getBook() {
        return "Book: Effective Java, Author: Joshua Bloch, Price: $45";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int x, @RequestParam int y, @RequestParam String operation) {
        return switch (operation) {
            case "add" -> "Result: " + (x + y);
            case "subtract" -> "Result: " + (x - y);
            case "multiply" -> "Result: " + (x * y);
            case "divide" -> y != 0 ? "Result: " + (x / (double) y) : "Cannot divide by zero";
            default -> "Invalid operation";
        };
    }

    @GetMapping("/convert")
    public String convert(@RequestParam double temperature) {
        return "Temperature in Fahrenheit: " + (temperature * 9/5 + 32);
    }

    @GetMapping("/discount")
    public String discount(@RequestParam double originalPrice, @RequestParam double discountRate) {
        return "Discounted price: " + (originalPrice - (originalPrice * discountRate / 100));
    }

    @GetMapping("/course-info")
    public Map<String, Object> getCourseInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("title", "Java Programming");
        response.put("description", "Learn Java from basics to advanced.");
        response.put("duration", 40);
        return response;
    }

    @GetMapping("/user-profile")
    public Map<String, Object> getUserProfile() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Alice Johnson");
        response.put("email", "alice@example.com");
        response.put("role", "Admin");
        return response;
    }

    @GetMapping("/product-details")
    public Map<String, Object> getProductDetails() {
        Map<String, Object> response = new HashMap<>();
        response.put("name", "Laptop");
        response.put("category", "Electronics");
        response.put("price", 999.99);
        response.put("stock_status", "In Stock");
        return response;
    }
}

class Teacher {
    @GetMapping("/teacher")
    public String getTeacher() {
        String subject = "Mathematics";
        String name = "Mr. Smith";
        return "Teacher: " + name + ", Subject: " + subject;
    }
}

class Course {
    @GetMapping("/course")
    public String getCourse() {
        String title = "Java Programming";
        int duration = 40;
        return "Course: " + title + ", Duration: " + duration + " hours";
    }
}


class Book {
    @GetMapping("/book")
    public String getBook() {
        String title = "Effective Java";
        String author = "Joshua Bloch";
        double price = 45.99;
        return "Book: " + title + ", Author: " + author + ", Price: $" + price;
    }
}