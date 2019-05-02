import manager.CustomInf;
import manager.MoacService;
import manager.MoacServiceAsyn;
import model.McResponse;
import network.service.MoacNetworkService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SDKDemo {
    public static void main(String[] args){
        new SDKDemo().runV020();
    }

    public class MyCustom implements CustomInf{
        public void doSomething(){
            System.out.println("this is a test");
        }
    }

    //asyn demo
    public void runV020(){
        String url = "http://139.198.126.104:8080/";
        MoacServiceAsyn moacServiceAsyn = new MoacServiceAsyn(new MoacNetworkService(url));
        //auth
        MyCustom myCustom = new MyCustom();
        try{
            moacServiceAsyn.mc_getAuth("test", "123456", myCustom);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //v0.1.2 & new API
    public void runV012(){
        String url = "http://139.198.126.104:8080/";
        MoacService moacService = new MoacService(new MoacNetworkService(url));
        //auth
        try {
            McResponse auth = moacService.mc_getAuth("test","1234j56");
            System.out.println("auth = "+auth.getData());
            //todo
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //v0.1.0 ~ v0.1.1 demo
    public void runV010(){
        try{
            String url = "http://139.198.126.104:8080/";
//            MoacService moacServiceManager = new MoacService(url);

//            //get auth token
//            McResponse auth = moacServiceManager.mc_getAuth("test","123456");
//            System.out.println("token: "+auth.getData());
//
//            //register
//            String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50IjoidGVzdCIsInB3ZCI6IjEyMzQ1NiIsImlhdCI6MTU1MzE0MzA4NCwiZXhwIjoxNTUzMTUwMjg0fQ.OJwMcE3Zasf3KjXiauORal98GgmL-Sql8VUgkhQCVBI";
//            McResponse register=moacServiceManager.mc_register("test", token);
//            System.out.println("address: "+register.getData());
//            System.out.println("address: "+register.getData().getKeyStore());
//
//            //login
//            String address ="0x7b319AabaF37f2081db2D2998A777659b044bE22";
//            String pwd="test";
//            String keystore="{\"version\":3,\"id\":\"8af214aa-4ffe-41da-bbe1-e433e1274815\",\"address\":\"7b319aabaf37f2081db2d2998a777659b044be22\",\"crypto\":{\"ciphertext\":\"230f39f3bc840bcdd97b5fea1dc0f9aab8a6d4b1d5a2eae9165b542dd277bdef\",\"cipherparams\":{\"iv\":\"c6051fb024294d3d13cb3dd85ff1edcb\"},\"cipher\":\"aes-128-ctr\",\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":32,\"salt\":\"b83bc08499deac08c87b8930130d3ce2b2cb2129da6cf72ec6ce70c296289a47\",\"n\":8192,\"r\":8,\"p\":1},\"mac\":\"b292192225e1203ba1472a742b279821314971d6ae0217e97d085747f0ebc2a5\"}}";
//            System.out.println("keystore: "+keystore);
//            McResponse login = moacServiceManager.mc_login(address,pwd,keystore,token);
//            System.out.println("data: "+login.getData());
//
//            //getBalance
//            McResponse mcBalance=moacServiceManager.mc_getBalance("","","0x7b329AabaF7fd2081db2D2998A777659b044bE22",token);
//            System.out.println("balance: "+mcBalance.getData());
//
//            //getBlockNumber
//            McResponse mcBlockNumber=moacServiceManager.mc_getBlockNumber("","",token);
//            System.out.println("block number is "+mcBlockNumber.getData());
//
//            //getBlockInfo
//            McResponse mcBlockInfo=moacServiceManager.mc_getBlockInfo("","","2071851",token);
//            System.out.println("number: "+mcBlockInfo.getData().getNumber());
//            System.out.println("transactions: "+mcBlockInfo.getData().getTransactions().length);
//
//            McResponse mcTransactionByHash = moacServiceManager.mc_getTransactionByHash("", "", "0x7db4782673557030e8b15f7502ab01fddd9d5c6af60f8e1c08ada44904994ed6", token);
//            System.out.println("from "+mcTransactionByHash.getData().getFrom());
//
//            McResponse mcTransactionReceiptByHash = moacServiceManager.mc_getTransactionReceiptByHash(
//                    "","","0x7db4782673557030e8b15f7502ab01fddd9d5c6af60f8e1c08ada44904994ed6",token);
//            System.out.println("success "+mcTransactionReceiptByHash.getMessage());
//
//            String from="0x48dfaA56D316a8fE2E3a392F89a08Fafd86de692";
//            String to="0xd90D1aE327a47bAa810BAaD89F1762C82BDE47E4";
//            Integer amount= 10;
//            String method="buyMintToken(uint256)";
//            Integer[] paramvalues=new Integer[]{100000000};
//            String paramvalues="[100000000]";
//            String [] paramtypes= new String[]{"uint256"};
//            String paramtypes = "[\"uint256\"]";
//            String privatekey="0xd3cab73941500840bbe7da562c5c3f2bc6b8979d1e59e07f13cec9c7a07e9884";
//            McResponse mcSendRawTransaction = moacServiceManager.mc_sendRawTransaction("", "",
//                  from,to,amount,method,paramtypes,paramvalues,privatekey,token);
//            System.out.println("Message "+ mcSendRawTransaction.getSuccess());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
