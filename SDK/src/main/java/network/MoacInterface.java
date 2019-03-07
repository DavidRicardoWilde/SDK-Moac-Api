package network;

import model.Auth;
import model.McResult;
import model.Register;
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
    Call<Auth> mc_auth(
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
    @POST("api/account/register")
    Call<Register> mc_register(
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
    @POST("api/account/login")
    Call<McResult> mc_login(
            @Field("address") String address,
            @Field("pwd") String pwd,
            @Field("keyStore") String keyStore,
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
    @POST("api/vnode/getBalance")
    Call<McResult> mc_getBalance(
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
    @POST("api/vnode/getBlockNumber")
    Call<McResult> mc_getBlockNumber(
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
    @POST("api/vnode/getBlockInfo")
    Call<McResult> mc_getBlockInfo(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("block")String block,
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
    @POST("api/vnode/sendRawTransaction")
    Call<McResult> mc_sendTransaction(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("from")String from,
            @Field("to") String to,
            @Field("amount") String amount,
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
    @POST("api/vnode/callContract")
    Call<McResult> mc_callContract(
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
    @POST("api/vnode/transferErc")
    Call<McResult> mc_transgerErc(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeprot,
            @Field("from") String from,
            @Field("to") String to,
            @Field("contractaddress") String contractaddress,
            @Field("amount") String amount,
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
    @POST("api/vnode/getErcBalance")
    Call<McResult> mc_getErcBalance(
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
    @POST("api/vnode/ercApprove")
    Call<McResult> mc_ercApprove(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("address") String address,
            @Field("amount") String amount,
            @Field("privatekey") String privatekey,
            @Field("microchainaddress") String microchainaddress,
            @Field("contractaddress") String contractaddress,
            @Field("token") String token
    );

    @FormUrlEncoded
    @POST("api/vnode/buyErcMintToken")
    Call<McResult> mc_buyErcMintToken(
            @Field("vnodeip") String vnodeip,
            @Field("vmpde@prt") String vnodeport,
            @Field("address") String address,
            @Field("amount") String amount,
            @Field("privatekey") String privatekey,
            @Field("microchainaddress") String microchainaddress,
            @Field("token") String token
    );

    /***
     *
     * @param vnodeip
     * @param vnodeport
     * @param address
     * @param privatekey
     * @param microchainaddress
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api/vnode/buyMoacMintToken")
    Call<McResult> mc_buyMoacMintToken(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("address") String address,
            @Field("privatekey") String privatekey,
            @Field("microchainaddress") String microchainaddress,
            @Field("token") String token
    );

    /***
     *
     * @param microip
     * @param microport
     * @param microchainaddress
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api//micro/getBlockNumber")
    Call<McResult> micro_getBlockNumber(
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
    @POST("api//micro/getBlock")
    Call<McResult> micro_getBlock(
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
    @POST("api//micro/getBalance")
    Call<McResult>micro_getBalance(
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("address") String address,
            @Field("token") String token
    );

    @FormUrlEncoded
    @POST("api//micro/transferCoin")
    Call<McResult> micro_transferCoin(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("via") String via,
            @Field("from") String from,
            @Field("to") String to,
            @Field("amount") String amount,
            @Field("privatekey") String privatekey,
            @Field("token") String token
    );

    /***
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
     * @param data
     * @param privatekey
     * @param token
     * @return
     */
    @FormUrlEncoded
    @POST("api//micro/sendRawTransaction")
    Call<McResult> micro_sanrawTransaction(
            @Field("vnodeip") String vnodeip,
            @Field("vnodepoet") String vnodeport,
            @Field("microip") String microop,
            @Field("microport") String microport,
            @Field("from") String from,
            @Field("microchainaddress") String microchainaddress,
            @Field("via") String via,
            @Field("amount") String amount,
            @Field("dappaddress") String dappaddress,
            @Field("data") String data,
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
    @POST("api//micro/callContract")
    Call<McResult> micro_callContract(
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
    @POST("/api//micro/redeemMintToken")
    Call<McResult> micro_redeemMintToken(
            @Field("vnodeip") String vnodeip,
            @Field("vnodeport") String vnodeport,
            @Field("microip") String microip,
            @Field("microport") String microport,
            @Field("microchainaddress") String microchainaddress,
            @Field("dappbaseaddress") String dappbaseaddress,
            @Field("address") String address,
            @Field("amount") String amount,
            @Field("privatekey") String privatekey,
            @Field("token") String token
    );

}
