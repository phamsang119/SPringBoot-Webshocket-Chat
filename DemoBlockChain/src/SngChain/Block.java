package SngChain;

import java.util.Date;

/**
 * 
 * @author phamsang
 * This class use to create object Block.
 *
 */
public class Block {
	public String hash;
	public String previousHash;
	private String data; //data example is message
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	public Block(String data, String previousHash){
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
	}
}
