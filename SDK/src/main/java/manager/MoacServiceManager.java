package manager;

import model.Auth;
import model.McResult;
import model.Register;
import network.service.MoacService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class MoacServiceManager {
    private MoacService moacService;
    //private Response<McResult> response = null;

    public MoacServiceManager(String baseURL){
        moacService = new MoacService(baseURL);
    }

    //Auth
    /***
     *
     * @param account
     * @param password
     * @return Auth
     *  To get token
     * @throws IOException
     */
    public Auth mc_getAuth(String account, String password) throws IOException {
        Response<Auth> response;
        Call<Auth> call=moacService.getMoacInterface().mc_auth(account,password);
        response = call.execute();

        return response.body();
//        if (response.body().getSuccess() == true) {
//            return new Auth(response.body().getSuccess(), response.body().getMessage(), response.body().getData());
//        }else {
//            return new Auth(response.body().getSuccess(), response.body().getMessage());
//        }
    }

    public Register mc_register(String password, String token) throws IOException{
        Response<Register> response;
        Call<Register> call = moacService.getMoacInterface().mc_register(password,token);
        response = call.execute();

        return response.body();
    }

}
