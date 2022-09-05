public class Main {
    public static void main(String[] args) {
        User user1=new User("Kübra","Öçal",new Truck());
        User user2=new User("Kübra","Öçal",new Car());
        Counter counter =new Counter();
        counter.payment(user1);
        counter.payment(user2);
        Manager manager=new Manager();
        manager.totalBalance(counter);
    }
}
