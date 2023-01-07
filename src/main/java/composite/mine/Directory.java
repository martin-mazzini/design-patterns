package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {

    private List<FileSystemComponent> components;

    public Directory(String name) {
        super(name);
        components = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.print();
        }
        System.out.println("-----------");
    }

}
