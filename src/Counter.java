import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Counter {
    List<ITransport> transports;
    int totalBalance=0;
    IReport report;

    public Counter() {
        transports=new ArrayList<>();
        report=new Logger();
    }

    public void payment(User user){
        transports.add(user.getTransport());
        totalBalance += user.getTransport().transportPayment();
        report.report(new Date(),user.getTransport().transportPayment());
    }

    public int getDayReport() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        if(LocalTime.now().format(dtf)==LocalTime.MIDNIGHT.toString()){
            transports.clear();
            totalBalance=0;
        }
        return totalBalance;
    }
}
