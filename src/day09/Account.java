package day09;

public class Account {
    String accNum;
    String accUser;
    int accCount;

    Account(String accNum, String accUser, int accCount){
        this.accNum=accNum;
        this.accUser=accUser;
        this.accCount=accCount;
    }

    void replaceAcc(int status, int accChange){
        if(status==3){//예금
            this.accCount+=accChange;
        }
        if(status==4){//출금
            this.accCount-=accChange;
        }
    }
}
