import java.util.Date;

public class Logger implements IReport{

    @Override
    public void report(Date date, int balance) {
        System.out.println(date+ " ödenen tutar: "+balance    );
    }
}
