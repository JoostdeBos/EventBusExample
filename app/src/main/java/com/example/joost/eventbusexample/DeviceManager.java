package com.example.joost.eventbusexample;

/**
 * Created by Joost on 29-1-2016.
 */
public class DeviceManager {

    public final static int NOT_CONNECTED = 0;
    public final static int PAIRING = 1;
    public final static int CONNECTED = 2;
    public final static int ERROR = 3;
    public static Hub hub = null;
    public static Left_aid left_aid = null;
    public static Right_aid right_aid = null;

    private static DeviceManager deviceManager = new DeviceManager();

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private DeviceManager(){
        hub = new Hub();
        left_aid = new Left_aid();
        right_aid = new Right_aid();
    }

    /* Static 'instance' method */
    public static DeviceManager getInstance( ) {
        return deviceManager;
    }

    public static Hub getHub() {
        return hub;
    }

    public static Left_aid getLeft_aid() {
        return left_aid;
    }

    public static Right_aid getRight_aid() {
        return right_aid;
    }


    public class Hub {
        String id;
        int batteryStatus;
        int state;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getBatteryStatus() {
            return batteryStatus;
        }

        public void setBatteryStatus(int batteryStatus) {
            this.batteryStatus = batteryStatus;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }
    }

    public class Left_aid {
        String id;
        Boolean isEnabled;
        int batteryStatus;
        int state;
        int volumeLevel;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Boolean getIsEnabled() {
            return isEnabled;
        }

        public void setIsEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
        }

        public int getBatteryStatus() {
            return batteryStatus;
        }

        public void setBatteryStatus(int batteryStatus) {
            this.batteryStatus = batteryStatus;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getVolumeLevel() {
            return volumeLevel;
        }

        public void setVolumeLevel(int volumeLevel) {
            this.volumeLevel = volumeLevel;
        }
    }

    public class Right_aid {
        String id;
        Boolean isEnabled;
        int batteryStatus;
        int state;
        int volumeLevel;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Boolean getIsEnabled() {
            return isEnabled;
        }

        public void setIsEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
        }

        public int getBatteryStatus() {
            return batteryStatus;
        }

        public void setBatteryStatus(int batteryStatus) {
            this.batteryStatus = batteryStatus;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getVolumeLevel() {
            return volumeLevel;
        }

        public void setVolumeLevel(int volumeLevel) {
            this.volumeLevel = volumeLevel;
        }
    }

}