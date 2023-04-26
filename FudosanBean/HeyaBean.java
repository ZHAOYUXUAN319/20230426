/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FudosanBean;

/**
 *部屋データ
 * @author hangt
 */
public class HeyaBean {

    private int roomId;
    private int syozokuPropertyId;
    private String roomName;
    private int roomFloor;
    private int price;
    private String station;
    private int roomArea;
    private int minutesFromStation;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getSyozokuPropertyId() {
        return syozokuPropertyId;
    }

    public void setSyozokuPropertyId(int syozokuPropertyId) {
        this.syozokuPropertyId = syozokuPropertyId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(int roomArea) {
        this.roomArea = roomArea;
    }

    public int getMinutesFromStation() {
        return minutesFromStation;
    }

    public void setMinutesFromStation(int minutesFromStation) {
        this.minutesFromStation = minutesFromStation;
    }
    
}
