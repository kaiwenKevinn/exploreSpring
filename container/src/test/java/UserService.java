/**
 * @author Kevin
 * @Description
 */
public class UserService {
    private String uid;
    private UserDao userDao;

    public UserService(){

    }


    @Override
    public String toString() {
        return super.toString();
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息" + userDao.queryUserName(uid));
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}