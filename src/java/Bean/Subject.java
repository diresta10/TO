package Bean;

import javax.persistence.*;

/**
 *
 * @author sanowak
 */
@Entity
public class Subject {
    @Id
    @GeneratedValue
    private int sub_id;

    @Column(unique=true, nullable= false)
    private String Sub_name;
    
    public Subject() {
    }
    
    private int Sub_duration, Sub_fees;
    private String Sub_level;


    public Subject(String Sub_name, int Sub_duration, String Sub_level, int Sub_fees) {
        this.Sub_name = Sub_name;
        this.Sub_duration = Sub_duration;
        this.Sub_level = Sub_level;
        this.Sub_fees = Sub_fees;
    }
    
    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return Sub_name;
    }

    public void setSub_name(String Sub_name) {
        this.Sub_name = Sub_name;
    }
    
    public String getSub_level() {
        return Sub_level;
    }

    public void setSub_level(String Sub_level) {
        this.Sub_level = Sub_level;
    }


    public int getSub_fees() {
        return Sub_fees;
    }

    public void setSub_fees(int Sub_fees) {
        this.Sub_fees = Sub_fees;
    }

    public int getSub_duration() {
        return Sub_duration;
    }

    public void setSub_duration(int Sub_duration) {
        this.Sub_duration = Sub_duration;
    }


}
