package notepad;

import java.time.LocalDate;

public class Reminder extends Alarm implements Expirable {
    private LocalDate date;


    @Override
    public void askQuestions() {
        super.askQuestions();
        System.out.println("Enter reminder date");
        date = Main.askDate();
    }

    @Override
    public boolean hasSubstring(String str) {
        return super.hasSubstring(str)
                || date.format(Main.DATE_FORMATTER).contains(str);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean isExpired() {
        return true;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() + ", " +
                "text='" + getText() + '\'' +
                ", date='" + date.format(Main.DATE_FORMATTER) + '\'' +
                ", time='" + getTime().format(Main.TIME_FORMATTER) + '\'' +
                '}';
    }
}
