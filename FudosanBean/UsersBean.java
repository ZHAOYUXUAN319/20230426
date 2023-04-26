/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FudosanBean;

/**
 *ユーザデータ
 * @author hangt
 */
public class UsersBean {

    private int UsersId;
    private String UsersPassword;
    private String UsersPhone;

    public int getUsersId() {
        return UsersId;
    }

    public void setUsersId(int UsersId) {
        this.UsersId = UsersId;
    }

    public String getUsersPassword() {
        return UsersPassword;
    }

    public void setUsersPassword(String UsersPassword) {
        this.UsersPassword = UsersPassword;
    }

    public String getUsersPhone() {
        return UsersPhone;
    }

    public void setUsersPhone(String UsersPhone) {
        this.UsersPhone = UsersPhone;
    }
}
