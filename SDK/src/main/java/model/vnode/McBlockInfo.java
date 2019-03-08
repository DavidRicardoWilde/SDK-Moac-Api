package model.vnode;


import org.chain3j.abi.datatypes.Int;

import java.security.Timestamp;

public class McBlockInfo {
    public McBlockInfo(){}

    private boolean success;
    private String message;
    private Data data;

    public class Data{
        private String difficulty;
        private String extraData;
        private String gasLimit;
        private String gasUsed;
        private String hash;
        private String logsBloom;
        private String miner;
        private String mixHash;
        private String nonce;
        private Integer number;
//        private int number;
        private String parentHash;
        private String receiptsRoot;
        private String sha3Uncles;
        private Integer size;
//        private int seiz;
        private String stateRoot;
        //private Timestamp timestamp;
        private Integer timestamp;
        private String totalDifficulty;
        private String[] transactions;
//        private String transactions;
        private String transactionsRoot;
        private String[] uncles;

        public String getDifficulty() {
            return difficulty;
        }

        public String getExtraData() {
            return extraData;
        }

        public String getGasLimit() {
            return gasLimit;
        }

        public String getGasUsed() {
            return gasUsed;
        }

        public String getHash() {
            return hash;
        }

        public String getLogsBloom() {
            return logsBloom;
        }

        public String getMiner() {
            return miner;
        }

        public String getMixHash() {
            return mixHash;
        }

        public String getNonce() {
            return nonce;
        }

        public Integer getNumber() {
            return number;
        }

        public String getParentHash() {
            return parentHash;
        }

        public String getReceiptsRoot() {
            return receiptsRoot;
        }

        public String getSha3Uncles() {
            return sha3Uncles;
        }

        public Integer getSize() {
            return size;
        }

        public String getStateRoot() {
            return stateRoot;
        }

        public Integer getTimestamp() {
            return timestamp;
        }

        public String getTotalDifficulty() {
            return totalDifficulty;
        }

        public String[] getTransactions() {
            return transactions;
        }

        public String getTransactionsRoot() {
            return transactionsRoot;
        }

        public String[] getUncles() {
            return uncles;
        }
    }

    public boolean getSuccess(){
        return success;
    }
    public void setSuccess(boolean success){
        this.success = success;
    }

    public String getMessage(){
        return  message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    /**
     *
     * @return
     */
    public Data getData(){
        return data;
    }
    public void setData(Data data){
        this.data = data;
    }

}
