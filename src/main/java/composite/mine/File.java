package composite.mine;

public class File extends FileSystemComponent {

    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("File: " + name);
    }

}
