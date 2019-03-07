import manager.MoacServiceManager;
import model.Auth;

import java.io.IOException;

public class SDKDemo {
    //test
    public static void main(String[] args){
        new SDKDemo().run();
    }

    public void run(){
        try{
            String url = "http://139.198.126.104:8080/";
            MoacServiceManager moacServiceManager = new MoacServiceManager(url);
            Auth auth = moacServiceManager.mc_getAuth("test","123456");
            System.out.println("token: "+auth.getToken());

//            Register register=moacServiceManager.mc_register("test","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1YzZkMzYzZTNkYjhmYzM4M2VmNGU2OGQiLCJhY2NvdW50IjoidGVzdCIsInB3ZCI6IjEyMzQ1NiIsIl9fdiI6MCwiaWF0IjoxNTUxOTA5ODE5LCJleHAiOjE1NTE5MTcwMTl9.i0YNkuUFD5E31epgrHIiYnW0rCclLm-Lvtvs57bStmI");
//            System.out.println("success: "+register.getData());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
