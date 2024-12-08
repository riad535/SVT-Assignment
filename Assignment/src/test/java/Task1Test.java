import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    private Q1Task1 q1Task1;

    @BeforeAll
    static void setUpAll() {
        System.out.println("Hello");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("Get Set Go");
        q1Task1 = new Q1Task1();
    }


    @AfterEach
    void tearDown() {
        System.out.println("Finish");
        q1Task1 = null;
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Good Bye");
    }


    @Test
    void add() {
        int result = q1Task1.add(5,3);
        assertEquals(8,result);
    }


    @Test
    void reverse() {
        String reversed = q1Task1.reverse("hello");
        assertEquals("olleh",reversed);
    }
}