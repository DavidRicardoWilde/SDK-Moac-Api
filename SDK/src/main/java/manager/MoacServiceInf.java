package manager;

import exception.McException;
import model.McResponse;
import model.acount.McImport;
import model.acount.McLogin;
import model.acount.McRegister;

import java.io.IOException;

public interface MoacServiceInf {
    McResponse mc_getAuth(String account, String password) throws IOException, McException;

    McRegister mc_register(String password, String token) throws IOException, McException;

    McLogin mc_login(String address, String pwd, String encode, String  token) throws IOException, McException;

    McImport mc_import(String address, String pwd, String keystore, String token) throws IOException, McException;

    McResponse mc_getBalance(String vnodeip, String vnodeport, String address, String token) throws IOException, McException;

    McResponse mc_getBlockNumber(String vnodeip, String vnodeport, String token) throws IOException, McException;

    McResponse mc_getBlockInfo(String vnodeip, String vnodeport, String block, String token) throws IOException, McException;

    McResponse mc_getTransactionByHash(String vnodeip, String vnodeport, String hash, String token)throws IOException, McException;

    McResponse mc_getTransactionReceiptByHash(String vnodeip, String vnodeport, String address, String token) throws IOException, McException;

    McResponse mc_sendRawTransaction(String vnodeip, String vnodeport, String from, String to, Integer amount, String method, String paramtypes, String paramvalues, String privatekey, String token) throws IOException, McException;

    McResponse mc_transferErc(String vnodeip, String vnodeport, String from, String to, String contractaddress, Integer amount, String privatekey, String token) throws IOException, McException;

    McResponse mc_getErcBalance(String vnodeip, String vnodeport, String address, String contractaddress, String token) throws IOException, McException;

    McResponse mc_ercApprove(String vnodeip, String vnodeport, String address, Integer amount, String privatekey, String microchainaddress, String contractaddress, String token) throws IOException, McException;

    McResponse mc_buyErcMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token) throws IOException, McException;

    McResponse mc_buyMoacMintToken(String vnodeip, String vnodeport, String address, String privatekey, String microchainaddress, String method, String paramtypes, String paramvalues, String token) throws IOException, McException;

    McResponse micro_getBlockNumber(String microip, String microport, String microchainaddress, String token) throws IOException, McException;

    McResponse micro_getBlockInfo(String microip, String microport, String microchainaddress, String blocknum, String token) throws IOException, McException;

    McResponse micro_getBalance(String microip, String microport, String microchainaddress, String address, String token) throws IOException, McException;

    McResponse micro_transferCoin(String vnodeip, String vnodeport, String microip, String microport, String microchainaddress, String via, String from, String to, Integer amount, String privatekye, String token)throws IOException, McException;

    McResponse micro_sendRawTransaction(String vnodeip, String vnodeport, String microip, String microport, String from, String microchainaddress, String via, Integer amount, String dappaddress, String method, String paramtypes, String paramvalues, String privatekey, String token) throws IOException, McException;

    McResponse micro_callContract(String microip, String microport, String microchainaddress, String dappaddress, String data, String token) throws IOException, McException;

    McResponse micro_redeemErcMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappaddress, String address, Integer amount, String privatekey, String token) throws IOException, McException;

    McResponse micro_redeemMoacMintToken(String vnodeip, String vnodeport, String microipHmonitor, String microport, String microchainaddress, String dappbaseaddress, String address, Integer amount, String privatekey, String token) throws IOException, McException;
}
