import manager.MoacServiceManager;
import model.*;

import java.io.IOException;

public class SDKDemo {
    //test
    public static void main(String[] args){
        new SDKDemo().run();
    }

    public void run(){
        try{
            String url = "http://139.198.126.104:8080/";
            MoacServiceManager moacServiceManager = new MoacServiceManager(url);
            //get auth token
//            Auth auth = moacServiceManager.mc_getAuth("test","123456");
//            System.out.println("token: "+auth.getToken());

            //register
            String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI1YzZkMzYzZTNkYjhmYzM4M2VmNGU2OGQiLCJhY2NvdW50IjoidGVzdCIsInB3ZCI6IjEyMzQ1NiIsIl9fdiI6MCwiaWF0IjoxNTUyMDAxMjg5LCJleHAiOjE1NTIwMDg0ODl9.kij8VauphSfuqdsDGPzDoBpcweZzKG9Bzw8GJlszss4";
//            Register register=moacServiceManager.mc_register("test", token);
//            System.out.println("address: "+register.getData().getaddress());
//            System.out.println("address: "+register.getData().getKeyStore());

            //login
            String address ="0x7b319AabaF37f2081db2D2998A777659b044bE22";
            String pwd="test";
            String keystore="{\"version\":3,\"id\":\"8af214aa-4ffe-41da-bbe1-e433e1274815\",\"address\":\"7b319aabaf37f2081db2d2998a777659b044be22\",\"crypto\":{\"ciphertext\":\"230f39f3bc840bcdd97b5fea1dc0f9aab8a6d4b1d5a2eae9165b542dd277bdef\",\"cipherparams\":{\"iv\":\"c6051fb024294d3d13cb3dd85ff1edcb\"},\"cipher\":\"aes-128-ctr\",\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":32,\"salt\":\"b83bc08499deac08c87b8930130d3ce2b2cb2129da6cf72ec6ce70c296289a47\",\"n\":8192,\"r\":8,\"p\":1},\"mac\":\"b292192225e1203ba1472a742b279821314971d6ae0217e97d085747f0ebc2a5\"}}";
            //            System.out.println("keystore: "+keystore);
//            Login login = moacServiceManager.mc_login(address,pwd,keystore,token);
//            System.out.println("data: "+login.getData());

            //getBalance
//            McBalance mcBalance=moacServiceManager.mc_getBalance("","","0x7b329AabaF7fd2081db2D2998A777659b044bE22",token);
//            System.out.println("balance: "+mcBalance.getData());

            //getBlockNumber
//            McBlockNumber mcBlockNumber=moacServiceManager.mc_getBlockNumber("","",token);
//            System.out.println("block number is "+mcBlockNumber.getData());

            //getBlockInfo
//            McBlockInfo mcBlockInfo=moacServiceManager.mc_getBlockInfo("","","2071851",token);
//            System.out.println("number: "+mcBlockInfo.getData().getNumber());
//            System.out.println("transactions: "+mcBlockInfo.getData().getTransactions().length);

//            McTransactionByHash mcTransactionByHash = moacServiceManager.mc_getTransactionByHash("", "", "0x7db4782673557030e8b15f7502ab01fddd9d5c6af60f8e1c08ada44904994ed6", token);
//            System.out.println("from "+mcTransactionByHash.getData().getFrom());

//            McTransactionReceiptByHash mcTransactionReceiptByHash = moacServiceManager.mc_getTransactionReceiptByHash(
//                    "","","0x7db4782673557030e8b15f7502ab01fddd9d5c6af60f8e1c08ada44904994ed6",token);
//            System.out.println("success "+mcTransactionReceiptByHash.getMessage());

            String from="0x48dfaA56D316a8fE2E3a392F89a08Fafd86de692";
            String to="0xd90D1aE327a47bAa810BAaD89F1762C82BDE47E4";
            Integer amount= 10;
            String method="buyMintToken(uint256)";
            Integer[] paramvalues=new Integer[]{100000000};
            String [] paramtypes= new String[]{"uint256"};
            String privatekey="0xd3cab73941500840bbe7da562c5c3f2bc6b8979d1e59e07f13cec9c7a07e9884";
            McSendRawTransaction mcSendRawTransaction = moacServiceManager.mc_sendRawTransaction("", "",
                    from,to,amount,method,paramtypes,paramvalues,privatekey,token);
            System.out.println("Message "+ mcSendRawTransaction.getMessage());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
