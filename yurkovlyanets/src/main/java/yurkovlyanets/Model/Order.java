package yurkovlyanets.Model;

import java.time.Clock;
import java.time.Instant;

public class Order {
    private int ordernumber;
    private Instant orderadddate;

    public Order(int ordernumber) {
        this.ordernumber=ordernumber;
        this.orderadddate=Clock.systemDefaultZone().instant();
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Instant getOrderadddate() {
        return Clock.systemDefaultZone().instant();
    }

    public void setOrderadddate(Instant orderadddate) {
        this.orderadddate = orderadddate;
    }
}
