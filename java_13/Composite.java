import java.util.ArrayList;
import java.util.List;

class Composite implements FileComponent {
    private String name;
    private List<FileComponent> components;
    public Composite(String name) {
        this.name = name;
        components = new ArrayList<>();
    }
    public void add(FileComponent component) {
        components.add(component);
    }
    public void remove(FileComponent component) {
        components.remove(component);
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + "Директория: " + name);
        for (FileComponent component : components) {
            component.display(indent + "  ");
        }
    }
}