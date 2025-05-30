package y3.s2.ser315.summer.week1._6_ASSIGNMENT_1.new_attempt.FieldTrip;

import java.time.LocalDateTime;

public abstract class Observation {
    private String id;
    private LocalDateTime datetime;

    Observation() {
        this.id = SimpleID.generate();
        this.datetime = LocalDateTime.now();
    }

    public String getID() {
        return this.id;
    }

    public String read() {
        StringBuilder builder = new StringBuilder();
        builder.append("{id: \"");
        builder.append(this.getID());
        builder.append("\", \"date: \"");
        builder.append(this.getDatetime());
        builder.append("\"}");

        return builder.toString();
    }

    private String getDatetime() {
        return this.datetime.toString();
    }
}
