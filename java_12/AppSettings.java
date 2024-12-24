import java.util.HashMap;
import java.util.Map;
public class AppSettings {
    private static AppSettings instance;
    private Map<String, String> object = new HashMap<String, String>();
    private AppSettings() {}
    public static AppSettings getInstance() {
        if (instance == null) { instance = new AppSettings(); }
        return instance;
    }
    public void setSettings(String key, String value) { object.put(key, value); }
    public String getSetting(String key) { return object.get(key); }
    @Override
    public String toString() { return object.toString(); }
}