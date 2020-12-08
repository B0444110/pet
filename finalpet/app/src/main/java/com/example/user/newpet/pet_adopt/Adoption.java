package com.example.user.newpet.pet_adopt;

public class Adoption {

    private String Title;
    private String Category ;
    private String Description ;
    private String Description2 ;
    private String Description3 ;
    private String Description4 ;
    private int Thumbnail ;

    public Adoption() {
    }

    public Adoption(String title, String category, String description, String description2, String description3, String description4, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Description2 = description2;
        Description3 = description3;
        Description4 = description4;
        Thumbnail = thumbnail;
    }


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public String getDescription2() {
        return Description2;
    }

    public String getDescription3() {
        return Description3;
    }

    public String getDescription4() {
        return Description4;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setDescription2(String description2) { Description2 = description2; }

    public void setDescription3(String description3) {
        Description3 = description3;
    }

    public void setDescription4(String description4) {
        Description4 = description4;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
