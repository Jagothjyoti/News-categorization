/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_300;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doha
 */
class Token_Part {
    
    public static String[] inp;
    public static String[] str_arry;
    BufferedReader reader;
    InputStream in;
    StringBuilder out;
    
    public static Vector<String> sports_vec = new Vector<String>();
    public static Vector<String> entertain_vec = new Vector<String>();
    public static Vector<String> business_vec = new Vector<String>();
    public static Vector<String> health_vec = new Vector<String>();
    public static Vector<String> life_vec = new Vector<String>();
    public static Vector<String> world_vec = new Vector<String>();
    
    
    void read_file_name() {
        
        inp = new String[10];
        str_arry = new String[500];
        inp[0] = "sports_news.txt";
        inp[1] = "entertain_news.txt";
        inp[2] = "business_news.txt";
        inp[3] = "health_news.txt";
        inp[4] = "life_style_news.txt";
        inp[5] = "world_news.txt";
        System.out.println(inp[0]);
    }
    
    void read_file() throws IOException {
        
        for(int i=0; i<6; i++) {
            
            String tem = inp[i];
            String arr = "";
            
            try {
            
                in = new FileInputStream(new File(tem));
                reader = new BufferedReader(new InputStreamReader(in));
                out = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    out.append(line);
                }
                arr = out.toString();
                reader.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Token_Part.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            str_arry[i] = arr;
        }
    }
}
