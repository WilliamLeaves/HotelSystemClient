package VO;

import PO.HotelRoomInfoPO;

public class HotelRoomInfoVO {
	public HotelRoomInfoVO() {
		this.doubleRoomNum = 25;
		this.doubleRoomRemain = 13;
		this.doubleRoomPrice = 198;

		this.queenSizeRoomNum = 15;
		this.queenSizeRoomRemain = 10;
		this.queenSizeRoomPrice = 198;

		this.singleRoomNum = 57;
		this.singleRoomRemain = 16;
		this.singleRoomPrice = 120;

		this.multiRoomNum = 8;
		this.multiRoomRemain = 6;
		this.multiRoomPrice = 75;
	}

	public HotelRoomInfoVO(HotelRoomInfoPO hotelRoomInfo) {
		// TODO Auto-generated constructor stub
	}

	int doubleRoomNum;
	int queenSizeRoomNum;
	int singleRoomNum;
	int multiRoomNum;

	int doubleRoomRemain;
	int queenSizeRoomRemain;
	int singleRoomRemain;
	int multiRoomRemain;

	int doubleRoomPrice;
	int queenSizeRoomPrice;
	int singleRoomPrice;
	int multiRoomPrice;

	public int getDoubleRoomNum() {
		return doubleRoomNum;
	}

	public void setDoubleRoomNum(int doubleRoomNum) {
		this.doubleRoomNum = doubleRoomNum;
	}

	public int getQueenSizeRoomNum() {
		return queenSizeRoomNum;
	}

	public void setQueenSizeRoomNum(int queenSizeRoomNum) {
		this.queenSizeRoomNum = queenSizeRoomNum;
	}

	public int getSingleRoomNum() {
		return singleRoomNum;
	}

	public void setSingleRoomNum(int singleRoomNum) {
		this.singleRoomNum = singleRoomNum;
	}

	public String getMultiRoomNum() {
		return String.valueOf(multiRoomNum);
	}

	public void setMultiRoomNum(int multiRoomNum) {
		this.multiRoomNum = multiRoomNum;
	}

	public int getDoubleRoomRemain() {
		return doubleRoomRemain;
	}

	public void setDoubleRoomRemain(int doubleRoomRemain) {
		this.doubleRoomRemain = doubleRoomRemain;
	}

	public int getQueenSizeRoomRemain() {
		return queenSizeRoomRemain;
	}

	public void setQueenSizeRoomRemain(int queenSizeRoomRemain) {
		this.queenSizeRoomRemain = queenSizeRoomRemain;
	}

	public int getSingleRoomRemain() {
		return singleRoomRemain;
	}

	public void setSingleRoomRemain(int singleRoomRemain) {
		this.singleRoomRemain = singleRoomRemain;
	}

	public int getMultiRoomRemain() {
		return multiRoomRemain;
	}

	public void setMultiRoomRemain(int multiRoomRemain) {
		this.multiRoomRemain = multiRoomRemain;
	}

	public int getDoubleRoomPrice() {
		return doubleRoomPrice;
	}

	public void setDoubleRoomPrice(int doubleRoomPrice) {
		this.doubleRoomPrice = doubleRoomPrice;
	}

	public int getQueenSizeRoomPrice() {
		return queenSizeRoomPrice;
	}

	public void setQueenSizeRoomPrice(int queenSizeRoomPrice) {
		this.queenSizeRoomPrice = queenSizeRoomPrice;
	}

	public int getSingleRoomPrice() {
		return singleRoomPrice;
	}

	public void setSingleRoomPrice(int singleRoomPrice) {
		this.singleRoomPrice = singleRoomPrice;
	}

	public int getMultiRoomPrice() {
		return multiRoomPrice;
	}

	public void setMultiRoomPrice(int multiRoomPrice) {
		this.multiRoomPrice = multiRoomPrice;
	}

}
