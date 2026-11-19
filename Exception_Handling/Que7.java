package Exception_Handling;

import java.io.IOException;

public class Que7 {
    public static void main(String[] args) {
        Que7 que7 = new Que7();
        try {
            que7.testException();
        } catch (IOException e) {
            System.out.println("Exception: testException Method Se Exception Throw Kiya Hai");
        }
    }
    void testException() throws IOException {
        throw new IOException();
    }
}
