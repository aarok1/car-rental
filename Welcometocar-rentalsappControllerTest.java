package com.aws.codestar.projecttemplates.controller;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link Welcome to car-rentals app!Controller}. Modify the tests in order to support your use case as you build your project.
 */
@DisplayName("Tests for  Welcome to car-rentals app!Controller")
public class  Welcome to car-rentals app!ControllerTest {

    private static final String EXPECTED_SITE_NAME = "home";
    private static final String EXPECTED_VIEW_NAME = "index";

    private  Welcome to car-rentals app!Controller  welcome to car-rentals app!Controller = new  Welcome to car-rentals app!Controller(EXPECTED_SITE_NAME);

    /**
     * Initializing variables before we run the tests.
     * Use @BeforeAll for initializing static variables at the start of the test class execution.
     * Use @BeforeEach for initializing variables before each test is run.
     */
    @BeforeAll
    static void setup() {
        // Use as needed.
  

    /**
     * De-initializing variables after we run the tests.
     * Use @AfterAll for de-initializing static variables at the end of the test class execution.
     * Use @AfterEach for de-initializing variables at the end of each test.
     */
    @AfterAll
    static void tearDown() {
        // Use as needed.
    }

    /**
     * Basic test to verify the result obtained when calling {@link  Welcome to car-rentals app!Controller#welcome to car-rentals app!} successfully.
     */
    @Test
    @DisplayName("Basic test for controller")
    void testWelcome to car-rentals app!() {
        ModelAndView actualModelAndView = welcome to car-rentals app!Controller.welcome to car-rentals app!();

        // Verify the result obtained matches the values we expect.
        assertEquals(EXPECTED_VIEW_NAME, actualModelAndView.getViewName());
        assertEquals(EXPECTED_SITE_NAME, String.valueOf(actualModelAndView.getModel().get("siteName")));
    }
}
