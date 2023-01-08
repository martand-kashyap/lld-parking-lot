package design.parkinglot.model.account;

import design.parkinglot.common.Person;
import design.parkinglot.constant.AccountStatus;
import lombok.Getter;
import lombok.Setter;

public abstract class Account {
    @Getter
    private String username;
    @Getter
    private String password;
    @Getter
    private Person person;
    @Getter
    @Setter
    private AccountStatus status;

    public Account(String username, String password, Person person) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.status = AccountStatus.DEFAULT;
    }

    public void login() {

    }

    public void logout() {

    }

    public abstract void resetPassword();
}
