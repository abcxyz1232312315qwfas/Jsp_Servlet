package com.buiminhduc.model.entity;


import com.buiminhduc.common.annotation.Column;
import com.buiminhduc.common.annotation.Entity;
import com.buiminhduc.common.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "DonHang")
public class OrderEntity {
    @Id(value = "id_DH")
    private Integer id;
    @Column(value = "FirstName")
    private String firstName;
    @Column(value = "LastName")
    private String lastName;
    @Column(value = "CompanyName")
    private String CompanyName;
    @Column(value = "Email")
    private String email;
    @Column(value = "Phone")
    private String phone;
    @Column(value = "Address")
    private String address;
    @Column(value = "Province")
    private String province;
    @Column(value = "District")
    private String district;
    @Column(value = "Apartment")
    private String apartment;
    @Column(value = "PostCode")
    private String postCode;
    @Column(value = "SpecialNotes")
    private String specialNotes;
    @Column(value = "modefied_date")
    private LocalDate modefied_date;
    @Column(value = "TongTien")
    private Integer tongTien;
    @Column(value = "PaymentMethod")
    private String paymentMethod;
    @Column(value = "id_user")
    private Integer id_user;
    @Column(value = "ListProduct")
    private String listProduct;

    public OrderEntity(Integer id, String firstName, String lastName, String companyName, String email, String phone, String address, String province, String district, String apartment, String postCode, String specialNotes, LocalDate modefied_date, Integer tongTien, String paymentMethod, Integer id_user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        CompanyName = companyName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.province = province;
        this.district = district;
        this.apartment = apartment;
        this.postCode = postCode;
        this.specialNotes = specialNotes;
        this.modefied_date = modefied_date;
        this.tongTien = tongTien;
        this.paymentMethod = paymentMethod;
        this.id_user = id_user;
    }

    public OrderEntity(Integer id, String firstName, String lastName, String companyName, String email, String phone, String address, String province, String district, String apartment, String postCode, String specialNotes, LocalDate modefied_date, Integer tongTien, String paymentMethod, Integer id_user, String listProduct) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        CompanyName = companyName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.province = province;
        this.district = district;
        this.apartment = apartment;
        this.postCode = postCode;
        this.specialNotes = specialNotes;
        this.modefied_date = modefied_date;
        this.tongTien = tongTien;
        this.paymentMethod = paymentMethod;
        this.id_user = id_user;
        this.listProduct = listProduct;
    }

    public OrderEntity(String firstName, String lastName, String companyName, String email, String phone, String address, String province, String district, String apartment, String postCode, String specialNotes, LocalDate modefied_date, Integer tongTien, String paymentMethod, Integer id_user) {
        this.firstName = firstName;
        this.lastName = lastName;
        CompanyName = companyName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.province = province;
        this.district = district;
        this.apartment = apartment;
        this.postCode = postCode;
        this.specialNotes = specialNotes;
        this.modefied_date = modefied_date;
        this.tongTien = tongTien;
        this.paymentMethod = paymentMethod;
        this.id_user = id_user;
    }

    public OrderEntity(String firstName, String lastName, String companyName, String email, String phone, String address, String province, String district, String apartment, String postCode, String specialNotes, LocalDate modefied_date, Integer tongTien, String paymentMethod, Integer id_user, String listProduct) {
        this.firstName = firstName;
        this.lastName = lastName;
        CompanyName = companyName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.province = province;
        this.district = district;
        this.apartment = apartment;
        this.postCode = postCode;
        this.specialNotes = specialNotes;
        this.modefied_date = modefied_date;
        this.tongTien = tongTien;
        this.paymentMethod = paymentMethod;
        this.id_user = id_user;
        this.listProduct = listProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }


    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public LocalDate getModefied_date() {
        return modefied_date;
    }

    public void setModefied_date(LocalDate modefied_date) {
        this.modefied_date = modefied_date;
    }

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getListProduct() {
        return listProduct;
    }

    public void setListProduct(String listProduct) {
        this.listProduct = listProduct;
    }


    public OrderEntity() {
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", apartment='" + apartment + '\'' +
                ", postCode='" + postCode + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                ", modefied_date=" + modefied_date +
                ", tongTien=" + tongTien +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", id_user='" + id_user + '\'' +
                '}';
    }
}
