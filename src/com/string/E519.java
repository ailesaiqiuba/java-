package com.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class E519 {

	public static void main(String[] args) throws ParseException {
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		
		SimpleDateFormat sbf=new SimpleDateFormat("Gyyy年MM月dd日HH:mm:ss E");
		System.out.println(sbf.format(new Date()));
		
		Calendar calendar=Calendar.getInstance();
		int nian=calendar.get(Calendar.YEAR);
		int yue=calendar.get(Calendar.MONTH)+1;
		int ri=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		System.out.println("今天是"+nian+"年"+yue+"月"+ri+"日"+hour+":"+minute+":"+second);
		
		calendar.set(nian,yue,ri);
		calendar.add(Calendar.DATE,100);
		nian=calendar.get(Calendar.YEAR);
		yue=calendar.get(Calendar.MONTH);
		ri=calendar.get(Calendar.DATE);
		hour=calendar.get(Calendar.HOUR);
		minute=calendar.get(Calendar.MINUTE);
		second=calendar.get(Calendar.SECOND);
		System.out.println("100天以后是"+nian+"年"+yue+"月"+ri+"日"+hour+":"+minute+":"+second);
		
		/*LocalDate localDate=LocalDate.now();
		System.out.println("100天以后："+localDate.plusDays(100));*/
		
		LocalDate rt=LocalDate.now();
		LocalDate times=rt.plusDays(100);
		System.out.println(times);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-hh");
		String f=times.toString();
		Date date_100=sdf1.parse(f);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月hh日");
		System.out.println("100天以后"+sdf2.format(date_100));
		
		
		String str1="abc";
		String str2="abc";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3=new String("abc");
		String str4=new String("abc");
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
}
}
