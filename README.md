# Techno Study Testing Project with TestNG
This repository contains the Test Automation Project for Techno Study, focusing on web application testing using TestNG. The aim of the project is to test various functionalities of the Techno Study website.

# Team Members
Yusuf Ucucu,
Sefacan Başoğlu,
Betül Gözlükoğlu,
İlknur Neşe Tuncal

# Project Overview
# Project Objectives:
Implement Page Object Model (POM) for structured test automation.
Execute parallel tests on both Chrome and Firefox browsers.
Run test cases from TestNG XML files.
Separate and execute test cases as smoke and regression tests via different XML files.
Test live environment at Techno Study Website.
Important Notes:

Test data used in the application form must contain "test" in the Name and Email fields, such as "Test Ayşe Yılmaz" or "test_a.yilmaz@gmail.com".
For country selection, always choose Andorra.

# Test Cases
# Test Case 1: Dropdown Menu
Verify the presence of a "Courses" dropdown menu at the top of the homepage.
Ensure that all available courses are listed when the dropdown is clicked.
Confirm that each course name is visible and clickable, leading to the respective course page.

# Test Case 2: Cross Campus Access
Ensure the presence of a "Campus Login" option at the top of the homepage.
Clicking the option should redirect the user to the Campus login page.

# Test Case 3: Booking Form
Ensure the presence of an "Apply" button on the homepage.
Clicking the button should lead to the application form page.
Confirm that the form can be filled in, using "test" for name and email fields and selecting Andorra as the country.

# Test Case 4: Submenu Courses
Ensure a "Courses" option is available in the navigation menu.
Clicking it should display a list of courses or a submenu.

# Test Case 5: Submenu Social Media
Verify the availability of social media links in the website footer.
Clicking a link should redirect to the corresponding social media page.

# Test Case 6: Logo Navigation
Ensure that the Techno Study logo is present on every page and redirects to the homepage when clicked.

# Test Case 7: Course Details
Ensure that each course has a "More Info" button, which leads to the course detail page.

# Test Case 8: Terms of Use
Verify the presence of a "I accept the terms" checkbox in the contact form.
Clicking it should redirect to the Terms of Use page.

## Technologies and Tools Used
This project utilizes the following key technologies and tools:

- Java: Core programming language used for developing test scripts.
- Selenium WebDriver: Tool for automating web browser interactions.
- TestNG: Framework for defining, managing, and executing test cases.
- Apache POI: Library used for handling Excel files, particularly for reading and writing test data.
- Git & GitHub: Version control systems for tracking changes and enabling team collaboration.
- JIRA & Zephyr-Squad: Tools for managing test cases and tracking bugs.
- Page Object Model (POM): Design pattern implemented to enhance the maintainability and scalability of the automation framework.

## Prerequisites
Before running this project, ensure the following software and tools are installed and configured:

Java Development Kit (JDK): Install the JDK to write and compile Java code for the test cases.

IDE (Integrated Development Environment): Use an IDE such as IntelliJ IDEA for writing and managing the code.

Git: Install Git for version control to manage and share the project source code using GitHub.

Selenium WebDriver: Be familiar with Selenium and set it up for automating browser tasks.

TestNG: Have a basic understanding of TestNG, its annotations, and how to structure and run tests using XML files.

Page Object Model (POM): Learn and implement the POM design pattern for organizing web elements and actions in the test automation framework.

JIRA & Zephyr: If these tools are used for test management, make sure you have access and know how to create, manage, and report test cases and issues within these platforms.







