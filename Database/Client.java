package FactoryPattern.Database;

public class Client {
    public static void main(String[] args) {
        DatabaseFactory datafactory= new MysqlDatafactory();
        Database d= datafactory.database();
        System.out.println(d);
    }
}
