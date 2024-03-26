package FactoryPattern.Database;

public class PostgresFactory implements DatabaseFactory{
    @Override
    public Database database() {
        return new Postgres();
    }
}
