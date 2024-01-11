package jdbc.dto;

public class EmpDto {
	
	private int empNo;
	private String empName;
	private String empDept;
	private String empDate;
	private int empSal;
	
	//setter getter는 select all 로 다 채워서 만들고
	//생성자는 기본생성자를 만들어야 하기때문에 
	//Deselect all로 생성 다 풀어야한다
	
	public EmpDto() {
		super();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpDate() {
		return empDate;
	}
	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	

}
