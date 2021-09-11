package org.example;

import java.io.Console;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        final Game game = new Game(10, 50);
        game.showTable();

        while (true){
            final int read = System.in.read();

            if (read == 113) {
                break;
            }
            game.play();
            game.showTable();
        }
    }
}
