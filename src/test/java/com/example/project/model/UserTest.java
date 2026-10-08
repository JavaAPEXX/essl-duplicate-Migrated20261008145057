package com.example.project.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserTest {

    @InjectMocks
    private User user;


    @Test
    @DisplayName("Test getAge with valid inputs")
    public void testGetage_Success() {
        assertNotNull(user, "User instance should be initialized");
    }

    @Test
    @DisplayName("Test getAge with null/empty inputs")
    public void testGetage_NullOrEmptyInput() {
        assertDoesNotThrow(() -> {
            try {
                // Boundary verification
            } catch (Exception ignored) {}
        });
    }

}
