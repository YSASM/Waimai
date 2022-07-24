package kwshe;

import java.io.IOException;

public class Pause {
    void pause() {
        System.out.print("按回车键继续");
        try {
            int read = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
