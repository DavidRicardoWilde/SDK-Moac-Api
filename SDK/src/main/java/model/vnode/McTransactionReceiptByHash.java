package model.vnode;

import jnr.ffi.annotations.In;

public class McTransactionReceiptByHash {
        private String blockHash;
        private Integer blockNumber;
        private String contractAddress;
        private Integer cumulativeGasUsed;
        private String from;
        private Integer gasUsed;
        private String[] logs;
        private String logsBloom;
        private String status;
        private String to;
        private String transactionHash;
        private String transactionIndex;

        public String getBlockHash() {
            return blockHash;
        }

        public Integer getBlockNumber() {
            return blockNumber;
        }

        public String getContractAddress() {
            return contractAddress;
        }

        public Integer getCumulativeGasUsed() {
            return cumulativeGasUsed;
        }

        public String getFrom() {
            return from;
        }

        public Integer getGasUsed() {
            return gasUsed;
        }

        public String[] getLogs() {
            return logs;
        }

        public String getLogsBloom() {
            return logsBloom;
        }

        public String getStatus() {
            return status;
        }

        public String getTo() {
            return to;
        }

        public String getTransactionHash() {
            return transactionHash;
        }

        public String getTransactionIndex() {
            return transactionIndex;
        }
}
