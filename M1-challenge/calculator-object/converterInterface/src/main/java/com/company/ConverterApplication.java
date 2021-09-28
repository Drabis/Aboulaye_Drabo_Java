package com.company;

public class ConverterApplication implements Converter{
    public static void main(String[] args) {
        ConverterApplication x = new ConverterApplication();
        Converter a = new ConverterApplication();
        System.out.println(x.convertDay(5));
        System.out.println(x.convertMonth(4));
    }
    @Override
    public String convertMonth(int monthNumber) {
        System.out.println("---- inside CONVERT MONTH method------");
        System.out.println("----- monthNumber inputted: " + monthNumber);
        if(monthNumber == 1) {
            return "January";
        }else if (monthNumber == 2){
            return "February";
        }else if (monthNumber == 3){
            return "March";
        }else if (monthNumber == 4){
            return "April";
        }else if (monthNumber == 5){
            return "May";
        }else if (monthNumber == 6){
            return "June";
        }else if (monthNumber == 7){
            return "July";
        }else if (monthNumber == 8){
            return "August";
        }else if (monthNumber == 9){
            return "September";
        }else if (monthNumber == 10){
            return "October";
        }else if (monthNumber == 11){
            return "November";
        }else if (monthNumber == 12){
            return "December";
        }else {
            return "Please enter a valid month number";
        }

    }

    @Override
    public String convertDay(int dayNumber) {
        System.out.println("----- inside CONVERT DAY method");
        System.out.println("----- dayNumber inputted: " + dayNumber);
        String dayString = "";
        switch(dayNumber) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;
            default: dayString = "Must enter valid weekday number";
        }

        return dayString;
    }

}
