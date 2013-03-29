package org.youyou.common.domain;

/**
 *
 * @author youpengfeiinfo
 * @version 13-3-29
 */

public class User {
    private int id;
    private String name;
    private String age;
    private String number;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
