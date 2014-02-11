package com.project.aak.interfacer;
import com.project.aak.typo.InfoOfFriend;
import com.project.aak.typo.InfoOfMessage;


public interface Updater {
	public void updateData(InfoOfMessage[] messages, InfoOfFriend[] friends, InfoOfFriend[] unApprovedFriends, String userKey);

}
