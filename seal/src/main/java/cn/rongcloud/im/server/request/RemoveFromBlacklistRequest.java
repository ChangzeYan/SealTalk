package cn.rongcloud.im.server.request;

public class RemoveFromBlacklistRequest {

    private String friendId;

    public RemoveFromBlacklistRequest(String friendId) {
        this.friendId = friendId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }
}
