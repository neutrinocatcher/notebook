package polymathpack;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Notebook notebook = new Notebook();

        Shell shell = ShellFactory.createConsoleShell("hello", "helloMaven", notebook);

        shell.commandLoop();
    }
}
