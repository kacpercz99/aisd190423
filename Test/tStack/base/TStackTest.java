package tStack.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

class TStackTest {

    InterStack<String> stack;

    @BeforeEach
    public void create() {
        stack = new TStack<>();
    }

    @Test
    void topThrowsEmptyStackExceptionWhenStackIsEmpty() {
        Assertions.assertThrows(EmptyStackException.class, stack::top);
    }
}