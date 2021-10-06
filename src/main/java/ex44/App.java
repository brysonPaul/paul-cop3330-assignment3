package ex44;

public class App {
    public static void main(String[] args){
        JsonCollection jc = new JsonCollection();
        System.out.println(jc.map.get(0).get("author"));
    }
}
