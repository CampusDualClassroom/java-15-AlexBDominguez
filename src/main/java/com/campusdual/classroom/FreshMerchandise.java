package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);

    }

    public Date getExpirationDate(){
        return this.expirationDate;
    }

    @Override
    public String getSpecificData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Localización: ").append(getLocation()).append("\n");
        sb.append("Caducidad : ").append(getFormattedDate(this.expirationDate)).append("\n");
        return sb.toString() ;
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());

    }
}

