package com.example.oop13072020;

public class SinhVien {
    //Thuộc tính

    private String Ten;
    private int Tuoi;
    private String Diachi;

    // Phương thức
    public void setTen(String ten)
    {
        if(!ten.isEmpty())
        {
            this.Ten = ten;
        }
    }
    public String getTen()
    {
        return Ten;
    }
}
