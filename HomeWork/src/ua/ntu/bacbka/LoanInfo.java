package ua.ntu.bacbka;

public class LoanInfo {
	public int sum;
	public int term;
	public double percent;
	public double x;

	LoanInfo(int sum, int term, double percent){
		setSum(sum);
		setTerm(term);
		setPercent(percent);
		result();
	}

	private void result() {
		x = sum/(1 + term * 12 * 0.045);
		System.out.println("Надана сума кредиту: " + x);
		
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	
	
}
