/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Channel;

import java.util.ArrayList;

/**
 *
 * @author Ke Wang
 * 
 */
public class MessageList {
    private ArrayList<Message> messageList;

    public MessageList() {
        messageList = new ArrayList();
    }

    public ArrayList<Message> getMessageList() {
        return messageList;
    }
}
