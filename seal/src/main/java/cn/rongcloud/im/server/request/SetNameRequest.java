package cn.rongcloud.im.server.request;


public class SetNameRequest {

    private String nickname;

    public SetNameRequest(String nickname) {
        this.nickname = nickname;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
