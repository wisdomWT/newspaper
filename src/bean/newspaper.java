package bean;

public class newspaper {

	private int pid; 
    private String pname;
    private String image;
    
    public newspaper() {
		
	}
	public newspaper(int pid, String pname, String image) {
		this.pid = pid;
		this.pname = pname;
		this.image = image;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

    
}
