package ru.mirea.lab2;

public class Dog {
    String nick;
    int age;

    public Dog(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public String getNick() {return nick;}

    public void setNick(String nick) {this.nick = nick;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public int humanAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }
}