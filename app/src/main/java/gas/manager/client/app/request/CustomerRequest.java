package gas.manager.client.app.request;

public class CustomerRequest {
    private String name;
    private String phone;
    private String address;
    private boolean men;
    private String password;
    private String avatar;

    public CustomerRequest(String name, String phone, String address, boolean isMen, String password, String avatar) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.men = isMen;
        this.password = password;
        this.avatar = avatar;
    }

    public CustomerRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean men() {
        return men;
    }

    public void setMen(boolean men) {
        this.men = men;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
