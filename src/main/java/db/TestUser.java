package db;

public class TestUser {
    private String uid;
    private String loginname;
    private String loginpass;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    @Override
    public String toString() {
        return "TestUser [uid=" + uid + ", loginname=" + loginname + ", loginpass=" + loginpass + "]";
    }
}
