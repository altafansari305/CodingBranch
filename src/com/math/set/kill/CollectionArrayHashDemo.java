package com.math.set.kill;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

public class CollectionArrayHashDemo {
	  
	public static void main(String[] args) {
	  Collection arr=new ArrayList();
	  
	  arr.add("A");
	  
	  arr.add(12323);
	  arr.add("B");  
	  
	  final String DATE_FORMAT = "EEEEE,MMMMM dd,yyyy - HH:mm";
		Date date = new Date();
		SimpleDateFormat sdfIndia = new SimpleDateFormat(DATE_FORMAT);
      TimeZone timeZoneIst = TimeZone.getTimeZone("GMT+5:30");
      sdfIndia.setTimeZone(timeZoneIst);
      String dateAndTime = sdfIndia.format(date);
      
      System.out.println(" Time format "+dateAndTime+" >>>>date >>>> "+date);
      
      LocalDateTime ld = LocalDateTime.now();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE,MMM dd,yyyy - HH:mm");
      String localdateString = ld.format(dtf);
      System.out.println(" localdateString format "+localdateString);
      
      SimpleDateFormat format =   new SimpleDateFormat("MMM dd,yyyy  hh:mm");
      System.out.println(format.format(date.getTime()));
      
	}

}
