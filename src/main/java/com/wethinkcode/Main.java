package com.wethinkcode;

import com.wethinkcode.Files.WriteFile;
import com.wethinkcode.views.DisplayConsole;
import com.wethinkcode.views.DisplayGui;

public class Main {

    public static void main(String[] args) {

        try{
            WriteFile.createFile();

            if (args.length != 1 || (!args[0].equals("console") && !args[0].equals("gui"))) {
                System.out.println("Program arguments: console or gui, please pass in the right arguments");
                System.exit(1);
            }
            if (args[0].equals("console")) {
                DisplayConsole.begin();
            }
            else {
                   DisplayGui gui = new DisplayGui();
                            gui.welcomeToGui();
            }
        }
        finally{
            WriteFile.closeFile();
        }
    }
}
