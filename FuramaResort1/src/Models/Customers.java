package Models;

public class Customers  {
//    1.	Tạo class có tên là Customer với các thuộc tính như sau:  Họ tên Customer, Ngày sinh, Giới tính, Số CMND,
//    Số ĐT, Email, Loại khách, Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().
    private String nameCustomer;
    private String birthDay;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;

    public Customers() {
    }

    public Customers(String nameCustomer, String birthDay, String gender, String idCard, String phoneNumber,
                     String email, String typeCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String showInfor(){
        return "1.Name customer:"+this.nameCustomer+
                "\n2.Birthday: "+this.birthDay+
                "\n3.Gender: "+this.gender+
                "\n4.Id card: "+this.idCard+
                "\n5.Phone Number: "+this.phoneNumber+
                "\n6.Email: "+this.email+
                "\n7.Type customer: "+this.typeCustomer+
                "\n8.Address: "+this.address;
    }




}
