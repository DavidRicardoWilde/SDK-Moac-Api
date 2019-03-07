package manager;

import model.Auth;
import model.McResult;
import network.service.MoacService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class MoacServiceManager {
    private MoacService moacService;
    private Response<McResult> response = null;

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
        Call<McResult> call=moacService.getMoacInterface().mc_getAuth(account,password);
        response = call.execute();

        if (response.body().getSuccess() == true) {
            return new Auth(response.body().getSuccess(), response.body().getData());
        }else {
            return new Auth(response.body().getSuccess(),response.body().getMessage());
        }
    }

}
