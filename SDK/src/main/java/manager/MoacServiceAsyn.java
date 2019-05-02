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
import support.*;

import java.io.IOException;

public class MoacServiceAsyn implements MoacServiceAsynInf{
    private static final Logger log = LoggerFactory.getLogger(MoacService.class);

    private MoacNetworkService moacService;

    public MoacServiceAsyn(MoacNetworkService moacNetworkService){
        this.moacService =moacNetworkService;
    }

    //account
    @Override
    public void mc_getAuth(String account, String password, CustomInf customInf) throws IOException, McException {
        Call<McResponse> call=moacService.getMoacInterface().mc_auth(account,password);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_register(String password, String token, CustomInf customInf) throws IOException, McException{
        Call<McRegister> call = moacService.getMoacInterface().mc_register(password,token);
        call.enqueue(new McRegisterCallback<McRegister>());
    }

    @Override
    public void mc_login(String address, String pwd, String encode, String  token, CustomInf customInf) throws IOException, McException{
        Call<McLogin> call = moacService.getMoacInterface().mc_login(address,pwd,encode,token);
        call.enqueue(new McLoginCallback<McLogin>());
    }

    @Override
    public void mc_import(String address, String pwd, String keystore, String token, CustomInf customInf) throws IOException, McException{
        Call<McImport> call = moacService.getMoacInterface().mc_import(address,pwd,keystore,token);
        call.enqueue(new McImportCallback<McImport>());
    }

    @Override
    public void mc_getBalance(String vnodeip, String vnodeport, String address, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_getBalance(vnodeip,vnodeport,address,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_getBlockNumber(String vnodeip, String vnodeport, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_getBlockNumber(vnodeip,vnodeport,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_getBlockInfo(String vnodeip, String vnodeport, String block, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse<McBlockInfo>> call=moacService.getMoacInterface().mc_getBlockInfo(vnodeip,vnodeport,block,token);
        call.enqueue(new McBlockInfoCallback<McResponse<McBlockInfo>>());
    }

    @Override
    public void mc_getTransactionByHash(String vnodeip, String vnodeport, String hash, String token, CustomInf customInf)throws IOException, McException{
        Call<McResponse<McTransactionByHash>> call=moacService.getMoacInterface().mc_getTransactionByHash(vnodeip,vnodeport,hash,token);
        call.enqueue(new McTransactionByHashCallback<McResponse<McTransactionByHash>>());
    }

    @Override
    public void mc_getTransactionReceiptByHash(String vnodeip, String vnodeport, String hash, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse<McTransactionReceiptByHash>> call=moacService.getMoacInterface().mc_getTransactionReceiptByHash(vnodeip,
                vnodeport,hash,token);
        call.enqueue(new McTransactionReceiptByHashCallback<McResponse<McTransactionReceiptByHash>>());
    }

    @Override
    public void mc_sendRawTransaction(String vnodeip, String vnodeport, String from, String to, Integer amount, String method, String paramtypes, String paramvalues, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_sendRawTransaction(vnodeip,vnodeport,
                from, to, amount, method, paramtypes, paramvalues, privatekey, token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_transferErc(String vnodeip, String vnodeport, String from, String to, String contractaddress, Integer amount, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_transferErc(vnodeip,vnodeport,from,
                to, contractaddress, amount, privatekey, token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_getErcBalance(String vnodeip, String vnodeport, String address, String contractaddress, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_getErcBalance(vnodeip,vnodeport,
                address,contractaddress, token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_ercApprove(String vnodeip, String vnodeport, String address, Integer amount, String privatekey, String microchainaddress, String contractaddress, String token,CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_ercApprove(vnodeip,vnodeport,address, amount,
                privatekey, microchainaddress, contractaddress,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_buyErcMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_buyErcMintToken(vnodeip,vnodeport,address,
                privatekey, microchainaddress, method, paramtypes,paramvalues, token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void mc_buyMoacMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().mc_buyMoacMintToken(vnodeip,vnodeport,address,privatekey,
                microchainaddress, method, paramtypes, paramvalues,token);
        call.enqueue(new McCallback<McResponse>());
    }

    //micro
    @Override
    public void micro_getBlockNumber(String microip, String microport, String microchainaddress, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_getBlockNumber(microip,microport,microchainaddress,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void micro_getBlockInfo(String microip, String microport, String microchainaddress, String blocknum, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_getBlock(microip,microport,microchainaddress,blocknum,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void micro_getBalance(String microip, String microport, String microchainaddress, String address, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_getBalance(microip,microport, microchainaddress,address,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void micro_transferCoin(String vnodeip, String vnodeport, String microip, String microport, String microchainaddress, String via, String from, String to, Integer amount, String privatekye, String token, CustomInf customInf)throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_transferCoin(vnodeip,vnodeport,microip,
                microport, microchainaddress, via, from, to,amount,privatekye,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void micro_sendRawTransaction(String vnodeip, String vnodeport, String microip, String microport, String from, String microchainaddress, String via, Integer amount, String dappaddress, String method, String paramtypes, String paramvalues, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_sendRawTransaction(vnodeip,vnodeport, microip,
                microport,from, microchainaddress,via,amount,dappaddress, method, paramtypes, paramvalues,privatekey,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void micro_callContract(String microip, String microport, String microchainaddress, String dappaddress, String data, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_callContract(microip,microport,
                microchainaddress,dappaddress, data,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void micro_redeemErcMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappaddress, String address, Integer amount, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_redeemErcMintToken(vnodeip,vnodeport,microipHmonitor,
                microport, microchainaddress, dappaddress,address,amount,privatekey,token);
        call.enqueue(new McCallback<McResponse>());
    }

    @Override
    public void micro_redeemMoacMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappbaseaddress, String address, Integer amount, String privatekey, String token, CustomInf customInf) throws IOException, McException{
        Call<McResponse> call=moacService.getMoacInterface().micro_redeemMoacMintToken(vnodeip,vnodeport,
                microipHmonitor,microport,microchainaddress,dappbaseaddress,address,amount,privatekey,token);
        call.enqueue(new McCallback<McResponse>());
    }
}
