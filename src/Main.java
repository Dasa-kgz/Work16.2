import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Backends back = new Backends();
        Backends[] backends = new Backends[3];

        backends[0] = new Java();

        backends[1] = new CSharp();

        backends[2] = new Python();
        back.run();

        for (Backends backend : backends) {

            if (backend instanceof Java) ((Java) backend).spring();

            else if (backend instanceof CSharp) ((CSharp) backend).dotNet();

            else if (backend instanceof Python) ((Python) backend).django();
        }
    }
}