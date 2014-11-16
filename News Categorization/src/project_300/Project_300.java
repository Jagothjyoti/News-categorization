
package project_300;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;                                                                 
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Project_300 {

    Document doc_sports, doc_business, doc_entertain, doc_health, doc_lifestyle, doc_law, doc_world;
    String str, chk, tem;
    Elements links;
    String[] sports, entertain, business, health, lifestyle, world;
    int cnt_sports, cnt_entertain, cnt_business, cnt_health, cnt_lifestyle, cnt_world;
    public Vector<String> sports_word, entertain_word, business_word, health_word, lifestyle_word, world_word;
    public static String input_str;
    public static Vector<String> query_vec = new Vector<String>();

    public Project_300() throws IOException, InterruptedException {
        Document doc_sports, doc_business, doc_entertain, doc_health, doc_lifestyle, doc_law, doc_showbiz;

        sports = new String[501];
        //cnt_sports = read_sports_link( sports , 0 );

        entertain = new String[501];
        //cnt_entertain = read_entertain_link( entertain , 0 );

        business = new String[501];
        //cnt_business = read_business_link( business , 0 );

        health = new String[501];
        //cnt_health = read_health_link( health , 0 );

        lifestyle = new String[501];
        //cnt_lifestyle = read_life_link( lifestyle , 0 ); 

        world = new String[501];
        //cnt_world = read_world_link( world , 0 );

        //chk_sport( sports , cnt_sports );

        //chk_entertain( entertain , cnt_entertain );

        //chk_business( business , cnt_business );

        //chk_health( health , cnt_health );

        //chk_life( lifestyle , cnt_lifestyle );

        //chk_world( world , cnt_world );

        Token_Part obj = new Token_Part();
        obj.read_file_name();
        obj.read_file();

        Token_process_sports obj_sport = new Token_process_sports();
        //obj_sport.process();

        Token_process_business obj_business = new Token_process_business();
        //obj_business.process();

        Token_process_entertain obj_entertain = new Token_process_entertain();
        //obj_entertain.process();

        Token_process_health obj_health = new Token_process_health();
        //obj_health.process();

        Token_process_life obj_life = new Token_process_life();
        //obj_life.process();

        Token_process_world obj_world = new Token_process_world();
        //obj_world.process();

        /*Input Here 
         * for query 
         * news and 
         * Process*/

        input_str = JOptionPane.showInputDialog("Please Enter Your Query News Please : ").toString();
        System.out.println("inp "+input_str);
        input_str.toLowerCase();

        StringTokenizer sk1 = new StringTokenizer(input_str, " ");
        int n = sk1.countTokens();

        query_vec = new Vector<String>();

        for (int i = 0; i < n; i++) {
            String st2 = sk1.nextToken();
            st2.toLowerCase();
            query_vec.add(st2);
        }

        System.out.println(query_vec.size());
        for (int i = 0; i < query_vec.size(); i++) {
            System.out.println(query_vec.get(i));
        }

        /* Query Now 
         * is in 
         * process */

        Query_porcess query_pro = new Query_porcess();
        query_pro.read_file_name();
        
        System.out.println("preee ---------- preee");
        query_pro.process();

       
        query_pro.calculate_matching();
        System.out.println("4333333333333333333333344444444444mmvnvjhf888888888888888hjgfh");
        query_pro.final_res();
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        new Project_300();

    }

    public int read_sports_link(String[] sports, int cnt_sport) {

        try {
            //News Portal for Sports
            doc_sports = (Document) Jsoup.connect("http://www.thedailystar.net/sports").get();

            chk = "http://www.thedailystar.net/sports/";
            links = doc_sports.select("a[href]");

            for (Element link : links) {

                str = link.attr("href").toString();
                if (str.length() < chk.length()) {
                    continue;
                }

                tem = str.substring(0, chk.length());

                if (tem.equals(chk)) {
                    sports[cnt_sport] = str;
                    System.out.println("cnt_sports = " + cnt_sport + "  " + sports[cnt_sport]);
                    cnt_sport++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cnt_sport;
    }

    private int read_entertain_link(String[] entertain, int cnt_entertain) {

        try {
            //News Portal for Entertain
            doc_entertain = (Document) Jsoup.connect("http://www.thedailystar.net/entertainment").get();

            String chk = "http://www.thedailystar.net/entertainment/";
            links = doc_entertain.select("a[href]");

            for (Element link : links) {

                str = link.attr("href").toString();
                if (str.length() < chk.length()) {
                    continue;
                }

                tem = str.substring(0, chk.length());

                if (tem.equals(chk)) {
                    entertain[cnt_entertain] = str;
                    System.out.println("cnt_entertain = " + cnt_entertain + "  " + entertain[cnt_entertain]);
                    cnt_entertain++;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cnt_entertain;
    }

    private int read_business_link(String[] business, int cnt_business) {

        try {
            //News Portal for Business
            doc_business = (Document) Jsoup.connect("http://www.thedailystar.net/business").get();

            chk = "http://www.thedailystar.net/business/";
            links = doc_business.select("a[href]");

            for (Element link : links) {

                str = link.attr("href").toString();
                if (str.length() < chk.length()) {
                    continue;
                }

                tem = str.substring(0, chk.length());

                if (tem.equals(chk)) {
                    business[cnt_business] = str;
                    System.out.println("cnt_business = " + cnt_business + "  " + business[cnt_business]);
                    cnt_business++;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cnt_business;
    }

    private int read_health_link(String[] health, int cnt_health) {

        try {
            //News Portal for Health
            doc_health = (Document) Jsoup.connect("http://www.thedailystar.net/health").get();

            chk = "http://www.thedailystar.net/health/";
            links = doc_health.select("a[href]");

            for (Element link : links) {

                str = link.attr("href").toString();
                if (str.length() < chk.length()) {
                    continue;
                }

                tem = str.substring(0, chk.length());

                if (tem.equals(chk)) {
                    health[cnt_health] = str;
                    System.out.println("cnt_health = " + cnt_health + "  " + health[cnt_health]);
                    cnt_health++;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cnt_health;
    }

    private int read_life_link(String[] lifestyle, int cnt_lifestyle) {

        try {
            //News Portal for Life
            doc_lifestyle = (Document) Jsoup.connect("http://www.thedailystar.net/health").get();

            chk = "http://www.thedailystar.net/health/";
            links = doc_lifestyle.select("a[href]");

            for (Element link : links) {

                str = link.attr("href").toString();
                if (str.length() < chk.length()) {
                    continue;
                }

                tem = str.substring(0, chk.length());

                if (tem.equals(chk)) {
                    lifestyle[cnt_lifestyle] = str;
                    System.out.println("cnt_lifestyle = " + cnt_lifestyle + "  " + lifestyle[cnt_lifestyle]);
                    cnt_lifestyle++;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cnt_lifestyle;
    }

    private int read_world_link(String[] world, int cnt_world) {

        try {
            //News Portal for World
            doc_world = (Document) Jsoup.connect("http://www.thedailystar.net/world").get();

            chk = "http://www.thedailystar.net/world/";
            links = doc_world.select("a[href]");

            for (Element link : links) {

                str = link.attr("href").toString();
                if (str.length() < chk.length()) {
                    continue;
                }

                tem = str.substring(0, chk.length());

                if (tem.equals(chk)) {
                    world[cnt_world] = str;
                    System.out.println("cnt_world = " + cnt_world + "  " + world[cnt_world]);
                    cnt_world++;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cnt_world;
    }

    private void chk_sport(String[] sports, int cnt_sports) throws IOException {

        String text = "";
        for (int i = 0; i < cnt_sports; i++) {
            Document doc = Jsoup.connect(sports[i]).get();
            Elements table = doc.select("div > p");
            for (Element para : table) {

                String ss = para.ownText().toString();
                text = "\n" + text + ss + "\n";
            }
        }
        File file = new File("sports_news.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file);
        output.write(text);
        output.flush();
        output.close();
    }

    private void chk_entertain(String[] entertain, int cnt_entertain) throws IOException {

        String text = "";
        for (int i = 0; i < cnt_entertain; i++) {
            Document doc = Jsoup.connect(entertain[i]).get();
            Elements table = doc.select("div > p");
            for (Element para : table) {

                String ss = para.ownText().toString();
                text = "\n" + text + ss + "\n";
            }
        }
        File file = new File("entertain_news.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file);
        output.write(text);
        output.flush();
        output.close();
    }

    private void chk_business(String[] business, int cnt_business) throws IOException {

        String text = "";
        for (int i = 0; i < cnt_business; i++) {
            Document doc = Jsoup.connect(business[i]).get();
            Elements table = doc.select("div > p");
            System.out.println(table.size());
            for (Element para : table) {

                String ss = para.ownText().toString();
                text = "\n" + text + ss + "\n";
            }
        }
        File file = new File("business_news.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file);
        output.write(text);
        output.flush();
        output.close();
    }

    private void chk_health(String[] health, int cnt_health) throws IOException {

        String text = "";
        for (int i = 0; i < cnt_health; i++) {
            Document doc = Jsoup.connect(health[i]).get();
            Elements table = doc.select("div > p");
            System.out.println(table.size());
            for (Element para : table) {

                String ss = para.ownText().toString();
                text = "\n" + text + ss + "\n";
            }
        }
        File file = new File("health_news.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file);
        output.write(text);
        output.flush();
        output.close();
    }

    private void chk_life(String[] lifestyle, int cnt_lifestyle) throws IOException {
        String text = "";
        for (int i = 0; i < cnt_lifestyle; i++) {
            Document doc = Jsoup.connect(lifestyle[i]).get();
            Elements table = doc.select("div > p");
            System.out.println(table.size());
            for (Element para : table) {

                String ss = para.ownText().toString();
                text = "\n" + text + ss + "\n";
            }
        }
        File file = new File("life_style_news.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file);
        output.write(text);
        output.flush();
        output.close();
    }

    private void chk_world(String[] world, int cnt_world) throws IOException {

        String text = "";
        for (int i = 0; i < cnt_world; i++) {
            Document doc = Jsoup.connect(world[i]).get();
            Elements table = doc.select("div > p");
            System.out.println(table.size());
            for (Element para : table) {

                String ss = para.ownText().toString();
                text = "\n" + text + ss + "\n";
            }
        }
        File file = new File("world_news.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file);
        output.write(text);
        output.flush();
        output.close();
    }

    public Vector<String> getQuery() {
        return query_vec;
    }
}
