package com.example.oop13072020;

public class SinhVien {
    //Thuộc tính

    private String Ten;
    private int Tuoi;
    private String Diachi;
    // Định nghĩa constructer : phương thức khởi tạo
    public  SinhVien(String Ten ,int tuoi,String DiaChi)
    {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.Diachi = DiaChi;
    }
   // trỏ chuột vào tên class nhấn alt + insert để gọi getter setter tự động
    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    // Phương thức
    //public void setTen(String ten)
    //{
        //if(!ten.isEmpty())
        //{
            //this.Ten = ten;
        //}
    //}
    //public String getTen()
    //{
       // return Ten;
    //}
}
