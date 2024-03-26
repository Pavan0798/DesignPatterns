package FactoryPattern.Database;

public class MysqlDatafactory implements DatabaseFactory{
    @Override
    public Database database() {
        return new Mysql();
    }
}
