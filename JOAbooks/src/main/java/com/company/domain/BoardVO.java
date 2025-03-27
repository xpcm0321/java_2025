package com.company.domain;

public class BoardVO {
	private int bno;
	private String btitle;
	private String bcontent;
	private String bname;
	private int bhit;
	private String bdate;
	private String bip;
	
	public BoardVO() { super(); }
	public BoardVO(int bno, String btitle, String bcontent, String bname, int bhit, String bdate, String bip) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bname = bname;
		this.bhit = bhit;
		this.bdate = bdate;
		this.bip = bip;
	}
	
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bname=" + bname + ", bhit="
				+ bhit + ", bdate=" + bdate + ", bip=" + bip + "]";
	}
	public int getBno() { return bno; }
	public void setBno(int bno) { this.bno = bno; }
	public String getBtitle() { return btitle; }
	public void setBtitle(String btitle) { this.btitle = btitle; }
	public String getBcontent() { return bcontent; }
	public void setBcontent(String bcontent) { this.bcontent = bcontent; }
	public String getBname() { return bname; }
	public void setBname(String bname) { this.bname = bname; }
	public int getBhit() { return bhit; }
	public void setBhit(int bhit) { this.bhit = bhit; }
	public String getBdate() { return bdate; }
	public void setBdate(String bdate) { this.bdate = bdate; }
	public String getBip() { return bip; }
	public void setBip(String bip) { this.bip = bip; }
}
/*
+----------+---------------+------+-----+-------------------+-------------------+
| Field    | Type          | Null | Key | Default           | Extra             |
+----------+---------------+------+-----+-------------------+-------------------+
| bno      | int           | NO   | PRI | NULL              | auto_increment    |
| btitle   | varchar(1000) | NO   |     | NULL              |                   |
| bcontent | text          | NO   |     | NULL              |                   |
| bname    | varchar(100)  | NO   |     | NULL              |                   |
| bhit     | int           | YES  |     | 0                 |                   |
| bdate    | timestamp     | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| bip      | varchar(100)  | NO   |     | NULL              |                   |
+----------+---------------+------+-----+-------------------+-------------------+
7 rows in set (0.00 sec)
*/