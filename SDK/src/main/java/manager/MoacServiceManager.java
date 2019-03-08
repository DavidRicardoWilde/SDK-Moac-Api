package manager;

import model.*;
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

    /**
     *
     * @param password
     * @param token
     * @return
     * @throws IOException
     */
    public Register mc_register(String password, String token) throws IOException{
        Response<Register> response;
        Call<Register> call = moacService.getMoacInterface().mc_register(password,token);
        response = call.execute();

        return response.body();
    }

    /***
     *
     * @param address
     * @param pwd
     * @param keyStore
     * @param token
     * @return
     * @throws IOException
     */
    public Login mc_login(String address, String pwd, String keyStore, String  token)throws IOException{
        Response<Login> response;
        Call<Login> call = moacService.getMoacInterface().mc_login(address,pwd,keyStore,token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param token
     * @return
     * @throws IOException
     */
    public McBalance mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
        Response<McBalance> response;
        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param token
     * @return
     * @throws IOException
     */
    public McBlockNumber mc_getBlockNumber(String vnodeip, String vnodeport, String token)throws IOException{
        Response<McBlockNumber> response;
        Call<McBlockNumber> call=moacService.getMoacInterface().mc_getBlockNumber(vnodeip,vnodeport,token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param block
     * @param token
     * @return
     * @throws IOException
     */
    public McBlockInfo mc_getBlockInfo(String vnodeip, String vnodeport, String block, String token)throws IOException{
        Response<McBlockInfo> response;
        Call<McBlockInfo> call=moacService.getMoacInterface().mc_getBlockInfo(vnodeip,vnodeport,block,token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param hash
     * @param token
     * @return
     * @throws IOException Todo: 添加自定义Exception来处理Data为null的情况
     */
        public McTransactionByHash mc_getTransactionByHash(String vnodeip, String vnodeport, String hash, String token)throws IOException{
        Response<McTransactionByHash> response;
        Call<McTransactionByHash> call=moacService.getMoacInterface().mc_getTransactionByHash(vnodeip,vnodeport,hash,token);
        response = call.execute();

        return response.body();
    }


    public McTransactionReceiptByHash mc_getTransactionReceiptByHash(String vnodeip, String vnodeport, String address, String token)throws IOException{
        Response<McTransactionReceiptByHash> response;
        Call<McTransactionReceiptByHash> call=moacService.getMoacInterface().mc_getTransactionReceiptByHash(vnodeip,vnodeport,address,token);
        response = call.execute();

        return response.body();
    }

        public McSendRawTransaction mc_sendRawTransaction(String vnodeip, String vnodeport, String from, String to,
                                                          int amount, String method, String[] paramtypes, Integer[] paramvalues,
                                                          String privatekey, String token)throws IOException{
        Response<McSendRawTransaction> response;
        Call<McSendRawTransaction> call=moacService.getMoacInterface().mc_sendRawTransaction(vnodeip,vnodeport,from, to,
                amount, method, paramtypes, paramvalues, privatekey, token);
        response = call.execute();

        return response.body();
    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }

    //    public McBalance Mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException{
//        Response<McBalance> response;
//        Call<McBalance> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
//        response = call.execute();
//
//        return response.body();
//    }
}
