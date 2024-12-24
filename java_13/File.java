public class File implements FileComponent {
    private String name;
    public File(String name) { this.name = name; }
    @Override
    public void display(String indent) {
        System.out.println(indent + "Файл: " + name);
    }
}
