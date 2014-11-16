/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_300;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import static project_300.Token_Part.str_arry;
import static project_300.Token_process_sports.conj;

/**
 *
 * @author doha
 */
public class Token_process_business {
    
    Vector<String> tem_vec = new Vector<String>();
    Vector<String> tem_vec_1 = new Vector<String>();
    
    public static Vector<String> conj = new Vector<String>();

    void process() throws IOException, InterruptedException {
        
        conj.add("and"); conj.add("or"); conj.add("but"); conj.add("nor"); conj.add("but"); conj.add("so"); conj.add("for"); conj.add("yet");
        conj.add("after"); conj.add("although"); conj.add("as"); conj.add("as if"); conj.add("as long as"); conj.add("because"); conj.add("beofore");
        conj.add("even"); conj.add("even if"); conj.add("if"); conj.add("since"); conj.add("so that"); conj.add("that"); conj.add("though"); conj.add("till");
        conj.add("untill"); conj.add("when"); conj.add("when ever"); conj.add("wherever"); conj.add("whether"); conj.add("when"); conj.add("what");
        conj.add("Accordingly"); conj.add("also"); conj.add("Anyway"); conj.add("besides"); conj.add("Consequently"); conj.add("finally"); conj.add("further");
        conj.add("Furthermore"); conj.add("hence"); conj.add("however"); conj.add("indeed"); conj.add("infact"); conj.add("instead"); conj.add("likewise");
        conj.add("now"); conj.add("then"); conj.add("therefore"); conj.add("still"); conj.add("Incidentally"); conj.add("So Far"); conj.add("yes");
        conj.add("i"); conj.add("am"); conj.add("he"); conj.add("she"); conj.add("they"); conj.add("it"); conj.add("a"); conj.add("I"); conj.add("your");
        conj.add("over"); conj.add("to"); conj.add("the"); conj.add("of"); conj.add("in"); conj.add("all"); conj.add("him"); conj.add("her");
        conj.add("by"); conj.add("with"); conj.add("had"); conj.add("have"); conj.add("th"); conj.add("will"); conj.add("shall"); conj.add("was");
        conj.add(";"); conj.add("has"); conj.add("not"); conj.add("on"); conj.add("be"); conj.add("into"); conj.add("an"); conj.add("is"); conj.add("who");
        conj.add("his"); conj.add("this"); conj.add("are"); conj.add("s"); conj.add("at"); conj.add("we"); conj.add("t"); conj.add("\""); conj.add("up"); 
        
        String st1 = str_arry[2];
        StringTokenizer sk1 = new StringTokenizer(st1,".");
        int n = sk1.countTokens();
        
        Project_300 p = new Project_300();
        
        p.business_word = new Vector<String>();

        for(int i=0; i<n; i++) {
            String st2 = sk1.nextToken();
            tem_vec.add(st2);
        }

        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,",");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"%");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2);
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"@");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"*");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2);
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"$");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"(");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2);
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,")");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"\"");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2);
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"-");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"!");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2);
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"&");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"1");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2.toLowerCase());
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"2");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"3");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2.toLowerCase());
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"4");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"5");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2.toLowerCase());
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"6");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"7");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2.toLowerCase());
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"8");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"9");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2.toLowerCase());
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"0");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1,"'");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2.toLowerCase());
                
            }
        }
        
        tem_vec_1.clear();
        for(int i=0; i<tem_vec.size(); i++) {

            st1 = tem_vec.get(i);
            sk1 = new StringTokenizer(st1,"`");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec_1.add(st2);
                
            }
        }
        
        tem_vec.clear();
        for(int i=0; i<tem_vec_1.size(); i++) {

            st1 = tem_vec_1.get(i);
            sk1 = new StringTokenizer(st1," ");
            n = sk1.countTokens();

            for(int j=0; j<n; j++) {
                String st2 = sk1.nextToken();
                tem_vec.add(st2.toLowerCase());
                
            }
        }
        
        for(int i=0; i<tem_vec.size(); i++) {
            int f = 0;
            for(int j=0; j<conj.size(); j++) {
                if( tem_vec.get(i).equals(conj.get(j)) ) {
                    f = 1;
                    break;
                }
            }
            if( f==0 ) {
                p.business_word.add(tem_vec.get(i));
                System.out.println(tem_vec.get(i));
            }
        }
        File file = new File("business_news_words.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file);
        
        for(int i=0; i<p.business_word.size(); i++) {
            
            output.write(p.business_word.get(i));
            output.write("\r\n");
        }
        output.flush();
        output.close();
    }
}
