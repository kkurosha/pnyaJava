public class Main {
    public static void main(String[] args) {
        Composite rootDir = new Composite("1");
        Composite subDir1 = new Composite("2");
        Composite subDir2 = new Composite("3");
        File file1 = new File("Файл1.txt");
        File file2 = new File("Файл2.txt");
        File file3 = new File("Файл3.txt");
        File file4 = new File("Файл4.txt");
        rootDir.add(file1);
        rootDir.add(subDir1);
        subDir1.add(file2);
        subDir1.add(file4);
        subDir1.add(subDir2);
        subDir2.add(file3);
        rootDir.display("");
        System.out.println("\nИерархия файлов после удаления Директории 3 и файла в Директории 2");
        subDir2.remove(file3);
        subDir1.remove(subDir2);
        subDir1.remove(file2);
        rootDir.display("\t");
    }
}
