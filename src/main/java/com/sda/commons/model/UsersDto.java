package com.sda.commons.model;

import java.util.List;
import java.util.Set;

/**
 * Created by RENT on 2017-08-02.
 */
public class UsersDto extends AbstractDto {
    private List<String> usernames;

    public UsersDto() {
        super(MessageType.USERS_UPDATE);
    }

    public List<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }

}
