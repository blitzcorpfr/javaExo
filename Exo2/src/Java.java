import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class Java {

    public static HashMap<String, String> read(){

        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\antoi\\IdeaProjects\\Exo2\\test.txt"));
            String line = br.readLine();
            HashMap<String, String> map = new HashMap<>();
            while (line != ""){

                String mail = line.substring(0, line.indexOf(':'));
                String score = line.substring(line.indexOf(':') + 1);
                map.put(mail, score);
            }
            br.close();
            return map;

        }catch(Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    public static void average( HashMap<String, String> map){

        ArrayList<Integer> list = new ArrayList<>();
        int somme = 0;
        for(String s : map.keySet()){

            list.add(Integer.parseInt(map.get(s)));
        }
        for(Integer a : list){
            somme += list.get(list.indexOf(a));
        }
        System.out.println(somme / map.size());
    }

    public static void findScore(HashMap<String, String> map, String student){

        Integer score = Integer.parseInt(map.get(student));
        System.out.println(score);
    }

    public static void main(String [] args){

        HashMap<String, String> map = new HashMap<>();
        map = read();
        average(map);
        findScore(map,"antoine");
    }




}
