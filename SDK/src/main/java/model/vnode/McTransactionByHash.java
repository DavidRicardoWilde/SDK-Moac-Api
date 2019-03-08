package model.vnode;

import jnr.ffi.annotations.In;
import org.chain3j.abi.datatypes.Int;

/**
 * Need to first determine if the variable "data" is null
 */
public class McTransactionByHash {
    private boolean success;
    private String message;
    private Data data;

    public class Data{
        public Data(){}

        private String blochHash;
        private String blockNumber;
        private String from;
        private Integer gas;
        private String gasPrice;
        private String hash;
        private String input;
        private Integer nonce;
        private String syscnt;
        private String to;
        private Integer value;
        private String v;
        private String r;
        private String s;
        private String shardingFlag;

        public String getBlochHash() {
            return blochHash;
        }

        public void setBlochHash(String blochHash) {
            this.blochHash = blochHash;
        }

        public String getBlockNumber() {
            return blockNumber;
        }

        public void setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public Integer getGas() {
            return gas;
        }

        public void setGas(Integer gas) {
            this.gas = gas;
        }

        public String getGasPrice() {
            return gasPrice;
        }

        public void setGasPrice(String gasPrice) {
            this.gasPrice = gasPrice;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }

        public Integer getNonce() {
            return nonce;
        }

        public void setNonce(Integer nonce) {
            this.nonce = nonce;
        }

        public String getSyscnt() {
            return syscnt;
        }

        public void setSyscnt(String syscnt) {
            this.syscnt = syscnt;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getV() {
            return v;
        }

        public void setV(String v) {
            this.v = v;
        }

        public String getR() {
            return r;
        }

        public void setR(String r) {
            this.r = r;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }

        public String getShardingFlag() {
            return shardingFlag;
        }

        public void setShardingFlag(String shardingFlag) {
            this.shardingFlag = shardingFlag;
        }
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }
}
