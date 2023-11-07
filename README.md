# UI Automation Testing with Playwright Assignment

## Objective

The primary objective of this assignment is to familiarize you with UI automation testing using Playwright, focusing on testing the user registration form and related functionality.

- In this assignment, you will be writing Playwright tests for the user registration form and its associated UI - components. You will copy the code for the backend and UI from the previous assignments. You don't have to copy the unit test files from the previous assignments.
- In the UI unit testing assginment, the code submitted the form to a mock server. You have to change that to call the Java backend.
- You have to write a second HTML page that displays the user information. You have to write a Playwright test to verify that the user information is displayed correctly.

## Playwright
Playwright tests can be writtedn in JavaScript, TypeScript, Python, or C#. You can use any of these languages for this assignment. The sample code in this repository is in Java.

I recommend writing the test in Java because it is easier to setup and run. If you do write the test in JavaScript, you have to manually start the springboot server and then run the tests.

## User Registration Form

The user registration form comprises the following fields:

1. **Username**: A unique username for the user (Validation required).
2. **First Name**: User's first name (Validation required).
3. **Last Name**: User's last name (Validation required).
4. **Address**: Consisting of:
    - **Street**: User's street address (Validation required).
    - **Street2**: Additional street information (optional).
    - **City**: User's city (Validation required).
    - **State**: User's state (Validation required).
    - **Zip Code**: User's zip code (Validation required).
5. **Email Address**: User's email address (Validation required and must be unique across users).
6. **Date of Birth**: User's date of birth (Validation required).

## Requirements

1. Write Playwright test scripts to automate the following aspects of the user registration form:

- Verify the correctness of UI components, including labels and input acceptance. (1 point)
- Ensure input validation by testing various scenarios for each field, including username, first name, last name, email address, and address details. (1 point)
- Automate tests for submitting the user registration form to the server, and retretiving the user details of the submitted user. You can write a HTML to show user details or just make the api call via Playwright (1 point)
- Handle various error scenarios from the server (e.g., invalid address, duplicate username) and verify that appropriate error messages are displayed to the user. (1 point)
- Your test code should be readable, and follow the arrange, act, assert pattern. (1 point)

## Late Submission Policy
- 1 point deducted for submissions within the first 24 hours after due date
- 2 points deducted for submission after 24 hours
