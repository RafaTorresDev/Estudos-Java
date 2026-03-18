package entities;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    //atributos
    private Integer roomNumber;
    private Date chakein;
    private Date chekout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //construtores
    public Reservation(Date chakein, Date chekout, Integer roomNumber) {
        this.chakein = chakein;
        this.chekout = chekout;
        this.roomNumber = roomNumber;
    }

    //get e set
    public Date getChakein() {
        return chakein;
    }
    public Date getChekout() {
        return chekout;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    //métodos
    public long duration(){
        long diff = chekout.getTime() = chakein.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);
    }

    public void upddateDates(Data checkin, Data checkout){
        this.chakein = chakein;
        this.chekout = chekout;
    }

    @Override
    public String toString(){
        return "Room "
                + roomNumber +
                ", check-in: "
                + sdf.format(chakein)
                + ", check-out"
                + sdf.format(chekout)
                + ", " + duration() + " nigths";
    }
}
