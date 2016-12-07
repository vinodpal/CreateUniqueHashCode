package Hash;

import java.util.UUID;

public class Records {
	String tokenId ;
	String userId;
	String userPass;
	Records(String tokenId,String user,String pass){
		this.tokenId = tokenId;
		this.userId = user;
		this.userPass = pass;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	@Override
	public boolean equals(Object obj){
		Records r1 = (Records) obj;
		if(r1.userId.equals(this.userId))
			return true;
		else
		return false;
	}
	@Override
	public int hashCode(){
		return UUID.randomUUID().hashCode();
	}
}
