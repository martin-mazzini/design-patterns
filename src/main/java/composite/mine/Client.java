package composite.mine;

public class Client {


    public static void main(String[] args) {


        File curriculum = new File("Curriculum.pdf");
        File photo = new File("photo242.jpg");
        File chrome = new File("chrome.exe");

        Directory users = new Directory("users");
        Directory desktop = new Directory("desktop");
        Directory pedro = new Directory("pedro");
        Directory root = new Directory("root");

        pedro.add(curriculum);
        pedro.add(photo);
        desktop.add(chrome);

        users.add(pedro);
        root.add(desktop);
        root.add(users);

        root.print();

    }







}
