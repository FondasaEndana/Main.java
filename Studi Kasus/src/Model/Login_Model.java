package Model;

import Controller.Login_Controller;
import Entity.User_Entity;
import java.util.ArrayList;
public class Login_Model {
    private static ArrayList<User_Entity> akun = new ArrayList<>();

    public static void initialUser(){
        User_Entity user = new User_Entity("Fondasa","zeroace", "123");


    }

    public static void regist(User_Entity user){
        akun.add(user);
    }

    public static ArrayList<User_Entity> getAkun(){
        return akun;
    }

}
