package entity;

public class Transfer {
	
	private double amount;
    private String transferredAccountId;
    private String transfereeAccountId;
    private String status;

    public Transfer() {

    }

    public Transfer(double amount, String transferredAccountId, String transfereeAccountId, String status) {
        this.amount = amount;
        this.transferredAccountId = transferredAccountId;
        this.transfereeAccountId = transfereeAccountId;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransferredAccountId() {
        return transferredAccountId;
    }

    public void setTransferredAccountId(String transferredAccountId) {
        this.transferredAccountId = transferredAccountId;
    }

    public String getTransfereeAccountId() {
        return transfereeAccountId;
    }

    public void setTransfereeAccountId(String transfereeAccountId) {
        this.transfereeAccountId = transfereeAccountId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
