/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_300;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static project_300.Token_Part.inp;


/**
 *
 * @author doha
 */
public class Query_porcess {
    
    public ArrayList<String> vec_sports, vec_entertain, vec_business, vec_health, vec_life, vec_world;
    String inp[];
    BufferedReader reader;
    InputStream in;
    StringBuilder out;
    Node[] tree_sport = new Node[10010];
    Node[] tree_entertain = new Node[10010];
    Node[] tree_business = new Node[10010];
    Node[] tree_health = new Node[10010];
    Node[] tree_life = new Node[10010];
    Node[] tree_world = new Node[10010];
    int distPos_sport=0, distPos_entertain=0, distPos_business=0, distPos_health=0, distPos_life=0, distPos_world=0;
    public String str;
    int sports_res, entertain_res, business_res, health_res, life_res, world_res;
    public int mx;
    
    void read_file_name() {
        
        inp = new String[10];
        inp[0] = "sports_news_words.txt";
        inp[1] = "entertain_news_words.txt";
        inp[2] = "business_news_words.txt";
        inp[3] = "health_news_words.txt";
        inp[4] = "life_news_words.txt";
        inp[5] = "world_news_words.txt";
    }
    
    void process() throws IOException {
        
        vec_sports = new ArrayList<>();
        vec_entertain = new ArrayList<>();
        vec_business = new ArrayList<>();
        vec_health = new ArrayList<>();
        vec_life = new ArrayList<>();
        vec_world = new ArrayList<>();
        
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
                    arr = out.toString();
                    if( i==0 ) vec_sports.add(arr);
                    else if( i==1 ) vec_entertain.add(arr);
                    else if( i==2 ) vec_business.add(arr);
                    else if( i==3 ) vec_health.add(arr);
                    else if( i==4 ) vec_life.add(arr);
                    else if( i==5 ) vec_world.add(arr);
//                    System.out.println(arr);
                    out.delete(0, out.length());
                }
//                arr = out.toString();
//                System.out.println("last --> "+arr);
                reader.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Token_Part.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    /* Last process 
     of matching */

    void calculate_matching() throws InterruptedException {
        
        for(int i=0;i<10010;i++){
            tree_sport[i] = new Node();
            tree_entertain[i] = new Node();
            tree_business[i] = new Node();
            tree_health[i] = new Node();
            tree_life[i] = new Node();
            tree_world[i] = new Node();
        }
        
        for(int i=0;i<vec_sports.size();i++){
            str = vec_sports.get(i).toString();
            char ch[] = str.toCharArray();
//            System.out.println("sport "+str);
            insert_for_sport(ch, 0, 1);
            Thread.sleep(1);
        }
        
        Thread.sleep(5);
        
        for(int i=0;i<vec_entertain.size();i++){
            str = vec_entertain.get(i).toString();
            char ch[] = str.toCharArray();
//            System.out.println("entertain in matching : "+str);
            insert_for_entertain(ch, 0, 1);
            Thread.sleep(1);
        }
        
        Thread.sleep(5);
                
        for(int i=0;i<vec_business.size();i++){
            str = vec_business.get(i).toString();
            char ch[] = str.toCharArray();
//            System.out.println("business in matching :: "+str);
            insert_for_business(ch, 0, 1);
            Thread.sleep(1);
        }
        
        Thread.sleep(5);
        
        for(int i=0;i<vec_health.size();i++){
            str = vec_health.get(i).toString();
            char ch[] = str.toCharArray();
//            System.out.println("health in matching ::: "+str);
            insert_for_health(ch, 0, 1);
            Thread.sleep(1);
        }
        
        Thread.sleep(5);
        
        for(int i=0;i<vec_life.size();i++){
            str = vec_life.get(i).toString();
            char ch[] = str.toCharArray();
//            System.out.println("life in matching :::: "+str);
            insert_for_life(ch, 0, 1);
            Thread.sleep(1);
        }
        
        for(int i=0;i<vec_world.size();i++){
            str = vec_world.get(i).toString();
            char ch[] = str.toCharArray();
//            System.out.println("world in matching ::::: "+str);
            insert_for_world(ch, 0, 1);
            Thread.sleep(1);
        }
    }
    
    public void insert_for_sport(char ch[], int pos,int index) {
        if(index == str.length()){
            return;
        }
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        if(tree_sport[pos].edge[edgePos] == -1){
            tree_sport[pos].edge[edgePos] = ++distPos_sport;
            tree_sport[distPos_sport] = new Node();
        }
        int temp = tree_sport[pos].edge[edgePos];
        tree_sport[temp].cnt++;
        insert_for_sport( ch, tree_sport[pos].edge[edgePos] , index+1);
    }
    
