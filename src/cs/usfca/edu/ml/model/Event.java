package cs.usfca.edu.ml.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Events")
public class Event implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name = "id", nullable = false)
	private int id;
	private String name;
	private String userId;
	private String deviceType;
	private String boxId;
	private String keyPressed;
	private int location;
	private float pressedAfter;
	private float holdFor;
	private int longPressedEquivalent;
	private String platform;
	private boolean falseCharacter;
	private long timestamp;
	
	public Event() {}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getDeviceType() {
		return deviceType;
	}


	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}


	public String getBoxId() {
		return boxId;
	}


	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}


	public String getKeyPressed() {
		return keyPressed;
	}


	public void setKeyPressed(String keyPressed) {
		this.keyPressed = keyPressed;
	}


	public int getLocation() {
		return location;
	}


	public void setLocation(int location) {
		this.location = location;
	}


	public float getPressedAfter() {
		return pressedAfter;
	}


	public void setPressedAfter(float pressedAfter) {
		this.pressedAfter = pressedAfter;
	}


	public float getHoldFor() {
		return holdFor;
	}


	public void setHoldFor(float holdFor) {
		this.holdFor = holdFor;
	}


	public int getLongPressedEquivalent() {
		return longPressedEquivalent;
	}


	public void setLongPressedEquivalent(int longPressedEquivalent) {
		this.longPressedEquivalent = longPressedEquivalent;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public boolean isFalseCharacter() {
		return falseCharacter;
	}


	public void setFalseCharacter(boolean falseCharacter) {
		this.falseCharacter = falseCharacter;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public long getTimestamp() {
		return timestamp;
	}
	
}
