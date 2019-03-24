package network;

import model.*;
import model.acount.McLogin;
import model.acount.McRegister;
import model.vnode.*;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MoacInterface {
    /***
     *
     * @param account Authorized account
     * @param pwd Authorized password
     * @return
     */
    @FormUrlEncoded
    @POST("auth")
    Call<McResponse> mc_auth(
            @Field("account") String account,
            @Field("pwd") String pwd
    );

    /***
     *
     * @param pwd wallet password
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/account/v1.0/register")
    Call<McRegister> mc_register(
            @Field("pwd") String pwd,
            @Field("token") String token
    );

    /***
     *
     * @param address wallet account address 0x**********
     * @param pwd wallet account password
     * @param keyStore KeyStore Information
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/account/v1.0/login")
    Call<McResponse<McLogin>> mc_login(
            @Field("address") String address,
            @Field("pwd") String pwd,
            @Field("keystore") String keyStore,
            @Field("token")String token
    );

    /***
     *
     * @param vnodeip vnode ip address
     * @param vnodeport vnode port
     * @param address wallet account address
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/getBalance")
    Call<McResponse<McBalance>> mc_getBalance(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("address") String address,
            @Field("token") String token
    );

    /**
     *
     * @param vnodeip vnode ip address
     * @param vnodeport vnode port
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/getBlockNumber")
    Call<McResponse<McBlockNumber>> mc_getBlockNumber(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("token") String token
    );

    /***
     *
     * @param vnodeip vnode ip address
     * @param vnodeport vnode port
     * @param block block number
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/getBlockInfo")
    Call<McResponse<McBlockInfo>> mc_getBlockInfo(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("block") String block,
            @Field("token") String token
    );

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param hash
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/getTransactionReceiptByHash")
    Call<McResponse<McTransactionByHash>>mc_getTransactionByHash(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("hash") String hash,
            @Field("token") String token
    );

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param hash
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/getTransactionReceiptByHash")
    Call<McResponse<McTransactionReceiptByHash>>mc_getTransactionReceiptByHash(
            @Field("vnodeip") String vnodeip,
            @Field("vnodepost") String vnodeport,
            @Field("hash") String hash,
            @Field("token") String token
    );

    /**
     *
     * @param vnodeip vnode ip address
     * @param vnodeport vnode port
     * @param from from-address
     * @param to    to-address
     * @param amount amount (unit: moac)
     * @param method dapp contract function
     * @param paramtypes the type of param
     * @param paramvalues the value of param
     * @param privatekey the private key of wallet
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/sendRawTransaction")
    Call<McResponse<McSendRawTransaction>> mc_sendRawTransaction(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("from")String from,
            @Field("to") String to,
            @Field("amount") Integer amount,
            @Field("method") String method,
            @Field("paramtypes") String paramtypes,
            @Field("paramvalues") String paramvalues,
            @Field("privatekey") String privatekey,
            @Field("token") String token
    );

    /***
     *
     * @param vnodeip vnode ip
     * @param vnodeport vnode port
     * @param address contract address
     * @param method dapp contract function
     * @param paramtypes the type of paramtypes
     * @param paramvalues the values of paramtyes
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/callContract")
    Call<McResponse> mc_callContract(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("address") String address,
            @Field("method") String method,
            @Field("paramtypes")String paramtypes,
            @Field("paramvalues") String paramvalues,
            @Field("token") String token
    );

    /***
     *
     * @param vnodeip vnode ip
     * @param vnodeprot vnode port
     * @param from from - address
     * @param to to - address
     * @param contractaddress contract address
     * @param amount
     * @param privatekey
     * @param token The token returned by API:Auth
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/transferErc")
    Call<McResponse<McTransferErc>> mc_transferErc(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeprot,
            @Field("from") String from,
            @Field("to") String to,
            @Field("contractaddress") String contractaddress,
            @Field("amount") Integer amount,
            @Field("privatekey") String privatekey,
            @Field("token") String token
    );

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param address wallet address
     * @param contractaddress
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/getErcBalance")
    Call<McResponse<McErcBalance>> mc_getErcBalance(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeprot") String vnodeport,
            @Field("address") String address,
            @Field("contractaddress") String contractaddress,
            @Field("token") String token
    );

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
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/ercApprove")
    Call<McResponse> mc_ercApprove(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("address") String address,
            @Field("amount") Integer amount,
            @Field("privatekey") String privatekey,
            @Field("microchainaddress") String microchainaddress,
            @Field("contractaddress") String contractaddress,
            @Field("token") String token
    );

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
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/buyErcMintToken")
    Call<McResponse> mc_buyErcMintToken(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("address") String address,
            @Field("privatekey") String privatekey,
            @Field("microchainaddress") String microchainaddress,
            @Field("method") String method,
            @Field("paramtypes") String paramtypes,
            @Field("paramvalues") String paramvalues,
            @Field("token") String token
    );

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param privatekey
     * @param microchainaddress
     * @param paramtypes
     * @param paramvalues
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/v1.0/buyMoacMintToken")
    Call<McResponse> mc_buyMoacMintToken(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("address") String address,
            @Field("privatekey") String privatekey,
            @Field("microchainaddress") String microchainaddress,
            @Field("method") String method,
            @Field("paramtypes") String paramtypes,
            @Field("paramvalues") String paramvalues,
            @Field("token") String token
    );


    //Micro
    /***
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api//micro/v1.0/getBlockNumber")
    Call<McResponse> micro_getBlockNumber(
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("token") String token
    );

    /***
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param blocknum
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api//micro/v1.0/getBlock")
    Call<McResponse> micro_getBlock(
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("blocknum") String blocknum,
            @Field("token") String token
    );

    /***
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param address
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api//micro/v1.0/getBalance")
    Call<McResponse>micro_getBalance(
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("address") String address,
            @Field("token") String token
    );

    @FormUrlEncoded
    @POST("api//micro/v1.0/transferCoin")
    Call<McResponse> micro_transferCoin(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("via") String via,
            @Field("from") String from,
            @Field("to") String to,
            @Field("amount") Integer amount,
            @Field("privatekey") String privatekey,
            @Field("token") String token
    );

    /**
     *
     * @param vnodeip
     * @param vnodeport
     * @param microop
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
     * @return
     */
    @FormUrlEncoded
    @POST("api//micro/v1.0/sendRawTransaction")
    Call<McResponse> micro_sendRawTransaction(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("microip") String microop,
            @Field("microport") String microport,
            @Field("from") String from,
            @Field("microchainaddress") String microchainaddress,
            @Field("via") String via,
            @Field("amount") Integer amount,
            @Field("dappaddress") String dappaddress,
            @Field("method") String method,
            @Field("paramtypes") String paramtypes,
            @Field("paramvalues") String paramvalues,
            @Field("privatekey") String privatekey,
            @Field("token") String token
    );

    /***
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param dappaddress
     * @param data
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api//micro/v1.0/callContract")
    Call<McResponse> micro_callContract(
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("dappaddress") String dappaddress,
            @Field("data") String data,
            @Field("token") String token
    );

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param dappbaseaddress
     * @param address
     * @param amount
     * @param privatekey
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("/api//micro/v1.0/redeemMintToken")
    Call<McResponse> micro_redeemErcMintToken(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("dappbaseaddress") String dappbaseaddress,
            @Field("address") String address,
            @Field("amount") Integer amount,
            @Field("privatekey") String privatekey,
            @Field("token") String token
    );

    @FormUrlEncoded
    @POST("api//micro/v1.0/redeemMoacMintToken")
    Call<McResponse>micro_redeemMoacMintToken(
      @Field("vnodeip") String vnodeip,
      @Field("vnodeport") String vnodeport,
      @Field("microipHmonitor") String microipHmonitor,
      @Field("microport") String microport,
      @Field("microchainaddress") String microchainaddress,
      @Field("dappbaseaddress")String dappbaseaddress,
      @Field("address")String address,
      @Field("amount")Integer amount,
      @Field("privatekey")String privatekey,
      @Field("token")String token
    );

}
