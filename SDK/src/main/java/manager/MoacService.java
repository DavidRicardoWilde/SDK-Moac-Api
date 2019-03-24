package manager;


import exception.McException;
import model.*;
import model.acount.*;
import model.vnode.*;

import network.service.MoacNetworkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class MoacService implements MoacServiceInf {
    private static final Logger log = LoggerFactory.getLogger(MoacService.class);

    private MoacNetworkService moacService;

    public MoacService(String baseURL){
        moacService = new MoacNetworkService(baseURL);
    }

    //Auth
    @Override
    public McResponse mc_getAuth(String account, String password) throws IOException,McException{
        Response<McResponse> response;

            Call<McResponse> call=moacService.getMoacInterface().mc_auth(account,password);
            response = call.execute();

            if(!response.body().getSuccess()){
                log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
                throw new McException(response.body().getMessage());
            }

            return response.body();
    }

    public McRegister mc_register(String password, String token) throws IOException, McException{
        Response<McRegister> response;
        Call<McRegister> call = moacService.getMoacInterface().mc_register(password,token);
        response = call.execute();

        return response.body();
    }

    public McResponse mc_login(String address, String pwd, String keyStore, String token)throws IOException, McException{
        Response<McResponse<McLogin>> response;
        Call<McResponse<McLogin>> call = moacService.getMoacInterface().mc_login(address,pwd,keyStore,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_getBalance(String vnodeip, String vnodeport, String address, String token)throws IOException, McException{
        Response<McResponse<McBalance>> response;
        Call<McResponse<McBalance>> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_getBlockNumber(String vnodeip, String vnodeport, String token)throws IOException, McException{
        Response<McResponse<McBlockNumber>> response;
        Call<McResponse<McBlockNumber>> call=moacService.getMoacInterface().mc_getBlockNumber(vnodeip,vnodeport,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_getBlockInfo(String vnodeip, String vnodeport, String block, String token)throws IOException, McException{
        Response<McResponse<McBlockInfo>> response;
        Call<McResponse<McBlockInfo>> call=moacService.getMoacInterface().mc_getBlockInfo(vnodeip,vnodeport,block,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_getTransactionByHash(String vnodeip, String vnodeport, String hash,
                                                  String token)throws IOException, McException{
        Response<McResponse<McTransactionByHash>> response;
        Call<McResponse<McTransactionByHash>> call=moacService.getMoacInterface().mc_getTransactionByHash(vnodeip,vnodeport,hash,token);
        response = call.execute();

            if(!response.body().getSuccess()){
                log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
                throw new McException(response.body().getMessage());
            }

        return response.body();
    }

    public McResponse mc_getTransactionReceiptByHash(String vnodeip, String vnodeport,
                                                     String address, String token)throws IOException, McException{
        Response<McResponse<McTransactionReceiptByHash>> response;
        Call<McResponse<McTransactionReceiptByHash>> call=moacService.getMoacInterface().mc_getTransactionReceiptByHash(vnodeip,
                vnodeport,address,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_sendRawTransaction(String vnodeip, String vnodeport, String from, String to,
                                            Integer amount, String method, String paramtypes, String paramvalues,
                                            String privatekey, String token)throws IOException, McException{
        Response<McResponse<McSendRawTransaction>> response;
        Call<McResponse<McSendRawTransaction>> call=moacService.getMoacInterface().mc_sendRawTransaction(vnodeip,vnodeport,
                from, to, amount, method, paramtypes, paramvalues, privatekey, token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_transferErc(String vnodeip, String vnodeport, String from, String to,
                                     String contractaddress, Integer amount, String privatekey, String token)throws IOException, McException{
        Response<McResponse<McTransferErc>> response;
        Call<McResponse<McTransferErc>> call=moacService.getMoacInterface().mc_transferErc(vnodeip,vnodeport,from,
                to, contractaddress, amount, privatekey, token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_getErcBalance(String vnodeip, String vnodeport, String address,
                                       String contractaddress, String token)throws IOException, McException{
        Response<McResponse<McErcBalance>> response;
        Call<McResponse<McErcBalance>> call=moacService.getMoacInterface().mc_getErcBalance(vnodeip,vnodeport,
                address,contractaddress, token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_ercApprove(String vnodeip, String vnodeport, String address, Integer amount,
                                    String privatekey, String microchainaddress, String contractaddress, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().mc_ercApprove(vnodeip,vnodeport,address, amount,
                privatekey, microchainaddress, contractaddress,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_buyErcMintToken(String vnodeip, String vnodeport, String address, String privatekey,
                                         String microchainaddress, String method, String paramtypes,
                                         String paramvalues, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().mc_buyErcMintToken(vnodeip,vnodeport,address,
                privatekey, microchainaddress, method, paramtypes,paramvalues, token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse mc_buyMoacMintToken(String vnodeip, String vnodeport, String address, String privatekey,
                                          String microchainaddress, String method, String paramtypes,
                                          String paramvalues, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().mc_buyMoacMintToken(vnodeip,vnodeport,address,privatekey,
                microchainaddress, method, paramtypes, paramvalues,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    //Micro
    public McResponse micro_getBlockNumber(String microip, String microport, String microchainaddress, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_getBlockNumber(microip,microport,microchainaddress,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse micro_getBlockInfo(String microip, String microport, String microchainaddress, String blocknum, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_getBlock(microip,microport,microchainaddress,blocknum,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse micro_getBalance(String microip, String microport, String microchainaddress, String address, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_getBalance(microip,microport, microchainaddress,address,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse micro_transferCoin(String vnodeip, String vnodeport, String microip, String microport,
                                             String microchainaddress, String via, String from,
                                             String to, Integer amount, String privatekye, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_transferCoin(vnodeip,vnodeport,microip,
                microport, microchainaddress, via, from, to,amount,privatekye,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse micro_sendRawTransaction(String vnodeip, String vnodeport, String microip,
                                                   String microport, String from, String microchainaddress,
                                                   String via, Integer amount, String dappaddress, String method,
                                                   String paramtypes, String paramvalues, String privatekey, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_sendRawTransaction(vnodeip,vnodeport, microip,
                microport,from, microchainaddress,via,amount,dappaddress, method, paramtypes, paramvalues,privatekey,token);
        response = call.execute();

            if(!response.body().getSuccess()){
                log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
                throw new McException(response.body().getMessage());
            }

        return response.body();
    }

    public McResponse micro_callContract(String microip, String microport, String microchainaddress,
                                             String dappaddress, String data, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_callContract(microip,microport,
                microchainaddress,dappaddress, data,token);
        response = call.execute();

        if(!response.body().getSuccess()){
                log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
                throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse micro_redeemErcMintToken(String vnodeip, String vnodeport, String microipHmonitor,
                                                   String microport, String microchainaddress, String dappaddress,
                                                   String address, Integer amount, String privatekey, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_redeemErcMintToken(vnodeip,vnodeport,microipHmonitor,
                microport, microchainaddress, dappaddress,address,amount,privatekey,token);
        response = call.execute();

        if(!response.body().getSuccess()){
            log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
            throw new McException(response.body().getMessage());
        }

        return response.body();
    }

    public McResponse micro_redeemMoacMintToken(String vnodeip, String vnodeport, String microipHmonitor,
                                                    String microport, String microchainaddress,
                                                    String dappbaseaddress, String address, Integer amount,
                                                    String privatekey, String token)throws IOException, McException{
        Response<McResponse> response;
        Call<McResponse> call=moacService.getMoacInterface().micro_redeemMoacMintToken(vnodeip,vnodeport,
                microipHmonitor,microport,microchainaddress,dappbaseaddress,address,amount,privatekey,token);
        response = call.execute();

            if(!response.body().getSuccess()){
                log.debug("response: "+response.body().getSuccess()+", details: "+response.body().getMessage());
                throw new McException(response.body().getMessage());
            }

        return response.body();
    }

}
