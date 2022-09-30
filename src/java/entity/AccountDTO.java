
package entity;

/**
 *
 * @author Admin
 */
public class AccountDTO {
    public int uID;
    public String Username;
    public String password;
    public int isSell;
    public int isAdmin;
//    public String     
    
    public AccountDTO(){
        
    }
    public AccountDTO(int uID,String Username, String password,int isSell,int isAdmin){
        this.uID = uID;
        this.Username=Username;
        this.password=password;
        this.isAdmin=isAdmin;
        this.isSell=isSell;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public int getIsSell() {
        return isSell;
    }

    public void setIsSell(int isSell) {
        this.isSell = isSell;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "AccountDTO{" + "uID=" + uID + ", Username=" + Username + ", password=" + password + ", isSell=" + isSell + ", isAdmin=" + isAdmin + '}';
    }


}