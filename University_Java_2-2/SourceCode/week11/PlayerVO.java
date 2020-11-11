package week11;

import java.io.Serializable;

public class PlayerVO implements Comparable<PlayerVO> {

	private String name;
	private String position;
	private int regYear;

	public PlayerVO(String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}

	@Override
	public String toString() {
		return name + ":" + position + ":" + regYear;
	}

	@Override
	public int compareTo(PlayerVO player) {
		return this.name.compareTo(player.name);
	}

	public int getReYear() {
		return regYear;
	}
	
}
