package belajar.java.opp.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try{
            String[] name = {
                    "albert","Anugerah","putra"
            };
            System.out.println(name[0]);
        }
        catch (Throwable throwable){
            StackTraceElement[] stackTraceElements =  throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}

//StackTraceElmenet Class = berisikan informasi tentang class, file, bahkan baris lokasi terjadinya error
// StackTraceElement berada pada Thorwable memiliki method bernama getStackTrace, menghasilkan aray dari StackTrace object.
// cara yang paling mudah, kita bisa memanggil method dengan printStackTrace() class throwable, untuk ngeprint ke console detail error Stacktraceelement.
