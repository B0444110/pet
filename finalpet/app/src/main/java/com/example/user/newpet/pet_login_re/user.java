package com.example.user.newpet.pet_login_re;

public class user {
    private String Name;
    private String Sex;
    private String Ca;
    private String Col;
    private String Age;
    private String Rec;
    private String Appe;
    public user() { }

    public user(String name, String sex,String category,String color,
                String age,String record,String appearance) {
        Name = name;
        Sex=sex; Ca=category;Col=color; Age=age;
        Rec=record;Appe=appearance;
        }

    public String getname() { return Name; }

    public void setname(String name) { Name = name; }

    public String getsex() { return Sex; }

    public void setsex(String sex) { Sex = sex; }

    public String getcategory() { return Ca; }

    public void setcategory(String category) { Ca = category; }

    public String getcolor() { return Col; }

    public void setcolor(String color) { Col = color; }

    public String getage() { return Age; }

    public void setage(String age) { Age = age; }

    public String getrecord() { return Rec; }

    public void setrecord(String record) { Rec = record; }

    public String getappearance() { return Appe; }

    public void setappearance(String appearance) { Appe = appearance; }

}
