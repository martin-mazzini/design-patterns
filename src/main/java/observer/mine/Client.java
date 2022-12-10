package observer.mine;

public class Client {




    public static void main(String[] args) {


        ConcreteSubject subjectOne = new ConcreteSubject();
        ConcreteSubject subjectTwo = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
        ConcreteObserver observer3 = new ConcreteObserver("Observer 3");


        subjectOne.attach(observer1);
        subjectOne.attach(observer2);
        subjectOne.attach(observer3);

        subjectTwo.attach(observer1);

        System.out.println("Changing state of subject one");
        subjectOne.setState(5);


        System.out.println("Changing state of subject two");
        subjectTwo.setState(10);


        System.out.println("Detaching observer1 and observer2 from subject one");
        subjectOne.detach(observer1);
        subjectOne.detach(observer2);

        System.out.println("Changing state of subject one");
        subjectOne.setState(11);


    }
}