    public void insert_for_entertain(char ch[], int pos,int index) {
        if(index == str.length()){
            return;
        }
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        if(tree_entertain[pos].edge[edgePos] == -1){
            tree_entertain[pos].edge[edgePos] = ++distPos_entertain;
            tree_entertain[distPos_entertain] = new Node();
        }
        int temp = tree_entertain[pos].edge[edgePos];
        tree_entertain[temp].cnt++;
        insert_for_entertain( ch, tree_entertain[pos].edge[edgePos] , index+1 );
    }
    
    public void insert_for_business(char[] ch,int pos,int index) {
        if(index == str.length()){
            return;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        if(tree_business[pos].edge[edgePos] == -1){
            tree_business[pos].edge[edgePos] = ++distPos_business;
            tree_business[distPos_business] = new Node();
        }
        int temp = tree_business[pos].edge[edgePos];
        tree_business[temp].cnt++;
        insert_for_business( ch, tree_business[pos].edge[edgePos] , index+1 );
    }
    
    public void insert_for_health(char[] ch, int pos,int index) {
        if(index == str.length()){
            return;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        if(tree_health[pos].edge[edgePos] == -1){
            tree_health[pos].edge[edgePos] = ++distPos_health;
            tree_health[distPos_health] = new Node();
        }
        int temp = tree_health[pos].edge[edgePos];
        tree_health[temp].cnt++;
        insert_for_health( ch, tree_health[pos].edge[edgePos] , index+1 );
    }
    
    public void insert_for_life(char[] ch, int pos,int index) {
        if(index == str.length()){
            return;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        if(tree_life[pos].edge[edgePos] == -1){
            tree_life[pos].edge[edgePos] = ++distPos_life;
            tree_life[distPos_life] = new Node();
        }
        int temp = tree_life[pos].edge[edgePos];
        tree_life[temp].cnt++;
        insert_for_life( ch, tree_life[pos].edge[edgePos] , index+1 );
    }
    
    public void insert_for_world(char[] ch, int pos,int index) {
        if(index == str.length()){
            return;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        if(tree_world[pos].edge[edgePos] == -1){
            tree_world[pos].edge[edgePos] = ++distPos_world;
            tree_world[distPos_world] = new Node();
        }
        int temp = tree_world[pos].edge[edgePos];
        tree_world[temp].cnt++;
        insert_for_world( ch, tree_world[pos].edge[edgePos] , index+1 );
    }
    
    /*
     * Now search 
     * for result
     */

    void final_res() throws IOException, InterruptedException {
        
        sports_res = 0;
        entertain_res = 0;
        business_res = 0;
        health_res = 0;
        life_res = 0;
        world_res = 0;
        
        System.out.println("zknfiafifjaisfijaf");
       
        for(int i=0; i<Project_300.query_vec.size(); i++) {
            
            mx = 0;
            str = Project_300.query_vec.get(i);
            char ch[] = str.toCharArray();
            find_res_sports( ch, 0 , 1 );
            if( mx > sports_res  )
            sports_res = mx;
        }
        
        for(int i=0; i<Project_300.query_vec.size(); i++) {
            
            mx = 0;
            str = Project_300.query_vec.get(i);
            char ch[] = str.toCharArray();
            find_res_entertain(ch, 0 , 1 );
//            System.out.println("sdputki mara -- hh");
//            System.out.println("mx : "+mx+" re "+entertain_res);
            if( mx > entertain_res  )
            entertain_res = mx;
        }
        
        for(int i=0; i<Project_300.query_vec.size(); i++) {
            
            mx = 0;
            str = Project_300.query_vec.get(i);
            char ch[] = str.toCharArray();
            find_res_business( ch, 0 , 1 );
            if( mx > business_res  )
            business_res = mx;
        }
        
        for(int i=0; i<Project_300.query_vec.size(); i++) {
            
            mx = 0;
            str = Project_300.query_vec.get(i);
            char ch[] = str.toCharArray();
            find_res_health( ch, 0 , 1 );
            if( mx > health_res  )
            health_res = mx;
        }

        for(int i=0; i<Project_300.query_vec.size(); i++) {
            
            mx = 0;
            str = Project_300.query_vec.get(i);
            char ch[] = str.toCharArray();
            find_res_life( ch, 0 , 1 );
            if( mx > life_res  )
            life_res = mx;
        }
        
        for(int i=0; i<Project_300.query_vec.size(); i++) {
            
            mx = 0;
            str = Project_300.query_vec.get(i);
            char ch[] = str.toCharArray();
            find_res_world( ch, 0 , 1 );
            if( mx > world_res  )
            world_res = mx;
        }
        
        
        int Maximum_1 = 0, Maximum_2 = 0;
        Maximum_1 = Math.max(Maximum_1, Math.max(sports_res, Math.max(business_res, Math.max(entertain_res, Math.max(health_res, Math.max(life_res, world_res))))));
        
        if( sports_res==Maximum_1 ) { 
            JOptionPane.showMessageDialog(null, "This Query '"+Project_300.input_str+ "' belongs to : Sports News");
            sports_res = 0;
        }
        else if( business_res==Maximum_1 ) {
            JOptionPane.showMessageDialog(null, "This Query '"+Project_300.input_str+ "' belongs to : Business News");
            business_res = 0;
        }
        else if( entertain_res==Maximum_1 ) {
            JOptionPane.showMessageDialog(null, "This Query '"+Project_300.input_str+ "' belongs to : Entertainment News");
            entertain_res = 0;
        }
        else if( health_res==Maximum_1 ) {
            JOptionPane.showMessageDialog(null, "This Query '"+Project_300.input_str+ "' belongs to : Health News");
            health_res = 0;
        }
        else if( life_res==Maximum_1 ) {
            JOptionPane.showMessageDialog(null, "This Query '"+Project_300.input_str+ "' belongs to : Life News");
            life_res = 0;
        }
        else if( world_res==Maximum_1 ) {
            JOptionPane.showMessageDialog(null, "This Query '"+Project_300.input_str+ "' belongs to : World Others News");
            world_res = 0;
        }
        
        Maximum_2 = Math.max(Maximum_2, Math.max(sports_res, Math.max(business_res, Math.max(entertain_res, Math.max(health_res, Math.max(life_res, world_res))))));
        
    }
    
    public int find_res_sports(char[] ch,int pos,int index){
        
        if(index == str.length()){
            return tree_sport[pos].cnt;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        int temp = tree_sport[pos].edge[edgePos];
        if( tree_sport[temp].cnt>=1 ) {
            int res = (tree_sport[temp].cnt)*(index+1);
            mx = Math.max(mx, res);
            return find_res_sports( ch, tree_sport[pos].edge[edgePos] , index+1 );
        }
        return 0;
    }
    
    public int find_res_business(char[] ch,int pos,int index){
        
        if(index == str.length()){
            return tree_business[pos].cnt;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        int temp = tree_business[pos].edge[edgePos];
        if( tree_business[temp].cnt>=1 ) {
            int res = (tree_business[temp].cnt)*(index+1);
            mx = Math.max(mx, res);
            return find_res_business( ch, tree_business[pos].edge[edgePos] , index+1 );
        }
        return 0;
    }
    
    public int find_res_entertain(char ch[], int pos,int index){
        
        if(index == str.length()){
            return tree_entertain[pos].cnt;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        System.out.println("c "+c+" "+edgePos);
        
        int temp = tree_entertain[pos].edge[edgePos];
        if( tree_entertain[temp].cnt>=1 ) {
            int res = (tree_entertain[temp].cnt)*(index+1);
            mx = Math.max(mx, res);
            return find_res_entertain( ch, tree_entertain[pos].edge[edgePos] , index+1 );
        }
        return 0;
    }
    
    public int find_res_health(char[] ch, int pos,int index){
        
        if(index == str.length()){
            return tree_health[pos].cnt;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        int temp = tree_health[pos].edge[edgePos];
        if( tree_health[temp].cnt>=1 ) {
            int res = (tree_health[temp].cnt)*(index+1);
            mx = Math.max(mx, res);
            return find_res_health( ch, tree_health[pos].edge[edgePos] , index+1 );
        }
        return 0;
    }
    
    public int find_res_life(char[] ch, int pos,int index){
        
        if(index == str.length()){
            return tree_life[pos].cnt;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        int temp = tree_life[pos].edge[edgePos];
        if( tree_life[temp].cnt>=1 ) {
            int res = (tree_life[temp].cnt)*(index+1);
            mx = Math.max(mx, res);
            return find_res_life( ch, tree_life[pos].edge[edgePos] , index+1 );
        }
        return 0;
    }
    
    public int find_res_world(char[] ch, int pos,int index){
        
        if(index == str.length()){
            return tree_world[pos].cnt;
        }
        
        int edgePos;
        char c = ch[index];
        edgePos = c-'a';
        
        int temp = tree_world[pos].edge[edgePos];
        if( tree_world[temp].cnt>=1 ) {
            int res = (tree_world[temp].cnt)*(index+1);
            mx = Math.max(mx, res);
            return find_res_world( ch, tree_world[pos].edge[edgePos] , index+1 );
        }
        return 0;
    }
}
class Node{

    int cnt;
    int[] edge = new int[100];
    
    public Node() {
        cnt = 0;
        Arrays.fill(edge, -1);
    }
    
    Node next;
}
