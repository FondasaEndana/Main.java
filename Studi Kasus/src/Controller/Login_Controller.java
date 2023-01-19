package Controller;

import Entity.User_Entity;
import Model.Login_Model;

public class Login_Controller {

    private static User_Entity userlogged = null;
    public static boolean login(String username, String password){
        for (User_Entity user : Login_Model.getAkun()){
            System.out.println(user.username);
            if((user.username.equals(username)) && (user.password.equals(password))){
                userlogged = user;
                return true;
            }
        }
        return false;
    }

    public static boolean register(User_Entity akunBaru){
        for (User_Entity akun : Login_Model.getAkun()){
            if ((akun.username.equals(akunBaru.username))){
                return false;
            }
        }

        Login_Model.regist(akunBaru);

        return true;
    }

    public static void logout(){
        userlogged = null;
    }

    public static User_Entity getUserlogged(){
        return userlogged;
    }
}
