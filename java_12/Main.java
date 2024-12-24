public class Main {
    public static void main(String[] args) {
        AppSettings obj1 = AppSettings.getInstance();
        AppSettings obj2 = AppSettings.getInstance();
        obj1.setSettings("Topic", "Cats");
        obj2.setSettings("Language", "KZ");
        System.out.println(obj2);
    }
}