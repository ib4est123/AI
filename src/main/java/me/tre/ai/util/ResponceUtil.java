package me.tre.ai.util;

import lombok.experimental.UtilityClass;
import me.tre.ai.Constants;

import javax.swing.*;

@UtilityClass
public class ResponceUtil {

    public int sendMessageResponce(String message) {
        return JOptionPane.showConfirmDialog(null, message,
                "", JOptionPane.OK_CANCEL_OPTION);
    }

    public void sendStupidMessage(String message){
        JOptionPane.showConfirmDialog(null, message, "", JOptionPane.INFORMATION_MESSAGE);
        Constants.getAi().getQuestion().sendFrame();
    }
}
