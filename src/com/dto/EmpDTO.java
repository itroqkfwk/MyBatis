package com.dto;

// DTO 패턴 ( Data Transfer Object)
// 레이어 간에 데이터 전달하는 목적.
// emp 테이블의 레코드 저장
public class EmpDTO {

	private int empno;
	private String username; // 컬럼명은 ename
	private String job;
	private int mgr;
	private String hiredate;  // 날짜데이터 가공할려면 LocalDate 타입으로 지정한다.
	private int salary;      // 컬럼명은 sal
	private int commission;  // 컬럼명은 commission
	private int deptno;
	

	public EmpDTO() {}


	public EmpDTO(int empno, String username, String job, int mgr, String hiredate, int salary, int commission,
			int deptno) {
		this.empno = empno;
		this.username = username;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission = commission;
		this.deptno = deptno;
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getMgr() {
		return mgr;
	}


	public void setMgr(int mgr) {
		this.mgr = mgr;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getCommission() {
		return commission;
	}


	public void setCommission(int commission) {
		this.commission = commission;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", username=" + username + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission=" + commission + ", deptno=" + deptno + "]";
	}
	
}