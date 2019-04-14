package manager;

import exception.McException;
import model.McResponse;
import model.acount.McImport;
import model.acount.McLogin;
import model.acount.McRegister;
import model.vnode.*;
import network.service.MoacNetworkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class MoacServiceAsyn implements MoacServiceAsynInf{
    private static final Logger log = LoggerFactory.getLogger(MoacService.class);

    private MoacNetworkService moacService;


    public MoacServiceAsyn(MoacNetworkService moacNetworkService){
        this.moacService =moacNetworkService;
    }

    //account

    /***
     *
     * @param account
     * @param password
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_getAuth(String account, String password, CustomInf customInf) throws IOException, McException {
        Call<McResponse> call=moacService.getMoacInterface().mc_auth(account,password);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {
                if(!response.body().getSuccess()){
                    log.info("error");
                }else {
                    customInf.doSomething();
                }

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {
                System.out.println("something going wrong");
            }
        });
    }

    /***
     *
     * @param password
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_register(String password, String token, CustomInf customInf) throws IOException, McException{
        Call<McRegister> call = moacService.getMoacInterface().mc_register(password,token);
        call.enqueue(new Callback<McRegister>() {
            @Override
            public void onResponse(Call<McRegister> call, Response<McRegister> response) {
                if(!response.body().isSuccess()){
                    log.info("error");
                }else {
                    customInf.doSomething();
                }
            }

            @Override
            public void onFailure(Call<McRegister> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param address
     * @param pwd
     * @param encode
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_login(String address, String pwd, String encode, String  token, CustomInf customInf) throws IOException, McException{
        Call<McLogin> call = moacService.getMoacInterface().mc_login(address,pwd,encode,token);
        call.enqueue(new Callback<McLogin>() {
            @Override
            public void onResponse(Call<McLogin> call, Response<McLogin> response) {

            }

            @Override
            public void onFailure(Call<McLogin> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param address
     * @param pwd
     * @param keystore
     * @param token
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_import(String address, String pwd, String keystore, String token, CustomInf customInf) throws IOException, McException{
        Call<McImport> call = moacService.getMoacInterface().mc_import(address,pwd,keystore,token);
        call.enqueue(new Callback<McImport>() {
            @Override
            public void onResponse(Call<McImport> call, Response<McImport> response) {

            }

            @Override
            public void onFailure(Call<McImport> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_getBalance(String vnodeip, String vnodeport, String address, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {
                if(!response.body().getSuccess()){
                    log.info("error");
                }else {
                    customInf.doSomething();
                }

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {
                System.out.println("something going wrong");
            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_getBlockNumber(String vnodeip, String vnodeport, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_getBlockNumber(vnodeip,vnodeport,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param block
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_getBlockInfo(String vnodeip, String vnodeport, String block, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse<McBlockInfo>> call=moacService.getMoacInterface().mc_getBlockInfo(vnodeip,vnodeport,block,token);
        call.enqueue(new Callback<McResponse<McBlockInfo>>() {
            @Override
            public void onResponse(Call<McResponse<McBlockInfo>> call, Response<McResponse<McBlockInfo>> response) {

            }

            @Override
            public void onFailure(Call<McResponse<McBlockInfo>> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param hash
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_getTransactionByHash(String vnodeip, String vnodeport, String hash, String token, CustomInf customInf)throws IOException, McException{
        Call<McResponse<McTransactionByHash>> call=moacService.getMoacInterface().mc_getTransactionByHash(vnodeip,vnodeport,hash,token);
        call.enqueue(new Callback<McResponse<McTransactionByHash>>() {
            @Override
            public void onResponse(Call<McResponse<McTransactionByHash>> call, Response<McResponse<McTransactionByHash>> response) {

            }

            @Override
            public void onFailure(Call<McResponse<McTransactionByHash>> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param hash
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_getTransactionReceiptByHash(String vnodeip, String vnodeport, String hash, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse<McTransactionReceiptByHash>> call=moacService.getMoacInterface().mc_getTransactionReceiptByHash(vnodeip,
                vnodeport,hash,token);
        call.enqueue(new Callback<McResponse<McTransactionReceiptByHash>>() {
            @Override
            public void onResponse(Call<McResponse<McTransactionReceiptByHash>> call, Response<McResponse<McTransactionReceiptByHash>> response) {

            }

            @Override
            public void onFailure(Call<McResponse<McTransactionReceiptByHash>> call, Throwable t) {

            }
        });
    }

    /***
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
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_sendRawTransaction(String vnodeip, String vnodeport, String from, String to, Integer amount, String method, String paramtypes, String paramvalues, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_sendRawTransaction(vnodeip,vnodeport,
                from, to, amount, method, paramtypes, paramvalues, privatekey, token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param from
     * @param to
     * @param contractaddress
     * @param amount
     * @param privatekey
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_transferErc(String vnodeip, String vnodeport, String from, String to, String contractaddress, Integer amount, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_transferErc(vnodeip,vnodeport,from,
                to, contractaddress, amount, privatekey, token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param contractaddress
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_getErcBalance(String vnodeip, String vnodeport, String address, String contractaddress, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_getErcBalance(vnodeip,vnodeport,
                address,contractaddress, token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param amount
     * @param privatekey
     * @param microchainaddress
     * @param contractaddress
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_ercApprove(String vnodeip, String vnodeport, String address, Integer amount, String privatekey, String microchainaddress, String contractaddress, String token,CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_ercApprove(vnodeip,vnodeport,address, amount,
                privatekey, microchainaddress, contractaddress,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
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
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void mc_buyErcMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_buyErcMintToken(vnodeip,vnodeport,address,
                privatekey, microchainaddress, method, paramtypes,paramvalues, token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    public void mc_buyMoacMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_buyMoacMintToken(vnodeip,vnodeport,address,privatekey,
                microchainaddress, method, paramtypes, paramvalues,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    //micro

    /***
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void micro_getBlockNumber(String microip, String microport, String microchainaddress, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_getBlockNumber(microip,microport,microchainaddress,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    public void micro_getBlockInfo(String microip, String microport, String microchainaddress, String blocknum, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_getBlock(microip,microport,microchainaddress,blocknum,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param address
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void micro_getBalance(String microip, String microport, String microchainaddress, String address, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_getBalance(microip,microport, microchainaddress,address,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    public void micro_transferCoin(String vnodeip, String vnodeport, String microip, String microport, String microchainaddress, String via, String from, String to, Integer amount, String privatekye, String token, CustomInf customInf)throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_transferCoin(vnodeip,vnodeport,microip,
                microport, microchainaddress, via, from, to,amount,privatekye,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param microip
     * @param microport
     * @param from
     * @param microchainaddress
     * @param via
     * @param amount
     * @param dappaddress
     * @param method
     * @param paramtypes
     * @param paramvalues
     * @param privatekey
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void micro_sendRawTransaction(String vnodeip, String vnodeport, String microip, String microport, String from, String microchainaddress, String via, Integer amount, String dappaddress, String method, String paramtypes, String paramvalues, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_sendRawTransaction(vnodeip,vnodeport, microip,
                microport,from, microchainaddress,via,amount,dappaddress, method, paramtypes, paramvalues,privatekey,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    public void micro_callContract(String microip, String microport, String microchainaddress, String dappaddress, String data, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_callContract(microip,microport,
                microchainaddress,dappaddress, data,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param microipHmonitor
     * @param microport
     * @param microchainaddress
     * @param dappaddress
     * @param address
     * @param amount
     * @param privatekey
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void micro_redeemErcMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappaddress, String address, Integer amount, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_redeemErcMintToken(vnodeip,vnodeport,microipHmonitor,
                microport, microchainaddress, dappaddress,address,amount,privatekey,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param microipHmonitor
     * @param microport
     * @param microchainaddress
     * @param dappbaseaddress
     * @param address
     * @param amount
     * @param privatekey
     * @param token
     * @param customInf
     * @throws IOException
     * @throws McException
     */
    @Override
    public void micro_redeemMoacMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappbaseaddress, String address, Integer amount, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_redeemMoacMintToken(vnodeip,vnodeport,
                microipHmonitor,microport,microchainaddress,dappbaseaddress,address,amount,privatekey,token);
        call.enqueue(new Callback<McResponse>() {
            @Override
            public void onResponse(Call<McResponse> call, Response<McResponse> response) {

            }

            @Override
            public void onFailure(Call<McResponse> call, Throwable t) {

            }
        });
    }
}
