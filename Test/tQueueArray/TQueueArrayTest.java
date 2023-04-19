package tQueueArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tQueueArray.base.InterQueue;

import static org.junit.jupiter.api.Assertions.*;

class TQueueArrayTest {

    InterQueue<String> queue;

    @BeforeEach
    public void create() {
        queue = new TQueueArray<>(4);
    }


    @Test
    void popReturnsFalseWhenEmpty() {
        assertFalse(queue.pop());
    }

    @Test
    void popReturnsTrueWhenQueueHasAElement(){
        queue.put("t1");
        assertTrue(queue.pop());
    }

    @Test
    void popReturnsTrueWhenQueueHasMoreElements(){
        queue.put("1");
        queue.put("2");
        assertTrue(queue.pop());
    }

    @Test
    void popDecrementsTheSizeAfterExecution() {
        queue.put("t1");
        queue.pop();
        assertEquals(0,queue.size());
    }

    @Test
    void isEmptyReturnsTrueAfterQueueCreation(){
        assertTrue(queue.isEmpty());
    }

    @Test
    void isEmptyReturnsFalseAfterAddingAElement(){
        queue.put("t");
        assertFalse(queue.isEmpty());
    }

    @Test
    void isEmptyReturnsTrueAfterAddingAElementAndRemovingIt() {
        queue.put("t");
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    void isEmptyReturnsTrueAfterFilledAndThenEmptied(){
        queue.put("a");
        queue.put("a");
        queue.put("a");
        queue.put("a");
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    void isFullReturnsFalseWhenEmpty() {
        assertFalse(queue.isFull());
    }

    @Test
    void isFullReturnsFalseWhenPartiallyFilled(){
        queue.put("t");
        assertFalse(queue.isFull());
        queue.put("t");
        assertFalse(queue.isFull());
    }

    @Test
    void isFullReturnsTrueWhenFilled() {
        queue.put("t");
        queue.put("s");
        queue.put("a");
        queue.put("b");
        assertTrue(queue.isFull());
    }

    @Test
    void isFullReturnsFalseWhenFilledAndThenEmptied(){
        queue.put("a");
        queue.put("a");
        queue.put("a");
        queue.put("a");
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        assertFalse(queue.isFull());
    }
}