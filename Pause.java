package kwshe;

import java.io.IOException;

public class Pause {
    void pause() {
        System.out.print("���س�������");
        try {
            int read = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
