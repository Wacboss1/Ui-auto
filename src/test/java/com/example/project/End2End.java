package com.example.project;

import java.util.regex.Pattern;
import com.microsoft.playwright.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class End2End {
    @LocalServerPort
    private int port;
    
    @Test
    public void testUserRegistrationPage() {
        try (Playwright playwright = Playwright.create()) {
            //Arrange
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            
            //Act
            page.navigate("http://localhost:" + port + "/");

            //Assert
            assertThat(page).hasTitle(Pattern.compile("User Registration"));
        }
    }
}