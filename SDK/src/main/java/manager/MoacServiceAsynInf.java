package manager;

import exception.McException;
import model.McResponse;
import model.acount.McLogin;
import model.acount.McRegister;
import model.vnode.*;
import retrofit2.Callback;

import java.io.IOException;

public interface MoacServiceAsynInf {
    void mc_getAuth(String account, String password, Callback<McResponse> callback) throws IOException, McException;

    void mc_register(String password, String token, Callback<McRegister> callback) throws IOException, McException;

    void mc_login(String address, String pwd, String keyStore, String token, Callback<McResponse<McLogin>> callback) throws IOException, McException;

    void mc_getBalance(String vnodeip, String vnodeport, String address, String token, Callback<McResponse<McBalance>> callback) throws IOException, McException;

    void mc_getBlockNumber(String vnodeip, String vnodeport, String token, Callback<McResponse<McBlockNumber>> callback) throws IOException, McException;

    void mc_getBlockInfo(String vnodeip, String vnodeport, String block, String token, Callback<McResponse<McBlockInfo>> callback) throws IOException, McException;

    void mc_getTransactionByHash(String vnodeip, String vnodeport, String hash, String token, Callback<McResponse<McTransactionByHash>> callback)throws IOException, McException;

    void mc_getTransactionReceiptByHash(String vnodeip, String vnodeport, String address, String token, Callback<McResponse<McTransactionReceiptByHash>> callback) throws IOException, McException;

    void mc_sendRawTransaction(String vnodeip, String vnodeport, String from, String to, Integer amount, String method, String paramtypes, String paramvalues, String privatekey, String token, Callback<McResponse<McSendRawTransaction>> callback) throws IOException, McException;

    void mc_transferErc(String vnodeip, String vnodeport, String from, String to, String contractaddress, Integer amount, String privatekey, String token, Callback<McResponse<McTransferErc>> callback) throws IOException, McException;

    void mc_getErcBalance(String vnodeip, String vnodeport, String address, String contractaddress, String token, Callback<McResponse<McErcBalance>> callback) throws IOException, McException;

    void mc_ercApprove(String vnodeip, String vnodeport, String address, Integer amount, String privatekey, String microchainaddress, String contractaddress, String token, Callback<McResponse> callback) throws IOException, McException;

    void mc_buyErcMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token, Callback<McResponse> callback) throws IOException, McException;

    void mc_buyMoacMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token, Callback<McResponse> callback) throws IOException, McException;

    void micro_getBlockNumber(String microip, String microport, String microchainaddress, String token, Callback<McResponse> callback) throws IOException, McException;

    void micro_getBlockInfo(String microip, String microport, String microchainaddress, String blocknum, String token, Callback<McResponse> callback) throws IOException, McException;

    void micro_getBalance(String microip, String microport, String microchainaddress, String address, String token, Callback<McResponse> callback) throws IOException, McException;

    void micro_transferCoin(String vnodeip, String vnodeport, String microip, String microport, String microchainaddress, String via, String from, String to, Integer amount, String privatekye, String token, Callback<McResponse> callback)throws IOException, McException;

    void micro_sendRawTransaction(String vnodeip, String vnodeport, String microip, String microport, String from, String microchainaddress, String via, Integer amount, String dappaddress, String method, String paramtypes, String paramvalues, String privatekey, String token, Callback<McResponse> callback) throws IOException, McException;

    void micro_callContract(String microip, String microport, String microchainaddress, String dappaddress, String data, String token, Callback<McResponse> callback) throws IOException, McException;

    void micro_redeemErcMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappaddress, String address, Integer amount, String privatekey, String token, Callback<McResponse> callback) throws IOException, McException;

    void micro_redeemMoacMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappbaseaddress, String address, Integer amount, String privatekey, String token, Callback<McResponse> callback) throws IOException, McException;

}
