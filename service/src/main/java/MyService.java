package src.main.java;

import src.main.java.Db;
import src.main.java.DbSetting;
import src.main.java.MyEntity;

import java.util.UUID;

public class MyService {

    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "myService";
    private Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}