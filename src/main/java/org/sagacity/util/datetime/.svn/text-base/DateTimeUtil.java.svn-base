/**
 * 
 */
package org.sagacity.util.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTime.Property;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;

/**
 * @author LIZHTIAO 日期时间util
 * 
 */
public class DateTimeUtil {
	/**
	 * 默认的日期格式
	 */
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
	/**
	 * 默认的时间格式
	 */
	public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 格式化日期 格式为yyyy-MM-dd
	 * @param date Date对象
	 * @return String
	 */
	public static String formatDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(DateTimeUtil.DEFAULT_DATE_PATTERN);
		return sdf.format(date);
	}
	
	/**
	 * 格式化日期 
	 * @param pattern 格式化日期的表达式 默认格式为yyyy-MM-dd
	 * @param Date 对象
	 * @return String
	 */
	public static String formatDate(Date date, String pattern){
		if(null == pattern){
			pattern = DateTimeUtil.DEFAULT_DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
	/**
	 * 将字符串转化为Date对象，格式为yyyy-MM-dd
	 * @param date 字符串日期
	 * @return Date
	 */
	public static Date parseDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat(DateTimeUtil.DEFAULT_DATE_PATTERN);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将字符串转化为Date对象
	 * @param date 字符串日期
	 * @param pattern 转化日期的格式表达式，默认格式为yyyy-MM-dd
	 * @return Date
	 */
	public static Date parseDate(String date, String pattern){
		if(null == pattern){
			pattern = DateTimeUtil.DEFAULT_DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将字符串转换为joda-time DateTime对象
	 * @param 
	 * @name parseJodaTime
	 * @active
	 * @state
	 * @type DateTime
	 * @time 上午9:09:25
	 * @exception/throws
	 * @see
	 * @since
	 * @param date 日期字符串，格式为yyyy-MM-dd
	 * @return
	 */
	public static DateTime parseJodaTime(String date){
		return DateTime.parse(date, DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
	}
	
	/**
	 * 将字符串转换为joda-time DateTime对象
	 * @param 
	 * @name parseJodaTime
	 * @active
	 * @state
	 * @type DateTime
	 * @time 上午9:09:25
	 * @exception/throws
	 * @see
	 * @since
	 * @param date 日期字符串，格式为yyyy-MM-dd
	 * @param pattern 格式化日期的字符串，默认为yyyy-MM-dd
	 * @return
	 */
	public static DateTime parseJodaTime(String date, String pattern){
		if(null == pattern){
			pattern = DateTimeUtil.DEFAULT_DATE_PATTERN;
		}
		return DateTime.parse(date, DateTimeFormat.forPattern(pattern));
	}
	
	/**
	 * 将字符串转化为Date对象，格式为yyyy-MM-dd HH:mm:ss
	 * @param date 字符串日期
	 * @return Date
	 */
	public static Date parseDateTime(String date){
		SimpleDateFormat sdf = new SimpleDateFormat(DateTimeUtil.DEFAULT_DATETIME_PATTERN);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 将字符串转化为Date对象
	 * @param date 字符串日期
	 * @param pattern 转化日期的格式表达式，默认格式为yyyy-MM-dd HH:mm:ss
	 * @return Date
	 */
	public static Date parseDateTime(String date, String pattern){
		if(null == pattern){
			pattern = DateTimeUtil.DEFAULT_DATETIME_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 格式化日期时间 格式为yyyy-MM-dd HH:mm:ss
	 * @param date Date对象
	 * @return String
	 */
	public static String formatDateTime(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat(DateTimeUtil.DEFAULT_DATETIME_PATTERN);
		return sdf.format(date);
	}
	
	/**
	 * 格式化日期时间
	 * @param date Date对象
	 * @param pattern 格式化日期时间格式表达式 默认格式为yyyy-MM-dd HH:mm:ss
	 * @return String
	 */
	public static String formatDateTime(Date date, String pattern){
		if(null == pattern){
			pattern = DateTimeUtil.DEFAULT_DATETIME_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * 获取当前日期
	 * @author LIZHTIAO
	 * @return String
	 */
	public static String getCurrentDate() {
		return DateTimeUtil.formatDate(new Date());
	}
	
	/**
	 * 获取当前日期
	 * @param pattern 格式化日期的表达式，默认为（yyyy-MM-dd）
	 * @author LIZHTIAO
	 * @return String
	 */
	public static String getCurrentDate(String pattern) {
		return DateTimeUtil.formatDate(new Date(), pattern);
	}
	
	/**
	 * 获取当前日期时间
	 * @author LIZHTIAO
	 * @return String
	 */
	public static String getCurrentDateTime() {
		return DateTimeUtil.formatDateTime(new Date());
	}
	
	/**
	 * 获取当前日期时间
	 * @param pattern 格式化日期时间的表达式，默认为（yyyy-MM-dd HH:mm:ss）
	 * @author LIZHTIAO
	 * @return String
	 */
	public static String getCurrentDateTime(String pattern) {
		return DateTimeUtil.formatDateTime(new Date(), pattern);
	}
	
	/**
	 * 获取当前年份
	 * @author LIZHTIAO
	 * @return int
	 */
	public static int getYear(){
		DateTime dt = new DateTime();
		return dt.getYear();
	}
	
	/**
	 * 获取当前月份
	 * @author LIZHTIAO
	 * @return int
	 */
	public static int getMonthOfYear(){
		DateTime dt = new DateTime();
		return dt.getMonthOfYear();
	}
	
	/**
	 * 获取当前日期是一年当中的第几个星期
	 * @param 
	 * @name getWeekYear
	 * @active
	 * @state
	 * @type int
	 * @time 下午4:15:23
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static int getWeekYear(){
		DateTime dt = new DateTime();
		return dt.getWeekyear();
	}
	
	/**
	 * 获取当前日是一月中的多少号
	 * @author LIZHTIAO
	 * @return int
	 */
	public static int getDayOfMonth(){
		DateTime dt = new DateTime();
		return dt.getDayOfMonth();
	}
	
	/**
	 * 获取指定日期是一月中的多少号
	 * @author LIZHTIAO
	 * @param date 日期字符串。格式为yyyy-MM-dd
	 * @return int
	 */
	public static int getDayOfMonth(String date){
		DateTime dt = DateTimeUtil.parseJodaTime(date);
		return dt.getDayOfMonth();
	}
	
	/**
	 * 获取指定日期是一月中的多少号
	 * @author LIZHTIAO
	 * @param date 日期字符串
	 * @param pattern 格式化日期的表达式，默认为（yyyy-MM-dd）
	 * @return int
	 */
	public static int getDayOfMonth(String date, String pattern){
		DateTime dt = DateTimeUtil.parseJodaTime(date, pattern);
		return dt.getDayOfMonth();
	}
	
	/**
	 * 获取今天是星期几
	 * @author LIZHTIAO
	 * @return int
	 */
	public static int getDayOfWeek(){
		DateTime dt = new DateTime();
		return dt.getDayOfWeek();
	}
	
	/**
	 * 获取指定日期是星期几
	 * @param 
	 * @name getDayOfWeek
	 * @active
	 * @state
	 * @type int
	 * @time 上午10:08:35
	 * @exception/throws
	 * @see
	 * @since
	 * @param date日期字符串。格式为yyyy-MM-dd
	 * @return
	 */
	public static int getDayOfWeek(String date){
		DateTime dt = DateTimeUtil.parseJodaTime(date);
		return dt.getDayOfWeek();
	}
	
	/**
	 * 获取指定日期是星期几
	 * @param 
	 * @name getDayOfWeek
	 * @active
	 * @state
	 * @type int
	 * @time 上午10:08:35
	 * @exception/throws
	 * @see
	 * @since
	 * @param date日期字符串
	 * @param pattern 格式化日期的表达式，默认为（yyyy-MM-dd） 
	 * @return
	 */
	public static int getDayOfWeek(String date, String pattern){
		DateTime dt = DateTimeUtil.parseJodaTime(date, pattern);
		return dt.getDayOfWeek();
	}
	
	/**
	 * 获取今天是星期几
	 * @param 
	 * @name getDayOfWeekAsString
	 * @active
	 * @state
	 * @type String
	 * @time 上午10:00:33
	 * @exception/throws
	 * @see
	 * @since
	 * @return String 星期一、星期二、星期三、星期四、星期五、星期六、星期日
	 */
	public static String getDayOfWeekAsText(){
		DateTime dt = new DateTime();
		return dt.dayOfWeek().getAsText();
	}
	
	/**
	 * 获取今天是星期几
	 * @param date日期字符串。格式为yyyy-MM-dd 
	 * @name getDayOfWeekAsString
	 * @active
	 * @state
	 * @type String
	 * @time 上午10:00:33
	 * @exception/throws
	 * @see
	 * @since
	 * @return String 星期一、星期二、星期三、星期四、星期五、星期六、星期日
	 */
	public static String getDayOfWeekAsText(String date){
		DateTime dt = DateTimeUtil.parseJodaTime(date);
		return dt.dayOfWeek().getAsText();
	}
	
	/**
	 * 获取今天是星期几
	 * @param date日期字符串
	 * @param  pattern 格式化日期的表达式，默认为（yyyy-MM-dd） 
	 * @name getDayOfWeekAsString
	 * @active
	 * @state
	 * @type String
	 * @time 上午10:00:33
	 * @exception/throws
	 * @see
	 * @since
	 * @return String 星期一、星期二、星期三、星期四、星期五、星期六、星期日
	 */
	public static String getDayOfWeekAsText(String date, String pattern){
		DateTime dt = DateTimeUtil.parseJodaTime(date, pattern);
		return dt.dayOfWeek().getAsText();
	}
	
	/**
	 * 判断当前年是否为闰年
	 * @author LIZHTIAO
	 * @return int
	 */
	public static boolean isLeapYear() {
		DateTime dt = new DateTime();
		Property year = dt.year();
		return year.isLeap();
	}
	
	/**
	 * 判断指定年份是否为闰年
	 * @param year 年份
	 * @author LIZHTIAO
	 * @return int
	 */
	public static boolean isLeapYear(int year) {
		DateTime dt = new DateTime();
		return dt.withYear(year).year().isLeap();
	}	
	
	/**
	 * 计算两个日期的日期差
	 * @name dateDiff
	 * @state
	 * @type int
	 * @time 下午3:42:26
	 * @exception/throws
	 * @see
	 * @since
	 * @param startDate 开始日期 时间 格式为yyyy-MM-dd
	 * @param endDate 结束日期 格式为yyyy-MM-dd
	 * @param dateUnit 日期单位 有年、月、周、日、小时、分钟、秒
	 * @return int 日期相差的数值
	 */
	public static int dateDiff(String startDate, String endDate,
			DateUnit dateUnit) {
		DateTime start = DateTime.parse(startDate,
				DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
		DateTime end = DateTime.parse(endDate);
		LocalDate startD = new LocalDate(start);
		LocalDate endD = new LocalDate(end);
		switch (dateUnit) {
		case YEAR:
			return Years.yearsBetween(startD, endD).getYears();
		case MONTH:
			return Months.monthsBetween(startD, endD).getMonths();
		case WEEK:
			return Weeks.weeksBetween(startD, endD).getWeeks();
		case DAY:
			return Days.daysBetween(startD, endD).getDays();
		case HOUR:
			return Hours.hoursBetween(startD, endD).getHours();
		case MINUTE:
			return Minutes.minutesBetween(startD, endD).getMinutes();
		case SECOND:
			return Seconds.secondsBetween(startD, endD).getSeconds();
		default:
			return 0;
		}
	}
	
	/**
	 * 计算两个日期的日期差
	 * @name dateDiff
	 * @state
	 * @type int
	 * @time 下午3:42:26
	 * @exception/throws
	 * @see
	 * @since
	 * @param startDate 开始日期 时间 格式为yyyy-MM-dd
	 * @param endDate 结束日期 格式为yyyy-MM-dd
	 * @param dateUnit 日期单位 有年、月、周、日、小时、分钟、秒
	 * @param pattern 格式化日期的格式 默认为yyyy-MM-dd
	 * @return int 日期相差的数值
	 */
	public static int dateDiff(String startDate, String endDate, String pattern,
			DateUnit dateUnit) {
		if (null == pattern) {
			pattern = DateTimeUtil.DEFAULT_DATE_PATTERN;
		}
		DateTime start = DateTime.parse(startDate,
				DateTimeFormat.forPattern(pattern));
		DateTime end = DateTime.parse(endDate);
		LocalDate startD = new LocalDate(start);
		LocalDate endD = new LocalDate(end);
		switch (dateUnit) {
		case YEAR:
			return Years.yearsBetween(startD, endD).getYears();
		case MONTH:
			return Months.monthsBetween(startD, endD).getMonths();
		case WEEK:
			return Weeks.weeksBetween(startD, endD).getWeeks();
		case DAY:
			return Days.daysBetween(startD, endD).getDays();
		case HOUR:
			return Hours.hoursBetween(startD, endD).getHours();
		case MINUTE:
			return Minutes.minutesBetween(startD, endD).getMinutes();
		case SECOND:
			return Seconds.secondsBetween(startD, endD).getSeconds();
		default:
			return 0;
		}
	}
	
	/**
	 * 日期增加函数
	 * @name plus
	 * @state
	 * @type String
	 * @time 下午3:33:25
	 * @exception/throws
	 * @see
	 * @since
	 * @param date 日期字符串 日期格式为yyyy-MM-dd
	 * @param unit 需要增加的日期单位 有年、月、周、日、小时、分钟、秒
	 * @param plusNums 增加的数字
	 * @return String 增加后的日期
	 */
	public static String plus(String date, int plusNums, DateUnit unit) {
		DateTime dt = DateTime.parse(date, DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
		switch (unit) {
			case YEAR:
				return dt.plusYears(plusNums).toString(DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
			case MONTH:
				return dt.plusMonths(plusNums).toString(DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
			case WEEK:
				return dt.plusWeeks(plusNums).toString(DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
			case DAY:
				return dt.plusDays(plusNums).toString(DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
			case HOUR:
				return dt.plusHours(plusNums).toString(DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
			case MINUTE:
				return dt.plusMinutes(plusNums).toString(DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
			case SECOND:
				return dt.plusMillis(plusNums).toString(DateTimeFormat.forPattern(DateTimeUtil.DEFAULT_DATE_PATTERN));
			default:
				return "";
		}
	}
	
	/**
	 * 日期增加函数
	 * @name plus
	 * @state
	 * @type String
	 * @time 下午3:31:22
	 * @exception/throws
	 * @see
	 * @since
	 * @param date 日期字符串
	 * @param pattern 日期格式化字符串 默认为yyyy-MM-dd
	 * @param unit 需要增加的日期单位 有年、月、周、日、小时、分钟、秒
	 * @param plusNums 增加的数字
	 * @return String 增加后的日期
	 */
	public static String plus(String date, String pattern, int plusNums, DateUnit unit) {
		if (null == pattern) {
			pattern = DateTimeUtil.DEFAULT_DATE_PATTERN;
		}
		DateTime dt = DateTime.parse(date, DateTimeFormat.forPattern(pattern));
		switch (unit) {
			case YEAR:
				return dt.plusYears(plusNums).toString(DateTimeFormat.forPattern(pattern));
			case MONTH:
				return dt.plusMonths(plusNums).toString(DateTimeFormat.forPattern(pattern));
			case WEEK:
				return dt.plusWeeks(plusNums).toString(DateTimeFormat.forPattern(pattern));
			case DAY:
				return dt.plusDays(plusNums).toString(DateTimeFormat.forPattern(pattern));
			case HOUR:
				return dt.plusHours(plusNums).toString(DateTimeFormat.forPattern(pattern));
			case MINUTE:
				return dt.plusMinutes(plusNums).toString(DateTimeFormat.forPattern(pattern));
			case SECOND:
				return dt.plusMillis(plusNums).toString(DateTimeFormat.forPattern(pattern));
			default:
				return "";
		}
	}
	
	/**
	 * 日期减少函数
	 * @name minus
	 * @state
	 * @type String
	 * @time 下午4:00:23
	 * @exception/throws
	 * @see
	 * @since
	 * @param date 日期字符串 日期格式为yyyy-MM-dd
	 * @param minusNum 减少的数字
	 * @param unit 需要减少的日期单位 有年、月、周、日、小时、分钟、秒
	 * @return String 减少后的日期
	 */
	public static String minus(String date, int minusNum, DateUnit unit) {
		return DateTimeUtil.plus(date, -minusNum, unit);
	}
	
	/**
	 * 日期减少函数
	 * @name minus
	 * @state
	 * @type String
	 * @time 下午4:00:23
	 * @exception/throws
	 * @see
	 * @since
	 * @param date 日期字符串 日期格式为yyyy-MM-dd
	 * @param minusNum 减少的数字
	 * @param unit 需要减少的日期单位 有年、月、周、日、小时、分钟、秒
	 * @return String 减少后的日期
	 */
	public static String minus(String date, String pattern, int minusNum, DateUnit unit) {
		return DateTimeUtil.plus(date, pattern, -minusNum, unit);
	}
	
	/**
	 * 获取时间戳
	 * @param 
	 * @name getTimeStamp
	 * @active
	 * @state
	 * @type String
	 * @time 上午9:20:47
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static String getTimeStamp(){
		return DateTimeUtil.getCurrentDateTime("yyyyMMddHHmmssSSS");
	}
	
	/**
	 * 获取当前月的最后一天的日期
	 * @name getLastDayOfMonth
	 * @active
	 * @state
	 * @type String
	 * @time 上午9:53:56
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static String getLastDayOfMonth(){
		DateTime dt = new DateTime();
		DateTime lastDay = dt.dayOfMonth().withMaximumValue();
		return lastDay.toString(DateTimeUtil.DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 获取指定日期所在月的最后一天的日期
	 * @name getLastDayOfMonth
	 * @param date  日期字符串 日期格式为yyyy-MM-dd
	 * @active
	 * @state
	 * @type String
	 * @time 上午9:53:56
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static String getLastDayOfMonth(String date){
		DateTime dt = DateTimeUtil.parseJodaTime(date);
		DateTime lastDay = dt.dayOfMonth().withMaximumValue();
		return lastDay.toString(DateTimeUtil.DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 获取指定日期所在月的最后一天的日期
	 * @name getLastDayOfMonth
	 * @param date  日期字符串
	 * @param pattern pattern 日期格式化字符串 默认为yyyy-MM-dd
	 * @active
	 * @state
	 * @type String
	 * @time 上午9:53:56
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static String getLastDayOfMonth(String date, String pattern){
		DateTime dt = DateTimeUtil.parseJodaTime(date, pattern);
		DateTime lastDay = dt.dayOfMonth().withMaximumValue();
		return lastDay.toString(DateTimeUtil.DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 获取当前月的第一天的日期
	 * @param 
	 * @name getFirstDayOfMonth
	 * @active
	 * @state
	 * @type String
	 * @time 上午9:55:24
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static String getFirstDayOfMonth(){
		DateTime dt = new DateTime();
		DateTime firstDay = dt.dayOfMonth().withMinimumValue();
		return firstDay.toString(DateTimeUtil.DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 获取指定日期所在月的第一天的日期
	 * @param date 日期字符串 日期格式为yyyy-MM-dd
	 * @name getFirstDayOfMonth
	 * @active
	 * @state
	 * @type String
	 * @time 上午9:55:24
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static String getFirstDayOfMonth(String date){
		DateTime dt = DateTimeUtil.parseJodaTime(date);
		DateTime firstDay = dt.dayOfMonth().withMinimumValue();
		return firstDay.toString(DateTimeUtil.DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 获取指定日期所在月的第一天的日期
	 * @param date 日期字符串
	 * @param pattern 日期格式化字符串 默认为yyyy-MM-dd
	 * @name getFirstDayOfMonth
	 * @active
	 * @state
	 * @type String
	 * @time 上午9:55:24
	 * @exception/throws
	 * @see
	 * @since
	 * @return
	 */
	public static String getFirstDayOfMonth(String date, String pattern){
		DateTime dt = DateTimeUtil.parseJodaTime(date, pattern);
		DateTime firstDay = dt.dayOfMonth().withMinimumValue();
		return firstDay.toString(DateTimeUtil.DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 获取当前全格式的日期带星期
	 * @name getFullDateWithWeek
	 * @param pattern 日期格式化字符串 默认为yyyy-MM-dd
	 * @active
	 * @state
	 * @type String
	 * @time 上午10:27:00
	 * @exception/throws
	 * @see
	 * @since
	 * @param pattern 
	 * @return
	 */
	public static String getDateTimeWithWeek(String pattern){
		if(null == pattern){
			pattern = DateTimeUtil.DEFAULT_DATETIME_PATTERN;
		}
		DateTime dt = new DateTime();
		return dt.toString(DateTimeFormat.forPattern(pattern)) + " " + DateTimeUtil.getDayOfWeekAsText();
	}
	
	/**
	 * 获取指定日期全格式的日期带星期
	 * @name getFullDateWithWeek
	 * @param dateTime 日期字符串 日期格式为yyyy-MM-dd HH:mm:ss
	 * @param pattern 日期格式化字符串 默认为yyyy-MM-dd HH:mm:ss
	 * @active
	 * @state
	 * @type String
	 * @time 上午10:27:00
	 * @exception/throws
	 * @see
	 * @since
	 * @param pattern 
	 * @return
	 */
	public static String getDateTimeWithWeek(String dateTime, String pattern){
		if(null == pattern){
			pattern = DateTimeUtil.DEFAULT_DATETIME_PATTERN;
		}
		DateTime dt = DateTimeUtil.parseJodaTime(dateTime, pattern);
		return dt.toString(DateTimeFormat.forPattern(pattern)) + " " + DateTimeUtil.getDayOfWeekAsText();
	}
	
	/**
	 * 判断第一个日期是否大于第二个日期，如果两个日期相等则也返回false
	 * @param 
	 * @name max
	 * @active
	 * @state
	 * @type boolean
	 * @time 下午3:23:45
	 * @exception/throws
	 * @see
	 * @since
	 * @param firstDate 第一个日期，格式为yyyy-MM-dd
	 * @param secendDate 第二个日期，格式为yyyy-MM-dd
	 * @return boolean
	 */
	public static boolean max(String firstDate, String secendDate) {
		int days = dateDiff(firstDate, secendDate, DateUnit.DAY);
		if (days < 0) {
			return false;
		} else if (days > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 判断第一个日期是否大于第二个日期，如果两个日期相等则也返回false
	 * @param 
	 * @name max
	 * @active
	 * @state
	 * @type boolean
	 * @time 下午3:23:45
	 * @exception/throws
	 * @see
	 * @since
	 * @param firstDate 第一个日期，默认格式为yyyy-MM-dd
	 * @param secendDate 第二个日期，默认格式为yyyy-MM-dd
	 * @param pattern 格式化日期的字符串
	 * @return boolean
	 */
	public static boolean max(String firstDate, String secendDate, String pattern) {
		int days = dateDiff(firstDate, secendDate, pattern, DateUnit.DAY);
		if (days < 0) {
			return false;
		} else if (days > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断第一个日期是否小于第二个日期
	 * @param 
	 * @name min
	 * @active
	 * @state
	 * @type boolean
	 * @time 下午3:29:55
	 * @exception/throws
	 * @see
	 * @since
	 * @param firstDate 第一个日期，格式为yyyy-MM-dd
	 * @param secendDate 第二个日期，格式为yyyy-MM-dd
	 * @return
	 */
	public static boolean min(String firstDate, String secendDate){
		return !max(firstDate, secendDate);
	}
	
	/**
	 * 判断第一个日期是否小于第二个日期
	 * @param 
	 * @name min
	 * @active
	 * @state
	 * @type boolean
	 * @time 下午3:29:55
	 * @exception/throws
	 * @see
	 * @since
	 * @param firstDate 第一个日期，默认格式为yyyy-MM-dd
	 * @param secendDate 第二个日期，默认格式为yyyy-MM-dd
	 * @param pattern 格式化日期的字符串
	 * @return
	 */
	public static boolean min(String firstDate, String secendDate, String pattern){
		return !max(firstDate, secendDate, pattern);
	}

}
