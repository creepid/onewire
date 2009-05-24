package by.bsu.onewire.core.modules.signaling;

import java.io.Serializable;

import com.dalsemi.onewire.utils.Address;

public class SignalingElement implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private boolean enabled;
    private boolean alarm;
    private long id;
    private long keyAddress;
    private long labelAddress;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getKeyAddress() {
        return keyAddress;
    }

    public void setKeyAddress(long keyAddress) {
        this.keyAddress = keyAddress;
    }
    
    public void setKeyAddressString(String address){
        setKeyAddress(Address.toLong(address));
    }

    public long getLabelAddress() {
        return labelAddress;
    }
    
    public void setLabelAddressString(String address){
        setLabelAddress(Address.toLong(address));
    }

    public void setLabelAddress(long labelAddress) {
        this.labelAddress = labelAddress;
    }

}
