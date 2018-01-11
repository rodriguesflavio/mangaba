/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.*;
import Mangaba.lexer.*;
import Mangaba.node.*;
import Mangaba.analysis.*;
import Mangaba.parser.*;

public class Main {

    public static void main(String[] args) {
        String saida = "";
        String strToken = "";

        try {
            String arquivo = "src/exp.calc";

            Lexer lexer = new Lexer(new PushbackReader(new FileReader(arquivo), 1024));
            Token token;
            while (!((token = lexer.next()) instanceof EOF)) {
                strToken = token.toString();

                saida = token.getClass().getName().substring(13, token.getClass().getName().lastIndexOf("")) + "(" + strToken + ") ";
                System.out.print(saida);
                /*	System.out.println("strTokrn token: "+strToken);
				strToken = token.getClass().getName();
				System.out.println("##getClass: "+strToken); */
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // System.out.println(new Exception().getStackTrace()[0].getClassName());
    }
}
