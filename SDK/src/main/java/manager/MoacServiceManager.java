package manager;

import model.*;
import model.acount.*;
import model.micro.*;
import model.vnode.*;
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
    public McRegister mc_register(String password, String token) throws IOException{
        Response<McRegister> response;
        Call<McRegister> call = moacService.getMoacInterface().mc_register(password,token);
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
    public McLogin mc_login(String address, String pwd, String keyStore, String  token)throws IOException{
        Response<McLogin> response;
        Call<McLogin> call = moacService.getMoacInterface().mc_login(address,pwd,keyStore,token);
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
        public McTransactionByHash mc_getTransactionByHash(String vnodeip, String vnodeport, String hash,
                                                           String token)throws IOException{
        Response<McTransactionByHash> response;
        Call<McTransactionByHash> call=moacService.getMoacInterface().mc_getTransactionByHash(vnodeip,vnodeport,hash,token);
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
    public McTransactionReceiptByHash mc_getTransactionReceiptByHash(String vnodeip, String vnodeport,
                                                                     String address, String token)throws IOException{
        Response<McTransactionReceiptByHash> response;
        Call<McTransactionReceiptByHash> call=moacService.getMoacInterface().mc_getTransactionReceiptByHash(vnodeip,
                vnodeport,address,token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param from
     * @param to
     * @param amount
     * @param method
     * @param paramtypes
     * @param paramvalues
     * @param privatekey
     * @param token
     * @return
     * @throws IOException
     */
    public McSendRawTransaction mc_sendRawTransaction(String vnodeip, String vnodeport, String from, String to,
                                                          Integer amount, String method, String paramtypes, String paramvalues,
                                                          String privatekey, String token)throws IOException{
        Response<McSendRawTransaction> response;
        Call<McSendRawTransaction> call=moacService.getMoacInterface().mc_sendRawTransaction(vnodeip,vnodeport,
                from, to, amount, method, paramtypes, paramvalues, privatekey, token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param from
     * @param to
     * @param contractaddress
     * @param amount
     * @param privatekey
     * @param token
     * @return
     * @throws IOException
     */
    public McTransferErc mc_transferErc(String vnodeip, String vnodeport, String from, String to,
                                        String contractaddress, Integer amount, String privatekey, String token)throws IOException{
        Response<McTransferErc> response;
        Call<McTransferErc> call=moacService.getMoacInterface().mc_transferErc(vnodeip,vnodeport,from,
                to, contractaddress, amount, privatekey, token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param contractaddress
     * @param token
     * @return
     * @throws IOException
     */
    public McErcBalance mc_getErcBalance(String vnodeip, String vnodeport, String address,
                                         String contractaddress, String token)throws IOException{
        Response<McErcBalance> response;
        Call<McErcBalance> call=moacService.getMoacInterface().mc_getErcBalance(vnodeip,vnodeport,
                address,contractaddress, token);
        response = call.execute();

        return response.body();
    }

    /**
     *
      * @param vnodeip
     * @param vnodeport
     * @param address
     * @param amount
     * @param privatekey
     * @param microchainaddress
     * @param contractaddress
     * @param token
     * @return
     * @throws IOException
     */
    public McErcApprove mc_ercApprove(String vnodeip, String vnodeport, String address, Integer amount,
                                      String privatekey, String microchainaddress, String contractaddress, String token)throws IOException{
        Response<McErcApprove> response;
        Call<McErcApprove> call=moacService.getMoacInterface().mc_ercApprove(vnodeip,vnodeport,address, amount,
                privatekey, microchainaddress, contractaddress,token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param privatekey
     * @param microchainaddress
     * @param method
     * @param paramtypes
     * @param paramvalues
     * @param token
     * @return
     * @throws IOException
     */
    public McBuyErcMintToken mc_buyErcMintToken(String vnodeip, String vnodeport, String address, String privatekey,
                                                String microchainaddress, String method, String paramtypes,
                                                String paramvalues, String token)throws IOException{
        Response<McBuyErcMintToken> response;
        Call<McBuyErcMintToken> call=moacService.getMoacInterface().mc_buyErcMintToken(vnodeip,vnodeport,address,
                privatekey, microchainaddress, method, paramtypes,paramvalues, token);
        response = call.execute();

        return response.body();
    }

    public McBuyMoacMintToken mc_buyMoacMintToken(String vnodeip, String vnodeport, String address, String privatekey,
                                                  String microchainaddress, String method, String paramtypes,
                                                  String paramvalues, String token)throws IOException{
        Response<McBuyMoacMintToken> response;
        Call<McBuyMoacMintToken> call=moacService.getMoacInterface().mc_buyMoacMintToken(vnodeip,vnodeport,address,privatekey,
                microchainaddress, method, paramtypes, paramvalues,token);
        response = call.execute();

        return response.body();
    }

    //Micro

    /**
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param token
     * @return
     * @throws IOException
     */
    public MicroBlockNumber micro_getBlockNumber(String microip, String microport, String microchainaddress, String token)throws IOException{
        Response<MicroBlockNumber> response;
        Call<MicroBlockNumber> call=moacService.getMoacInterface().micro_getBlockNumber(microip,microport,microchainaddress,token);
        response = call.execute();

        return response.body();
    }

    /**
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param blocknum
     * @param token
     * @return
     * @throws IOException
     */
    public MicroBlockInfo micro_getBlockInfo(String microip, String microport, String microchainaddress, String blocknum,String token)throws IOException{
        Response<MicroBlockInfo> response;
        Call<MicroBlockInfo> call=moacService.getMoacInterface().micro_getBlock(microip,microport,microchainaddress,blocknum,token);
        response = call.execute();

        return response.body();
    }

    public MicroBalance micro_getBalance(String microip, String microport, String microchainaddress, String address,String token)throws IOException{
        Response<MicroBalance> response;
        Call<MicroBalance> call=moacService.getMoacInterface().micro_getBalance(microip,microport, microchainaddress,address,token);
        response = call.execute();

        return response.body();
    }

        public MicroTransferCoin micro_transferCoin(String vnodeip, String vnodeport, String microip, String microport,
                                                    String microchainaddress, String via, String from,
                                                    String to,Integer amount, String privatekye,  String token)throws IOException{
        Response<MicroTransferCoin> response;
        Call<MicroTransferCoin> call=moacService.getMoacInterface().micro_transferCoin(vnodeip,vnodeport,microip,
                microport, microchainaddress, via, from, to,amount,privatekye,token);
        response = call.execute();

        return response.body();
    }

        public MicroSendRawTransaction micro_sendRawTransaction(String vnodeip, String vnodeport, String microip,
                                                                String microport, String from, String microchainaddress,
                                                                String via, Integer amount, String dappaddress, String method,
                                                                String paramtypes, String paramvalues,String privatekey, String token)throws IOException{
        Response<MicroSendRawTransaction> response;
        Call<MicroSendRawTransaction> call=moacService.getMoacInterface().micro_sendRawTransaction(vnodeip,vnodeport, microip,
                microport,from, microchainaddress,via,amount,dappaddress, method, paramtypes, paramvalues,privatekey,token);
        response = call.execute();

        return response.body();
    }

        public MicroCallContract micro_callContract(String microip, String microport, String microchainaddress,
                                                    String dappaddress, String data, String token)throws IOException{
        Response<MicroCallContract> response;
        Call<MicroCallContract> call=moacService.getMoacInterface().micro_callContract(microip,microport,
                microchainaddress,dappaddress, data,token);
        response = call.execute();

        return response.body();
    }

        public MicroRedeemErcMintToken micro_redeemErcMintToken(String vnodeip, String vnodeport, String microipHmonitor,
                                                                String microport, String microchainaddress, String dappaddress,
                                                                String address, Integer amount, String privatekey,String token)throws IOException{
        Response<MicroRedeemErcMintToken> response;
        Call<MicroRedeemErcMintToken> call=moacService.getMoacInterface().micro_redeemErcMintToken(vnodeip,vnodeport,microipHmonitor,
                microport, microchainaddress, dappaddress,address,amount,privatekey,token);
        response = call.execute();

        return response.body();
    }

        public MicroRedeemMoacMintToken micro_redeemMoacMintToken(String vnodeip, String vnodeport, String microipHmonitor,
                                                                  String microport, String microchainaddress,
                                                                  String dappbaseaddress, String address, Integer amount,String privatekey, String token)throws IOException{
        Response<MicroRedeemMoacMintToken> response;
        Call<MicroRedeemMoacMintToken> call=moacService.getMoacInterface().micro_redeemMoacMintToken(vnodeip,vnodeport,
                microipHmonitor,microport,microchainaddress,dappbaseaddress,address,amount,privatekey,token);
        response = call.execute();

        return response.body();
    }

}
